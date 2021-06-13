package HospitalTransformRules.hipe.engine;

import java.io.File;
import java.io.IOException;

import java.text.DecimalFormat;
import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import HospitalTransformRules.hipe.engine.actor.NotificationActor;
import HospitalTransformRules.hipe.engine.actor.DispatchActor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;
import hipe.generic.actor.junction.util.HiPEConfig;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final Config hipeConf = ConfigFactory.parseString(
			  "akka {\n" +
				    "actor {\n" +
				    "guardian-supervisor-strategy = \"hipe.engine.actor.HiPESupervisorStrategy\"" +
				    "}\n" +
			   "}\n"
	);
	private final ActorSystem system = ActorSystem.create("HiPE-Engine", ConfigFactory.load(hipeConf));
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	final private IncUtil incUtil = new IncUtil();
	final private ProductionUtil prodUtil = new ProductionUtil();
	
	private long time = 0;
	private int counter = 0;
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public HiPEEngine() {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		loadNetwork();
	}
	
	public void loadNetwork() {
		ResourceSet rs = new ResourceSetImpl();
		String cp = "";
		
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
		// fix that is necessary if executed in an eclipse plugin context
		if(!path.contains("bin/"))
			path += "bin/";
		path += getClass().getPackageName().replace(".", "/") + "/" + "hipe-network.xmi";
		
		File file = new File(path);
		
		try {
			 cp = file.getCanonicalPath();
			 cp = cp.replace("%20", " ");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		URI uri = URI.createFileURI(cp);
		Resource r = rs.createResource(uri);

		try {
			r.load(null);
			network = (HiPENetwork) r.getContents().get(0);
		} catch(Exception e) {
			throw new RuntimeException("Network file could not be loaded via " + uri);	
		}
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("assignNurseToRoom_production", GenericProductionActor.class);
		productionNodes2pattern.put("assignNurseToRoom_production", "assignNurseToRoom");
		classes.put("assignPatientToRoom_production", GenericProductionActor.class);
		productionNodes2pattern.put("assignPatientToRoom_production", "assignPatientToRoom");
		classes.put("department_production", GenericProductionActor.class);
		productionNodes2pattern.put("department_production", "department");
		classes.put("doctor_production", GenericProductionActor.class);
		productionNodes2pattern.put("doctor_production", "doctor");
		classes.put("doctorInDepartment_production", GenericProductionActor.class);
		productionNodes2pattern.put("doctorInDepartment_production", "doctorInDepartment");
		classes.put("doctorInDepartment_CONDITION_department_production", GenericProductionActor.class);
		productionNodes2pattern.put("doctorInDepartment_CONDITION_department_production", "doctorInDepartment_CONDITION_department");
		classes.put("findDepartment_production", GenericProductionActor.class);
		productionNodes2pattern.put("findDepartment_production", "findDepartment");
		classes.put("findDepartmentWithoutDoctor_production", GenericProductionActor.class);
		productionNodes2pattern.put("findDepartmentWithoutDoctor_production", "findDepartmentWithoutDoctor");
		classes.put("findDocWithPatient_production", GenericProductionActor.class);
		productionNodes2pattern.put("findDocWithPatient_production", "findDocWithPatient");
		classes.put("findDoctor_production", GenericProductionActor.class);
		productionNodes2pattern.put("findDoctor_production", "findDoctor");
		classes.put("findHospital_production", GenericProductionActor.class);
		productionNodes2pattern.put("findHospital_production", "findHospital");
		classes.put("findHospital_CONDITION__production", GenericProductionActor.class);
		productionNodes2pattern.put("findHospital_CONDITION__production", "findHospital_CONDITION_");
		classes.put("findNurse_production", GenericProductionActor.class);
		productionNodes2pattern.put("findNurse_production", "findNurse");
		classes.put("findNurseInRoom_production", GenericProductionActor.class);
		productionNodes2pattern.put("findNurseInRoom_production", "findNurseInRoom");
		classes.put("findNurseInRoom_CONDITION_room_production", GenericProductionActor.class);
		productionNodes2pattern.put("findNurseInRoom_CONDITION_room_production", "findNurseInRoom_CONDITION_room");
		classes.put("findOccupiedDoc_production", GenericProductionActor.class);
		productionNodes2pattern.put("findOccupiedDoc_production", "findOccupiedDoc");
		classes.put("findPatient_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatient_production", "findPatient");
		classes.put("findPatientInReception_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatientInReception_production", "findPatientInReception");
		classes.put("findPatientInRoom_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatientInRoom_production", "findPatientInRoom");
		classes.put("findPatientWithDoc_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatientWithDoc_production", "findPatientWithDoc");
		classes.put("findPatientWithDoc_CONDITION_patient_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatientWithDoc_CONDITION_patient_production", "findPatientWithDoc_CONDITION_patient");
		classes.put("findPatientWithDoc_CONDITION_somedoctor_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatientWithDoc_CONDITION_somedoctor_production", "findPatientWithDoc_CONDITION_somedoctor");
		classes.put("findReception_production", GenericProductionActor.class);
		productionNodes2pattern.put("findReception_production", "findReception");
		classes.put("findReception_CONDITION__production", GenericProductionActor.class);
		productionNodes2pattern.put("findReception_CONDITION__production", "findReception_CONDITION_");
		classes.put("findRoom_production", GenericProductionActor.class);
		productionNodes2pattern.put("findRoom_production", "findRoom");
		classes.put("findRoomInDepartment_production", GenericProductionActor.class);
		productionNodes2pattern.put("findRoomInDepartment_production", "findRoomInDepartment");
		classes.put("findRoomWithoutNurse_production", GenericProductionActor.class);
		productionNodes2pattern.put("findRoomWithoutNurse_production", "findRoomWithoutNurse");
		classes.put("patient_production", GenericProductionActor.class);
		productionNodes2pattern.put("patient_production", "patient");
		classes.put("reception_production", GenericProductionActor.class);
		productionNodes2pattern.put("reception_production", "reception");
		classes.put("releasePatient_production", GenericProductionActor.class);
		productionNodes2pattern.put("releasePatient_production", "releasePatient");
		classes.put("room_production", GenericProductionActor.class);
		productionNodes2pattern.put("room_production", "room");
		
	}
	
	public void createJunctionNodes() {
		classes.put("assignNurseToRoom_6_nacjunction", GenericNACJunctionActor.class);
		classes.put("assignNurseToRoom_4_junction", GenericJunctionActor.class);
		classes.put("assignPatientToRoom_17_nacjunction", GenericNACJunctionActor.class);
		classes.put("assignPatientToRoom_21_junction", GenericJunctionActor.class);
		classes.put("assignPatientToRoom_18_junction", GenericJunctionActor.class);
		classes.put("assignPatientToRoom_16_junction", GenericJunctionActor.class);
		classes.put("assignPatientToRoom_14_junction", GenericJunctionActor.class);
		classes.put("doctor_33_nacjunction", GenericNACJunctionActor.class);
		classes.put("findDepartmentWithoutDoctor_41_nacjunction", GenericNACJunctionActor.class);
		classes.put("findRoomWithoutNurse_72_nacjunction", GenericNACJunctionActor.class);
		classes.put("reception_77_nacjunction", GenericNACJunctionActor.class);
		classes.put("releasePatient_79_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Hospital_department_0_reference",Hospital_department_0_reference.class);
		classes.put("Department_rooms_0_reference",Department_rooms_0_reference.class);
		classes.put("Nurse_responsible_0_reference",Nurse_responsible_0_reference.class);
		classes.put("Reception_waits_0_reference",Reception_waits_0_reference.class);
		classes.put("Doctor_caresfor_0_reference",Doctor_caresfor_0_reference.class);
		classes.put("Hospital_reception_0_reference",Hospital_reception_0_reference.class);
		classes.put("Department_staff_0_reference",Department_staff_0_reference.class);
		classes.put("Patient_doctor_0_reference",Patient_doctor_0_reference.class);
		classes.put("Room_lies_0_reference",Room_lies_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("Reception_object_SP0",Reception_object_SP0.class);
		classes.put("Reception_object_SP1",Reception_object_SP1.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Hospital_department_0_reference", new InitGenReferenceActor<HospitalExample.Hospital,HospitalExample.Department>(name2actor, name2node.get("Hospital_department_0_reference"), (o) -> o instanceof HospitalExample.Hospital, null, (o) -> o.getDepartment(), false, prodUtil, incUtil));
		name2initRefGen.put("Department_rooms_0_reference", new InitGenReferenceActor<HospitalExample.Department,HospitalExample.Room>(name2actor, name2node.get("Department_rooms_0_reference"), (o) -> o instanceof HospitalExample.Department, null, (o) -> o.getRooms(), false, prodUtil, incUtil));
		name2initRefGen.put("Nurse_responsible_0_reference", new InitGenReferenceActor<HospitalExample.Nurse,HospitalExample.Room>(name2actor, name2node.get("Nurse_responsible_0_reference"), (o) -> o instanceof HospitalExample.Nurse, (o) -> o.getResponsible(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Reception_waits_0_reference", new InitGenReferenceActor<HospitalExample.Reception,HospitalExample.Patient>(name2actor, name2node.get("Reception_waits_0_reference"), (o) -> o instanceof HospitalExample.Reception, null, (o) -> o.getWaits(), false, prodUtil, incUtil));
		name2initRefGen.put("Doctor_caresfor_0_reference", new InitGenReferenceActor<HospitalExample.Doctor,HospitalExample.Patient>(name2actor, name2node.get("Doctor_caresfor_0_reference"), (o) -> o instanceof HospitalExample.Doctor, null, (o) -> o.getCaresfor(), false, prodUtil, incUtil));
		name2initRefGen.put("Hospital_reception_0_reference", new InitGenReferenceActor<HospitalExample.Hospital,HospitalExample.Reception>(name2actor, name2node.get("Hospital_reception_0_reference"), (o) -> o instanceof HospitalExample.Hospital, (o) -> o.getReception(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Department_staff_0_reference", new InitGenReferenceActor<HospitalExample.Department,HospitalExample.Staff>(name2actor, name2node.get("Department_staff_0_reference"), (o) -> o instanceof HospitalExample.Department, null, (o) -> o.getStaff(), false, prodUtil, incUtil));
		name2initRefGen.put("Patient_doctor_0_reference", new InitGenReferenceActor<HospitalExample.Patient,HospitalExample.Doctor>(name2actor, name2node.get("Patient_doctor_0_reference"), (o) -> o instanceof HospitalExample.Patient, (o) -> o.getDoctor(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Room_lies_0_reference", new InitGenReferenceActor<HospitalExample.Room,HospitalExample.Patient>(name2actor, name2node.get("Room_lies_0_reference"), (o) -> o instanceof HospitalExample.Room, null, (o) -> o.getLies(), false, prodUtil, incUtil));
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		
		long tic = System.nanoTime();
		counter++;
		
		dirty = false;
		
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		Map<String, ProductionResult> productionResults = prodUtil.getProductionResults();
				
		incUtil.clean();
		prodUtil.clean();
		
		time += System.nanoTime() - tic;
		
		return productionResults;
	}
	
	public void terminate() {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("HiPEEngine" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
						
		system.terminate();	
	}
	
}

class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class Reception_object_SP0 extends GenericObjectActor<HospitalExample.Reception> { }
class Reception_object_SP1 extends GenericObjectActor<HospitalExample.Reception> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }

class Hospital_department_0_reference extends GenericReferenceActor<HospitalExample.Hospital, HospitalExample.Department> { }
class Department_rooms_0_reference extends GenericReferenceActor<HospitalExample.Department, HospitalExample.Room> { }
class Nurse_responsible_0_reference extends GenericReferenceActor<HospitalExample.Nurse, HospitalExample.Room> { }
class Reception_waits_0_reference extends GenericReferenceActor<HospitalExample.Reception, HospitalExample.Patient> { }
class Doctor_caresfor_0_reference extends GenericReferenceActor<HospitalExample.Doctor, HospitalExample.Patient> { }
class Hospital_reception_0_reference extends GenericReferenceActor<HospitalExample.Hospital, HospitalExample.Reception> { }
class Department_staff_0_reference extends GenericReferenceActor<HospitalExample.Department, HospitalExample.Staff> { }
class Patient_doctor_0_reference extends GenericReferenceActor<HospitalExample.Patient, HospitalExample.Doctor> { }
class Room_lies_0_reference extends GenericReferenceActor<HospitalExample.Room, HospitalExample.Patient> { }

