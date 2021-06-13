package AdministrationTransformRule.hipe.engine;

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

import AdministrationTransformRule.hipe.engine.actor.NotificationActor;
import AdministrationTransformRule.hipe.engine.actor.DispatchActor;
import AdministrationTransformRule.hipe.engine.actor.junction.patientCovered_28_junction;
import AdministrationTransformRule.hipe.engine.actor.junction.patientCovered_17_junction;

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
		classes.put("findAdministration_production", GenericProductionActor.class);
		productionNodes2pattern.put("findAdministration_production", "findAdministration");
		classes.put("findAdministration_CONDITION__production", GenericProductionActor.class);
		productionNodes2pattern.put("findAdministration_CONDITION__production", "findAdministration_CONDITION_");
		classes.put("findCoveredPatient_production", GenericProductionActor.class);
		productionNodes2pattern.put("findCoveredPatient_production", "findCoveredPatient");
		classes.put("findEarlyShift_production", GenericProductionActor.class);
		productionNodes2pattern.put("findEarlyShift_production", "findEarlyShift");
		classes.put("findLateShift_production", GenericProductionActor.class);
		productionNodes2pattern.put("findLateShift_production", "findLateShift");
		classes.put("findNightShift_production", GenericProductionActor.class);
		productionNodes2pattern.put("findNightShift_production", "findNightShift");
		classes.put("findPatient_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPatient_production", "findPatient");
		classes.put("findPerson_production", GenericProductionActor.class);
		productionNodes2pattern.put("findPerson_production", "findPerson");
		classes.put("findShiftplan_production", GenericProductionActor.class);
		productionNodes2pattern.put("findShiftplan_production", "findShiftplan");
		classes.put("findStaff_production", GenericProductionActor.class);
		productionNodes2pattern.put("findStaff_production", "findStaff");
		classes.put("findTreatment_production", GenericProductionActor.class);
		productionNodes2pattern.put("findTreatment_production", "findTreatment");
		classes.put("patient_production", GenericProductionActor.class);
		productionNodes2pattern.put("patient_production", "patient");
		classes.put("patientCovered_production", GenericProductionActor.class);
		productionNodes2pattern.put("patientCovered_production", "patientCovered");
		classes.put("staff_production", GenericProductionActor.class);
		productionNodes2pattern.put("staff_production", "staff");
		
	}
	
	public void createJunctionNodes() {
		classes.put("patientCovered_21_junction", GenericJunctionActor.class);
		classes.put("patientCovered_18_junction", GenericJunctionActor.class);
		classes.put("patientCovered_27_junction", GenericJunctionActor.class);
		classes.put("patientCovered_34_junction", GenericJunctionActor.class);
		classes.put("patientCovered_28_junction", patientCovered_28_junction.class);
		classes.put("patientCovered_22_junction", GenericJunctionActor.class);
		classes.put("patientCovered_19_nacjunction", GenericNACJunctionActor.class);
		classes.put("patientCovered_17_junction", patientCovered_17_junction.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Patient_coveredBy_0_reference",Patient_coveredBy_0_reference.class);
		classes.put("Staff_treatment_0_reference",Staff_treatment_0_reference.class);
		classes.put("Staff_shiftPlan_0_reference",Staff_shiftPlan_0_reference.class);
		classes.put("Shiftplan_shifts_0_reference",Shiftplan_shifts_0_reference.class);
		classes.put("Patient_treatment_0_reference",Patient_treatment_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Administration_object",Administration_object.class);
		classes.put("Patient_object",Patient_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Person_object",Person_object.class);
		classes.put("Staff_object",Staff_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Patient_coveredBy_0_reference", new InitGenReferenceActor<AdministrationExample.Patient,AdministrationExample.Shiftplan>(name2actor, name2node.get("Patient_coveredBy_0_reference"), (o) -> o instanceof AdministrationExample.Patient, null, (o) -> o.getCoveredBy(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_treatment_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Treatment>(name2actor, name2node.get("Staff_treatment_0_reference"), (o) -> o instanceof AdministrationExample.Staff, null, (o) -> o.getTreatment(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_0_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Shiftplan_shifts_0_reference", new InitGenReferenceActor<AdministrationExample.Shiftplan,AdministrationExample.Shift>(name2actor, name2node.get("Shiftplan_shifts_0_reference"), (o) -> o instanceof AdministrationExample.Shiftplan, null, (o) -> o.getShifts(), false, prodUtil, incUtil));
		name2initRefGen.put("Patient_treatment_0_reference", new InitGenReferenceActor<AdministrationExample.Patient,AdministrationExample.Treatment>(name2actor, name2node.get("Patient_treatment_0_reference"), (o) -> o instanceof AdministrationExample.Patient, (o) -> o.getTreatment(), null, false, prodUtil, incUtil));
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

class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }
class Patient_object extends GenericObjectActor<AdministrationExample.Patient> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Person_object extends GenericObjectActor<AdministrationExample.Person> { }
class Staff_object extends GenericObjectActor<AdministrationExample.Staff> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }

class Patient_coveredBy_0_reference extends GenericReferenceActor<AdministrationExample.Patient, AdministrationExample.Shiftplan> { }
class Staff_treatment_0_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Treatment> { }
class Staff_shiftPlan_0_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }
class Shiftplan_shifts_0_reference extends GenericReferenceActor<AdministrationExample.Shiftplan, AdministrationExample.Shift> { }
class Patient_treatment_0_reference extends GenericReferenceActor<AdministrationExample.Patient, AdministrationExample.Treatment> { }

