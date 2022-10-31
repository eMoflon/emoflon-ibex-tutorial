package AdministrationTransformRule.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import AdministrationTransformRule.hipe.engine.actor.NotificationActor;
import AdministrationTransformRule.hipe.engine.actor.DispatchActor;
import AdministrationTransformRule.hipe.engine.actor.junction.patientCovered_28_junction;
import AdministrationTransformRule.hipe.engine.actor.junction.patientCovered_17_junction;
import AdministrationTransformRule.hipe.engine.actor.junction.findTreatment_15_count;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitGenReferenceActor;

import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine extends IHiPEEngine{
	
	public HiPEEngine(HiPENetwork network) {
		super(network);
	}
	
	public HiPEEngine() {
		super();
	}
	
	@Override
	public String getClassLocation() {
		return getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
	}
	
	@Override
	public String getPackageName() {
		return getClass().getPackageName();
	}
	
	@Override
	protected ActorRef getDispatchActor() {
		return system.actorOf(
			Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
			"DispatchActor");
	}
	
	@Override
	protected ActorRef getNotificationActor(boolean cascadingNotifications) {
		return system.actorOf(
			Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil, cascadingNotifications)), 
			"NotificationActor");
	}
	
	@Override
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
	
	@Override
	public void createJunctionNodes() {
		classes.put("patientCovered_21_junction", GenericJunctionActor.class);
		classes.put("patientCovered_18_junction", GenericJunctionActor.class);
		classes.put("patientCovered_27_junction", GenericJunctionActor.class);
		classes.put("patientCovered_34_junction", GenericJunctionActor.class);
		classes.put("patientCovered_28_junction", patientCovered_28_junction.class);
		classes.put("patientCovered_22_junction", GenericJunctionActor.class);
		classes.put("patientCovered_19_nacjunction", GenericNACJunctionActor.class);
		classes.put("patientCovered_17_junction", patientCovered_17_junction.class);
		classes.put("findTreatment_15_count", findTreatment_15_count.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("Patient_coveredBy_0_reference",Patient_coveredBy_0_reference.class);
		classes.put("Staff_treatment_0_reference",Staff_treatment_0_reference.class);
		classes.put("Staff_shiftPlan_0_reference",Staff_shiftPlan_0_reference.class);
		classes.put("Shiftplan_shifts_0_reference",Shiftplan_shifts_0_reference.class);
		classes.put("Patient_treatment_0_reference",Patient_treatment_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Administration_object",Administration_object.class);
		classes.put("Patient_object",Patient_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Person_object",Person_object.class);
		classes.put("Staff_object",Staff_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("Patient_coveredBy_0_reference", new InitGenReferenceActor<AdministrationExample.Patient,AdministrationExample.Shiftplan>(name2actor, name2node.get("Patient_coveredBy_0_reference"), (o) -> o instanceof AdministrationExample.Patient, null, (o) -> o.getCoveredBy(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_treatment_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Treatment>(name2actor, name2node.get("Staff_treatment_0_reference"), (o) -> o instanceof AdministrationExample.Staff, null, (o) -> o.getTreatment(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_0_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Shiftplan_shifts_0_reference", new InitGenReferenceActor<AdministrationExample.Shiftplan,AdministrationExample.Shift>(name2actor, name2node.get("Shiftplan_shifts_0_reference"), (o) -> o instanceof AdministrationExample.Shiftplan, null, (o) -> o.getShifts(), false, prodUtil, incUtil));
		name2initRefGen.put("Patient_treatment_0_reference", new InitGenReferenceActor<AdministrationExample.Patient,AdministrationExample.Treatment>(name2actor, name2node.get("Patient_treatment_0_reference"), (o) -> o instanceof AdministrationExample.Patient, (o) -> o.getTreatment(), null, false, prodUtil, incUtil));
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

