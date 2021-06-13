package Hospital2Administration.modelgen.hipe.engine;

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

import Hospital2Administration.modelgen.hipe.engine.actor.NotificationActor;
import Hospital2Administration.modelgen.hipe.engine.actor.DispatchActor;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.DoctorShiftplanRule__GEN_10_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.DoctorToPatient__GEN_19_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.NurseShiftplanRule__GEN_28_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.NurseToRoomRule__GEN_38_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.PatientInReception__GEN_55_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.PatientInRoom__GEN_60_localSearch;

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
		classes.put("DepartmentRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__GEN_production", "DepartmentRule__GEN");
		classes.put("DocToStaffRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__GEN_production", "DocToStaffRule__GEN");
		classes.put("DoctorShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__GEN_production", "DoctorShiftplanRule__GEN");
		classes.put("DoctorToPatient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__GEN_production", "DoctorToPatient__GEN");
		classes.put("NurseShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__GEN_production", "NurseShiftplanRule__GEN");
		classes.put("NurseToRoomRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__GEN_production", "NurseToRoomRule__GEN");
		classes.put("NurseToStaffRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__GEN_production", "NurseToStaffRule__GEN");
		classes.put("PatientInReception__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__GEN_production", "PatientInReception__GEN");
		classes.put("PatientInRoom__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__GEN_production", "PatientInRoom__GEN");
		classes.put("RoomRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__GEN_production", "RoomRule__GEN");
		
	}
	
	public void createJunctionNodes() {
		classes.put("DocToStaffRule__GEN_4_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__GEN_2_junction", GenericJunctionActor.class);
		classes.put("DoctorShiftplanRule__GEN_10_localSearch", DoctorShiftplanRule__GEN_10_localSearch.class);
		classes.put("DoctorToPatient__GEN_19_localSearch", DoctorToPatient__GEN_19_localSearch.class);
		classes.put("NurseShiftplanRule__GEN_28_localSearch", NurseShiftplanRule__GEN_28_localSearch.class);
		classes.put("NurseToRoomRule__GEN_38_localSearch", NurseToRoomRule__GEN_38_localSearch.class);
		classes.put("NurseToStaffRule__GEN_49_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__GEN_47_junction", GenericJunctionActor.class);
		classes.put("PatientInReception__GEN_55_localSearch", PatientInReception__GEN_55_localSearch.class);
		classes.put("PatientInRoom__GEN_60_localSearch", PatientInRoom__GEN_60_localSearch.class);
	}
	
	public void createReferenceNodes() {
		classes.put("HospitalToAdministration_source_0_reference",HospitalToAdministration_source_0_reference.class);
		classes.put("HospitalToAdministration_target_0_reference",HospitalToAdministration_target_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Administration_object",Administration_object.class);
		classes.put("Patient_object",Patient_object.class);
		classes.put("Patient_1_object",Patient_1_object.class);
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("Staff_object",Staff_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Room_object",Room_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Reception_object",Reception_object.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("HospitalToAdministration_source_0_reference", new InitGenReferenceActor<Hospital2Administration.HospitalToAdministration,HospitalExample.Hospital>(name2actor, name2node.get("HospitalToAdministration_source_0_reference"), (o) -> o instanceof Hospital2Administration.HospitalToAdministration, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("HospitalToAdministration_target_0_reference", new InitGenReferenceActor<Hospital2Administration.HospitalToAdministration,AdministrationExample.Administration>(name2actor, name2node.get("HospitalToAdministration_target_0_reference"), (o) -> o instanceof Hospital2Administration.HospitalToAdministration, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
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

class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }
class Patient_object extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class Staff_object extends GenericObjectActor<AdministrationExample.Staff> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Room_object extends GenericObjectActor<HospitalExample.Room> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Reception_object extends GenericObjectActor<HospitalExample.Reception> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration> { }

