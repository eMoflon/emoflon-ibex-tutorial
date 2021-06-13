package Hospital2Administration.sync.hipe.engine;

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

import Hospital2Administration.sync.hipe.engine.actor.NotificationActor;
import Hospital2Administration.sync.hipe.engine.actor.DispatchActor;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DepartmentRule__CONSISTENCY_1_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DepartmentRule__FWD_5_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.junction.DocToStaffRule__BWD_16_junction;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DocToStaffRule__CONSISTENCY_35_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DocToStaffRule__FWD_46_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorShiftplanRule__BWD_52_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorShiftplanRule__CONSISTENCY_61_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_71_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorToPatient__BWD_75_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorToPatient__CONSISTENCY_85_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.DoctorToPatient__FWD_96_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_106_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__CONSISTENCY_110_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__FWD_116_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseShiftplanRule__BWD_119_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseShiftplanRule__CONSISTENCY_129_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToRoomRule__CONSISTENCY_140_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToRoomRule__FWD_150_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_163_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_159_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.junction.NurseToStaffRule__BWD_167_junction;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToStaffRule__CONSISTENCY_186_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.NurseToStaffRule__FWD_197_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInReception__BWD_203_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_209_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInReception__CONSISTENCY_212_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInReception__FWD_221_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInRoom__BWD_227_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_234_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInRoom__CONSISTENCY_237_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.PatientInRoom__FWD_247_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.RoomRule__CONSISTENCY_254_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.localsearch.RoomRule__FWD_258_localSearch;
import Hospital2Administration.sync.hipe.engine.actor.node.Staff_object_SP0;
import Hospital2Administration.sync.hipe.engine.actor.node.Staff_object_SP1;
import Hospital2Administration.sync.hipe.engine.actor.node.Staff_object_SP4;

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
		classes.put("DepartmentRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__CONSISTENCY_production", "DepartmentRule__CONSISTENCY");
		classes.put("DepartmentRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__FWD_production", "DepartmentRule__FWD");
		classes.put("DocToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__BWD_production", "DocToStaffRule__BWD");
		classes.put("DocToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CONSISTENCY_production", "DocToStaffRule__CONSISTENCY");
		classes.put("DocToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__FWD_production", "DocToStaffRule__FWD");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__BWD_production", "DoctorShiftplanRule__BWD");
		classes.put("DoctorShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CONSISTENCY_production", "DoctorShiftplanRule__CONSISTENCY");
		classes.put("DoctorToPatient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__BWD_production", "DoctorToPatient__BWD");
		classes.put("DoctorToPatient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CONSISTENCY_production", "DoctorToPatient__CONSISTENCY");
		classes.put("DoctorToPatient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__FWD_production", "DoctorToPatient__FWD");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__BWD_production", "HospitaltoAdministrationRule__BWD");
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CONSISTENCY_production", "HospitaltoAdministrationRule__CONSISTENCY");
		classes.put("HospitaltoAdministrationRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__FWD_production", "HospitaltoAdministrationRule__FWD");
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", "HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("NurseShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__BWD_production", "NurseShiftplanRule__BWD");
		classes.put("NurseShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CONSISTENCY_production", "NurseShiftplanRule__CONSISTENCY");
		classes.put("NurseToRoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CONSISTENCY_production", "NurseToRoomRule__CONSISTENCY");
		classes.put("NurseToRoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__FWD_production", "NurseToRoomRule__FWD");
		classes.put("NurseToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__BWD_production", "NurseToStaffRule__BWD");
		classes.put("NurseToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CONSISTENCY_production", "NurseToStaffRule__CONSISTENCY");
		classes.put("NurseToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__FWD_production", "NurseToStaffRule__FWD");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__BWD_production", "PatientInReception__BWD");
		classes.put("PatientInReception__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CONSISTENCY_production", "PatientInReception__CONSISTENCY");
		classes.put("PatientInReception__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__FWD_production", "PatientInReception__FWD");
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", "PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC");
		classes.put("PatientInRoom__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__BWD_production", "PatientInRoom__BWD");
		classes.put("PatientInRoom__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CONSISTENCY_production", "PatientInRoom__CONSISTENCY");
		classes.put("PatientInRoom__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__FWD_production", "PatientInRoom__FWD");
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC");
		classes.put("RoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CONSISTENCY_production", "RoomRule__CONSISTENCY");
		classes.put("RoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__FWD_production", "RoomRule__FWD");
		
	}
	
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CONSISTENCY_1_localSearch", DepartmentRule__CONSISTENCY_1_localSearch.class);
		classes.put("DepartmentRule__FWD_5_localSearch", DepartmentRule__FWD_5_localSearch.class);
		classes.put("DocToStaffRule__BWD_19_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch.class);
		classes.put("DocToStaffRule__BWD_23_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch.class);
		classes.put("DocToStaffRule__BWD_30_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule__BWD_24_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_20_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_18_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_16_junction", DocToStaffRule__BWD_16_junction.class);
		classes.put("DocToStaffRule__CONSISTENCY_35_localSearch", DocToStaffRule__CONSISTENCY_35_localSearch.class);
		classes.put("DocToStaffRule__FWD_46_localSearch", DocToStaffRule__FWD_46_localSearch.class);
		classes.put("DoctorShiftplanRule__BWD_52_localSearch", DoctorShiftplanRule__BWD_52_localSearch.class);
		classes.put("DoctorShiftplanRule__CONSISTENCY_61_localSearch", DoctorShiftplanRule__CONSISTENCY_61_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_71_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_71_localSearch.class);
		classes.put("DoctorToPatient__BWD_75_localSearch", DoctorToPatient__BWD_75_localSearch.class);
		classes.put("DoctorToPatient__CONSISTENCY_85_localSearch", DoctorToPatient__CONSISTENCY_85_localSearch.class);
		classes.put("DoctorToPatient__FWD_96_localSearch", DoctorToPatient__FWD_96_localSearch.class);
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_106_localSearch", HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_106_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_110_localSearch", HospitaltoAdministrationRule__CONSISTENCY_110_localSearch.class);
		classes.put("HospitaltoAdministrationRule__FWD_116_localSearch", HospitaltoAdministrationRule__FWD_116_localSearch.class);
		classes.put("NurseShiftplanRule__BWD_119_localSearch", NurseShiftplanRule__BWD_119_localSearch.class);
		classes.put("NurseShiftplanRule__CONSISTENCY_129_localSearch", NurseShiftplanRule__CONSISTENCY_129_localSearch.class);
		classes.put("NurseToRoomRule__CONSISTENCY_140_localSearch", NurseToRoomRule__CONSISTENCY_140_localSearch.class);
		classes.put("NurseToRoomRule__FWD_150_localSearch", NurseToRoomRule__FWD_150_localSearch.class);
		classes.put("NurseToStaffRule__BWD_170_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_163_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_163_localSearch.class);
		classes.put("NurseToStaffRule__BWD_174_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_159_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_159_localSearch.class);
		classes.put("NurseToStaffRule__BWD_181_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_175_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_171_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_169_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_167_junction", NurseToStaffRule__BWD_167_junction.class);
		classes.put("NurseToStaffRule__CONSISTENCY_186_localSearch", NurseToStaffRule__CONSISTENCY_186_localSearch.class);
		classes.put("NurseToStaffRule__FWD_197_localSearch", NurseToStaffRule__FWD_197_localSearch.class);
		classes.put("PatientInReception__BWD_203_localSearch", PatientInReception__BWD_203_localSearch.class);
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_209_localSearch", PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_209_localSearch.class);
		classes.put("PatientInReception__CONSISTENCY_212_localSearch", PatientInReception__CONSISTENCY_212_localSearch.class);
		classes.put("PatientInReception__FWD_221_localSearch", PatientInReception__FWD_221_localSearch.class);
		classes.put("PatientInRoom__BWD_227_localSearch", PatientInRoom__BWD_227_localSearch.class);
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_234_localSearch", PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_234_localSearch.class);
		classes.put("PatientInRoom__CONSISTENCY_237_localSearch", PatientInRoom__CONSISTENCY_237_localSearch.class);
		classes.put("PatientInRoom__FWD_247_localSearch", PatientInRoom__FWD_247_localSearch.class);
		classes.put("RoomRule__CONSISTENCY_254_localSearch", RoomRule__CONSISTENCY_254_localSearch.class);
		classes.put("RoomRule__FWD_258_localSearch", RoomRule__FWD_258_localSearch.class);
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
		classes.put("DepartmentRule__Marker_object",DepartmentRule__Marker_object.class);
		classes.put("DocToStaffRule__Marker_object",DocToStaffRule__Marker_object.class);
		classes.put("DoctorShiftplanRule__Marker_object",DoctorShiftplanRule__Marker_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("DoctorToPatient__Marker_object",DoctorToPatient__Marker_object.class);
		classes.put("HospitaltoAdministrationRule__Marker_object",HospitaltoAdministrationRule__Marker_object.class);
		classes.put("NurseShiftplanRule__Marker_object",NurseShiftplanRule__Marker_object.class);
		classes.put("NurseToRoomRule__Marker_object",NurseToRoomRule__Marker_object.class);
		classes.put("NurseToStaffRule__Marker_object",NurseToStaffRule__Marker_object.class);
		classes.put("PatientInReception__Marker_object",PatientInReception__Marker_object.class);
		classes.put("PatientInRoom__Marker_object",PatientInRoom__Marker_object.class);
		classes.put("RoomRule__Marker_object",RoomRule__Marker_object.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Department_object_SP2",Department_object_SP2.class);
		classes.put("Department_object_SP3",Department_object_SP3.class);
		classes.put("Department_object_SP4",Department_object_SP4.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Hospital_object_SP2",Hospital_object_SP2.class);
		classes.put("Hospital_object_SP3",Hospital_object_SP3.class);
		classes.put("HospitalToAdministration_object_SP0",HospitalToAdministration_object_SP0.class);
		classes.put("HospitalToAdministration_object_SP1",HospitalToAdministration_object_SP1.class);
		classes.put("HospitalToAdministration_object_SP2",HospitalToAdministration_object_SP2.class);
		classes.put("HospitalToAdministration_object_SP3",HospitalToAdministration_object_SP3.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Administration_object_SP2",Administration_object_SP2.class);
		classes.put("Administration_object_SP3",Administration_object_SP3.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Shiftplan_object_SP2",Shiftplan_object_SP2.class);
		classes.put("Shiftplan_object_SP3",Shiftplan_object_SP3.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Shift_object_SP2",Shift_object_SP2.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Staff_object_SP3",Staff_object_SP3.class);
		classes.put("Staff_object_SP4",Staff_object_SP4.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("StaffToStaff_object_SP2",StaffToStaff_object_SP2.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_object_SP2",Patient_object_SP2.class);
		classes.put("Patient_object_SP3",Patient_object_SP3.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Patient_1_object_SP2",Patient_1_object_SP2.class);
		classes.put("Patient_1_object_SP3",Patient_1_object_SP3.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("PatientToPatient_object_SP2",PatientToPatient_object_SP2.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Room_object_SP2",Room_object_SP2.class);
		classes.put("Room_object_SP3",Room_object_SP3.class);
		classes.put("Reception_object_SP0",Reception_object_SP0.class);
		classes.put("Reception_object_SP1",Reception_object_SP1.class);
		classes.put("Nurse_object_SP0",Nurse_object_SP0.class);
		classes.put("Nurse_object_SP1",Nurse_object_SP1.class);
		
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

class DepartmentRule__Marker_object extends GenericObjectActor<Hospital2Administration.DepartmentRule__Marker> { }
class DocToStaffRule__Marker_object extends GenericObjectActor<Hospital2Administration.DocToStaffRule__Marker> { }
class DoctorShiftplanRule__Marker_object extends GenericObjectActor<Hospital2Administration.DoctorShiftplanRule__Marker> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class DoctorToPatient__Marker_object extends GenericObjectActor<Hospital2Administration.DoctorToPatient__Marker> { }
class HospitaltoAdministrationRule__Marker_object extends GenericObjectActor<Hospital2Administration.HospitaltoAdministrationRule__Marker> { }
class NurseShiftplanRule__Marker_object extends GenericObjectActor<Hospital2Administration.NurseShiftplanRule__Marker> { }
class NurseToRoomRule__Marker_object extends GenericObjectActor<Hospital2Administration.NurseToRoomRule__Marker> { }
class NurseToStaffRule__Marker_object extends GenericObjectActor<Hospital2Administration.NurseToStaffRule__Marker> { }
class PatientInReception__Marker_object extends GenericObjectActor<Hospital2Administration.PatientInReception__Marker> { }
class PatientInRoom__Marker_object extends GenericObjectActor<Hospital2Administration.PatientInRoom__Marker> { }
class RoomRule__Marker_object extends GenericObjectActor<Hospital2Administration.RoomRule__Marker> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP2 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP3 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP4 extends GenericObjectActor<HospitalExample.Department> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP2 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP3 extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object_SP0 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class HospitalToAdministration_object_SP1 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class HospitalToAdministration_object_SP2 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class HospitalToAdministration_object_SP3 extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP2 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP3 extends GenericObjectActor<AdministrationExample.Administration> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP2 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP3 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP2 extends GenericObjectActor<AdministrationExample.Shift> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP3 extends GenericObjectActor<AdministrationExample.Staff> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class StaffToStaff_object_SP2 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP2 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP3 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP2 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP3 extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class PatientToPatient_object_SP2 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP2 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP3 extends GenericObjectActor<HospitalExample.Room> { }
class Reception_object_SP0 extends GenericObjectActor<HospitalExample.Reception> { }
class Reception_object_SP1 extends GenericObjectActor<HospitalExample.Reception> { }
class Nurse_object_SP0 extends GenericObjectActor<HospitalExample.Nurse> { }
class Nurse_object_SP1 extends GenericObjectActor<HospitalExample.Nurse> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration> { }
class Shiftplan_shifts_0_reference extends GenericReferenceActor<AdministrationExample.Shiftplan, AdministrationExample.Shift> { }
class Administration_staff_0_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_0_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }
class Administration_staff_1_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_1_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }

