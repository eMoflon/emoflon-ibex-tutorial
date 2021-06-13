package Hospital2Administration.co.hipe.engine;

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

import Hospital2Administration.co.hipe.engine.actor.NotificationActor;
import Hospital2Administration.co.hipe.engine.actor.DispatchActor;
import Hospital2Administration.co.hipe.engine.actor.localsearch.DepartmentRule__CO_1_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.DocToStaffRule__CO_4_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.DoctorShiftplanRule__CO_14_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.DoctorToPatient__CO_23_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__CO_33_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.NurseShiftplanRule__CO_38_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.NurseToRoomRule__CO_48_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.NurseToStaffRule__CO_57_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.PatientInReception__CO_67_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.PatientInRoom__CO_75_localSearch;
import Hospital2Administration.co.hipe.engine.actor.localsearch.RoomRule__CO_84_localSearch;

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
		classes.put("DepartmentRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__CO_production", "DepartmentRule__CO");
		classes.put("DocToStaffRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CO_production", "DocToStaffRule__CO");
		classes.put("DoctorShiftplanRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CO_production", "DoctorShiftplanRule__CO");
		classes.put("DoctorToPatient__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CO_production", "DoctorToPatient__CO");
		classes.put("HospitaltoAdministrationRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CO_production", "HospitaltoAdministrationRule__CO");
		classes.put("NurseShiftplanRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CO_production", "NurseShiftplanRule__CO");
		classes.put("NurseToRoomRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CO_production", "NurseToRoomRule__CO");
		classes.put("NurseToStaffRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CO_production", "NurseToStaffRule__CO");
		classes.put("PatientInReception__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CO_production", "PatientInReception__CO");
		classes.put("PatientInRoom__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CO_production", "PatientInRoom__CO");
		classes.put("RoomRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CO_production", "RoomRule__CO");
		
	}
	
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CO_1_localSearch", DepartmentRule__CO_1_localSearch.class);
		classes.put("DocToStaffRule__CO_4_localSearch", DocToStaffRule__CO_4_localSearch.class);
		classes.put("DoctorShiftplanRule__CO_14_localSearch", DoctorShiftplanRule__CO_14_localSearch.class);
		classes.put("DoctorToPatient__CO_23_localSearch", DoctorToPatient__CO_23_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CO_33_localSearch", HospitaltoAdministrationRule__CO_33_localSearch.class);
		classes.put("NurseShiftplanRule__CO_38_localSearch", NurseShiftplanRule__CO_38_localSearch.class);
		classes.put("NurseToRoomRule__CO_48_localSearch", NurseToRoomRule__CO_48_localSearch.class);
		classes.put("NurseToStaffRule__CO_57_localSearch", NurseToStaffRule__CO_57_localSearch.class);
		classes.put("PatientInReception__CO_67_localSearch", PatientInReception__CO_67_localSearch.class);
		classes.put("PatientInRoom__CO_75_localSearch", PatientInRoom__CO_75_localSearch.class);
		classes.put("RoomRule__CO_84_localSearch", RoomRule__CO_84_localSearch.class);
	}
	
	public void createReferenceNodes() {
		
	}
	
	public void createObjectNodes() {
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("Reception_object",Reception_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("HospitalToAdministration_object_SP0",HospitalToAdministration_object_SP0.class);
		classes.put("HospitalToAdministration_object_SP1",HospitalToAdministration_object_SP1.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
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

class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class Reception_object extends GenericObjectActor<HospitalExample.Reception> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class HospitalToAdministration_object_SP0 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class HospitalToAdministration_object_SP1 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }


