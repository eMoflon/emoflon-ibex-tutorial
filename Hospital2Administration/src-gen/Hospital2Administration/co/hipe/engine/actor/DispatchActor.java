package Hospital2Administration.co.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom(), obj -> {
			HospitalExample.Room _room = (HospitalExample.Room) obj;
			incUtil.newMessage();
			name2actor.get("Room_object_SP0").tell(new ObjectAdded<HospitalExample.Room>(incUtil, _room), getSelf());
			incUtil.newMessage();
			name2actor.get("Room_object_SP1").tell(new ObjectAdded<HospitalExample.Room>(incUtil, _room), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment(), obj -> {
			HospitalExample.Department _department = (HospitalExample.Department) obj;
			incUtil.newMessage();
			name2actor.get("Department_object_SP0").tell(new ObjectAdded<HospitalExample.Department>(incUtil, _department), getSelf());
			incUtil.newMessage();
			name2actor.get("Department_object_SP1").tell(new ObjectAdded<HospitalExample.Department>(incUtil, _department), getSelf());
		});
		type2addConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getStaffToStaff(), obj -> {
			Hospital2Administration.StaffToStaff _stafftostaff = (Hospital2Administration.StaffToStaff) obj;
			incUtil.newMessage();
			name2actor.get("StaffToStaff_object_SP0").tell(new ObjectAdded<Hospital2Administration.StaffToStaff>(incUtil, _stafftostaff), getSelf());
			incUtil.newMessage();
			name2actor.get("StaffToStaff_object_SP1").tell(new ObjectAdded<Hospital2Administration.StaffToStaff>(incUtil, _stafftostaff), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor(), obj -> {
			HospitalExample.Doctor _doctor = (HospitalExample.Doctor) obj;
			incUtil.newMessage();
			name2actor.get("Doctor_object").tell(new ObjectAdded<HospitalExample.Doctor>(incUtil, _doctor), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception(), obj -> {
			HospitalExample.Reception _reception = (HospitalExample.Reception) obj;
			incUtil.newMessage();
			name2actor.get("Reception_object").tell(new ObjectAdded<HospitalExample.Reception>(incUtil, _reception), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse(), obj -> {
			HospitalExample.Nurse _nurse = (HospitalExample.Nurse) obj;
			incUtil.newMessage();
			name2actor.get("Nurse_object").tell(new ObjectAdded<HospitalExample.Nurse>(incUtil, _nurse), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient(), obj -> {
			AdministrationExample.Patient _patient = (AdministrationExample.Patient) obj;
			incUtil.newMessage();
			name2actor.get("Patient_1_object_SP0").tell(new ObjectAdded<AdministrationExample.Patient>(incUtil, _patient), getSelf());
			incUtil.newMessage();
			name2actor.get("Patient_1_object_SP1").tell(new ObjectAdded<AdministrationExample.Patient>(incUtil, _patient), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital(), obj -> {
			HospitalExample.Hospital _hospital = (HospitalExample.Hospital) obj;
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP0").tell(new ObjectAdded<HospitalExample.Hospital>(incUtil, _hospital), getSelf());
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP1").tell(new ObjectAdded<HospitalExample.Hospital>(incUtil, _hospital), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff(), obj -> {
			AdministrationExample.Staff _staff = (AdministrationExample.Staff) obj;
			incUtil.newMessage();
			name2actor.get("Staff_object_SP0").tell(new ObjectAdded<AdministrationExample.Staff>(incUtil, _staff), getSelf());
			incUtil.newMessage();
			name2actor.get("Staff_object_SP1").tell(new ObjectAdded<AdministrationExample.Staff>(incUtil, _staff), getSelf());
		});
		type2addConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getHospitalToAdministration(), obj -> {
			Hospital2Administration.HospitalToAdministration _hospitaltoadministration = (Hospital2Administration.HospitalToAdministration) obj;
			incUtil.newMessage();
			name2actor.get("HospitalToAdministration_object_SP0").tell(new ObjectAdded<Hospital2Administration.HospitalToAdministration>(incUtil, _hospitaltoadministration), getSelf());
			incUtil.newMessage();
			name2actor.get("HospitalToAdministration_object_SP1").tell(new ObjectAdded<Hospital2Administration.HospitalToAdministration>(incUtil, _hospitaltoadministration), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShift(), obj -> {
			AdministrationExample.Shift _shift = (AdministrationExample.Shift) obj;
			incUtil.newMessage();
			name2actor.get("Shift_object").tell(new ObjectAdded<AdministrationExample.Shift>(incUtil, _shift), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient(), obj -> {
			HospitalExample.Patient _patient = (HospitalExample.Patient) obj;
			incUtil.newMessage();
			name2actor.get("Patient_object_SP0").tell(new ObjectAdded<HospitalExample.Patient>(incUtil, _patient), getSelf());
			incUtil.newMessage();
			name2actor.get("Patient_object_SP1").tell(new ObjectAdded<HospitalExample.Patient>(incUtil, _patient), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration(), obj -> {
			AdministrationExample.Administration _administration = (AdministrationExample.Administration) obj;
			incUtil.newMessage();
			name2actor.get("Administration_object_SP0").tell(new ObjectAdded<AdministrationExample.Administration>(incUtil, _administration), getSelf());
			incUtil.newMessage();
			name2actor.get("Administration_object_SP1").tell(new ObjectAdded<AdministrationExample.Administration>(incUtil, _administration), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan(), obj -> {
			AdministrationExample.Shiftplan _shiftplan = (AdministrationExample.Shiftplan) obj;
			incUtil.newMessage();
			name2actor.get("Shiftplan_object").tell(new ObjectAdded<AdministrationExample.Shiftplan>(incUtil, _shiftplan), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getTreatment(), obj -> {
			AdministrationExample.Treatment _treatment = (AdministrationExample.Treatment) obj;
			incUtil.newMessage();
			name2actor.get("Treatment_object").tell(new ObjectAdded<AdministrationExample.Treatment>(incUtil, _treatment), getSelf());
		});
		type2addConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getPatientToPatient(), obj -> {
			Hospital2Administration.PatientToPatient _patienttopatient = (Hospital2Administration.PatientToPatient) obj;
			incUtil.newMessage();
			name2actor.get("PatientToPatient_object_SP0").tell(new ObjectAdded<Hospital2Administration.PatientToPatient>(incUtil, _patienttopatient), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientToPatient_object_SP1").tell(new ObjectAdded<Hospital2Administration.PatientToPatient>(incUtil, _patienttopatient), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Name(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP0").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP1").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getTreatment_Medication(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Treatment) {
				incUtil.newMessage();
				name2actor.get("Treatment_object").tell(new AttributeChanged<AdministrationExample.Treatment>(incUtil, (AdministrationExample.Treatment) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_DInt(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP0").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP1").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Level(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP0").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP1").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff_StaffID(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Doctor) {
				incUtil.newMessage();
				name2actor.get("Doctor_object").tell(new AttributeChanged<HospitalExample.Staff>(incUtil, (HospitalExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Nurse) {
				incUtil.newMessage();
				name2actor.get("Nurse_object").tell(new AttributeChanged<HospitalExample.Staff>(incUtil, (HospitalExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPerson_FirstName(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP0").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP0").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP1").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP1").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_DID(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP0").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP1").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_PatientID(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP0").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_object_SP1").tell(new AttributeChanged<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_StaffID(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP0").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP1").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPerson_LastName(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP0").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP0").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP1").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP1").tell(new AttributeChanged<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_Salary(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP0").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Staff) {
				incUtil.newMessage();
				name2actor.get("Staff_object_SP1").tell(new AttributeChanged<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff_Name(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Doctor) {
				incUtil.newMessage();
				name2actor.get("Doctor_object").tell(new AttributeChanged<HospitalExample.Staff>(incUtil, (HospitalExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Nurse) {
				incUtil.newMessage();
				name2actor.get("Nurse_object").tell(new AttributeChanged<HospitalExample.Staff>(incUtil, (HospitalExample.Staff) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_PatientID(), notification -> {
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP0").tell(new AttributeChanged<AdministrationExample.Patient>(incUtil, (AdministrationExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof AdministrationExample.Patient) {
				incUtil.newMessage();
				name2actor.get("Patient_1_object_SP1").tell(new AttributeChanged<AdministrationExample.Patient>(incUtil, (AdministrationExample.Patient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Capacity(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Room) {
				incUtil.newMessage();
				name2actor.get("Room_object_SP0").tell(new AttributeChanged<HospitalExample.Room>(incUtil, (HospitalExample.Room) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Room) {
				incUtil.newMessage();
				name2actor.get("Room_object_SP1").tell(new AttributeChanged<HospitalExample.Room>(incUtil, (HospitalExample.Room) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_MaxRoomCount(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP0").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP1").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getHospitalToAdministration_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getNewValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getNewValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getNewValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getNewValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getNewValue(), "HospitalToAdministration_source_Hospital"), getSelf());
		});
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getStaffToStaff_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "StaffToStaff_target_Staff"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Rooms(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("RoomRule__CO_84_localSearch").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Department_rooms_Room"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_ShiftPlan(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Shifts(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getNewValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getNewValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getNewValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getNewValue(), "Shiftplan_shifts_Shift"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Doctor(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<HospitalExample.Patient, HospitalExample.Doctor>(incUtil,(HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getNewValue(), "Patient_doctor_Doctor"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<HospitalExample.Patient, HospitalExample.Doctor>(incUtil,(HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getNewValue(), "Patient_doctor_Doctor"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<AdministrationExample.Administration, AdministrationExample.Staff>(incUtil,(AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "Administration_staff_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<AdministrationExample.Administration, AdministrationExample.Staff>(incUtil,(AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Staff) notification.getNewValue(), "Administration_staff_Staff"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Covers(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Patient>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "Shiftplan_covers_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Patient>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "Shiftplan_covers_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Lies(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<HospitalExample.Room, HospitalExample.Patient>(incUtil,(HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<HospitalExample.Room, HospitalExample.Patient>(incUtil,(HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<HospitalExample.Room, HospitalExample.Patient>(incUtil,(HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<HospitalExample.Room, HospitalExample.Patient>(incUtil,(HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "Room_lies_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception_Waits(), notification -> {
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<HospitalExample.Reception, HospitalExample.Patient>(incUtil,(HospitalExample.Reception) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "Reception_waits_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Department(), notification -> {
			incUtil.newMessage();
			name2actor.get("DepartmentRule__CO_1_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Department>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Hospital_department_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Department>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Hospital_department_Department"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Reception(), notification -> {
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Reception>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getNewValue(), "Hospital_reception_Reception"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Reception>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getNewValue(), "Hospital_reception_Reception"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff_Works(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<HospitalExample.Staff, HospitalExample.Department>(incUtil,(HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<HospitalExample.Staff, HospitalExample.Department>(incUtil,(HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<HospitalExample.Staff, HospitalExample.Department>(incUtil,(HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<HospitalExample.Staff, HospitalExample.Department>(incUtil,(HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "Staff_works_Department"), getSelf());
		});
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getStaffToStaff_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil,(Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "StaffToStaff_source_Staff"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Staff>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "Hospital_staff_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Staff>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "Hospital_staff_Staff"), getSelf());
		});
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getPatientToPatient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "PatientToPatient_source_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getHospitalToAdministration_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getNewValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getNewValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getNewValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getNewValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil,(Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getNewValue(), "HospitalToAdministration_target_Administration"), getSelf());
		});
		feature2addEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getPatientToPatient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil,(Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "PatientToPatient_target_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse_Responsible(), notification -> {
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceAdded<HospitalExample.Nurse, HospitalExample.Room>(incUtil,(HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Nurse_responsible_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceAdded<HospitalExample.Nurse, HospitalExample.Room>(incUtil,(HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "Nurse_responsible_Room"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration_Patient(), notification -> {
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceAdded<AdministrationExample.Administration, AdministrationExample.Patient>(incUtil,(AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "Administration_patient_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceAdded<AdministrationExample.Administration, AdministrationExample.Patient>(incUtil,(AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Patient) notification.getNewValue(), "Administration_patient_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<AdministrationExample.Patient, AdministrationExample.Treatment>(incUtil,(AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Treatment) notification.getNewValue(), "Patient_treatment_Treatment"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Treatment>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Treatment) notification.getNewValue(), "Staff_treatment_Treatment"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getHospitalToAdministration_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getOldValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getOldValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getOldValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getOldValue(), "HospitalToAdministration_source_Hospital"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, HospitalExample.Hospital>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (HospitalExample.Hospital) notification.getOldValue(), "HospitalToAdministration_source_Hospital"), getSelf());
		});
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getStaffToStaff_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, AdministrationExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "StaffToStaff_target_Staff"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Rooms(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("RoomRule__CO_84_localSearch").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Department_rooms_Room"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_ShiftPlan(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "Staff_shiftPlan_Shiftplan"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Shifts(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getOldValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getOldValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getOldValue(), "Shiftplan_shifts_Shift"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getOldValue(), "Shiftplan_shifts_Shift"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Doctor(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<HospitalExample.Patient, HospitalExample.Doctor>(incUtil, (HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getOldValue(), "Patient_doctor_Doctor"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<HospitalExample.Patient, HospitalExample.Doctor>(incUtil, (HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getOldValue(), "Patient_doctor_Doctor"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<AdministrationExample.Administration, AdministrationExample.Staff>(incUtil, (AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "Administration_staff_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<AdministrationExample.Administration, AdministrationExample.Staff>(incUtil, (AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Staff) notification.getOldValue(), "Administration_staff_Staff"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Covers(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Patient>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "Shiftplan_covers_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Patient>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "Shiftplan_covers_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Lies(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<HospitalExample.Room, HospitalExample.Patient>(incUtil, (HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<HospitalExample.Room, HospitalExample.Patient>(incUtil, (HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<HospitalExample.Room, HospitalExample.Patient>(incUtil, (HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "Room_lies_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<HospitalExample.Room, HospitalExample.Patient>(incUtil, (HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "Room_lies_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception_Waits(), notification -> {
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<HospitalExample.Reception, HospitalExample.Patient>(incUtil, (HospitalExample.Reception) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "Reception_waits_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Department(), notification -> {
			incUtil.newMessage();
			name2actor.get("DepartmentRule__CO_1_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Department>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Hospital_department_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Department>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Hospital_department_Department"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Reception(), notification -> {
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Reception>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getOldValue(), "Hospital_reception_Reception"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Reception>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getOldValue(), "Hospital_reception_Reception"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff_Works(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<HospitalExample.Staff, HospitalExample.Department>(incUtil, (HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<HospitalExample.Staff, HospitalExample.Department>(incUtil, (HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<HospitalExample.Staff, HospitalExample.Department>(incUtil, (HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Staff_works_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<HospitalExample.Staff, HospitalExample.Department>(incUtil, (HospitalExample.Staff) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "Staff_works_Department"), getSelf());
		});
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getStaffToStaff_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<Hospital2Administration.StaffToStaff, HospitalExample.Staff>(incUtil, (Hospital2Administration.StaffToStaff) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "StaffToStaff_source_Staff"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Staff>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "Hospital_staff_Staff"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Staff>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "Hospital_staff_Staff"), getSelf());
		});
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getPatientToPatient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, HospitalExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "PatientToPatient_source_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getHospitalToAdministration_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DocToStaffRule__CO_4_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getOldValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("HospitaltoAdministrationRule__CO_33_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getOldValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToStaffRule__CO_57_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getOldValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getOldValue(), "HospitalToAdministration_target_Administration"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<Hospital2Administration.HospitalToAdministration, AdministrationExample.Administration>(incUtil, (Hospital2Administration.HospitalToAdministration) notification.getNotifier(), (AdministrationExample.Administration) notification.getOldValue(), "HospitalToAdministration_target_Administration"), getSelf());
		});
		feature2removeEdgeConsumer.put(Hospital2Administration.Hospital2AdministrationPackage.eINSTANCE.getPatientToPatient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorShiftplanRule__CO_14_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<Hospital2Administration.PatientToPatient, AdministrationExample.Patient>(incUtil, (Hospital2Administration.PatientToPatient) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "PatientToPatient_target_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse_Responsible(), notification -> {
			incUtil.newMessage();
			name2actor.get("NurseShiftplanRule__CO_38_localSearch").tell(new ReferenceDeleted<HospitalExample.Nurse, HospitalExample.Room>(incUtil, (HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Nurse_responsible_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("NurseToRoomRule__CO_48_localSearch").tell(new ReferenceDeleted<HospitalExample.Nurse, HospitalExample.Room>(incUtil, (HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "Nurse_responsible_Room"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration_Patient(), notification -> {
			incUtil.newMessage();
			name2actor.get("PatientInReception__CO_67_localSearch").tell(new ReferenceDeleted<AdministrationExample.Administration, AdministrationExample.Patient>(incUtil, (AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "Administration_patient_Patient"), getSelf());
			incUtil.newMessage();
			name2actor.get("PatientInRoom__CO_75_localSearch").tell(new ReferenceDeleted<AdministrationExample.Administration, AdministrationExample.Patient>(incUtil, (AdministrationExample.Administration) notification.getNotifier(), (AdministrationExample.Patient) notification.getOldValue(), "Administration_patient_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<AdministrationExample.Patient, AdministrationExample.Treatment>(incUtil, (AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Treatment) notification.getOldValue(), "Patient_treatment_Treatment"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("DoctorToPatient__CO_23_localSearch").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Treatment>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Treatment) notification.getOldValue(), "Staff_treatment_Treatment"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof HospitalExample.Doctor) {
			incUtil.newMessage();
			name2actor.get("Doctor_object").tell(new ObjectDeleted<HospitalExample.Doctor>(incUtil, (HospitalExample.Doctor) node), getSelf());
		}
		if (node instanceof HospitalExample.Reception) {
			incUtil.newMessage();
			name2actor.get("Reception_object").tell(new ObjectDeleted<HospitalExample.Reception>(incUtil, (HospitalExample.Reception) node), getSelf());
		}
		if (node instanceof HospitalExample.Nurse) {
			incUtil.newMessage();
			name2actor.get("Nurse_object").tell(new ObjectDeleted<HospitalExample.Nurse>(incUtil, (HospitalExample.Nurse) node), getSelf());
		}
		if (node instanceof HospitalExample.Hospital) {
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP0").tell(new ObjectDeleted<HospitalExample.Hospital>(incUtil, (HospitalExample.Hospital) node), getSelf());
		}
		if (node instanceof HospitalExample.Hospital) {
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP1").tell(new ObjectDeleted<HospitalExample.Hospital>(incUtil, (HospitalExample.Hospital) node), getSelf());
		}
		if (node instanceof HospitalExample.Department) {
			incUtil.newMessage();
			name2actor.get("Department_object_SP0").tell(new ObjectDeleted<HospitalExample.Department>(incUtil, (HospitalExample.Department) node), getSelf());
		}
		if (node instanceof HospitalExample.Department) {
			incUtil.newMessage();
			name2actor.get("Department_object_SP1").tell(new ObjectDeleted<HospitalExample.Department>(incUtil, (HospitalExample.Department) node), getSelf());
		}
		if (node instanceof HospitalExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_object_SP0").tell(new ObjectDeleted<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) node), getSelf());
		}
		if (node instanceof HospitalExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_object_SP1").tell(new ObjectDeleted<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) node), getSelf());
		}
		if (node instanceof HospitalExample.Room) {
			incUtil.newMessage();
			name2actor.get("Room_object_SP0").tell(new ObjectDeleted<HospitalExample.Room>(incUtil, (HospitalExample.Room) node), getSelf());
		}
		if (node instanceof HospitalExample.Room) {
			incUtil.newMessage();
			name2actor.get("Room_object_SP1").tell(new ObjectDeleted<HospitalExample.Room>(incUtil, (HospitalExample.Room) node), getSelf());
		}
		if (node instanceof Hospital2Administration.HospitalToAdministration) {
			incUtil.newMessage();
			name2actor.get("HospitalToAdministration_object_SP0").tell(new ObjectDeleted<Hospital2Administration.HospitalToAdministration>(incUtil, (Hospital2Administration.HospitalToAdministration) node), getSelf());
		}
		if (node instanceof Hospital2Administration.HospitalToAdministration) {
			incUtil.newMessage();
			name2actor.get("HospitalToAdministration_object_SP1").tell(new ObjectDeleted<Hospital2Administration.HospitalToAdministration>(incUtil, (Hospital2Administration.HospitalToAdministration) node), getSelf());
		}
		if (node instanceof Hospital2Administration.StaffToStaff) {
			incUtil.newMessage();
			name2actor.get("StaffToStaff_object_SP0").tell(new ObjectDeleted<Hospital2Administration.StaffToStaff>(incUtil, (Hospital2Administration.StaffToStaff) node), getSelf());
		}
		if (node instanceof Hospital2Administration.StaffToStaff) {
			incUtil.newMessage();
			name2actor.get("StaffToStaff_object_SP1").tell(new ObjectDeleted<Hospital2Administration.StaffToStaff>(incUtil, (Hospital2Administration.StaffToStaff) node), getSelf());
		}
		if (node instanceof Hospital2Administration.PatientToPatient) {
			incUtil.newMessage();
			name2actor.get("PatientToPatient_object_SP0").tell(new ObjectDeleted<Hospital2Administration.PatientToPatient>(incUtil, (Hospital2Administration.PatientToPatient) node), getSelf());
		}
		if (node instanceof Hospital2Administration.PatientToPatient) {
			incUtil.newMessage();
			name2actor.get("PatientToPatient_object_SP1").tell(new ObjectDeleted<Hospital2Administration.PatientToPatient>(incUtil, (Hospital2Administration.PatientToPatient) node), getSelf());
		}
		if (node instanceof AdministrationExample.Shift) {
			incUtil.newMessage();
			name2actor.get("Shift_object").tell(new ObjectDeleted<AdministrationExample.Shift>(incUtil, (AdministrationExample.Shift) node), getSelf());
		}
		if (node instanceof AdministrationExample.Shiftplan) {
			incUtil.newMessage();
			name2actor.get("Shiftplan_object").tell(new ObjectDeleted<AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Shiftplan) node), getSelf());
		}
		if (node instanceof AdministrationExample.Treatment) {
			incUtil.newMessage();
			name2actor.get("Treatment_object").tell(new ObjectDeleted<AdministrationExample.Treatment>(incUtil, (AdministrationExample.Treatment) node), getSelf());
		}
		if (node instanceof AdministrationExample.Administration) {
			incUtil.newMessage();
			name2actor.get("Administration_object_SP0").tell(new ObjectDeleted<AdministrationExample.Administration>(incUtil, (AdministrationExample.Administration) node), getSelf());
		}
		if (node instanceof AdministrationExample.Administration) {
			incUtil.newMessage();
			name2actor.get("Administration_object_SP1").tell(new ObjectDeleted<AdministrationExample.Administration>(incUtil, (AdministrationExample.Administration) node), getSelf());
		}
		if (node instanceof AdministrationExample.Staff) {
			incUtil.newMessage();
			name2actor.get("Staff_object_SP0").tell(new ObjectDeleted<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) node), getSelf());
		}
		if (node instanceof AdministrationExample.Staff) {
			incUtil.newMessage();
			name2actor.get("Staff_object_SP1").tell(new ObjectDeleted<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) node), getSelf());
		}
		if (node instanceof AdministrationExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_1_object_SP0").tell(new ObjectDeleted<AdministrationExample.Patient>(incUtil, (AdministrationExample.Patient) node), getSelf());
		}
		if (node instanceof AdministrationExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_1_object_SP1").tell(new ObjectDeleted<AdministrationExample.Patient>(incUtil, (AdministrationExample.Patient) node), getSelf());
		}
	}
}

