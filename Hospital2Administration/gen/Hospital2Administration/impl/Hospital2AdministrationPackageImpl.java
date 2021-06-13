/**
 */
package Hospital2Administration.impl;

import AdministrationExample.AdministrationExamplePackage;

import Hospital2Administration.DepartmentRule__Marker;
import Hospital2Administration.DocToStaffRule__Marker;
import Hospital2Administration.DoctorShiftplanRule__Marker;
import Hospital2Administration.DoctorToPatient__Marker;
import Hospital2Administration.DoctorToStaff;
import Hospital2Administration.Hospital2AdministrationFactory;
import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.HospitaltoAdministrationRule__Marker;
import Hospital2Administration.NurseShiftplanRule__Marker;
import Hospital2Administration.NurseToRoomRule__Marker;
import Hospital2Administration.NurseToStaff;
import Hospital2Administration.NurseToStaffRule__Marker;
import Hospital2Administration.PatientInReception__Marker;
import Hospital2Administration.PatientInRoom__Marker;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.RoomRule__Marker;
import Hospital2Administration.RoomToShiftplan;
import Hospital2Administration.StaffToStaff;

import HospitalExample.HospitalExamplePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hospital2AdministrationPackageImpl extends EPackageImpl implements Hospital2AdministrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalToAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffToStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientToPatientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomToShiftplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorToStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nurseToStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docToStaffRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorShiftplanRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorToPatient__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitaltoAdministrationRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nurseShiftplanRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nurseToRoomRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nurseToStaffRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientInReception__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientInRoom__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomRule__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Hospital2Administration.Hospital2AdministrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hospital2AdministrationPackageImpl() {
		super(eNS_URI, Hospital2AdministrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hospital2AdministrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hospital2AdministrationPackage init() {
		if (isInited) return (Hospital2AdministrationPackage)EPackage.Registry.INSTANCE.getEPackage(Hospital2AdministrationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHospital2AdministrationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hospital2AdministrationPackageImpl theHospital2AdministrationPackage = registeredHospital2AdministrationPackage instanceof Hospital2AdministrationPackageImpl ? (Hospital2AdministrationPackageImpl)registeredHospital2AdministrationPackage : new Hospital2AdministrationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HospitalExamplePackage.eINSTANCE.eClass();
		AdministrationExamplePackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHospital2AdministrationPackage.createPackageContents();

		// Initialize created meta-data
		theHospital2AdministrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHospital2AdministrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hospital2AdministrationPackage.eNS_URI, theHospital2AdministrationPackage);
		return theHospital2AdministrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalToAdministration() {
		return hospitalToAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitalToAdministration_Source() {
		return (EReference)hospitalToAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitalToAdministration_Target() {
		return (EReference)hospitalToAdministrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffToStaff() {
		return staffToStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffToStaff_Source() {
		return (EReference)staffToStaffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffToStaff_Target() {
		return (EReference)staffToStaffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientToPatient() {
		return patientToPatientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientToPatient_Source() {
		return (EReference)patientToPatientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientToPatient_Target() {
		return (EReference)patientToPatientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomToShiftplan() {
		return roomToShiftplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomToShiftplan_Source() {
		return (EReference)roomToShiftplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomToShiftplan_Target() {
		return (EReference)roomToShiftplanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctorToStaff() {
		return doctorToStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToStaff_Source() {
		return (EReference)doctorToStaffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToStaff_Target() {
		return (EReference)doctorToStaffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNurseToStaff() {
		return nurseToStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaff_Source() {
		return (EReference)nurseToStaffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaff_Target() {
		return (EReference)nurseToStaffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartmentRule__Marker() {
		return departmentRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentRule__Marker_CREATE__SRC__d() {
		return (EReference)departmentRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentRule__Marker_CONTEXT__SRC__h() {
		return (EReference)departmentRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocToStaffRule__Marker() {
		return docToStaffRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CONTEXT__SRC__d() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CONTEXT__SRC__h() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CREATE__SRC__s1() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CREATE__TRG__s2() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CREATE__TRG__sh() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CREATE__TRG__sp() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CONTEXT__TRG__v() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CONTEXT__CORR__htov() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocToStaffRule__Marker_CREATE__CORR__stot() {
		return (EReference)docToStaffRule__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctorShiftplanRule__Marker() {
		return doctorShiftplanRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS() {
		return (EReference)doctorShiftplanRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctorToPatient__Marker() {
		return doctorToPatient__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__d() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__dep() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__p1() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__SRC__ro() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__TRG__p2() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__TRG__s() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CREATE__TRG__t() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__CORR__dToS() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctorToPatient__Marker_CONTEXT__CORR__pToP() {
		return (EReference)doctorToPatient__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitaltoAdministrationRule__Marker() {
		return hospitaltoAdministrationRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__h() {
		return (EReference)hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__r() {
		return (EReference)hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__TRG__v() {
		return (EReference)hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov() {
		return (EReference)hospitaltoAdministrationRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNurseShiftplanRule__Marker() {
		return nurseShiftplanRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__p1() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__ro() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__s1() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__p2() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__s2() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sh() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sp() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS() {
		return (EReference)nurseShiftplanRule__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNurseToRoomRule__Marker() {
		return nurseToRoomRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__dep() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__n() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__p1() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__SRC__r() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__TRG__p2() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__TRG__s() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__CORR__nToS() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToRoomRule__Marker_CONTEXT__CORR__pTop() {
		return (EReference)nurseToRoomRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNurseToStaffRule__Marker() {
		return nurseToStaffRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CONTEXT__SRC__d() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CONTEXT__SRC__h() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CREATE__SRC__s1() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__s2() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__sh() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CREATE__TRG__sp() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CONTEXT__TRG__v() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CONTEXT__CORR__htov() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurseToStaffRule__Marker_CREATE__CORR__stot() {
		return (EReference)nurseToStaffRule__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientInReception__Marker() {
		return patientInReception__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CONTEXT__SRC__h() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CREATE__SRC__p1() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CONTEXT__SRC__r() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CREATE__TRG__p2() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CONTEXT__TRG__v() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CONTEXT__CORR__htov() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInReception__Marker_CREATE__CORR__pTop() {
		return (EReference)patientInReception__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientInRoom__Marker() {
		return patientInRoom__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__d() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__h() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CREATE__SRC__p1() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CONTEXT__SRC__ro() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CREATE__TRG__p2() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CONTEXT__TRG__v() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CONTEXT__CORR__htov() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInRoom__Marker_CREATE__CORR__pTop() {
		return (EReference)patientInRoom__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomRule__Marker() {
		return roomRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomRule__Marker_CONTEXT__SRC__d() {
		return (EReference)roomRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomRule__Marker_CREATE__SRC__ro() {
		return (EReference)roomRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationFactory getHospital2AdministrationFactory() {
		return (Hospital2AdministrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hospitalToAdministrationEClass = createEClass(HOSPITAL_TO_ADMINISTRATION);
		createEReference(hospitalToAdministrationEClass, HOSPITAL_TO_ADMINISTRATION__SOURCE);
		createEReference(hospitalToAdministrationEClass, HOSPITAL_TO_ADMINISTRATION__TARGET);

		staffToStaffEClass = createEClass(STAFF_TO_STAFF);
		createEReference(staffToStaffEClass, STAFF_TO_STAFF__SOURCE);
		createEReference(staffToStaffEClass, STAFF_TO_STAFF__TARGET);

		patientToPatientEClass = createEClass(PATIENT_TO_PATIENT);
		createEReference(patientToPatientEClass, PATIENT_TO_PATIENT__SOURCE);
		createEReference(patientToPatientEClass, PATIENT_TO_PATIENT__TARGET);

		roomToShiftplanEClass = createEClass(ROOM_TO_SHIFTPLAN);
		createEReference(roomToShiftplanEClass, ROOM_TO_SHIFTPLAN__SOURCE);
		createEReference(roomToShiftplanEClass, ROOM_TO_SHIFTPLAN__TARGET);

		doctorToStaffEClass = createEClass(DOCTOR_TO_STAFF);
		createEReference(doctorToStaffEClass, DOCTOR_TO_STAFF__SOURCE);
		createEReference(doctorToStaffEClass, DOCTOR_TO_STAFF__TARGET);

		nurseToStaffEClass = createEClass(NURSE_TO_STAFF);
		createEReference(nurseToStaffEClass, NURSE_TO_STAFF__SOURCE);
		createEReference(nurseToStaffEClass, NURSE_TO_STAFF__TARGET);

		departmentRule__MarkerEClass = createEClass(DEPARTMENT_RULE_MARKER);
		createEReference(departmentRule__MarkerEClass, DEPARTMENT_RULE_MARKER__CREATE_SRC_D);
		createEReference(departmentRule__MarkerEClass, DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H);

		docToStaffRule__MarkerEClass = createEClass(DOC_TO_STAFF_RULE_MARKER);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV);
		createEReference(docToStaffRule__MarkerEClass, DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT);

		doctorShiftplanRule__MarkerEClass = createEClass(DOCTOR_SHIFTPLAN_RULE_MARKER);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P);
		createEReference(doctorShiftplanRule__MarkerEClass, DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S);

		doctorToPatient__MarkerEClass = createEClass(DOCTOR_TO_PATIENT_MARKER);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S);
		createEReference(doctorToPatient__MarkerEClass, DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P);

		hospitaltoAdministrationRule__MarkerEClass = createEClass(HOSPITALTO_ADMINISTRATION_RULE_MARKER);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V);
		createEReference(hospitaltoAdministrationRule__MarkerEClass, HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV);

		nurseShiftplanRule__MarkerEClass = createEClass(NURSE_SHIFTPLAN_RULE_MARKER);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P);
		createEReference(nurseShiftplanRule__MarkerEClass, NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S);

		nurseToRoomRule__MarkerEClass = createEClass(NURSE_TO_ROOM_RULE_MARKER);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S);
		createEReference(nurseToRoomRule__MarkerEClass, NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP);

		nurseToStaffRule__MarkerEClass = createEClass(NURSE_TO_STAFF_RULE_MARKER);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CREATE_SRC_S1);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_S2);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SH);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SP);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV);
		createEReference(nurseToStaffRule__MarkerEClass, NURSE_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT);

		patientInReception__MarkerEClass = createEClass(PATIENT_IN_RECEPTION_MARKER);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV);
		createEReference(patientInReception__MarkerEClass, PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP);

		patientInRoom__MarkerEClass = createEClass(PATIENT_IN_ROOM_MARKER);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_D);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_H);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CREATE_SRC_P1);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_RO);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CREATE_TRG_P2);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CONTEXT_TRG_V);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CONTEXT_CORR_HTOV);
		createEReference(patientInRoom__MarkerEClass, PATIENT_IN_ROOM_MARKER__CREATE_CORR_PTOP);

		roomRule__MarkerEClass = createEClass(ROOM_RULE_MARKER);
		createEReference(roomRule__MarkerEClass, ROOM_RULE_MARKER__CONTEXT_SRC_D);
		createEReference(roomRule__MarkerEClass, ROOM_RULE_MARKER__CREATE_SRC_RO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HospitalExamplePackage theHospitalExamplePackage = (HospitalExamplePackage)EPackage.Registry.INSTANCE.getEPackage(HospitalExamplePackage.eNS_URI);
		AdministrationExamplePackage theAdministrationExamplePackage = (AdministrationExamplePackage)EPackage.Registry.INSTANCE.getEPackage(AdministrationExamplePackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		departmentRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		docToStaffRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		doctorShiftplanRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		doctorToPatient__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		hospitaltoAdministrationRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		nurseShiftplanRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		nurseToRoomRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		nurseToStaffRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		patientInReception__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		patientInRoom__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		roomRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(hospitalToAdministrationEClass, HospitalToAdministration.class, "HospitalToAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospitalToAdministration_Source(), theHospitalExamplePackage.getHospital(), null, "source", null, 0, 1, HospitalToAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitalToAdministration_Target(), theAdministrationExamplePackage.getAdministration(), null, "target", null, 0, 1, HospitalToAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffToStaffEClass, StaffToStaff.class, "StaffToStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffToStaff_Source(), theHospitalExamplePackage.getStaff(), null, "source", null, 0, 1, StaffToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffToStaff_Target(), theAdministrationExamplePackage.getStaff(), null, "target", null, 0, 1, StaffToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientToPatientEClass, PatientToPatient.class, "PatientToPatient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientToPatient_Source(), theHospitalExamplePackage.getPatient(), null, "source", null, 0, 1, PatientToPatient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientToPatient_Target(), theAdministrationExamplePackage.getPatient(), null, "target", null, 0, 1, PatientToPatient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomToShiftplanEClass, RoomToShiftplan.class, "RoomToShiftplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomToShiftplan_Source(), theHospitalExamplePackage.getRoom(), null, "source", null, 0, 1, RoomToShiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomToShiftplan_Target(), theAdministrationExamplePackage.getShiftplan(), null, "target", null, 0, 1, RoomToShiftplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorToStaffEClass, DoctorToStaff.class, "DoctorToStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorToStaff_Source(), theHospitalExamplePackage.getDoctor(), null, "source", null, 0, 1, DoctorToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToStaff_Target(), theAdministrationExamplePackage.getStaff(), null, "target", null, 0, 1, DoctorToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nurseToStaffEClass, NurseToStaff.class, "NurseToStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToStaff_Source(), theHospitalExamplePackage.getNurse(), null, "source", null, 0, 1, NurseToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaff_Target(), theAdministrationExamplePackage.getStaff(), null, "target", null, 0, 1, NurseToStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentRule__MarkerEClass, DepartmentRule__Marker.class, "DepartmentRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartmentRule__Marker_CREATE__SRC__d(), theHospitalExamplePackage.getDepartment(), null, "CREATE__SRC__d", null, 1, 1, DepartmentRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartmentRule__Marker_CONTEXT__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CONTEXT__SRC__h", null, 1, 1, DepartmentRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docToStaffRule__MarkerEClass, DocToStaffRule__Marker.class, "DocToStaffRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocToStaffRule__Marker_CONTEXT__SRC__d(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__d", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CONTEXT__SRC__h", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__SRC__s1(), theHospitalExamplePackage.getDoctor(), null, "CREATE__SRC__s1", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__s2(), theAdministrationExamplePackage.getStaff(), null, "CREATE__TRG__s2", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__sh(), theAdministrationExamplePackage.getShift(), null, "CREATE__TRG__sh", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__TRG__sp(), theAdministrationExamplePackage.getShiftplan(), null, "CREATE__TRG__sp", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__TRG__v(), theAdministrationExamplePackage.getAdministration(), null, "CONTEXT__TRG__v", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(), null, "CONTEXT__CORR__htov", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocToStaffRule__Marker_CREATE__CORR__stot(), this.getStaffToStaff(), null, "CREATE__CORR__stot", null, 1, 1, DocToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorShiftplanRule__MarkerEClass, DoctorShiftplanRule__Marker.class, "DoctorShiftplanRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CONTEXT__SRC__p1", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1(), theHospitalExamplePackage.getDoctor(), null, "CONTEXT__SRC__s1", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CONTEXT__TRG__p2", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2(), theAdministrationExamplePackage.getStaff(), null, "CONTEXT__TRG__s2", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh(), theAdministrationExamplePackage.getShift(), null, "CONTEXT__TRG__sh", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp(), theAdministrationExamplePackage.getShiftplan(), null, "CONTEXT__TRG__sp", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(), null, "CONTEXT__CORR__pToP", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS(), this.getStaffToStaff(), null, "CONTEXT__CORR__sToS", null, 1, 1, DoctorShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorToPatient__MarkerEClass, DoctorToPatient__Marker.class, "DoctorToPatient__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__d(), theHospitalExamplePackage.getDoctor(), null, "CONTEXT__SRC__d", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__dep(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__dep", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CONTEXT__SRC__p1", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__SRC__ro(), theHospitalExamplePackage.getRoom(), null, "CONTEXT__SRC__ro", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CONTEXT__TRG__p2", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__TRG__s(), theAdministrationExamplePackage.getStaff(), null, "CONTEXT__TRG__s", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CREATE__TRG__t(), theAdministrationExamplePackage.getTreatment(), null, "CREATE__TRG__t", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__CORR__dToS(), this.getStaffToStaff(), null, "CONTEXT__CORR__dToS", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorToPatient__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(), null, "CONTEXT__CORR__pToP", null, 1, 1, DoctorToPatient__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospitaltoAdministrationRule__MarkerEClass, HospitaltoAdministrationRule__Marker.class, "HospitaltoAdministrationRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CREATE__SRC__h", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__SRC__r(), theHospitalExamplePackage.getReception(), null, "CREATE__SRC__r", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__TRG__v(), theAdministrationExamplePackage.getAdministration(), null, "CREATE__TRG__v", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov(), this.getHospitalToAdministration(), null, "CREATE__CORR__htov", null, 1, 1, HospitaltoAdministrationRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nurseShiftplanRule__MarkerEClass, NurseShiftplanRule__Marker.class, "NurseShiftplanRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CONTEXT__SRC__p1", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__ro(), theHospitalExamplePackage.getRoom(), null, "CONTEXT__SRC__ro", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__SRC__s1(), theHospitalExamplePackage.getNurse(), null, "CONTEXT__SRC__s1", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CONTEXT__TRG__p2", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__s2(), theAdministrationExamplePackage.getStaff(), null, "CONTEXT__TRG__s2", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__sh(), theAdministrationExamplePackage.getShift(), null, "CONTEXT__TRG__sh", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__TRG__sp(), theAdministrationExamplePackage.getShiftplan(), null, "CONTEXT__TRG__sp", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP(), this.getPatientToPatient(), null, "CONTEXT__CORR__pToP", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS(), this.getStaffToStaff(), null, "CONTEXT__CORR__sToS", null, 1, 1, NurseShiftplanRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nurseToRoomRule__MarkerEClass, NurseToRoomRule__Marker.class, "NurseToRoomRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__dep(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__dep", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__n(), theHospitalExamplePackage.getNurse(), null, "CONTEXT__SRC__n", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CONTEXT__SRC__p1", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__SRC__r(), theHospitalExamplePackage.getRoom(), null, "CONTEXT__SRC__r", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CONTEXT__TRG__p2", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__TRG__s(), theAdministrationExamplePackage.getStaff(), null, "CONTEXT__TRG__s", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__CORR__nToS(), this.getStaffToStaff(), null, "CONTEXT__CORR__nToS", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToRoomRule__Marker_CONTEXT__CORR__pTop(), this.getPatientToPatient(), null, "CONTEXT__CORR__pTop", null, 1, 1, NurseToRoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nurseToStaffRule__MarkerEClass, NurseToStaffRule__Marker.class, "NurseToStaffRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__SRC__d(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__d", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CONTEXT__SRC__h", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__SRC__s1(), theHospitalExamplePackage.getNurse(), null, "CREATE__SRC__s1", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__s2(), theAdministrationExamplePackage.getStaff(), null, "CREATE__TRG__s2", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__sh(), theAdministrationExamplePackage.getShift(), null, "CREATE__TRG__sh", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__TRG__sp(), theAdministrationExamplePackage.getShiftplan(), null, "CREATE__TRG__sp", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__TRG__v(), theAdministrationExamplePackage.getAdministration(), null, "CONTEXT__TRG__v", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(), null, "CONTEXT__CORR__htov", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurseToStaffRule__Marker_CREATE__CORR__stot(), this.getStaffToStaff(), null, "CREATE__CORR__stot", null, 1, 1, NurseToStaffRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientInReception__MarkerEClass, PatientInReception__Marker.class, "PatientInReception__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientInReception__Marker_CONTEXT__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CONTEXT__SRC__h", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CREATE__SRC__p1", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__SRC__r(), theHospitalExamplePackage.getReception(), null, "CONTEXT__SRC__r", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CREATE__TRG__p2", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__TRG__v(), theAdministrationExamplePackage.getAdministration(), null, "CONTEXT__TRG__v", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(), null, "CONTEXT__CORR__htov", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInReception__Marker_CREATE__CORR__pTop(), this.getPatientToPatient(), null, "CREATE__CORR__pTop", null, 1, 1, PatientInReception__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientInRoom__MarkerEClass, PatientInRoom__Marker.class, "PatientInRoom__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__d(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__d", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__h(), theHospitalExamplePackage.getHospital(), null, "CONTEXT__SRC__h", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__SRC__p1(), theHospitalExamplePackage.getPatient(), null, "CREATE__SRC__p1", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__SRC__ro(), theHospitalExamplePackage.getRoom(), null, "CONTEXT__SRC__ro", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__TRG__p2(), theAdministrationExamplePackage.getPatient(), null, "CREATE__TRG__p2", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__TRG__v(), theAdministrationExamplePackage.getAdministration(), null, "CONTEXT__TRG__v", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CONTEXT__CORR__htov(), this.getHospitalToAdministration(), null, "CONTEXT__CORR__htov", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientInRoom__Marker_CREATE__CORR__pTop(), this.getPatientToPatient(), null, "CREATE__CORR__pTop", null, 1, 1, PatientInRoom__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomRule__MarkerEClass, RoomRule__Marker.class, "RoomRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomRule__Marker_CONTEXT__SRC__d(), theHospitalExamplePackage.getDepartment(), null, "CONTEXT__SRC__d", null, 1, 1, RoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomRule__Marker_CREATE__SRC__ro(), theHospitalExamplePackage.getRoom(), null, "CREATE__SRC__ro", null, 1, 1, RoomRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Hospital2AdministrationPackageImpl
