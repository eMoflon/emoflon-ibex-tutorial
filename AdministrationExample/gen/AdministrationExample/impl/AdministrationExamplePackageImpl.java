package AdministrationExample.impl;

import AdministrationExample.Administration;
import AdministrationExample.Shift;
import AdministrationExample.Staff;
import AdministrationExample.Person;
import AdministrationExample.Treatment;
import AdministrationExample.Shiftplan;
import AdministrationExample.Patient;

import AdministrationExample.Medication;
import AdministrationExample.Daytime;

import AdministrationExample.AdministrationExampleFactory;
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

public class AdministrationExamplePackageImpl extends SmartPackageImpl
		implements AdministrationExamplePackage {
			
	private EClass administrationEClass = null;
	private EReference administration_staffEReference = null;
	private EReference administration_patientEReference = null;
	private EClass shiftEClass = null;
	private EAttribute shift_timeEAttribute = null;
	private EClass staffEClass = null;
	private EAttribute staff_staffIDEAttribute = null;
	private EAttribute staff_salaryEAttribute = null;
	private EReference staff_shiftPlanEReference = null;
	private EAttribute staff_dIntEAttribute = null;
	private EReference staff_treatmentEReference = null;
	private EClass personEClass = null;
	private EAttribute person_firstNameEAttribute = null;
	private EAttribute person_lastNameEAttribute = null;
	private EClass treatmentEClass = null;
	private EAttribute treatment_medicationEAttribute = null;
	private EClass shiftplanEClass = null;
	private EReference shiftplan_coversEReference = null;
	private EReference shiftplan_shiftsEReference = null;
	private EClass patientEClass = null;
	private EAttribute patient_patientIDEAttribute = null;
	private EReference patient_treatmentEReference = null;
	private EReference patient_coveredByEReference = null;
	
	private EEnum medicationEEnum = null;
	private EEnum daytimeEEnum = null;
	

	private AdministrationExamplePackageImpl() {
		super(eNS_URI, AdministrationExample.AdministrationExampleFactory.eINSTANCE);
	}

	private static boolean isRegistered = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public static AdministrationExamplePackage init() {
		if (isRegistered)
			return (AdministrationExamplePackage) EPackage.Registry.INSTANCE
					.getEPackage(AdministrationExamplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdministrationExamplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdministrationExamplePackageImpl theAdministrationExamplePackage = registeredAdministrationExamplePackage instanceof AdministrationExamplePackageImpl
				? (AdministrationExamplePackageImpl) registeredAdministrationExamplePackage
				: new AdministrationExamplePackageImpl();

		isRegistered = true;

		// Create package meta-data objects
		theAdministrationExamplePackage.createPackageContents();

		// Initialize created meta-data
		theAdministrationExamplePackage.initializePackageContents();
		
		// Inject internal eOpposites to unidirectional references
		theAdministrationExamplePackage.injectDynamicOpposites();
		
		// Inject external references into foreign packages
		theAdministrationExamplePackage.injectExternalReferences();

		// Mark meta-data to indicate it can't be changed
		theAdministrationExamplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdministrationExamplePackage.eNS_URI,
				theAdministrationExamplePackage);
				
		theAdministrationExamplePackage.fetchDynamicEStructuralFeaturesOfSuperTypes();
		return theAdministrationExamplePackage;
	}

	@Override
	public EClass getAdministration() {
		return administrationEClass;
	}
	@Override
	public EReference getAdministration_Staff() {
		return administration_staffEReference;	
	}
	@Override
	public EReference getAdministration_Patient() {
		return administration_patientEReference;	
	}
	@Override
	public EClass getShift() {
		return shiftEClass;
	}
	@Override
	public EAttribute getShift_Time() {
		return shift_timeEAttribute;	
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
	public EAttribute getStaff_Salary() {
		return staff_salaryEAttribute;	
	}
	@Override
	public EReference getStaff_ShiftPlan() {
		return staff_shiftPlanEReference;	
	}
	@Override
	public EAttribute getStaff_DInt() {
		return staff_dIntEAttribute;	
	}
	@Override
	public EReference getStaff_Treatment() {
		return staff_treatmentEReference;	
	}
	@Override
	public EClass getPerson() {
		return personEClass;
	}
	@Override
	public EAttribute getPerson_FirstName() {
		return person_firstNameEAttribute;	
	}
	@Override
	public EAttribute getPerson_LastName() {
		return person_lastNameEAttribute;	
	}
	@Override
	public EClass getTreatment() {
		return treatmentEClass;
	}
	@Override
	public EAttribute getTreatment_Medication() {
		return treatment_medicationEAttribute;	
	}
	@Override
	public EClass getShiftplan() {
		return shiftplanEClass;
	}
	@Override
	public EReference getShiftplan_Covers() {
		return shiftplan_coversEReference;	
	}
	@Override
	public EReference getShiftplan_Shifts() {
		return shiftplan_shiftsEReference;	
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
	public EReference getPatient_Treatment() {
		return patient_treatmentEReference;	
	}
	@Override
	public EReference getPatient_CoveredBy() {
		return patient_coveredByEReference;	
	}
	
	@Override
	public EEnum getMedication() {
		return medicationEEnum;
	}
	@Override
	public EEnum getDaytime() {
		return daytimeEEnum;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrationExample.AdministrationExampleFactory getAdministrationExampleFactory() {
		return (AdministrationExample.AdministrationExampleFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		administrationEClass = createEClass(ADMINISTRATION);
		createEReference(administrationEClass, ADMINISTRATION__STAFF);
		administration_staffEReference = (EReference) administrationEClass.getEStructuralFeatures().get(0);
		createEReference(administrationEClass, ADMINISTRATION__PATIENT);
		administration_patientEReference = (EReference) administrationEClass.getEStructuralFeatures().get(1);
		
		shiftEClass = createEClass(SHIFT);
		createEAttribute(shiftEClass, SHIFT__TIME);
		shift_timeEAttribute = (EAttribute) shiftEClass.getEStructuralFeatures().get(0);
		
		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__STAFFID);
		staff_staffIDEAttribute = (EAttribute) staffEClass.getEStructuralFeatures().get(0);
		createEAttribute(staffEClass, STAFF__SALARY);
		staff_salaryEAttribute = (EAttribute) staffEClass.getEStructuralFeatures().get(1);
		createEReference(staffEClass, STAFF__SHIFT_PLAN);
		staff_shiftPlanEReference = (EReference) staffEClass.getEStructuralFeatures().get(2);
		createEAttribute(staffEClass, STAFF__D_INT);
		staff_dIntEAttribute = (EAttribute) staffEClass.getEStructuralFeatures().get(3);
		createEReference(staffEClass, STAFF__TREATMENT);
		staff_treatmentEReference = (EReference) staffEClass.getEStructuralFeatures().get(4);
		
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		person_firstNameEAttribute = (EAttribute) personEClass.getEStructuralFeatures().get(0);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		person_lastNameEAttribute = (EAttribute) personEClass.getEStructuralFeatures().get(1);
		
		treatmentEClass = createEClass(TREATMENT);
		createEAttribute(treatmentEClass, TREATMENT__MEDICATION);
		treatment_medicationEAttribute = (EAttribute) treatmentEClass.getEStructuralFeatures().get(0);
		
		shiftplanEClass = createEClass(SHIFTPLAN);
		createEReference(shiftplanEClass, SHIFTPLAN__COVERS);
		shiftplan_coversEReference = (EReference) shiftplanEClass.getEStructuralFeatures().get(0);
		createEReference(shiftplanEClass, SHIFTPLAN__SHIFTS);
		shiftplan_shiftsEReference = (EReference) shiftplanEClass.getEStructuralFeatures().get(1);
		
		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENTID);
		patient_patientIDEAttribute = (EAttribute) patientEClass.getEStructuralFeatures().get(0);
		createEReference(patientEClass, PATIENT__TREATMENT);
		patient_treatmentEReference = (EReference) patientEClass.getEStructuralFeatures().get(1);
		createEReference(patientEClass, PATIENT__COVERED_BY);
		patient_coveredByEReference = (EReference) patientEClass.getEStructuralFeatures().get(2);
		
		// Create enums
		medicationEEnum = createEEnum(MEDICATION);
		daytimeEEnum = createEEnum(DAYTIME);
		
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
		staffEClass.getESuperTypes().add(this.getPerson());
		patientEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(administrationEClass, Administration.class, "Administration", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministration_Staff(), this.getStaff(),  null, 
			"staff", null, 0, -1, Administration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministration_Patient(), this.getPatient(),  null, 
			"patient", null, 0, -1, Administration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(shiftEClass, Shift.class, "Shift", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShift_Time(), this.getDaytime(),
			"time", "night", 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_StaffID(), ecorePackage.getEInt(),
			"staffID", "0", 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_Salary(), ecorePackage.getEDouble(),
			"salary", "0.0", 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_ShiftPlan(), this.getShiftplan(),  null, 
			"shiftPlan", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_DInt(), ecorePackage.getEInt(),
			"dInt", "0", 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Treatment(), this.getTreatment(),  null, 
			"treatment", null, 0, -1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(),
			"firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(),
			"lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(treatmentEClass, Treatment.class, "Treatment", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreatment_Medication(), this.getMedication(),
			"medication", "weak", 0, 1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		
		initEClass(shiftplanEClass, Shiftplan.class, "Shiftplan", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShiftplan_Covers(), this.getPatient(), this.getPatient_CoveredBy(), 
			"covers", null, 0, -1, Shiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShiftplan_Shifts(), this.getShift(),  null, 
			"shifts", null, 0, -1, Shiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientID(), ecorePackage.getEInt(),
			"patientID", "0", 1, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Treatment(), this.getTreatment(),  null, 
			"treatment", null, 1, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_CoveredBy(), this.getShiftplan(), this.getShiftplan_Covers(), 
			"coveredBy", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		
		// Initialize enums and add enum literals
		initEEnum(medicationEEnum, Medication.class, "Medication");
		addEEnumLiteral(medicationEEnum, AdministrationExample.Medication.WEAK);
		addEEnumLiteral(medicationEEnum, AdministrationExample.Medication.MEDIUM);
		addEEnumLiteral(medicationEEnum, AdministrationExample.Medication.STRONG);
		addEEnumLiteral(medicationEEnum, AdministrationExample.Medication.PENDING);
		initEEnum(daytimeEEnum, Daytime.class, "Daytime");
		addEEnumLiteral(daytimeEEnum, AdministrationExample.Daytime.NIGHT);
		addEEnumLiteral(daytimeEEnum, AdministrationExample.Daytime.EARLY);
		addEEnumLiteral(daytimeEEnum, AdministrationExample.Daytime.LATE);
		
		// Initialize data types
		
		// Create resource
		createResource(eNS_URI);
	}

} 

