package Hospital2Administration.initbwd.hipe.engine;

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

import Hospital2Administration.initbwd.hipe.engine.actor.NotificationActor;
import Hospital2Administration.initbwd.hipe.engine.actor.DispatchActor;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_5_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_1_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.junction.DocToStaffRule__BWD_9_junction;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.DoctorShiftplanRule__BWD_28_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_37_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.DoctorToPatient__BWD_41_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.NurseShiftplanRule__BWD_52_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_66_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_62_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.junction.NurseToStaffRule__BWD_70_junction;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.PatientInReception__BWD_89_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.localsearch.PatientInRoom__BWD_95_localSearch;
import Hospital2Administration.initbwd.hipe.engine.actor.node.Staff_object_SP0;
import Hospital2Administration.initbwd.hipe.engine.actor.node.Staff_object_SP1;
import Hospital2Administration.initbwd.hipe.engine.actor.node.Staff_object_SP2;

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
		classes.put("DocToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__BWD_production", "DocToStaffRule__BWD");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__BWD_production", "DoctorShiftplanRule__BWD");
		classes.put("DoctorToPatient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__BWD_production", "DoctorToPatient__BWD");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__BWD_production", "HospitaltoAdministrationRule__BWD");
		classes.put("NurseShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__BWD_production", "NurseShiftplanRule__BWD");
		classes.put("NurseToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__BWD_production", "NurseToStaffRule__BWD");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__BWD_production", "PatientInReception__BWD");
		classes.put("PatientInRoom__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__BWD_production", "PatientInRoom__BWD");
		
	}
	
	public void createJunctionNodes() {
		classes.put("DocToStaffRule__BWD_12_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_5_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_5_localSearch.class);
		classes.put("DocToStaffRule__BWD_16_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_1_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_1_localSearch.class);
		classes.put("DocToStaffRule__BWD_23_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule__BWD_17_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_13_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_11_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_9_junction", DocToStaffRule__BWD_9_junction.class);
		classes.put("DoctorShiftplanRule__BWD_28_localSearch", DoctorShiftplanRule__BWD_28_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_37_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_37_localSearch.class);
		classes.put("DoctorToPatient__BWD_41_localSearch", DoctorToPatient__BWD_41_localSearch.class);
		classes.put("NurseShiftplanRule__BWD_52_localSearch", NurseShiftplanRule__BWD_52_localSearch.class);
		classes.put("NurseToStaffRule__BWD_73_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_66_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_66_localSearch.class);
		classes.put("NurseToStaffRule__BWD_77_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_62_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_62_localSearch.class);
		classes.put("NurseToStaffRule__BWD_84_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_78_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_74_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_72_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_70_junction", NurseToStaffRule__BWD_70_junction.class);
		classes.put("PatientInReception__BWD_89_localSearch", PatientInReception__BWD_89_localSearch.class);
		classes.put("PatientInRoom__BWD_95_localSearch", PatientInRoom__BWD_95_localSearch.class);
	}
	
	public void createReferenceNodes() {
		classes.put("HospitalToAdministration_source_0_reference",HospitalToAdministration_source_0_reference.class);
		classes.put("HospitalToAdministration_target_0_reference",HospitalToAdministration_target_0_reference.class);
		classes.put("Shiftplan_shifts_0_reference",Shiftplan_shifts_0_reference.class);
		classes.put("Administration_staff_0_reference",Administration_staff_0_reference.class);
		classes.put("Staff_shiftPlan_0_reference",Staff_shiftPlan_0_reference.class);
		classes.put("Administration_staff_1_reference",Administration_staff_1_reference.class);
		classes.put("Staff_shiftPlan_1_reference",Staff_shiftPlan_1_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Department_object",Department_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("Patient_object",Patient_object.class);
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Room_object",Room_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Reception_object",Reception_object.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Shiftplan_object_SP2",Shiftplan_object_SP2.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("HospitalToAdministration_source_0_reference", new InitGenReferenceActor<Hospital2Administration.HospitalToAdministration,HospitalExample.Hospital>(name2actor, name2node.get("HospitalToAdministration_source_0_reference"), (o) -> o instanceof Hospital2Administration.HospitalToAdministration, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("HospitalToAdministration_target_0_reference", new InitGenReferenceActor<Hospital2Administration.HospitalToAdministration,AdministrationExample.Administration>(name2actor, name2node.get("HospitalToAdministration_target_0_reference"), (o) -> o instanceof Hospital2Administration.HospitalToAdministration, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Shiftplan_shifts_0_reference", new InitGenReferenceActor<AdministrationExample.Shiftplan,AdministrationExample.Shift>(name2actor, name2node.get("Shiftplan_shifts_0_reference"), (o) -> o instanceof AdministrationExample.Shiftplan, null, (o) -> o.getShifts(), false, prodUtil, incUtil));
		name2initRefGen.put("Administration_staff_0_reference", new InitGenReferenceActor<AdministrationExample.Administration,AdministrationExample.Staff>(name2actor, name2node.get("Administration_staff_0_reference"), (o) -> o instanceof AdministrationExample.Administration, null, (o) -> o.getStaff(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_0_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Administration_staff_1_reference", new InitGenReferenceActor<AdministrationExample.Administration,AdministrationExample.Staff>(name2actor, name2node.get("Administration_staff_1_reference"), (o) -> o instanceof AdministrationExample.Administration, null, (o) -> o.getStaff(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_1_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_1_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
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

class Department_object extends GenericObjectActor<HospitalExample.Department> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class Patient_object extends GenericObjectActor<HospitalExample.Patient> { }
class PatientToPatient_object extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Room_object extends GenericObjectActor<HospitalExample.Room> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Reception_object extends GenericObjectActor<HospitalExample.Reception> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP2 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration> { }
class Shiftplan_shifts_0_reference extends GenericReferenceActor<AdministrationExample.Shiftplan, AdministrationExample.Shift> { }
class Administration_staff_0_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_0_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }
class Administration_staff_1_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_1_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }

