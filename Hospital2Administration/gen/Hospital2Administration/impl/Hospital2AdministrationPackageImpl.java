package Hospital2Administration.impl;

import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.StaffToStaff;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.RoomToShiftplan;
import Hospital2Administration.DoctorToStaff;
import Hospital2Administration.NurseToStaff;
import Hospital2Administration.DepartmentRule__Marker;
import Hospital2Administration.DocToStaffRule__Marker;
import Hospital2Administration.DoctorShiftplanRule__Marker;
import Hospital2Administration.DoctorToPatient__Marker;
import Hospital2Administration.HospitaltoAdministrationRule__Marker;
import Hospital2Administration.NurseShiftplanRule__Marker;
import Hospital2Administration.NurseToRoomRule__Marker;
import Hospital2Administration.NurseToStaffRule__Marker;
import Hospital2Administration.PatientInReception__Marker;
import Hospital2Administration.PatientInRoom__Marker;
import Hospital2Administration.RoomRule__Marker;


import Hospital2Administration.Hospital2AdministrationFactory;
import Hospital2Administration.Hospital2AdministrationPackage;

import runtime.RuntimePackage;
import HospitalExample.HospitalExamplePackage;
import AdministrationExample.AdministrationExamplePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emoflon.smartemf.runtime.SmartPackageImpl;

