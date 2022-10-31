package AdministrationExample;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface AdministrationExamplePackage extends SmartPackage {

	String eNAME = "AdministrationExample";
	String eNS_URI = "platform:/resource/AdministrationExample/model/AdministrationExample.ecore";
	String eNS_PREFIX = "AdministrationExample";

	AdministrationExamplePackage eINSTANCE = AdministrationExample.impl.AdministrationExamplePackageImpl.init();

	int ADMINISTRATION = 0;
	int ADMINISTRATION__STAFF = 0;
	int ADMINISTRATION__PATIENT = 1;
	int ADMINISTRATION_FEATURE_COUNT = 2;
	int ADMINISTRATION_OPERATION_COUNT = 0;
	
	int SHIFT = 1;
	int SHIFT__TIME = 2;
	int SHIFT_FEATURE_COUNT = 1;
	int SHIFT_OPERATION_COUNT = 0;
	
	int STAFF = 2;
	int STAFF__STAFFID = 3;
	int STAFF__SALARY = 4;
	int STAFF__SHIFT_PLAN = 5;
	int STAFF__D_INT = 6;
	int STAFF__TREATMENT = 7;
	int STAFF_FEATURE_COUNT = 7;
	int STAFF_OPERATION_COUNT = 0;
	
	int PERSON = 3;
	int PERSON__FIRST_NAME = 8;
	int PERSON__LAST_NAME = 9;
	int PERSON_FEATURE_COUNT = 2;
	int PERSON_OPERATION_COUNT = 0;
	
	int TREATMENT = 4;
	int TREATMENT__MEDICATION = 10;
	int TREATMENT_FEATURE_COUNT = 1;
	int TREATMENT_OPERATION_COUNT = 0;
	
	int SHIFTPLAN = 5;
	int SHIFTPLAN__COVERS = 11;
	int SHIFTPLAN__SHIFTS = 12;
	int SHIFTPLAN_FEATURE_COUNT = 2;
	int SHIFTPLAN_OPERATION_COUNT = 0;
	
	int PATIENT = 6;
	int PATIENT__PATIENTID = 13;
	int PATIENT__TREATMENT = 14;
	int PATIENT__COVERED_BY = 15;
	int PATIENT_FEATURE_COUNT = 5;
	int PATIENT_OPERATION_COUNT = 0;
	
	int MEDICATION = 7;
	int DAYTIME = 8;
	

	EClass getAdministration();
	EReference getAdministration_Staff();
	EReference getAdministration_Patient();
	
	EClass getShift();
	EAttribute getShift_Time();
	
	EClass getStaff();
	EAttribute getStaff_StaffID();
	EAttribute getStaff_Salary();
	EReference getStaff_ShiftPlan();
	EAttribute getStaff_DInt();
	EReference getStaff_Treatment();
	
	EClass getPerson();
	EAttribute getPerson_FirstName();
	EAttribute getPerson_LastName();
	
	EClass getTreatment();
	EAttribute getTreatment_Medication();
	
	EClass getShiftplan();
	EReference getShiftplan_Covers();
	EReference getShiftplan_Shifts();
	
	EClass getPatient();
	EAttribute getPatient_PatientID();
	EReference getPatient_Treatment();
	EReference getPatient_CoveredBy();
	
	EEnum getMedication();
	EEnum getDaytime();
	
	AdministrationExample.AdministrationExampleFactory getAdministrationExampleFactory();

	interface Literals {
		
		EClass ADMINISTRATION = eINSTANCE.getAdministration();
		
		EReference ADMINISTRATION__STAFF = eINSTANCE.getAdministration_Staff();
		
		EReference ADMINISTRATION__PATIENT = eINSTANCE.getAdministration_Patient();
		
		EClass SHIFT = eINSTANCE.getShift();
		
		EAttribute SHIFT__TIME = eINSTANCE.getShift_Time();
		
		EClass STAFF = eINSTANCE.getStaff();
		
		EAttribute STAFF__STAFFID = eINSTANCE.getStaff_StaffID();
		
		EAttribute STAFF__SALARY = eINSTANCE.getStaff_Salary();
		
		EReference STAFF__SHIFT_PLAN = eINSTANCE.getStaff_ShiftPlan();
		
		EAttribute STAFF__D_INT = eINSTANCE.getStaff_DInt();
		
		EReference STAFF__TREATMENT = eINSTANCE.getStaff_Treatment();
		
		EClass PERSON = eINSTANCE.getPerson();
		
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();
		
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();
		
		EClass TREATMENT = eINSTANCE.getTreatment();
		
		EAttribute TREATMENT__MEDICATION = eINSTANCE.getTreatment_Medication();
		
		EClass SHIFTPLAN = eINSTANCE.getShiftplan();
		
		EReference SHIFTPLAN__COVERS = eINSTANCE.getShiftplan_Covers();
		
		EReference SHIFTPLAN__SHIFTS = eINSTANCE.getShiftplan_Shifts();
		
		EClass PATIENT = eINSTANCE.getPatient();
		
		EAttribute PATIENT__PATIENTID = eINSTANCE.getPatient_PatientID();
		
		EReference PATIENT__TREATMENT = eINSTANCE.getPatient_Treatment();
		
		EReference PATIENT__COVERED_BY = eINSTANCE.getPatient_CoveredBy();
		
		
		EEnum MEDICATION = eINSTANCE.getMedication();
		EEnum DAYTIME = eINSTANCE.getDaytime();
		
		
	}

} 
