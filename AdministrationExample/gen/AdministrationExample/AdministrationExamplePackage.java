/**
 */
package AdministrationExample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TODO: Add documentation for AdministrationExample. Hint: You may copy this element in the Ecore editor to add documentation to EClasses, EOperations, ...
 * <!-- end-model-doc -->
 * @see AdministrationExample.AdministrationExampleFactory
 * @model kind="package"
 * @generated
 */
public interface AdministrationExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AdministrationExample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/AdministrationExample/model/AdministrationExample.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AdministrationExample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdministrationExamplePackage eINSTANCE = AdministrationExample.impl.AdministrationExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.AdministrationImpl <em>Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.AdministrationImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getAdministration()
	 * @generated
	 */
	int ADMINISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION__STAFF = 0;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION__PATIENT = 1;

	/**
	 * The number of structural features of the '<em>Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.ShiftImpl <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.ShiftImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getShift()
	 * @generated
	 */
	int SHIFT = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__TIME = 0;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.PersonImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.StaffImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__SALARY = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shift Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__SHIFT_PLAN = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__DINT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__TREATMENT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.TreatmentImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 4;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__MEDICATION = 0;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.ShiftplanImpl <em>Shiftplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.ShiftplanImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getShiftplan()
	 * @generated
	 */
	int SHIFTPLAN = 5;

	/**
	 * The feature id for the '<em><b>Covers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFTPLAN__COVERS = 0;

	/**
	 * The feature id for the '<em><b>Shifts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFTPLAN__SHIFTS = 1;

	/**
	 * The number of structural features of the '<em>Shiftplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFTPLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Shiftplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFTPLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.impl.PatientImpl
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 6;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Patient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__TREATMENT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__COVERED_BY = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AdministrationExample.Medication <em>Medication</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.Medication
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 7;

	/**
	 * The meta object id for the '{@link AdministrationExample.Daytime <em>Daytime</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministrationExample.Daytime
	 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getDaytime()
	 * @generated
	 */
	int DAYTIME = 8;

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Administration <em>Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administration</em>'.
	 * @see AdministrationExample.Administration
	 * @generated
	 */
	EClass getAdministration();

	/**
	 * Returns the meta object for the containment reference list '{@link AdministrationExample.Administration#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see AdministrationExample.Administration#getStaff()
	 * @see #getAdministration()
	 * @generated
	 */
	EReference getAdministration_Staff();

	/**
	 * Returns the meta object for the containment reference list '{@link AdministrationExample.Administration#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient</em>'.
	 * @see AdministrationExample.Administration#getPatient()
	 * @see #getAdministration()
	 * @generated
	 */
	EReference getAdministration_Patient();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see AdministrationExample.Shift
	 * @generated
	 */
	EClass getShift();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Shift#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see AdministrationExample.Shift#getTime()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_Time();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see AdministrationExample.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Staff#getStaffID <em>Staff ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff ID</em>'.
	 * @see AdministrationExample.Staff#getStaffID()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffID();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Staff#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see AdministrationExample.Staff#getSalary()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Salary();

	/**
	 * Returns the meta object for the containment reference '{@link AdministrationExample.Staff#getShiftPlan <em>Shift Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shift Plan</em>'.
	 * @see AdministrationExample.Staff#getShiftPlan()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_ShiftPlan();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Staff#getDInt <em>DInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DInt</em>'.
	 * @see AdministrationExample.Staff#getDInt()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_DInt();

	/**
	 * Returns the meta object for the reference list '{@link AdministrationExample.Staff#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Treatment</em>'.
	 * @see AdministrationExample.Staff#getTreatment()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Treatment();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see AdministrationExample.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see AdministrationExample.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see AdministrationExample.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see AdministrationExample.Treatment
	 * @generated
	 */
	EClass getTreatment();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Treatment#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medication</em>'.
	 * @see AdministrationExample.Treatment#getMedication()
	 * @see #getTreatment()
	 * @generated
	 */
	EAttribute getTreatment_Medication();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Shiftplan <em>Shiftplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shiftplan</em>'.
	 * @see AdministrationExample.Shiftplan
	 * @generated
	 */
	EClass getShiftplan();

	/**
	 * Returns the meta object for the reference list '{@link AdministrationExample.Shiftplan#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covers</em>'.
	 * @see AdministrationExample.Shiftplan#getCovers()
	 * @see #getShiftplan()
	 * @generated
	 */
	EReference getShiftplan_Covers();

	/**
	 * Returns the meta object for the containment reference list '{@link AdministrationExample.Shiftplan#getShifts <em>Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shifts</em>'.
	 * @see AdministrationExample.Shiftplan#getShifts()
	 * @see #getShiftplan()
	 * @generated
	 */
	EReference getShiftplan_Shifts();

	/**
	 * Returns the meta object for class '{@link AdministrationExample.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see AdministrationExample.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link AdministrationExample.Patient#getPatientID <em>Patient ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient ID</em>'.
	 * @see AdministrationExample.Patient#getPatientID()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientID();

	/**
	 * Returns the meta object for the containment reference '{@link AdministrationExample.Patient#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Treatment</em>'.
	 * @see AdministrationExample.Patient#getTreatment()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Treatment();

	/**
	 * Returns the meta object for the reference list '{@link AdministrationExample.Patient#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see AdministrationExample.Patient#getCoveredBy()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_CoveredBy();

	/**
	 * Returns the meta object for enum '{@link AdministrationExample.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication</em>'.
	 * @see AdministrationExample.Medication
	 * @generated
	 */
	EEnum getMedication();

	/**
	 * Returns the meta object for enum '{@link AdministrationExample.Daytime <em>Daytime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Daytime</em>'.
	 * @see AdministrationExample.Daytime
	 * @generated
	 */
	EEnum getDaytime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdministrationExampleFactory getAdministrationExampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.AdministrationImpl <em>Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.AdministrationImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getAdministration()
		 * @generated
		 */
		EClass ADMINISTRATION = eINSTANCE.getAdministration();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATION__STAFF = eINSTANCE.getAdministration_Staff();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATION__PATIENT = eINSTANCE.getAdministration_Patient();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.ShiftImpl <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.ShiftImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getShift()
		 * @generated
		 */
		EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__TIME = eINSTANCE.getShift_Time();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.StaffImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_ID = eINSTANCE.getStaff_StaffID();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__SALARY = eINSTANCE.getStaff_Salary();

		/**
		 * The meta object literal for the '<em><b>Shift Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__SHIFT_PLAN = eINSTANCE.getStaff_ShiftPlan();

		/**
		 * The meta object literal for the '<em><b>DInt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__DINT = eINSTANCE.getStaff_DInt();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__TREATMENT = eINSTANCE.getStaff_Treatment();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.PersonImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.TreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.TreatmentImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getTreatment()
		 * @generated
		 */
		EClass TREATMENT = eINSTANCE.getTreatment();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT__MEDICATION = eINSTANCE.getTreatment_Medication();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.ShiftplanImpl <em>Shiftplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.ShiftplanImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getShiftplan()
		 * @generated
		 */
		EClass SHIFTPLAN = eINSTANCE.getShiftplan();

		/**
		 * The meta object literal for the '<em><b>Covers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFTPLAN__COVERS = eINSTANCE.getShiftplan_Covers();

		/**
		 * The meta object literal for the '<em><b>Shifts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFTPLAN__SHIFTS = eINSTANCE.getShiftplan_Shifts();

		/**
		 * The meta object literal for the '{@link AdministrationExample.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.impl.PatientImpl
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Patient ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_ID = eINSTANCE.getPatient_PatientID();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__TREATMENT = eINSTANCE.getPatient_Treatment();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__COVERED_BY = eINSTANCE.getPatient_CoveredBy();

		/**
		 * The meta object literal for the '{@link AdministrationExample.Medication <em>Medication</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.Medication
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getMedication()
		 * @generated
		 */
		EEnum MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '{@link AdministrationExample.Daytime <em>Daytime</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministrationExample.Daytime
		 * @see AdministrationExample.impl.AdministrationExamplePackageImpl#getDaytime()
		 * @generated
		 */
		EEnum DAYTIME = eINSTANCE.getDaytime();

	}

} //AdministrationExamplePackage