public class Hospital2AdministrationPackageImpl extends SmartPackageImpl
		implements Hospital2AdministrationPackage {
			
	private EClass hospitalToAdministrationEClass = null;
	private EReference hospitalToAdministration_sourceEReference = null;
	private EReference hospitalToAdministration_targetEReference = null;
	private EClass staffToStaffEClass = null;
	private EReference staffToStaff_sourceEReference = null;
	private EReference staffToStaff_targetEReference = null;
	private EClass patientToPatientEClass = null;
	private EReference patientToPatient_sourceEReference = null;
	private EReference patientToPatient_targetEReference = null;
	private EClass roomToShiftplanEClass = null;
	private EReference roomToShiftplan_sourceEReference = null;
	private EReference roomToShiftplan_targetEReference = null;
	private EClass doctorToStaffEClass = null;
	private EReference doctorToStaff_sourceEReference = null;
	private EReference doctorToStaff_targetEReference = null;
	private EClass nurseToStaffEClass = null;
	private EReference nurseToStaff_sourceEReference = null;
	private EReference nurseToStaff_targetEReference = null;
	private EClass departmentRule__MarkerEClass = null;
	private EReference departmentRule__Marker_cREATE__SRC__dEReference = null;
	private EReference departmentRule__Marker_cONTEXT__SRC__hEReference = null;
	private EClass docToStaffRule__MarkerEClass = null;
	private EReference docToStaffRule__Marker_cONTEXT__SRC__dEReference = null;
	private EReference docToStaffRule__Marker_cONTEXT__SRC__hEReference = null;
	private EReference docToStaffRule__Marker_cREATE__SRC__s1EReference = null;
	private EReference docToStaffRule__Marker_cREATE__TRG__s2EReference = null;
	private EReference docToStaffRule__Marker_cREATE__TRG__shEReference = null;
	private EReference docToStaffRule__Marker_cREATE__TRG__spEReference = null;
	private EReference docToStaffRule__Marker_cONTEXT__TRG__vEReference = null;
	private EReference docToStaffRule__Marker_cONTEXT__CORR__htovEReference = null;
	private EReference docToStaffRule__Marker_cREATE__CORR__stotEReference = null;
	private EClass doctorShiftplanRule__MarkerEClass = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__SRC__p1EReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__SRC__s1EReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__TRG__p2EReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__TRG__s2EReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__TRG__shEReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__TRG__spEReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__CORR__pToPEReference = null;
	private EReference doctorShiftplanRule__Marker_cONTEXT__CORR__sToSEReference = null;
	private EClass doctorToPatient__MarkerEClass = null;
	private EReference doctorToPatient__Marker_cONTEXT__SRC__dEReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__SRC__depEReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__SRC__p1EReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__SRC__roEReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__TRG__p2EReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__TRG__sEReference = null;
	private EReference doctorToPatient__Marker_cREATE__TRG__tEReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__CORR__dToSEReference = null;
	private EReference doctorToPatient__Marker_cONTEXT__CORR__pToPEReference = null;
	private EClass hospitaltoAdministrationRule__MarkerEClass = null;
	private EReference hospitaltoAdministrationRule__Marker_cREATE__SRC__hEReference = null;
	private EReference hospitaltoAdministrationRule__Marker_cREATE__SRC__rEReference = null;
	private EReference hospitaltoAdministrationRule__Marker_cREATE__TRG__vEReference = null;
	private EReference hospitaltoAdministrationRule__Marker_cREATE__CORR__htovEReference = null;
	private EClass nurseShiftplanRule__MarkerEClass = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__SRC__p1EReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__SRC__roEReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__SRC__s1EReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__TRG__p2EReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__TRG__s2EReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__TRG__shEReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__TRG__spEReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__CORR__pToPEReference = null;
	private EReference nurseShiftplanRule__Marker_cONTEXT__CORR__sToSEReference = null;
	private EClass nurseToRoomRule__MarkerEClass = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__SRC__depEReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__SRC__nEReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__SRC__p1EReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__SRC__rEReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__TRG__p2EReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__TRG__sEReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__CORR__nToSEReference = null;
	private EReference nurseToRoomRule__Marker_cONTEXT__CORR__pTopEReference = null;
	private EClass nurseToStaffRule__MarkerEClass = null;
	private EReference nurseToStaffRule__Marker_cONTEXT__SRC__dEReference = null;
	private EReference nurseToStaffRule__Marker_cONTEXT__SRC__hEReference = null;
	private EReference nurseToStaffRule__Marker_cREATE__SRC__s1EReference = null;
	private EReference nurseToStaffRule__Marker_cREATE__TRG__s2EReference = null;
	private EReference nurseToStaffRule__Marker_cREATE__TRG__shEReference = null;
	private EReference nurseToStaffRule__Marker_cREATE__TRG__spEReference = null;
	private EReference nurseToStaffRule__Marker_cONTEXT__TRG__vEReference = null;
	private EReference nurseToStaffRule__Marker_cONTEXT__CORR__htovEReference = null;
	private EReference nurseToStaffRule__Marker_cREATE__CORR__stotEReference = null;
	private EClass patientInReception__MarkerEClass = null;
	private EReference patientInReception__Marker_cONTEXT__SRC__hEReference = null;
	private EReference patientInReception__Marker_cREATE__SRC__p1EReference = null;
	private EReference patientInReception__Marker_cONTEXT__SRC__rEReference = null;
	private EReference patientInReception__Marker_cREATE__TRG__p2EReference = null;
	private EReference patientInReception__Marker_cONTEXT__TRG__vEReference = null;
	private EReference patientInReception__Marker_cONTEXT__CORR__htovEReference = null;
	private EReference patientInReception__Marker_cREATE__CORR__pTopEReference = null;
	private EClass patientInRoom__MarkerEClass = null;
	private EReference patientInRoom__Marker_cONTEXT__SRC__dEReference = null;
	private EReference patientInRoom__Marker_cONTEXT__SRC__hEReference = null;
	private EReference patientInRoom__Marker_cREATE__SRC__p1EReference = null;
	private EReference patientInRoom__Marker_cONTEXT__SRC__roEReference = null;
	private EReference patientInRoom__Marker_cREATE__TRG__p2EReference = null;
	private EReference patientInRoom__Marker_cONTEXT__TRG__vEReference = null;
	private EReference patientInRoom__Marker_cONTEXT__CORR__htovEReference = null;
	private EReference patientInRoom__Marker_cREATE__CORR__pTopEReference = null;
	private EClass roomRule__MarkerEClass = null;
	private EReference roomRule__Marker_cONTEXT__SRC__dEReference = null;
	private EReference roomRule__Marker_cREATE__SRC__roEReference = null;
	
	

	private Hospital2AdministrationPackageImpl() {
		super(eNS_URI, Hospital2Administration.Hospital2AdministrationFactory.eINSTANCE);
	}

	private static boolean isRegistered = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public static Hospital2AdministrationPackage init() {
		if (isRegistered)
			return (Hospital2AdministrationPackage) EPackage.Registry.INSTANCE
					.getEPackage(Hospital2AdministrationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHospital2AdministrationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hospital2AdministrationPackageImpl theHospital2AdministrationPackage = registeredHospital2AdministrationPackage instanceof Hospital2AdministrationPackageImpl
				? (Hospital2AdministrationPackageImpl) registeredHospital2AdministrationPackage
				: new Hospital2AdministrationPackageImpl();

		isRegistered = true;

		// Create package meta-data objects
		theHospital2AdministrationPackage.createPackageContents();

		// Initialize created meta-data
		theHospital2AdministrationPackage.initializePackageContents();
		
		// Inject internal eOpposites to unidirectional references
		theHospital2AdministrationPackage.injectDynamicOpposites();
		
		// Inject external references into foreign packages
		theHospital2AdministrationPackage.injectExternalReferences();

		// Mark meta-data to indicate it can't be changed
		theHospital2AdministrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hospital2AdministrationPackage.eNS_URI,
				theHospital2AdministrationPackage);
				
		theHospital2AdministrationPackage.fetchDynamicEStructuralFeaturesOfSuperTypes();
		return theHospital2AdministrationPackage;
	}

	@Override
	public EClass getHospitalToAdministration() {
		return hospitalToAdministrationEClass;
	}
	@Override
	public EReference getHospitalToAdministration_Source() {
		return hospitalToAdministration_sourceEReference;	
	}
	@Override
	public EReference getHospitalToAdministration_Target() {
		return hospitalToAdministration_targetEReference;	
	}
	@Override
	public EClass getStaffToStaff() {
		return staffToStaffEClass;
	}
	@Override
	public EReference getStaffToStaff_Source() {
		return staffToStaff_sourceEReference;	
	}
	@Override
	public EReference getStaffToStaff_Target() {
		return staffToStaff_targetEReference;	
	}
	@Override
	public EClass getPatientToPatient() {
		return patientToPatientEClass;
	}
	@Override
	public EReference getPatientToPatient_Source() {
		return patientToPatient_sourceEReference;	
	}
	@Override
	public EReference getPatientToPatient_Target() {
		return patientToPatient_targetEReference;	
	}
	@Override
	public EClass getRoomToShiftplan() {
		return roomToShiftplanEClass;
	}
	@Override
	public EReference getRoomToShiftplan_Source() {
		return roomToShiftplan_sourceEReference;	
	}
	@Override
	public EReference getRoomToShiftplan_Target() {
		return roomToShiftplan_targetEReference;	
	}
	@Override
	public EClass getDoctorToStaff() {
		return doctorToStaffEClass;
	}
	@Override
	public EReference getDoctorToStaff_Source() {
		return doctorToStaff_sourceEReference;	
	}
	@Override
	public EReference getDoctorToStaff_Target() {
		return doctorToStaff_targetEReference;	
	}
	@Override
	public EClass getNurseToStaff() {
		return nurseToStaffEClass;
	}
	@Override
	public EReference getNurseToStaff_Source() {
		return nurseToStaff_sourceEReference;	
	}
	@Override
	public EReference getNurseToStaff_Target() {
		return nurseToStaff_targetEReference;	
	}
	@Override
	public EClass getDepartmentRule__Marker() {
		return departmentRule__MarkerEClass;
	}
	@Override
	public EReference getDepartmentRule__Marker_CREATE__SRC__d() {
		return departmentRule__Marker_cREATE__SRC__dEReference;	
	}
	@Override
	public EReference getDepartmentRule__Marker_CONTEXT__SRC__h() {
		return departmentRule__Marker_cONTEXT__SRC__hEReference;	
	}
	@Override
	public EClass getDocToStaffRule__Marker() {
		return docToStaffRule__MarkerEClass;
	}
	@Override
	public EReference getDocToStaffRule__Marker_CONTEXT__SRC__d() {
		return docToStaffRule__Marker_cONTEXT__SRC__dEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CONTEXT__SRC__h() {
		return docToStaffRule__Marker_cONTEXT__SRC__hEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CREATE__SRC__s1() {
		return docToStaffRule__Marker_cREATE__SRC__s1EReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CREATE__TRG__s2() {
		return docToStaffRule__Marker_cREATE__TRG__s2EReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CREATE__TRG__sh() {
		return docToStaffRule__Marker_cREATE__TRG__shEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CREATE__TRG__sp() {
		return docToStaffRule__Marker_cREATE__TRG__spEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CONTEXT__TRG__v() {
		return docToStaffRule__Marker_cONTEXT__TRG__vEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CONTEXT__CORR__htov() {
		return docToStaffRule__Marker_cONTEXT__CORR__htovEReference;	
	}
	@Override
	public EReference getDocToStaffRule__Marker_CREATE__CORR__stot() {
		return docToStaffRule__Marker_cREATE__CORR__stotEReference;	
	}
	@Override
	public EClass getDoctorShiftplanRule__Marker() {
		return doctorShiftplanRule__MarkerEClass;
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1() {
		return doctorShiftplanRule__Marker_cONTEXT__SRC__p1EReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1() {
		return doctorShiftplanRule__Marker_cONTEXT__SRC__s1EReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2() {
		return doctorShiftplanRule__Marker_cONTEXT__TRG__p2EReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2() {
		return doctorShiftplanRule__Marker_cONTEXT__TRG__s2EReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh() {
		return doctorShiftplanRule__Marker_cONTEXT__TRG__shEReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp() {
		return doctorShiftplanRule__Marker_cONTEXT__TRG__spEReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP() {
		return doctorShiftplanRule__Marker_cONTEXT__CORR__pToPEReference;	
	}
	@Override
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS() {
		return doctorShiftplanRule__Marker_cONTEXT__CORR__sToSEReference;	
	}
	@Override
	public EClass getDoctorToPatient__Marker() {
		return doctorToPatient__MarkerEClass;
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__d() {
		return doctorToPatient__Marker_cONTEXT__SRC__dEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__dep() {
		return doctorToPatient__Marker_cONTEXT__SRC__depEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__p1() {
		return doctorToPatient__Marker_cONTEXT__SRC__p1EReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__ro() {
		return doctorToPatient__Marker_cONTEXT__SRC__roEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__TRG__p2() {
		return doctorToPatient__Marker_cONTEXT__TRG__p2EReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__TRG__s() {
		return doctorToPatient__Marker_cONTEXT__TRG__sEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CREATE__TRG__t() {
		return doctorToPatient__Marker_cREATE__TRG__tEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__CORR__dToS() {
		return doctorToPatient__Marker_cONTEXT__CORR__dToSEReference;	
	}
	@Override
	public EReference getDoctorToPatient__Marker_CONTEXT__CORR__pToP() {
		return doctorToPatient__Marker_cONTEXT__CORR__pToPEReference;	
	}
	@Override
	public EClass getHospitaltoAdministrationRule__Marker() {
		return hospitaltoAdministrationRule__MarkerEClass;
	}
	@Override
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__h() {
		return hospitaltoAdministrationRule__Marker_cREATE__SRC__hEReference;	
	}
	@Override
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__r() {
		return hospitaltoAdministrationRule__Marker_cREATE__SRC__rEReference;	
	}
	@Override
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__TRG__v() {
		return hospitaltoAdministrationRule__Marker_cREATE__TRG__vEReference;	
	}
	@Override
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov() {
		return hospitaltoAdministrationRule__Marker_cREATE__CORR__htovEReference;	
	}
	@Override
	public EClass getNurseShiftplanRule__Marker() {
		return nurseShiftplanRule__MarkerEClass;
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__p1() {
		return nurseShiftplanRule__Marker_cONTEXT__SRC__p1EReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__ro() {
		return nurseShiftplanRule__Marker_cONTEXT__SRC__roEReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__s1() {
		return nurseShiftplanRule__Marker_cONTEXT__SRC__s1EReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__p2() {
		return nurseShiftplanRule__Marker_cONTEXT__TRG__p2EReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__s2() {
		return nurseShiftplanRule__Marker_cONTEXT__TRG__s2EReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sh() {
		return nurseShiftplanRule__Marker_cONTEXT__TRG__shEReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sp() {
		return nurseShiftplanRule__Marker_cONTEXT__TRG__spEReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP() {
		return nurseShiftplanRule__Marker_cONTEXT__CORR__pToPEReference;	
	}
	@Override
	public EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS() {
		return nurseShiftplanRule__Marker_cONTEXT__CORR__sToSEReference;	
	}
	@Override
	public EClass getNurseToRoomRule__Marker() {
		return nurseToRoomRule__MarkerEClass;
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__dep() {
		return nurseToRoomRule__Marker_cONTEXT__SRC__depEReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__n() {
		return nurseToRoomRule__Marker_cONTEXT__SRC__nEReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__p1() {
		return nurseToRoomRule__Marker_cONTEXT__SRC__p1EReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__r() {
		return nurseToRoomRule__Marker_cONTEXT__SRC__rEReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__TRG__p2() {
		return nurseToRoomRule__Marker_cONTEXT__TRG__p2EReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__TRG__s() {
		return nurseToRoomRule__Marker_cONTEXT__TRG__sEReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__CORR__nToS() {
		return nurseToRoomRule__Marker_cONTEXT__CORR__nToSEReference;	
	}
	@Override
	public EReference getNurseToRoomRule__Marker_CONTEXT__CORR__pTop() {
		return nurseToRoomRule__Marker_cONTEXT__CORR__pTopEReference;	
	}
	@Override
	public EClass getNurseToStaffRule__Marker() {
		return nurseToStaffRule__MarkerEClass;
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CONTEXT__SRC__d() {
		return nurseToStaffRule__Marker_cONTEXT__SRC__dEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CONTEXT__SRC__h() {
		return nurseToStaffRule__Marker_cONTEXT__SRC__hEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CREATE__SRC__s1() {
		return nurseToStaffRule__Marker_cREATE__SRC__s1EReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__s2() {
		return nurseToStaffRule__Marker_cREATE__TRG__s2EReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__sh() {
		return nurseToStaffRule__Marker_cREATE__TRG__shEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__sp() {
		return nurseToStaffRule__Marker_cREATE__TRG__spEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CONTEXT__TRG__v() {
		return nurseToStaffRule__Marker_cONTEXT__TRG__vEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CONTEXT__CORR__htov() {
		return nurseToStaffRule__Marker_cONTEXT__CORR__htovEReference;	
	}
	@Override
	public EReference getNurseToStaffRule__Marker_CREATE__CORR__stot() {
		return nurseToStaffRule__Marker_cREATE__CORR__stotEReference;	
	}
	@Override
	public EClass getPatientInReception__Marker() {
		return patientInReception__MarkerEClass;
	}
	@Override
	public EReference getPatientInReception__Marker_CONTEXT__SRC__h() {
		return patientInReception__Marker_cONTEXT__SRC__hEReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CREATE__SRC__p1() {
		return patientInReception__Marker_cREATE__SRC__p1EReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CONTEXT__SRC__r() {
		return patientInReception__Marker_cONTEXT__SRC__rEReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CREATE__TRG__p2() {
		return patientInReception__Marker_cREATE__TRG__p2EReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CONTEXT__TRG__v() {
		return patientInReception__Marker_cONTEXT__TRG__vEReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CONTEXT__CORR__htov() {
		return patientInReception__Marker_cONTEXT__CORR__htovEReference;	
	}
	@Override
	public EReference getPatientInReception__Marker_CREATE__CORR__pTop() {
		return patientInReception__Marker_cREATE__CORR__pTopEReference;	
	}
	@Override
	public EClass getPatientInRoom__Marker() {
		return patientInRoom__MarkerEClass;
	}
	@Override
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__d() {
		return patientInRoom__Marker_cONTEXT__SRC__dEReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__h() {
		return patientInRoom__Marker_cONTEXT__SRC__hEReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CREATE__SRC__p1() {
		return patientInRoom__Marker_cREATE__SRC__p1EReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__ro() {
		return patientInRoom__Marker_cONTEXT__SRC__roEReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CREATE__TRG__p2() {
		return patientInRoom__Marker_cREATE__TRG__p2EReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CONTEXT__TRG__v() {
		return patientInRoom__Marker_cONTEXT__TRG__vEReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CONTEXT__CORR__htov() {
		return patientInRoom__Marker_cONTEXT__CORR__htovEReference;	
	}
	@Override
	public EReference getPatientInRoom__Marker_CREATE__CORR__pTop() {
		return patientInRoom__Marker_cREATE__CORR__pTopEReference;	
	}
	@Override
	public EClass getRoomRule__Marker() {
		return roomRule__MarkerEClass;
	}
	@Override
	public EReference getRoomRule__Marker_CONTEXT__SRC__d() {
		return roomRule__Marker_cONTEXT__SRC__dEReference;	
	}
	@Override
	public EReference getRoomRule__Marker_CREATE__SRC__ro() {
		return roomRule__Marker_cREATE__SRC__roEReference;	
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hospital2Administration.Hospital2AdministrationFactory getHospital2AdministrationFactory() {
		return (Hospital2Administration.Hospital2AdministrationFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hospitalToAdministrationEClass = createEClass(HOSPITAL_TO_ADMINISTRATION);
		createEReference(hospitalToAdministrationEClass, HOSPITAL_TO_ADMINISTRATION__SOURCE);
		hospitalToAdministration_sourceEReference = (EReference) hospitalToAdministrationEClass.getEStructuralFeatures().get(0);
		createEReference(hospitalToAdministrationEClass, HOSPITAL_TO_ADMINISTRATION__TARGET);
		hospitalToAdministration_targetEReference = (EReference) hospitalToAdministrationEClass.getEStructuralFeatures().get(1);
		
		staffToStaffEClass = createEClass(STAFF_TO_STAFF);
		createEReference(staffToStaffEClass, STAFF_TO_STAFF__SOURCE);
		staffToStaff_sourceEReference = (EReference) staffToStaffEClass.getEStructuralFeatures().get(0);
		createEReference(staffToStaffEClass, STAFF_TO_STAFF__TARGET);
		staffToStaff_targetEReference = (EReference) staffToStaffEClass.getEStructuralFeatures().get(1);
		
		patientToPatientEClass = createEClass(PATIENT_TO_PATIENT);
		createEReference(patientToPatientEClass, PATIENT_TO_PATIENT__SOURCE);
		patientToPatient_sourceEReference = (EReference) patientToPatientEClass.getEStructuralFeatures().get(0);
		createEReference(patientToPatientEClass, PATIENT_TO_PATIENT__TARGET);
		patientToPatient_targetEReference = (EReference) patientToPatientEClass.getEStructuralFeatures().get(1);
		
		roomToShiftplanEClass = createEClass(ROOM_TO_SHIFTPLAN);
		createEReference(roomToShiftplanEClass, ROOM_TO_SHIFTPLAN__SOURCE);
		roomToShiftplan_sourceEReference = (EReference) roomToShiftplanEClass.getEStructuralFeatures().get(0);
		createEReference(roomToShiftplanEClass, ROOM_TO_SHIFTPLAN__TARGET);
		roomToShiftplan_targetEReference = (EReference) roomToShiftplanEClass.getEStructuralFeatures().get(1);
		
		doctorToStaffEClass = createEClass(DOCTOR_TO_STAFF);
		createEReference(doctorToStaffEClass, DOCTOR_TO_STAFF__SOURCE);
		doctorToStaff_sourceEReference = (EReference) doctorToStaffEClass.getEStructuralFeatures().get(0);
		createEReference(doctorToStaffEClass, DOCTOR_TO_STAFF__TARGET);
		doctorToStaff_targetEReference = (EReference) doctorToStaffEClass.getEStructuralFeatures().get(1);
		
		nurseToStaffEClass = createEClass(NURSE_TO_STAFF);
		createEReference(nurseToStaffEClass, NURSE_TO_STAFF__SOURCE);
		nurseToStaff_sourceEReference = (EReference) nurseToStaffEClass.getEStructuralFeatures().get(0);
		createEReference(nurseToStaffEClass, NURSE_TO_STAFF__TARGET);
		nurseToStaff_targetEReference = (EReference) nurseToStaffEClass.getEStructuralFeatures().get(1);
		
		departmentRule__MarkerEClass = createEClass(DEPARTMENT_RULE___MARKER);
		createEReference(departmentRule__MarkerEClass, DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D);
		departmentRule__Marker_cREATE__SRC__dEReference = (EReference) departmentRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(departmentRule__MarkerEClass, DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H);
		departmentRule__Marker_cONTEXT__SRC__hEReference = (EReference) departmentRule__MarkerEClass.getEStructuralFeatures().get(1);
		
		docToStaffRule__MarkerEClass = createEClass(DOC_TO_STAFF_RULE___MARKER);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D);
		docToStaffRule__Marker_cONTEXT__SRC__dEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H);
		docToStaffRule__Marker_cONTEXT__SRC__hEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1);
		docToStaffRule__Marker_cREATE__SRC__s1EReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2);
		docToStaffRule__Marker_cREATE__TRG__s2EReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH);
		docToStaffRule__Marker_cREATE__TRG__shEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP);
		docToStaffRule__Marker_cREATE__TRG__spEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V);
		docToStaffRule__Marker_cONTEXT__TRG__vEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV);
		docToStaffRule__Marker_cONTEXT__CORR__htovEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(7);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT);
		docToStaffRule__Marker_cREATE__CORR__stotEReference = (EReference) docToStaffRule__MarkerEClass.getEStructuralFeatures().get(8);
		
		doctorShiftplanRule__MarkerEClass = createEClass(DOCTOR_SHIFTPLAN_RULE___MARKER);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1);
		doctorShiftplanRule__Marker_cONTEXT__SRC__p1EReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1);
		doctorShiftplanRule__Marker_cONTEXT__SRC__s1EReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2);
		doctorShiftplanRule__Marker_cONTEXT__TRG__p2EReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2);
		doctorShiftplanRule__Marker_cONTEXT__TRG__s2EReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH);
		doctorShiftplanRule__Marker_cONTEXT__TRG__shEReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP);
		doctorShiftplanRule__Marker_cONTEXT__TRG__spEReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP);
		doctorShiftplanRule__Marker_cONTEXT__CORR__pToPEReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS);
		doctorShiftplanRule__Marker_cONTEXT__CORR__sToSEReference = (EReference) doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(7);
		
		doctorToPatient__MarkerEClass = createEClass(DOCTOR_TO_PATIENT___MARKER);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__D);
		doctorToPatient__Marker_cONTEXT__SRC__dEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__DEP);
		doctorToPatient__Marker_cONTEXT__SRC__depEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__P1);
		doctorToPatient__Marker_cONTEXT__SRC__p1EReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__RO);
		doctorToPatient__Marker_cONTEXT__SRC__roEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__P2);
		doctorToPatient__Marker_cONTEXT__TRG__p2EReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__S);
		doctorToPatient__Marker_cONTEXT__TRG__sEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CREAT_E__TR_G__T);
		doctorToPatient__Marker_cREATE__TRG__tEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__D_TOS);
		doctorToPatient__Marker_cONTEXT__CORR__dToSEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(7);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__P_TOP);
		doctorToPatient__Marker_cONTEXT__CORR__pToPEReference = (EReference) doctorToPatient__MarkerEClass.getEStructuralFeatures().get(8);
		
		hospitaltoAdministrationRule__MarkerEClass = createEClass(HOSPITALTO_ADMINISTRATION_RULE___MARKER);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__H);
		hospitaltoAdministrationRule__Marker_cREATE__SRC__hEReference = (EReference) hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__SR_C__R);
		hospitaltoAdministrationRule__Marker_cREATE__SRC__rEReference = (EReference) hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__TR_G__V);
		hospitaltoAdministrationRule__Marker_cREATE__TRG__vEReference = (EReference) hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE___MARKER__CREAT_E__COR_R__HTOV);
		hospitaltoAdministrationRule__Marker_cREATE__CORR__htovEReference = (EReference) hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(3);
		
		nurseShiftplanRule__MarkerEClass = createEClass(NURSE_SHIFTPLAN_RULE___MARKER);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1);
		nurseShiftplanRule__Marker_cONTEXT__SRC__p1EReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO);
		nurseShiftplanRule__Marker_cONTEXT__SRC__roEReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1);
		nurseShiftplanRule__Marker_cONTEXT__SRC__s1EReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2);
		nurseShiftplanRule__Marker_cONTEXT__TRG__p2EReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2);
		nurseShiftplanRule__Marker_cONTEXT__TRG__s2EReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH);
		nurseShiftplanRule__Marker_cONTEXT__TRG__shEReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP);
		nurseShiftplanRule__Marker_cONTEXT__TRG__spEReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP);
		nurseShiftplanRule__Marker_cONTEXT__CORR__pToPEReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(7);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS);
		nurseShiftplanRule__Marker_cONTEXT__CORR__sToSEReference = (EReference) nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(8);
		
		nurseToRoomRule__MarkerEClass = createEClass(NURSE_TO_ROOM_RULE___MARKER);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP);
		nurseToRoomRule__Marker_cONTEXT__SRC__depEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N);
		nurseToRoomRule__Marker_cONTEXT__SRC__nEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1);
		nurseToRoomRule__Marker_cONTEXT__SRC__p1EReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R);
		nurseToRoomRule__Marker_cONTEXT__SRC__rEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2);
		nurseToRoomRule__Marker_cONTEXT__TRG__p2EReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S);
		nurseToRoomRule__Marker_cONTEXT__TRG__sEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS);
		nurseToRoomRule__Marker_cONTEXT__CORR__nToSEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP);
		nurseToRoomRule__Marker_cONTEXT__CORR__pTopEReference = (EReference) nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(7);
		
		nurseToStaffRule__MarkerEClass = createEClass(NURSE_TO_STAFF_RULE___MARKER);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__D);
		nurseToStaffRule__Marker_cONTEXT__SRC__dEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__SR_C__H);
		nurseToStaffRule__Marker_cONTEXT__SRC__hEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CREAT_E__SR_C__S1);
		nurseToStaffRule__Marker_cREATE__SRC__s1EReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__S2);
		nurseToStaffRule__Marker_cREATE__TRG__s2EReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SH);
		nurseToStaffRule__Marker_cREATE__TRG__shEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CREAT_E__TR_G__SP);
		nurseToStaffRule__Marker_cREATE__TRG__spEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__TR_G__V);
		nurseToStaffRule__Marker_cONTEXT__TRG__vEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CONTEX_T__COR_R__HTOV);
		nurseToStaffRule__Marker_cONTEXT__CORR__htovEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(7);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE___MARKER__CREAT_E__COR_R__STOT);
		nurseToStaffRule__Marker_cREATE__CORR__stotEReference = (EReference) nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(8);
		
		patientInReception__MarkerEClass = createEClass(PATIENT_IN_RECEPTION___MARKER);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__H);
		patientInReception__Marker_cONTEXT__SRC__hEReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CREAT_E__SR_C__P1);
		patientInReception__Marker_cREATE__SRC__p1EReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CONTEX_T__SR_C__R);
		patientInReception__Marker_cONTEXT__SRC__rEReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CREAT_E__TR_G__P2);
		patientInReception__Marker_cREATE__TRG__p2EReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CONTEX_T__TR_G__V);
		patientInReception__Marker_cONTEXT__TRG__vEReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CONTEX_T__COR_R__HTOV);
		patientInReception__Marker_cONTEXT__CORR__htovEReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION___MARKER__CREAT_E__COR_R__P_TOP);
		patientInReception__Marker_cREATE__CORR__pTopEReference = (EReference) patientInReception__MarkerEClass.getEStructuralFeatures().get(6);
		
		patientInRoom__MarkerEClass = createEClass(PATIENT_IN_ROOM___MARKER);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D);
		patientInRoom__Marker_cONTEXT__SRC__dEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H);
		patientInRoom__Marker_cONTEXT__SRC__hEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1);
		patientInRoom__Marker_cREATE__SRC__p1EReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO);
		patientInRoom__Marker_cONTEXT__SRC__roEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2);
		patientInRoom__Marker_cREATE__TRG__p2EReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V);
		patientInRoom__Marker_cONTEXT__TRG__vEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV);
		patientInRoom__Marker_cONTEXT__CORR__htovEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP);
		patientInRoom__Marker_cREATE__CORR__pTopEReference = (EReference) patientInRoom__MarkerEClass.getEStructuralFeatures().get(7);
		
		roomRule__MarkerEClass = createEClass(ROOM_RULE___MARKER);
		createEReference(roomRule__MarkerEClass, ROOM_RULE___MARKER__CONTEX_T__SR_C__D);
		roomRule__Marker_cONTEXT__SRC__dEReference = (EReference) roomRule__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(roomRule__MarkerEClass, ROOM_RULE___MARKER__CREAT_E__SR_C__RO);
		roomRule__Marker_cREATE__SRC__roEReference = (EReference) roomRule__MarkerEClass.getEStructuralFeatures().get(1);
		
		// Create enums
		
		// Create data types
	}

	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		
		// Obtain other dependent packages
		RuntimePackage theRuntimePackagePackage = RuntimePackage.eINSTANCE;
		HospitalExamplePackage theHospitalExamplePackagePackage = HospitalExamplePackage.eINSTANCE;
		AdministrationExamplePackage theAdministrationExamplePackagePackage = AdministrationExamplePackage.eINSTANCE;

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hospitalToAdministrationEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		staffToStaffEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		patientToPatientEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		roomToShiftplanEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		doctorToStaffEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		nurseToStaffEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		departmentRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		docToStaffRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		doctorShiftplanRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		doctorToPatient__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		hospitaltoAdministrationRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		nurseShiftplanRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		nurseToRoomRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		nurseToStaffRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		patientInReception__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		patientInRoom__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		roomRule__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(hospitalToAdministrationEClass, HospitalToAdministration.class, "HospitalToAdministration", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospitalToAdministration_Source(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"source", null, 0, 1, HospitalToAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitalToAdministration_Target(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"target", null, 0, 1, HospitalToAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(staffToStaffEClass, StaffToStaff.class, "StaffToStaff", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffToStaff_Source(), HospitalExamplePackage.eINSTANCE.getStaff(),  null, 
			"source", null, 0, 1, StaffToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffToStaff_Target(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"target", null, 0, 1, StaffToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(patientToPatientEClass, PatientToPatient.class, "PatientToPatient", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientToPatient_Source(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"source", null, 0, 1, PatientToPatient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientToPatient_Target(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"target", null, 0, 1, PatientToPatient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(roomToShiftplanEClass, RoomToShiftplan.class, "RoomToShiftplan", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomToShiftplan_Source(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"source", null, 0, 1, RoomToShiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomToShiftplan_Target(), AdministrationExamplePackage.eINSTANCE.getShiftplan(),  null, 
			"target", null, 0, 1, RoomToShiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(doctorToStaffEClass, DoctorToStaff.class, "DoctorToStaff", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorToStaff_Source(), HospitalExamplePackage.eINSTANCE.getDoctor(),  null, 
			"source", null, 0, 1, DoctorToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToStaff_Target(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"target", null, 0, 1, DoctorToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(nurseToStaffEClass, NurseToStaff.class, "NurseToStaff", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToStaff_Source(), HospitalExamplePackage.eINSTANCE.getNurse(),  null, 
			"source", null, 0, 1, NurseToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaff_Target(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"target", null, 0, 1, NurseToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(departmentRule__MarkerEClass, DepartmentRule__Marker.class, "DepartmentRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartmentRule__Marker_CREATE__SRC__d(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CREATE__SRC__d", null, 1, 1, DepartmentRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartmentRule__Marker_CONTEXT__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CONTEXT__SRC__h", null, 1, 1, DepartmentRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(docToStaffRule__MarkerEClass, DocToStaffRule__Marker.class, "DocToStaffRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocToStaffRule__Marker_CONTEXT__SRC__d(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__d", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CONTEXT__SRC__h", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__SRC__s1(), HospitalExamplePackage.eINSTANCE.getDoctor(),  null, 
			"CREATE__SRC__s1", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__s2(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CREATE__TRG__s2", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__sh(), AdministrationExamplePackage.eINSTANCE.getShift(),  null, 
			"CREATE__TRG__sh", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__sp(), AdministrationExamplePackage.eINSTANCE.getShiftplan(),  null, 
			"CREATE__TRG__sp", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__TRG__v(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"CONTEXT__TRG__v", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(),  null, 
			"CONTEXT__CORR__htov", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__CORR__stot(), this.getStaffToStaff(),  null, 
			"CREATE__CORR__stot", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(doctorShiftplanRule__MarkerEClass, DoctorShiftplanRule__Marker.class, "DoctorShiftplanRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__SRC__p1", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1(), HospitalExamplePackage.eINSTANCE.getDoctor(),  null, 
			"CONTEXT__SRC__s1", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__TRG__p2", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CONTEXT__TRG__s2", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh(), AdministrationExamplePackage.eINSTANCE.getShift(),  null, 
			"CONTEXT__TRG__sh", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp(), AdministrationExamplePackage.eINSTANCE.getShiftplan(),  null, 
			"CONTEXT__TRG__sp", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(),  null, 
			"CONTEXT__CORR__pToP", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS(), this.getStaffToStaff(),  null, 
			"CONTEXT__CORR__sToS", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(doctorToPatient__MarkerEClass, DoctorToPatient__Marker.class, "DoctorToPatient__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__d(), HospitalExamplePackage.eINSTANCE.getDoctor(),  null, 
			"CONTEXT__SRC__d", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__dep(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__dep", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__SRC__p1", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__ro(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"CONTEXT__SRC__ro", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__TRG__p2", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__TRG__s(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CONTEXT__TRG__s", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CREATE__TRG__t(), AdministrationExamplePackage.eINSTANCE.getTreatment(),  null, 
			"CREATE__TRG__t", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__CORR__dToS(), this.getStaffToStaff(),  null, 
			"CONTEXT__CORR__dToS", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(),  null, 
			"CONTEXT__CORR__pToP", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(hospitaltoAdministrationRule__MarkerEClass, HospitaltoAdministrationRule__Marker.class, "HospitaltoAdministrationRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CREATE__SRC__h", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__SRC__r(), HospitalExamplePackage.eINSTANCE.getReception(),  null, 
			"CREATE__SRC__r", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__TRG__v(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"CREATE__TRG__v", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov(), this.getHospitalToAdministration(),  null, 
			"CREATE__CORR__htov", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(nurseShiftplanRule__MarkerEClass, NurseShiftplanRule__Marker.class, "NurseShiftplanRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__SRC__p1", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__ro(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"CONTEXT__SRC__ro", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__s1(), HospitalExamplePackage.eINSTANCE.getNurse(),  null, 
			"CONTEXT__SRC__s1", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__TRG__p2", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__s2(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CONTEXT__TRG__s2", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__sh(), AdministrationExamplePackage.eINSTANCE.getShift(),  null, 
			"CONTEXT__TRG__sh", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__sp(), AdministrationExamplePackage.eINSTANCE.getShiftplan(),  null, 
			"CONTEXT__TRG__sp", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(),  null, 
			"CONTEXT__CORR__pToP", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS(), this.getStaffToStaff(),  null, 
			"CONTEXT__CORR__sToS", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(nurseToRoomRule__MarkerEClass, NurseToRoomRule__Marker.class, "NurseToRoomRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__dep(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__dep", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__n(), HospitalExamplePackage.eINSTANCE.getNurse(),  null, 
			"CONTEXT__SRC__n", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__SRC__p1", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__r(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"CONTEXT__SRC__r", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CONTEXT__TRG__p2", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__TRG__s(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CONTEXT__TRG__s", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__CORR__nToS(), this.getStaffToStaff(),  null, 
			"CONTEXT__CORR__nToS", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__CORR__pTop(), this.getPatientToPatient(),  null, 
			"CONTEXT__CORR__pTop", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(nurseToStaffRule__MarkerEClass, NurseToStaffRule__Marker.class, "NurseToStaffRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__SRC__d(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__d", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CONTEXT__SRC__h", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__SRC__s1(), HospitalExamplePackage.eINSTANCE.getNurse(),  null, 
			"CREATE__SRC__s1", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__s2(), AdministrationExamplePackage.eINSTANCE.getStaff(),  null, 
			"CREATE__TRG__s2", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__sh(), AdministrationExamplePackage.eINSTANCE.getShift(),  null, 
			"CREATE__TRG__sh", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__sp(), AdministrationExamplePackage.eINSTANCE.getShiftplan(),  null, 
			"CREATE__TRG__sp", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__TRG__v(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"CONTEXT__TRG__v", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(),  null, 
			"CONTEXT__CORR__htov", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__CORR__stot(), this.getStaffToStaff(),  null, 
			"CREATE__CORR__stot", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(patientInReception__MarkerEClass, PatientInReception__Marker.class, "PatientInReception__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientInReception__Marker_CONTEXT__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CONTEXT__SRC__h", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CREATE__SRC__p1", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__SRC__r(), HospitalExamplePackage.eINSTANCE.getReception(),  null, 
			"CONTEXT__SRC__r", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CREATE__TRG__p2", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__TRG__v(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"CONTEXT__TRG__v", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(),  null, 
			"CONTEXT__CORR__htov", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__CORR__pTop(), this.getPatientToPatient(),  null, 
			"CREATE__CORR__pTop", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(patientInRoom__MarkerEClass, PatientInRoom__Marker.class, "PatientInRoom__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__d(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__d", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__h(), HospitalExamplePackage.eINSTANCE.getHospital(),  null, 
			"CONTEXT__SRC__h", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__SRC__p1(), HospitalExamplePackage.eINSTANCE.getPatient(),  null, 
			"CREATE__SRC__p1", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__ro(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"CONTEXT__SRC__ro", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__TRG__p2(), AdministrationExamplePackage.eINSTANCE.getPatient(),  null, 
			"CREATE__TRG__p2", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__TRG__v(), AdministrationExamplePackage.eINSTANCE.getAdministration(),  null, 
			"CONTEXT__TRG__v", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(),  null, 
			"CONTEXT__CORR__htov", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__CORR__pTop(), this.getPatientToPatient(),  null, 
			"CREATE__CORR__pTop", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(roomRule__MarkerEClass, RoomRule__Marker.class, "RoomRule__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomRule__Marker_CONTEXT__SRC__d(), HospitalExamplePackage.eINSTANCE.getDepartment(),  null, 
			"CONTEXT__SRC__d", null, 1, 1, RoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomRule__Marker_CREATE__SRC__ro(), HospitalExamplePackage.eINSTANCE.getRoom(),  null, 
			"CREATE__SRC__ro", null, 1, 1, RoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		
		// Initialize enums and add enum literals
		
		// Initialize data types
		
		// Create resource
		createResource(eNS_URI);
	}

} 

