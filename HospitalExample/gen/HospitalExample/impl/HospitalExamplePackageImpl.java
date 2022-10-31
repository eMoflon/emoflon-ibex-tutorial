package HospitalExample.impl;

import HospitalExample.Hospital;
import HospitalExample.Reception;
import HospitalExample.Staff;
import HospitalExample.Doctor;
import HospitalExample.Nurse;
import HospitalExample.Department;
import HospitalExample.Patient;
import HospitalExample.Room;

import HospitalExample.Carelevel;

import HospitalExample.HospitalExampleFactory;
import HospitalExample.HospitalExamplePackage;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emoflon.smartemf.runtime.SmartPackageImpl;

public class HospitalExamplePackageImpl extends SmartPackageImpl
		implements HospitalExamplePackage {
			
	private EClass hospitalEClass = null;
	private EReference hospital_receptionEReference = null;
	private EReference hospital_staffEReference = null;
	private EReference hospital_departmentEReference = null;
	private EClass receptionEClass = null;
	private EReference reception_waitsEReference = null;
	private EClass staffEClass = null;
	private EAttribute staff_staffIDEAttribute = null;
	private EReference staff_worksEReference = null;
	private EAttribute staff_nameEAttribute = null;
	private EClass doctorEClass = null;
	private EReference doctor_caresforEReference = null;
	private EAttribute doctor_patientCapacityEAttribute = null;
	private EClass nurseEClass = null;
	private EReference nurse_responsibleEReference = null;
	private EClass departmentEClass = null;
	private EReference department_roomsEReference = null;
	private EAttribute department_dIDEAttribute = null;
	private EReference department_staffEReference = null;
	private EAttribute department_maxRoomCountEAttribute = null;
	private EClass patientEClass = null;
	private EAttribute patient_patientIDEAttribute = null;
	private EAttribute patient_nameEAttribute = null;
	private EAttribute patient_levelEAttribute = null;
	private EReference patient_doctorEReference = null;
	private EClass roomEClass = null;
	private EAttribute room_capacityEAttribute = null;
	private EAttribute room_levelEAttribute = null;
	private EReference room_liesEReference = null;
	private EReference room_nursesEReference = null;
	
	private EEnum carelevelEEnum = null;
	

	private HospitalExamplePackageImpl() {
		super(eNS_URI, HospitalExample.HospitalExampleFactory.eINSTANCE);
	}

	private static boolean isRegistered = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public static HospitalExamplePackage init() {
		if (isRegistered)
			return (HospitalExamplePackage) EPackage.Registry.INSTANCE
					.getEPackage(HospitalExamplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHospitalExamplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HospitalExamplePackageImpl theHospitalExamplePackage = registeredHospitalExamplePackage instanceof HospitalExamplePackageImpl
				? (HospitalExamplePackageImpl) registeredHospitalExamplePackage
				: new HospitalExamplePackageImpl();

		isRegistered = true;

		// Create package meta-data objects
		theHospitalExamplePackage.createPackageContents();

		// Initialize created meta-data
		theHospitalExamplePackage.initializePackageContents();
		
		// Inject internal eOpposites to unidirectional references
		theHospitalExamplePackage.injectDynamicOpposites();
		
		// Inject external references into foreign packages
		theHospitalExamplePackage.injectExternalReferences();

		// Mark meta-data to indicate it can't be changed
		theHospitalExamplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HospitalExamplePackage.eNS_URI,
				theHospitalExamplePackage);
				
		theHospitalExamplePackage.fetchDynamicEStructuralFeaturesOfSuperTypes();
		return theHospitalExamplePackage;
	}

	@Override
	public EClass getHospital() {
		return hospitalEClass;
	}
	@Override
	public EReference getHospital_Reception() {
		return hospital_receptionEReference;	
	}
	@Override
	public EReference getHospital_Staff() {
		return hospital_staffEReference;	
	}
	@Override
	public EReference getHospital_Department() {
		return hospital_departmentEReference;	
	}
	@Override
	public EClass getReception() {
		return receptionEClass;
	}
	@Override
	public EReference getReception_Waits() {
		return reception_waitsEReference;	
	}
	@Override
	public EClass getStaff() {
		return staffEClass;
	}
	@Override
	public EAttribute getStaff_StaffID() {
		return staff_staffIDEAttribute;	
	}
	@Override
	public EReference getStaff_Works() {
		return staff_worksEReference;	
	}
	@Override
	public EAttribute getStaff_Name() {
		return staff_nameEAttribute;	
	}
	@Override
	public EClass getDoctor() {
		return doctorEClass;
	}
	@Override
	public EReference getDoctor_Caresfor() {
		return doctor_caresforEReference;	
	}
	@Override
	public EAttribute getDoctor_PatientCapacity() {
		return doctor_patientCapacityEAttribute;	
	}
	@Override
	public EClass getNurse() {
		return nurseEClass;
	}
	@Override
	public EReference getNurse_Responsible() {
		return nurse_responsibleEReference;	
	}
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}
	@Override
	public EReference getDepartment_Rooms() {
		return department_roomsEReference;	
	}
	@Override
	public EAttribute getDepartment_DID() {
		return department_dIDEAttribute;	
	}
	@Override
	public EReference getDepartment_Staff() {
		return department_staffEReference;	
	}
	@Override
	public EAttribute getDepartment_MaxRoomCount() {
		return department_maxRoomCountEAttribute;	
	}
	@Override
	public EClass getPatient() {
		return patientEClass;
	}
	@Override
	public EAttribute getPatient_PatientID() {
		return patient_patientIDEAttribute;	
	}
	@Override
	public EAttribute getPatient_Name() {
		return patient_nameEAttribute;	
	}
	@Override
	public EAttribute getPatient_Level() {
		return patient_levelEAttribute;	
	}
	@Override
	public EReference getPatient_Doctor() {
		return patient_doctorEReference;	
	}
	@Override
	public EClass getRoom() {
		return roomEClass;
	}
	@Override
	public EAttribute getRoom_Capacity() {
		return room_capacityEAttribute;	
	}
	@Override
	public EAttribute getRoom_Level() {
		return room_levelEAttribute;	
	}
	@Override
	public EReference getRoom_Lies() {
		return room_liesEReference;	
	}
	@Override
	public EReference getRoom_Nurses() {
		return room_nursesEReference;	
	}
	
	@Override
	public EEnum getCarelevel() {
		return carelevelEEnum;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalExample.HospitalExampleFactory getHospitalExampleFactory() {
		return (HospitalExample.HospitalExampleFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hospitalEClass = createEClass(HOSPITAL);
		createEReference(hospitalEClass, HOSPITAL__RECEPTION);
		hospital_receptionEReference = (EReference) hospitalEClass.getEStructuralFeatures().get(0);
		createEReference(hospitalEClass, HOSPITAL__STAFF);
		hospital_staffEReference = (EReference) hospitalEClass.getEStructuralFeatures().get(1);
		createEReference(hospitalEClass, HOSPITAL__DEPARTMENT);
		hospital_departmentEReference = (EReference) hospitalEClass.getEStructuralFeatures().get(2);
		
		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__WAITS);
		reception_waitsEReference = (EReference) receptionEClass.getEStructuralFeatures().get(0);
		
		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__STAFFID);
		staff_staffIDEAttribute = (EAttribute) staffEClass.getEStructuralFeatures().get(0);
		createEReference(staffEClass, STAFF__WORKS);
		staff_worksEReference = (EReference) staffEClass.getEStructuralFeatures().get(1);
		createEAttribute(staffEClass, STAFF__NAME);
		staff_nameEAttribute = (EAttribute) staffEClass.getEStructuralFeatures().get(2);
		
		doctorEClass = createEClass(DOCTOR);
		createEReference(doctorEClass, DOCTOR__CARESFOR);
		doctor_caresforEReference = (EReference) doctorEClass.getEStructuralFeatures().get(0);
		createEAttribute(doctorEClass, DOCTOR__PATIENT_CAPACITY);
		doctor_patientCapacityEAttribute = (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
		
		nurseEClass = createEClass(NURSE);
		createEReference(nurseEClass, NURSE__RESPONSIBLE);
		nurse_responsibleEReference = (EReference) nurseEClass.getEStructuralFeatures().get(0);
		
		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__ROOMS);
		department_roomsEReference = (EReference) departmentEClass.getEStructuralFeatures().get(0);
		createEAttribute(departmentEClass, DEPARTMENT__DID);
		department_dIDEAttribute = (EAttribute) departmentEClass.getEStructuralFeatures().get(1);
		createEReference(departmentEClass, DEPARTMENT__STAFF);
		department_staffEReference = (EReference) departmentEClass.getEStructuralFeatures().get(2);
		createEAttribute(departmentEClass, DEPARTMENT__MAX_ROOM_COUNT);
		department_maxRoomCountEAttribute = (EAttribute) departmentEClass.getEStructuralFeatures().get(3);
		
		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENTID);
		patient_patientIDEAttribute = (EAttribute) patientEClass.getEStructuralFeatures().get(0);
		createEAttribute(patientEClass, PATIENT__NAME);
		patient_nameEAttribute = (EAttribute) patientEClass.getEStructuralFeatures().get(1);
		createEAttribute(patientEClass, PATIENT__LEVEL);
		patient_levelEAttribute = (EAttribute) patientEClass.getEStructuralFeatures().get(2);
		createEReference(patientEClass, PATIENT__DOCTOR);
		patient_doctorEReference = (EReference) patientEClass.getEStructuralFeatures().get(3);
		
		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__CAPACITY);
		room_capacityEAttribute = (EAttribute) roomEClass.getEStructuralFeatures().get(0);
		createEAttribute(roomEClass, ROOM__LEVEL);
		room_levelEAttribute = (EAttribute) roomEClass.getEStructuralFeatures().get(1);
		createEReference(roomEClass, ROOM__LIES);
		room_liesEReference = (EReference) roomEClass.getEStructuralFeatures().get(2);
		createEReference(roomEClass, ROOM__NURSES);
		room_nursesEReference = (EReference) roomEClass.getEStructuralFeatures().get(3);
		
		// Create enums
		carelevelEEnum = createEEnum(CARELEVEL);
		
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doctorEClass.getESuperTypes().add(this.getStaff());
		nurseEClass.getESuperTypes().add(this.getStaff());

		// Initialize classes, features, and operations; add parameters
		initEClass(hospitalEClass, Hospital.class, "Hospital", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospital_Reception(), this.getReception(),  null, 
			"reception", null, 1, 1, Hospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospital_Staff(), this.getStaff(),  null, 
			"staff", null, 0, -1, Hospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHospital_Department(), this.getDepartment(),  null, 
			"department", null, 0, -1, Hospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReception_Waits(), this.getPatient(),  null, 
			"waits", null, 0, -1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(staffEClass, Staff.class, "Staff", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_StaffID(), ecorePackage.getEInt(),
			"staffID", "-1", 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Works(), this.getDepartment(), this.getDepartment_Staff(), 
			"works", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Name(), ecorePackage.getEString(),
			"name", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctor_Caresfor(), this.getPatient(), this.getPatient_Doctor(), 
			"caresfor", null, 0, -1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_PatientCapacity(), ecorePackage.getEInt(),
			"patientCapacity", "0", 0, 1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(nurseEClass, Nurse.class, "Nurse", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurse_Responsible(), this.getRoom(), this.getRoom_Nurses(), 
			"responsible", null, 0, 1, Nurse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_Rooms(), this.getRoom(),  null, 
			"rooms", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_DID(), ecorePackage.getEInt(),
			"dID", "-1", 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Staff(), this.getStaff(), this.getStaff_Works(), 
			"staff", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_MaxRoomCount(), ecorePackage.getEInt(),
			"maxRoomCount", "0", 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientID(), ecorePackage.getEInt(),
			"patientID", "-1", 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Name(), ecorePackage.getEString(),
			"name", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Level(), this.getCarelevel(),
			"level", "PENDING", 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Doctor(), this.getDoctor(), this.getDoctor_Caresfor(), 
			"doctor", null, 1, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Capacity(), ecorePackage.getEInt(),
			"capacity", "0", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Level(), this.getCarelevel(),
			"level", "WEAK", 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Lies(), this.getPatient(),  null, 
			"lies", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Nurses(), this.getNurse(), this.getNurse_Responsible(), 
			"nurses", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		
		// Initialize enums and add enum literals
		initEEnum(carelevelEEnum, Carelevel.class, "Carelevel");
		addEEnumLiteral(carelevelEEnum, HospitalExample.Carelevel.WEAK);
		addEEnumLiteral(carelevelEEnum, HospitalExample.Carelevel.MEDIUM);
		addEEnumLiteral(carelevelEEnum, HospitalExample.Carelevel.STRONG);
		addEEnumLiteral(carelevelEEnum, HospitalExample.Carelevel.PENDING);
		
		// Initialize data types
		
		// Create resource
		createResource(eNS_URI);
	}

} 

