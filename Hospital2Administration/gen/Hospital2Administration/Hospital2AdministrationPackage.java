package Hospital2Administration;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface Hospital2AdministrationPackage extends SmartPackage {

	String eNAME = "Hospital2Administration";
	String eNS_URI = "platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore";
	String eNS_PREFIX = "Hospital2Administration";

	Hospital2AdministrationPackage eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationPackageImpl.init();

	int HOSPITAL_TO_ADMINISTRATION = 0;
	int HOSPITAL_TO_ADMINISTRATION__SOURCE = 0;
	int HOSPITAL_TO_ADMINISTRATION__TARGET = 1;
	int HOSPITAL_TO_ADMINISTRATION_FEATURE_COUNT = 2;
	int HOSPITAL_TO_ADMINISTRATION_OPERATION_COUNT = 0;
	
	int STAFF_TO_STAFF = 1;
	int STAFF_TO_STAFF__SOURCE = 2;
	int STAFF_TO_STAFF__TARGET = 3;
	int STAFF_TO_STAFF_FEATURE_COUNT = 2;
	int STAFF_TO_STAFF_OPERATION_COUNT = 0;
	
	int PATIENT_TO_PATIENT = 2;
	int PATIENT_TO_PATIENT__SOURCE = 4;
	int PATIENT_TO_PATIENT__TARGET = 5;
	int PATIENT_TO_PATIENT_FEATURE_COUNT = 2;
	int PATIENT_TO_PATIENT_OPERATION_COUNT = 0;
	
	int ROOM_TO_SHIFTPLAN = 3;
	int ROOM_TO_SHIFTPLAN__SOURCE = 6;
	int ROOM_TO_SHIFTPLAN__TARGET = 7;
	int ROOM_TO_SHIFTPLAN_FEATURE_COUNT = 2;
	int ROOM_TO_SHIFTPLAN_OPERATION_COUNT = 0;
	
	int DOCTOR_TO_STAFF = 4;
	int DOCTOR_TO_STAFF__SOURCE = 8;
	int DOCTOR_TO_STAFF__TARGET = 9;
	int DOCTOR_TO_STAFF_FEATURE_COUNT = 2;
	int DOCTOR_TO_STAFF_OPERATION_COUNT = 0;
	
	int NURSE_TO_STAFF = 5;
	int NURSE_TO_STAFF__SOURCE = 10;
	int NURSE_TO_STAFF__TARGET = 11;
	int NURSE_TO_STAFF_FEATURE_COUNT = 2;
	int NURSE_TO_STAFF_OPERATION_COUNT = 0;
	
	int DEPARTMENT_RULE___MARKER = 6;
	int DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D = 12;
	int DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H = 13;
	int DEPARTMENT_RULE___MARKER_FEATURE_COUNT = 3;
	int DEPARTMENT_RULE___MARKER_OPERATION_COUNT = 0;
	
	int DOC_TO_STAFF_RULE___MARKER = 7;
	int DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D = 14;
	int DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H = 15;
	int DOC_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1 = 16;
	int DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2 = 17;
	int DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH = 18;
	int DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP = 19;
	int DOC_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V = 20;
	int DOC_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV = 21;
	int DOC_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT = 22;
	int DOC_TO_STAFF_RULE___MARKER_FEATURE_COUNT = 10;
	int DOC_TO_STAFF_RULE___MARKER_OPERATION_COUNT = 0;
	
	int DOCTOR_SHIFTPLAN_RULE___MARKER = 8;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = 23;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = 24;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = 25;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = 26;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = 27;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = 28;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 29;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = 30;
	int DOCTOR_SHIFTPLAN_RULE___MARKER_FEATURE_COUNT = 9;
	int DOCTOR_SHIFTPLAN_RULE___MARKER_OPERATION_COUNT = 0;
	
	int DOCTOR_TO_PATIENT___MARKER = 9;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__D = 31;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__DEP = 32;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__P1 = 33;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__RO = 34;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__P2 = 35;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__S = 36;
	int DOCTOR_TO_PATIENT___MARKER__CREAT_E__TR_G__T = 37;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__D_TOS = 38;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__P_TOP = 39;
	int DOCTOR_TO_PATIENT___MARKER_FEATURE_COUNT = 10;
	int DOCTOR_TO_PATIENT___MARKER_OPERATION_COUNT = 0;
	
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER = 10;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__H = 40;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__R = 41;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__TR_G__V = 42;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__COR_R__HTOV = 43;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER_FEATURE_COUNT = 5;
	int HOSPITALTO_ADMINISTRATION_RULE___MARKER_OPERATION_COUNT = 0;
	
	int NURSE_SHIFTPLAN_RULE___MARKER = 11;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = 44;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO = 45;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = 46;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = 47;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = 48;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = 49;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = 50;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 51;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = 52;
	int NURSE_SHIFTPLAN_RULE___MARKER_FEATURE_COUNT = 10;
	int NURSE_SHIFTPLAN_RULE___MARKER_OPERATION_COUNT = 0;
	
	int NURSE_TO_ROOM_RULE___MARKER = 12;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP = 53;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N = 54;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1 = 55;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R = 56;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2 = 57;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S = 58;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS = 59;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 60;
	int NURSE_TO_ROOM_RULE___MARKER_FEATURE_COUNT = 9;
	int NURSE_TO_ROOM_RULE___MARKER_OPERATION_COUNT = 0;
	
	int NURSE_TO_STAFF_RULE___MARKER = 13;
	int NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D = 61;
	int NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H = 62;
	int NURSE_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1 = 63;
	int NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2 = 64;
	int NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH = 65;
	int NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP = 66;
	int NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V = 67;
	int NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV = 68;
	int NURSE_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT = 69;
	int NURSE_TO_STAFF_RULE___MARKER_FEATURE_COUNT = 10;
	int NURSE_TO_STAFF_RULE___MARKER_OPERATION_COUNT = 0;
	
	int PATIENT_IN_RECEPTION___MARKER = 14;
	int PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__H = 70;
	int PATIENT_IN_RECEPTION___MARKER__CREAT_E__SR_C__P1 = 71;
	int PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__R = 72;
	int PATIENT_IN_RECEPTION___MARKER__CREAT_E__TR_G__P2 = 73;
	int PATIENT_IN_RECEPTION___MARKER__CONTEX_T__TR_G__V = 74;
	int PATIENT_IN_RECEPTION___MARKER__CONTEX_T__COR_R__HTOV = 75;
	int PATIENT_IN_RECEPTION___MARKER__CREAT_E__COR_R__P_TOP = 76;
	int PATIENT_IN_RECEPTION___MARKER_FEATURE_COUNT = 8;
	int PATIENT_IN_RECEPTION___MARKER_OPERATION_COUNT = 0;
	
	int PATIENT_IN_ROOM___MARKER = 15;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D = 77;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H = 78;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1 = 79;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO = 80;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2 = 81;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V = 82;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV = 83;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP = 84;
	int PATIENT_IN_ROOM___MARKER_FEATURE_COUNT = 9;
	int PATIENT_IN_ROOM___MARKER_OPERATION_COUNT = 0;
	
	int ROOM_RULE___MARKER = 16;
	int ROOM_RULE___MARKER__CONTEX_T__SR_C__D = 85;
	int ROOM_RULE___MARKER__CREAT_E__SR_C__RO = 86;
	int ROOM_RULE___MARKER_FEATURE_COUNT = 3;
	int ROOM_RULE___MARKER_OPERATION_COUNT = 0;
	
	

	EClass getHospitalToAdministration();
	EReference getHospitalToAdministration_Source();
	EReference getHospitalToAdministration_Target();
	
	EClass getStaffToStaff();
	EReference getStaffToStaff_Source();
	EReference getStaffToStaff_Target();
	
	EClass getPatientToPatient();
	EReference getPatientToPatient_Source();
	EReference getPatientToPatient_Target();
	
	EClass getRoomToShiftplan();
	EReference getRoomToShiftplan_Source();
	EReference getRoomToShiftplan_Target();
	
	EClass getDoctorToStaff();
	EReference getDoctorToStaff_Source();
	EReference getDoctorToStaff_Target();
	
	EClass getNurseToStaff();
	EReference getNurseToStaff_Source();
	EReference getNurseToStaff_Target();
	
	EClass getDepartmentRule__Marker();
	EReference getDepartmentRule__Marker_CREATE__SRC__d();
	EReference getDepartmentRule__Marker_CONTEXT__SRC__h();
	
	EClass getDocToStaffRule__Marker();
	EReference getDocToStaffRule__Marker_CONTEXT__SRC__d();
	EReference getDocToStaffRule__Marker_CONTEXT__SRC__h();
	EReference getDocToStaffRule__Marker_CREATE__SRC__s1();
	EReference getDocToStaffRule__Marker_CREATE__TRG__s2();
	EReference getDocToStaffRule__Marker_CREATE__TRG__sh();
	EReference getDocToStaffRule__Marker_CREATE__TRG__sp();
	EReference getDocToStaffRule__Marker_CONTEXT__TRG__v();
	EReference getDocToStaffRule__Marker_CONTEXT__CORR__htov();
	EReference getDocToStaffRule__Marker_CREATE__CORR__stot();
	
	EClass getDoctorShiftplanRule__Marker();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();
	
	EClass getDoctorToPatient__Marker();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__d();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__dep();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__p1();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__ro();
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__p2();
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__s();
	EReference getDoctorToPatient__Marker_CREATE__TRG__t();
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__dToS();
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__pToP();
	
	EClass getHospitaltoAdministrationRule__Marker();
	EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__h();
	EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__r();
	EReference getHospitaltoAdministrationRule__Marker_CREATE__TRG__v();
	EReference getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov();
	
	EClass getNurseShiftplanRule__Marker();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();
	
	EClass getNurseToRoomRule__Marker();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__dep();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__n();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__p1();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__r();
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__p2();
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__s();
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();
	
	EClass getNurseToStaffRule__Marker();
	EReference getNurseToStaffRule__Marker_CONTEXT__SRC__d();
	EReference getNurseToStaffRule__Marker_CONTEXT__SRC__h();
	EReference getNurseToStaffRule__Marker_CREATE__SRC__s1();
	EReference getNurseToStaffRule__Marker_CREATE__TRG__s2();
	EReference getNurseToStaffRule__Marker_CREATE__TRG__sh();
	EReference getNurseToStaffRule__Marker_CREATE__TRG__sp();
	EReference getNurseToStaffRule__Marker_CONTEXT__TRG__v();
	EReference getNurseToStaffRule__Marker_CONTEXT__CORR__htov();
	EReference getNurseToStaffRule__Marker_CREATE__CORR__stot();
	
	EClass getPatientInReception__Marker();
	EReference getPatientInReception__Marker_CONTEXT__SRC__h();
	EReference getPatientInReception__Marker_CREATE__SRC__p1();
	EReference getPatientInReception__Marker_CONTEXT__SRC__r();
	EReference getPatientInReception__Marker_CREATE__TRG__p2();
	EReference getPatientInReception__Marker_CONTEXT__TRG__v();
	EReference getPatientInReception__Marker_CONTEXT__CORR__htov();
	EReference getPatientInReception__Marker_CREATE__CORR__pTop();
	
	EClass getPatientInRoom__Marker();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__d();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__h();
	EReference getPatientInRoom__Marker_CREATE__SRC__p1();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__ro();
	EReference getPatientInRoom__Marker_CREATE__TRG__p2();
	EReference getPatientInRoom__Marker_CONTEXT__TRG__v();
	EReference getPatientInRoom__Marker_CONTEXT__CORR__htov();
	EReference getPatientInRoom__Marker_CREATE__CORR__pTop();
	
	EClass getRoomRule__Marker();
	EReference getRoomRule__Marker_CONTEXT__SRC__d();
	EReference getRoomRule__Marker_CREATE__SRC__ro();
	
	
	Hospital2Administration.Hospital2AdministrationFactory getHospital2AdministrationFactory();

	interface Literals {
		
		EClass HOSPITAL_TO_ADMINISTRATION = eINSTANCE.getHospitalToAdministration();
		
		EReference HOSPITAL_TO_ADMINISTRATION__SOURCE = eINSTANCE.getHospitalToAdministration_Source();
		
		EReference HOSPITAL_TO_ADMINISTRATION__TARGET = eINSTANCE.getHospitalToAdministration_Target();
		
		EClass STAFF_TO_STAFF = eINSTANCE.getStaffToStaff();
		
		EReference STAFF_TO_STAFF__SOURCE = eINSTANCE.getStaffToStaff_Source();
		
		EReference STAFF_TO_STAFF__TARGET = eINSTANCE.getStaffToStaff_Target();
		
		EClass PATIENT_TO_PATIENT = eINSTANCE.getPatientToPatient();
		
		EReference PATIENT_TO_PATIENT__SOURCE = eINSTANCE.getPatientToPatient_Source();
		
		EReference PATIENT_TO_PATIENT__TARGET = eINSTANCE.getPatientToPatient_Target();
		
		EClass ROOM_TO_SHIFTPLAN = eINSTANCE.getRoomToShiftplan();
		
		EReference ROOM_TO_SHIFTPLAN__SOURCE = eINSTANCE.getRoomToShiftplan_Source();
		
		EReference ROOM_TO_SHIFTPLAN__TARGET = eINSTANCE.getRoomToShiftplan_Target();
		
		EClass DOCTOR_TO_STAFF = eINSTANCE.getDoctorToStaff();
		
		EReference DOCTOR_TO_STAFF__SOURCE = eINSTANCE.getDoctorToStaff_Source();
		
		EReference DOCTOR_TO_STAFF__TARGET = eINSTANCE.getDoctorToStaff_Target();
		
		EClass NURSE_TO_STAFF = eINSTANCE.getNurseToStaff();
		
		EReference NURSE_TO_STAFF__SOURCE = eINSTANCE.getNurseToStaff_Source();
		
		EReference NURSE_TO_STAFF__TARGET = eINSTANCE.getNurseToStaff_Target();
		
		EClass DEPARTMENT_RULE___MARKER = eINSTANCE.getDepartmentRule__Marker();
		
		EReference DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D = eINSTANCE.getDepartmentRule__Marker_CREATE__SRC__d();
		
		EReference DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getDepartmentRule__Marker_CONTEXT__SRC__h();
		
		EClass DOC_TO_STAFF_RULE___MARKER = eINSTANCE.getDocToStaffRule__Marker();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__SRC__d();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__SRC__h();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1 = eINSTANCE.getDocToStaffRule__Marker_CREATE__SRC__s1();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2 = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__s2();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__sh();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__sp();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__TRG__v();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__CORR__htov();
		
		EReference DOC_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT = eINSTANCE.getDocToStaffRule__Marker_CREATE__CORR__stot();
		
		EClass DOCTOR_SHIFTPLAN_RULE___MARKER = eINSTANCE.getDoctorShiftplanRule__Marker();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();
		
		EClass DOCTOR_TO_PATIENT___MARKER = eINSTANCE.getDoctorToPatient__Marker();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__d();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__DEP = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__dep();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__p1();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__ro();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__p2();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__S = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__s();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CREAT_E__TR_G__T = eINSTANCE.getDoctorToPatient__Marker_CREATE__TRG__t();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__D_TOS = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__dToS();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__pToP();
		
		EClass HOSPITALTO_ADMINISTRATION_RULE___MARKER = eINSTANCE.getHospitaltoAdministrationRule__Marker();
		
		EReference HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__H = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__SRC__h();
		
		EReference HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__R = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__SRC__r();
		
		EReference HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__TR_G__V = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__TRG__v();
		
		EReference HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__COR_R__HTOV = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov();
		
		EClass NURSE_SHIFTPLAN_RULE___MARKER = eINSTANCE.getNurseShiftplanRule__Marker();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();
		
		EClass NURSE_TO_ROOM_RULE___MARKER = eINSTANCE.getNurseToRoomRule__Marker();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__dep();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__n();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__p1();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__r();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__p2();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__s();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();
		
		EClass NURSE_TO_STAFF_RULE___MARKER = eINSTANCE.getNurseToStaffRule__Marker();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__SRC__d();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__SRC__h();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1 = eINSTANCE.getNurseToStaffRule__Marker_CREATE__SRC__s1();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2 = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__s2();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__sh();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__sp();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__TRG__v();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__CORR__htov();
		
		EReference NURSE_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT = eINSTANCE.getNurseToStaffRule__Marker_CREATE__CORR__stot();
		
		EClass PATIENT_IN_RECEPTION___MARKER = eINSTANCE.getPatientInReception__Marker();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getPatientInReception__Marker_CONTEXT__SRC__h();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CREAT_E__SR_C__P1 = eINSTANCE.getPatientInReception__Marker_CREATE__SRC__p1();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__R = eINSTANCE.getPatientInReception__Marker_CONTEXT__SRC__r();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CREAT_E__TR_G__P2 = eINSTANCE.getPatientInReception__Marker_CREATE__TRG__p2();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CONTEX_T__TR_G__V = eINSTANCE.getPatientInReception__Marker_CONTEXT__TRG__v();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CONTEX_T__COR_R__HTOV = eINSTANCE.getPatientInReception__Marker_CONTEXT__CORR__htov();
		
		EReference PATIENT_IN_RECEPTION___MARKER__CREAT_E__COR_R__P_TOP = eINSTANCE.getPatientInReception__Marker_CREATE__CORR__pTop();
		
		EClass PATIENT_IN_ROOM___MARKER = eINSTANCE.getPatientInRoom__Marker();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__d();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__h();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1 = eINSTANCE.getPatientInRoom__Marker_CREATE__SRC__p1();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__ro();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2 = eINSTANCE.getPatientInRoom__Marker_CREATE__TRG__p2();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V = eINSTANCE.getPatientInRoom__Marker_CONTEXT__TRG__v();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV = eINSTANCE.getPatientInRoom__Marker_CONTEXT__CORR__htov();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP = eINSTANCE.getPatientInRoom__Marker_CREATE__CORR__pTop();
		
		EClass ROOM_RULE___MARKER = eINSTANCE.getRoomRule__Marker();
		
		EReference ROOM_RULE___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getRoomRule__Marker_CONTEXT__SRC__d();
		
		EReference ROOM_RULE___MARKER__CREAT_E__SR_C__RO = eINSTANCE.getRoomRule__Marker_CREATE__SRC__ro();
		
		
		
		
	}

} 
