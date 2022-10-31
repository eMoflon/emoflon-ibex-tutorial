package HospitalExample;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface HospitalExamplePackage extends SmartPackage {

	String eNAME = "HospitalExample";
	String eNS_URI = "platform:/resource/HospitalExample/model/HospitalExample.ecore";
	String eNS_PREFIX = "HospitalExample";

	HospitalExamplePackage eINSTANCE = HospitalExample.impl.HospitalExamplePackageImpl.init();

	int HOSPITAL = 0;
	int HOSPITAL__RECEPTION = 0;
	int HOSPITAL__STAFF = 1;
	int HOSPITAL__DEPARTMENT = 2;
	int HOSPITAL_FEATURE_COUNT = 3;
	int HOSPITAL_OPERATION_COUNT = 0;
	
	int RECEPTION = 1;
	int RECEPTION__WAITS = 3;
	int RECEPTION_FEATURE_COUNT = 1;
	int RECEPTION_OPERATION_COUNT = 0;
	
	int STAFF = 2;
	int STAFF__STAFFID = 4;
	int STAFF__WORKS = 5;
	int STAFF__NAME = 6;
	int STAFF_FEATURE_COUNT = 3;
	int STAFF_OPERATION_COUNT = 0;
	
	int DOCTOR = 3;
	int DOCTOR__CARESFOR = 7;
	int DOCTOR__PATIENT_CAPACITY = 8;
	int DOCTOR_FEATURE_COUNT = 5;
	int DOCTOR_OPERATION_COUNT = 0;
	
	int NURSE = 4;
	int NURSE__RESPONSIBLE = 9;
	int NURSE_FEATURE_COUNT = 4;
	int NURSE_OPERATION_COUNT = 0;
	
	int DEPARTMENT = 5;
	int DEPARTMENT__ROOMS = 10;
	int DEPARTMENT__DID = 11;
	int DEPARTMENT__STAFF = 12;
	int DEPARTMENT__MAX_ROOM_COUNT = 13;
	int DEPARTMENT_FEATURE_COUNT = 4;
	int DEPARTMENT_OPERATION_COUNT = 0;
	
	int PATIENT = 6;
	int PATIENT__PATIENTID = 14;
	int PATIENT__NAME = 15;
	int PATIENT__LEVEL = 16;
	int PATIENT__DOCTOR = 17;
	int PATIENT_FEATURE_COUNT = 4;
	int PATIENT_OPERATION_COUNT = 0;
	
	int ROOM = 7;
	int ROOM__CAPACITY = 18;
	int ROOM__LEVEL = 19;
	int ROOM__LIES = 20;
	int ROOM__NURSES = 21;
	int ROOM_FEATURE_COUNT = 4;
	int ROOM_OPERATION_COUNT = 0;
	
	int CARELEVEL = 8;
	

	EClass getHospital();
	EReference getHospital_Reception();
	EReference getHospital_Staff();
	EReference getHospital_Department();
	
	EClass getReception();
	EReference getReception_Waits();
	
	EClass getStaff();
	EAttribute getStaff_StaffID();
	EReference getStaff_Works();
	EAttribute getStaff_Name();
	
	EClass getDoctor();
	EReference getDoctor_Caresfor();
	EAttribute getDoctor_PatientCapacity();
	
	EClass getNurse();
	EReference getNurse_Responsible();
	
	EClass getDepartment();
	EReference getDepartment_Rooms();
	EAttribute getDepartment_DID();
	EReference getDepartment_Staff();
	EAttribute getDepartment_MaxRoomCount();
	
	EClass getPatient();
	EAttribute getPatient_PatientID();
	EAttribute getPatient_Name();
	EAttribute getPatient_Level();
	EReference getPatient_Doctor();
	
	EClass getRoom();
	EAttribute getRoom_Capacity();
	EAttribute getRoom_Level();
	EReference getRoom_Lies();
	EReference getRoom_Nurses();
	
	EEnum getCarelevel();
	
	HospitalExample.HospitalExampleFactory getHospitalExampleFactory();

	interface Literals {
		
		EClass HOSPITAL = eINSTANCE.getHospital();
		
		EReference HOSPITAL__RECEPTION = eINSTANCE.getHospital_Reception();
		
		EReference HOSPITAL__STAFF = eINSTANCE.getHospital_Staff();
		
		EReference HOSPITAL__DEPARTMENT = eINSTANCE.getHospital_Department();
		
		EClass RECEPTION = eINSTANCE.getReception();
		
		EReference RECEPTION__WAITS = eINSTANCE.getReception_Waits();
		
		EClass STAFF = eINSTANCE.getStaff();
		
		EAttribute STAFF__STAFFID = eINSTANCE.getStaff_StaffID();
		
		EReference STAFF__WORKS = eINSTANCE.getStaff_Works();
		
		EAttribute STAFF__NAME = eINSTANCE.getStaff_Name();
		
		EClass DOCTOR = eINSTANCE.getDoctor();
		
		EReference DOCTOR__CARESFOR = eINSTANCE.getDoctor_Caresfor();
		
		EAttribute DOCTOR__PATIENT_CAPACITY = eINSTANCE.getDoctor_PatientCapacity();
		
		EClass NURSE = eINSTANCE.getNurse();
		
		EReference NURSE__RESPONSIBLE = eINSTANCE.getNurse_Responsible();
		
		EClass DEPARTMENT = eINSTANCE.getDepartment();
		
		EReference DEPARTMENT__ROOMS = eINSTANCE.getDepartment_Rooms();
		
		EAttribute DEPARTMENT__DID = eINSTANCE.getDepartment_DID();
		
		EReference DEPARTMENT__STAFF = eINSTANCE.getDepartment_Staff();
		
		EAttribute DEPARTMENT__MAX_ROOM_COUNT = eINSTANCE.getDepartment_MaxRoomCount();
		
		EClass PATIENT = eINSTANCE.getPatient();
		
		EAttribute PATIENT__PATIENTID = eINSTANCE.getPatient_PatientID();
		
		EAttribute PATIENT__NAME = eINSTANCE.getPatient_Name();
		
		EAttribute PATIENT__LEVEL = eINSTANCE.getPatient_Level();
		
		EReference PATIENT__DOCTOR = eINSTANCE.getPatient_Doctor();
		
		EClass ROOM = eINSTANCE.getRoom();
		
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();
		
		EAttribute ROOM__LEVEL = eINSTANCE.getRoom_Level();
		
		EReference ROOM__LIES = eINSTANCE.getRoom_Lies();
		
		EReference ROOM__NURSES = eINSTANCE.getRoom_Nurses();
		
		
		EEnum CARELEVEL = eINSTANCE.getCarelevel();
		
		
	}

} 
