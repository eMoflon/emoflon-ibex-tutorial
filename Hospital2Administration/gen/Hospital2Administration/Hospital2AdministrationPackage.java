/**
 */
package Hospital2Administration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import runtime.RuntimePackage;

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
 * @see Hospital2Administration.Hospital2AdministrationFactory
 * @model kind="package"
 * @generated
 */
public interface Hospital2AdministrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Hospital2Administration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Hospital2Administration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hospital2AdministrationPackage eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.HospitalToAdministrationImpl <em>Hospital To Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.HospitalToAdministrationImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getHospitalToAdministration()
	 * @generated
	 */
	int HOSPITAL_TO_ADMINISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_TO_ADMINISTRATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_TO_ADMINISTRATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Hospital To Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_TO_ADMINISTRATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hospital To Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_TO_ADMINISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.StaffToStaffImpl <em>Staff To Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.StaffToStaffImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getStaffToStaff()
	 * @generated
	 */
	int STAFF_TO_STAFF = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_TO_STAFF__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_TO_STAFF__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Staff To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_TO_STAFF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staff To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_TO_STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.PatientToPatientImpl <em>Patient To Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.PatientToPatientImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientToPatient()
	 * @generated
	 */
	int PATIENT_TO_PATIENT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TO_PATIENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TO_PATIENT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Patient To Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TO_PATIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Patient To Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TO_PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.RoomToShiftplanImpl <em>Room To Shiftplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.RoomToShiftplanImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getRoomToShiftplan()
	 * @generated
	 */
	int ROOM_TO_SHIFTPLAN = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TO_SHIFTPLAN__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TO_SHIFTPLAN__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Room To Shiftplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TO_SHIFTPLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room To Shiftplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TO_SHIFTPLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.DoctorToStaffImpl <em>Doctor To Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.DoctorToStaffImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorToStaff()
	 * @generated
	 */
	int DOCTOR_TO_STAFF = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_STAFF__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_STAFF__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Doctor To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_STAFF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Doctor To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.NurseToStaffImpl <em>Nurse To Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.NurseToStaffImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToStaff()
	 * @generated
	 */
	int NURSE_TO_STAFF = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Nurse To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nurse To Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.DepartmentRule__MarkerImpl <em>Department Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.DepartmentRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDepartmentRule__Marker()
	 * @generated
	 */
	int DEPARTMENT_RULE_MARKER = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_RULE_MARKER__CREATE_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Department Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Department Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl <em>Doc To Staff Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.DocToStaffRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDocToStaffRule__Marker()
	 * @generated
	 */
	int DOC_TO_STAFF_RULE_MARKER = 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR stot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Doc To Staff Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Doc To Staff Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TO_STAFF_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.DoctorShiftplanRule__MarkerImpl <em>Doctor Shiftplan Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.DoctorShiftplanRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER = 8;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR pTo P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR sTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Doctor Shiftplan Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Doctor Shiftplan Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_SHIFTPLAN_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl <em>Doctor To Patient Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.DoctorToPatient__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorToPatient__Marker()
	 * @generated
	 */
	int DOCTOR_TO_PATIENT_MARKER = 9;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC dep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG s</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE TRG t</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR dTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR pTo P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Doctor To Patient Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Doctor To Patient Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_TO_PATIENT_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl <em>Hospitalto Administration Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getHospitaltoAdministrationRule__Marker()
	 * @generated
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER = 10;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC r</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hospitalto Administration Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hospitalto Administration Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITALTO_ADMINISTRATION_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl <em>Nurse Shiftplan Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseShiftplanRule__Marker()
	 * @generated
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER = 11;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR pTo P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR sTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Nurse Shiftplan Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Nurse Shiftplan Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_SHIFTPLAN_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl <em>Nurse To Room Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.NurseToRoomRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToRoomRule__Marker()
	 * @generated
	 */
	int NURSE_TO_ROOM_RULE_MARKER = 12;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC dep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC n</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC r</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG s</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR nTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR pTop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Nurse To Room Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Nurse To Room Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_ROOM_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.NurseToStaffRule__MarkerImpl <em>Nurse To Staff Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.NurseToStaffRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToStaffRule__Marker()
	 * @generated
	 */
	int NURSE_TO_STAFF_RULE_MARKER = 13;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CREATE_SRC_S1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_S2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR stot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Nurse To Staff Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Nurse To Staff Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_TO_STAFF_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.PatientInReception__MarkerImpl <em>Patient In Reception Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.PatientInReception__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientInReception__Marker()
	 * @generated
	 */
	int PATIENT_IN_RECEPTION_MARKER = 14;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC r</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR pTop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Patient In Reception Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Patient In Reception Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_RECEPTION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.PatientInRoom__MarkerImpl <em>Patient In Room Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.PatientInRoom__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientInRoom__Marker()
	 * @generated
	 */
	int PATIENT_IN_ROOM_MARKER = 15;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_H = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CREATE_SRC_P1 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_RO = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CREATE_TRG_P2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CONTEXT_TRG_V = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CONTEXT_CORR_HTOV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR pTop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER__CREATE_CORR_PTOP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Patient In Room Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Patient In Room Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_IN_ROOM_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Hospital2Administration.impl.RoomRule__MarkerImpl <em>Room Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hospital2Administration.impl.RoomRule__MarkerImpl
	 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getRoomRule__Marker()
	 * @generated
	 */
	int ROOM_RULE_MARKER = 16;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RULE_MARKER__CONTEXT_SRC_D = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RULE_MARKER__CREATE_SRC_RO = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Room Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Hospital2Administration.HospitalToAdministration <em>Hospital To Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital To Administration</em>'.
	 * @see Hospital2Administration.HospitalToAdministration
	 * @generated
	 */
	EClass getHospitalToAdministration();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitalToAdministration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.HospitalToAdministration#getSource()
	 * @see #getHospitalToAdministration()
	 * @generated
	 */
	EReference getHospitalToAdministration_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitalToAdministration#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.HospitalToAdministration#getTarget()
	 * @see #getHospitalToAdministration()
	 * @generated
	 */
	EReference getHospitalToAdministration_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.StaffToStaff <em>Staff To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff To Staff</em>'.
	 * @see Hospital2Administration.StaffToStaff
	 * @generated
	 */
	EClass getStaffToStaff();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.StaffToStaff#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.StaffToStaff#getSource()
	 * @see #getStaffToStaff()
	 * @generated
	 */
	EReference getStaffToStaff_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.StaffToStaff#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.StaffToStaff#getTarget()
	 * @see #getStaffToStaff()
	 * @generated
	 */
	EReference getStaffToStaff_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.PatientToPatient <em>Patient To Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient To Patient</em>'.
	 * @see Hospital2Administration.PatientToPatient
	 * @generated
	 */
	EClass getPatientToPatient();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientToPatient#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.PatientToPatient#getSource()
	 * @see #getPatientToPatient()
	 * @generated
	 */
	EReference getPatientToPatient_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientToPatient#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.PatientToPatient#getTarget()
	 * @see #getPatientToPatient()
	 * @generated
	 */
	EReference getPatientToPatient_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.RoomToShiftplan <em>Room To Shiftplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room To Shiftplan</em>'.
	 * @see Hospital2Administration.RoomToShiftplan
	 * @generated
	 */
	EClass getRoomToShiftplan();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.RoomToShiftplan#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.RoomToShiftplan#getSource()
	 * @see #getRoomToShiftplan()
	 * @generated
	 */
	EReference getRoomToShiftplan_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.RoomToShiftplan#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.RoomToShiftplan#getTarget()
	 * @see #getRoomToShiftplan()
	 * @generated
	 */
	EReference getRoomToShiftplan_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.DoctorToStaff <em>Doctor To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor To Staff</em>'.
	 * @see Hospital2Administration.DoctorToStaff
	 * @generated
	 */
	EClass getDoctorToStaff();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToStaff#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.DoctorToStaff#getSource()
	 * @see #getDoctorToStaff()
	 * @generated
	 */
	EReference getDoctorToStaff_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToStaff#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.DoctorToStaff#getTarget()
	 * @see #getDoctorToStaff()
	 * @generated
	 */
	EReference getDoctorToStaff_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.NurseToStaff <em>Nurse To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse To Staff</em>'.
	 * @see Hospital2Administration.NurseToStaff
	 * @generated
	 */
	EClass getNurseToStaff();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaff#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Hospital2Administration.NurseToStaff#getSource()
	 * @see #getNurseToStaff()
	 * @generated
	 */
	EReference getNurseToStaff_Source();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaff#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Hospital2Administration.NurseToStaff#getTarget()
	 * @see #getNurseToStaff()
	 * @generated
	 */
	EReference getNurseToStaff_Target();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.DepartmentRule__Marker <em>Department Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Rule Marker</em>'.
	 * @see Hospital2Administration.DepartmentRule__Marker
	 * @generated
	 */
	EClass getDepartmentRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DepartmentRule__Marker#getCREATE__SRC__d <em>CREATE SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC d</em>'.
	 * @see Hospital2Administration.DepartmentRule__Marker#getCREATE__SRC__d()
	 * @see #getDepartmentRule__Marker()
	 * @generated
	 */
	EReference getDepartmentRule__Marker_CREATE__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DepartmentRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC h</em>'.
	 * @see Hospital2Administration.DepartmentRule__Marker#getCONTEXT__SRC__h()
	 * @see #getDepartmentRule__Marker()
	 * @generated
	 */
	EReference getDepartmentRule__Marker_CONTEXT__SRC__h();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.DocToStaffRule__Marker <em>Doc To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc To Staff Rule Marker</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker
	 * @generated
	 */
	EClass getDocToStaffRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC d</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__SRC__d()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CONTEXT__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC h</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__SRC__h()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CONTEXT__SRC__h();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCREATE__SRC__s1 <em>CREATE SRC s1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC s1</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCREATE__SRC__s1()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CREATE__SRC__s1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__s2 <em>CREATE TRG s2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG s2</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__s2()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CREATE__TRG__s2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__sh <em>CREATE TRG sh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG sh</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__sh()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CREATE__TRG__sh();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__sp <em>CREATE TRG sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG sp</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCREATE__TRG__sp()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CREATE__TRG__sp();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG v</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__TRG__v()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CONTEXT__TRG__v();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR htov</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCONTEXT__CORR__htov()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CONTEXT__CORR__htov();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DocToStaffRule__Marker#getCREATE__CORR__stot <em>CREATE CORR stot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR stot</em>'.
	 * @see Hospital2Administration.DocToStaffRule__Marker#getCREATE__CORR__stot()
	 * @see #getDocToStaffRule__Marker()
	 * @generated
	 */
	EReference getDocToStaffRule__Marker_CREATE__CORR__stot();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.DoctorShiftplanRule__Marker <em>Doctor Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor Shiftplan Rule Marker</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker
	 * @generated
	 */
	EClass getDoctorShiftplanRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC p1</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__SRC__p1()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__SRC__s1 <em>CONTEXT SRC s1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC s1</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__SRC__s1()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG p2</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__p2()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__s2 <em>CONTEXT TRG s2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG s2</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__s2()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__sh <em>CONTEXT TRG sh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG sh</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__sh()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__sp <em>CONTEXT TRG sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG sp</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__TRG__sp()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR pTo P</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__CORR__pToP()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__CORR__sToS <em>CONTEXT CORR sTo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR sTo S</em>'.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker#getCONTEXT__CORR__sToS()
	 * @see #getDoctorShiftplanRule__Marker()
	 * @generated
	 */
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.DoctorToPatient__Marker <em>Doctor To Patient Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor To Patient Marker</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker
	 * @generated
	 */
	EClass getDoctorToPatient__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC d</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__d()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC dep</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__dep()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__dep();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC p1</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__p1()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC ro</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__ro()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__ro();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG p2</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__p2()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG s</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__s()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__s();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCREATE__TRG__t <em>CREATE TRG t</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG t</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCREATE__TRG__t()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CREATE__TRG__t();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__dToS <em>CONTEXT CORR dTo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR dTo S</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__dToS()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__dToS();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR pTo P</em>'.
	 * @see Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__pToP()
	 * @see #getDoctorToPatient__Marker()
	 * @generated
	 */
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__pToP();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker <em>Hospitalto Administration Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospitalto Administration Rule Marker</em>'.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker
	 * @generated
	 */
	EClass getHospitaltoAdministrationRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__h <em>CREATE SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC h</em>'.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__h()
	 * @see #getHospitaltoAdministrationRule__Marker()
	 * @generated
	 */
	EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__h();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__r <em>CREATE SRC r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC r</em>'.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__r()
	 * @see #getHospitaltoAdministrationRule__Marker()
	 * @generated
	 */
	EReference getHospitaltoAdministrationRule__Marker_CREATE__SRC__r();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__TRG__v <em>CREATE TRG v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG v</em>'.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__TRG__v()
	 * @see #getHospitaltoAdministrationRule__Marker()
	 * @generated
	 */
	EReference getHospitaltoAdministrationRule__Marker_CREATE__TRG__v();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__CORR__htov <em>CREATE CORR htov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR htov</em>'.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__CORR__htov()
	 * @see #getHospitaltoAdministrationRule__Marker()
	 * @generated
	 */
	EReference getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.NurseShiftplanRule__Marker <em>Nurse Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse Shiftplan Rule Marker</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker
	 * @generated
	 */
	EClass getNurseShiftplanRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC p1</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__p1()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC ro</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__ro()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__s1 <em>CONTEXT SRC s1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC s1</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__SRC__s1()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG p2</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__p2()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__s2 <em>CONTEXT TRG s2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG s2</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__s2()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__sh <em>CONTEXT TRG sh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG sh</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__sh()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__sp <em>CONTEXT TRG sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG sp</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__TRG__sp()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR pTo P</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__CORR__pToP()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__CORR__sToS <em>CONTEXT CORR sTo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR sTo S</em>'.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker#getCONTEXT__CORR__sToS()
	 * @see #getNurseShiftplanRule__Marker()
	 * @generated
	 */
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.NurseToRoomRule__Marker <em>Nurse To Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse To Room Rule Marker</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker
	 * @generated
	 */
	EClass getNurseToRoomRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC dep</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__dep()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__dep();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__n <em>CONTEXT SRC n</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC n</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__n()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__n();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC p1</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__p1()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC r</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__r()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__r();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG p2</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__p2()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG s</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__s()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__s();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__nToS <em>CONTEXT CORR nTo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR nTo S</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__nToS()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__pTop <em>CONTEXT CORR pTop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR pTop</em>'.
	 * @see Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__pTop()
	 * @see #getNurseToRoomRule__Marker()
	 * @generated
	 */
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.NurseToStaffRule__Marker <em>Nurse To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse To Staff Rule Marker</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker
	 * @generated
	 */
	EClass getNurseToStaffRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC d</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__d()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CONTEXT__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC h</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__h()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CONTEXT__SRC__h();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__SRC__s1 <em>CREATE SRC s1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC s1</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCREATE__SRC__s1()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CREATE__SRC__s1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__s2 <em>CREATE TRG s2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG s2</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__s2()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CREATE__TRG__s2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sh <em>CREATE TRG sh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG sh</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sh()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CREATE__TRG__sh();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sp <em>CREATE TRG sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG sp</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sp()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CREATE__TRG__sp();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG v</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__TRG__v()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CONTEXT__TRG__v();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR htov</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__CORR__htov()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CONTEXT__CORR__htov();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__CORR__stot <em>CREATE CORR stot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR stot</em>'.
	 * @see Hospital2Administration.NurseToStaffRule__Marker#getCREATE__CORR__stot()
	 * @see #getNurseToStaffRule__Marker()
	 * @generated
	 */
	EReference getNurseToStaffRule__Marker_CREATE__CORR__stot();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.PatientInReception__Marker <em>Patient In Reception Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient In Reception Marker</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker
	 * @generated
	 */
	EClass getPatientInReception__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC h</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCONTEXT__SRC__h()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CONTEXT__SRC__h();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCREATE__SRC__p1 <em>CREATE SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC p1</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCREATE__SRC__p1()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CREATE__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC r</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCONTEXT__SRC__r()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CONTEXT__SRC__r();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCREATE__TRG__p2 <em>CREATE TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG p2</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCREATE__TRG__p2()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CREATE__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG v</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCONTEXT__TRG__v()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CONTEXT__TRG__v();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR htov</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCONTEXT__CORR__htov()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CONTEXT__CORR__htov();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInReception__Marker#getCREATE__CORR__pTop <em>CREATE CORR pTop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR pTop</em>'.
	 * @see Hospital2Administration.PatientInReception__Marker#getCREATE__CORR__pTop()
	 * @see #getPatientInReception__Marker()
	 * @generated
	 */
	EReference getPatientInReception__Marker_CREATE__CORR__pTop();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.PatientInRoom__Marker <em>Patient In Room Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient In Room Marker</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker
	 * @generated
	 */
	EClass getPatientInRoom__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC d</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__d()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CONTEXT__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC h</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__h()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CONTEXT__SRC__h();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCREATE__SRC__p1 <em>CREATE SRC p1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC p1</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCREATE__SRC__p1()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CREATE__SRC__p1();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC ro</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCONTEXT__SRC__ro()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CONTEXT__SRC__ro();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCREATE__TRG__p2 <em>CREATE TRG p2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG p2</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCREATE__TRG__p2()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CREATE__TRG__p2();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG v</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCONTEXT__TRG__v()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CONTEXT__TRG__v();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR htov</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCONTEXT__CORR__htov()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CONTEXT__CORR__htov();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.PatientInRoom__Marker#getCREATE__CORR__pTop <em>CREATE CORR pTop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR pTop</em>'.
	 * @see Hospital2Administration.PatientInRoom__Marker#getCREATE__CORR__pTop()
	 * @see #getPatientInRoom__Marker()
	 * @generated
	 */
	EReference getPatientInRoom__Marker_CREATE__CORR__pTop();

	/**
	 * Returns the meta object for class '{@link Hospital2Administration.RoomRule__Marker <em>Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Rule Marker</em>'.
	 * @see Hospital2Administration.RoomRule__Marker
	 * @generated
	 */
	EClass getRoomRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.RoomRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC d</em>'.
	 * @see Hospital2Administration.RoomRule__Marker#getCONTEXT__SRC__d()
	 * @see #getRoomRule__Marker()
	 * @generated
	 */
	EReference getRoomRule__Marker_CONTEXT__SRC__d();

	/**
	 * Returns the meta object for the reference '{@link Hospital2Administration.RoomRule__Marker#getCREATE__SRC__ro <em>CREATE SRC ro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ro</em>'.
	 * @see Hospital2Administration.RoomRule__Marker#getCREATE__SRC__ro()
	 * @see #getRoomRule__Marker()
	 * @generated
	 */
	EReference getRoomRule__Marker_CREATE__SRC__ro();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hospital2AdministrationFactory getHospital2AdministrationFactory();

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
		 * The meta object literal for the '{@link Hospital2Administration.impl.HospitalToAdministrationImpl <em>Hospital To Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.HospitalToAdministrationImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getHospitalToAdministration()
		 * @generated
		 */
		EClass HOSPITAL_TO_ADMINISTRATION = eINSTANCE.getHospitalToAdministration();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL_TO_ADMINISTRATION__SOURCE = eINSTANCE.getHospitalToAdministration_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL_TO_ADMINISTRATION__TARGET = eINSTANCE.getHospitalToAdministration_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.StaffToStaffImpl <em>Staff To Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.StaffToStaffImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getStaffToStaff()
		 * @generated
		 */
		EClass STAFF_TO_STAFF = eINSTANCE.getStaffToStaff();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_TO_STAFF__SOURCE = eINSTANCE.getStaffToStaff_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_TO_STAFF__TARGET = eINSTANCE.getStaffToStaff_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.PatientToPatientImpl <em>Patient To Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.PatientToPatientImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientToPatient()
		 * @generated
		 */
		EClass PATIENT_TO_PATIENT = eINSTANCE.getPatientToPatient();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_TO_PATIENT__SOURCE = eINSTANCE.getPatientToPatient_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_TO_PATIENT__TARGET = eINSTANCE.getPatientToPatient_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.RoomToShiftplanImpl <em>Room To Shiftplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.RoomToShiftplanImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getRoomToShiftplan()
		 * @generated
		 */
		EClass ROOM_TO_SHIFTPLAN = eINSTANCE.getRoomToShiftplan();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TO_SHIFTPLAN__SOURCE = eINSTANCE.getRoomToShiftplan_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TO_SHIFTPLAN__TARGET = eINSTANCE.getRoomToShiftplan_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.DoctorToStaffImpl <em>Doctor To Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.DoctorToStaffImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorToStaff()
		 * @generated
		 */
		EClass DOCTOR_TO_STAFF = eINSTANCE.getDoctorToStaff();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_STAFF__SOURCE = eINSTANCE.getDoctorToStaff_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_STAFF__TARGET = eINSTANCE.getDoctorToStaff_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.NurseToStaffImpl <em>Nurse To Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.NurseToStaffImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToStaff()
		 * @generated
		 */
		EClass NURSE_TO_STAFF = eINSTANCE.getNurseToStaff();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF__SOURCE = eINSTANCE.getNurseToStaff_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF__TARGET = eINSTANCE.getNurseToStaff_Target();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.DepartmentRule__MarkerImpl <em>Department Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.DepartmentRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDepartmentRule__Marker()
		 * @generated
		 */
		EClass DEPARTMENT_RULE_MARKER = eINSTANCE.getDepartmentRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT_RULE_MARKER__CREATE_SRC_D = eINSTANCE.getDepartmentRule__Marker_CREATE__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H = eINSTANCE.getDepartmentRule__Marker_CONTEXT__SRC__h();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl <em>Doc To Staff Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.DocToStaffRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDocToStaffRule__Marker()
		 * @generated
		 */
		EClass DOC_TO_STAFF_RULE_MARKER = eINSTANCE.getDocToStaffRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__SRC__h();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC s1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1 = eINSTANCE.getDocToStaffRule__Marker_CREATE__SRC__s1();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG s2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2 = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__s2();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG sh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__sh();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG sp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP = eINSTANCE.getDocToStaffRule__Marker_CREATE__TRG__sp();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG v</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__TRG__v();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR htov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV = eINSTANCE.getDocToStaffRule__Marker_CONTEXT__CORR__htov();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR stot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT = eINSTANCE.getDocToStaffRule__Marker_CREATE__CORR__stot();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.DoctorShiftplanRule__MarkerImpl <em>Doctor Shiftplan Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.DoctorShiftplanRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorShiftplanRule__Marker()
		 * @generated
		 */
		EClass DOCTOR_SHIFTPLAN_RULE_MARKER = eINSTANCE.getDoctorShiftplanRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC s1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG s2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG sh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG sp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR pTo P</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR sTo S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl <em>Doctor To Patient Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.DoctorToPatient__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getDoctorToPatient__Marker()
		 * @generated
		 */
		EClass DOCTOR_TO_PATIENT_MARKER = eINSTANCE.getDoctorToPatient__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC dep</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__dep();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC ro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__ro();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG s</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__s();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG t</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T = eINSTANCE.getDoctorToPatient__Marker_CREATE__TRG__t();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR dTo S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__dToS();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR pTo P</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__pToP();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl <em>Hospitalto Administration Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getHospitaltoAdministrationRule__Marker()
		 * @generated
		 */
		EClass HOSPITALTO_ADMINISTRATION_RULE_MARKER = eINSTANCE.getHospitaltoAdministrationRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__SRC__h();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC r</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__SRC__r();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG v</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__TRG__v();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR htov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV = eINSTANCE.getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl <em>Nurse Shiftplan Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseShiftplanRule__Marker()
		 * @generated
		 */
		EClass NURSE_SHIFTPLAN_RULE_MARKER = eINSTANCE.getNurseShiftplanRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC ro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC s1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG s2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG sh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG sp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR pTo P</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR sTo S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl <em>Nurse To Room Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.NurseToRoomRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToRoomRule__Marker()
		 * @generated
		 */
		EClass NURSE_TO_ROOM_RULE_MARKER = eINSTANCE.getNurseToRoomRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC dep</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__dep();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC n</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__n();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC r</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__r();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG s</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__s();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR nTo S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR pTop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.NurseToStaffRule__MarkerImpl <em>Nurse To Staff Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.NurseToStaffRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getNurseToStaffRule__Marker()
		 * @generated
		 */
		EClass NURSE_TO_STAFF_RULE_MARKER = eINSTANCE.getNurseToStaffRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__SRC__h();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC s1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CREATE_SRC_S1 = eINSTANCE.getNurseToStaffRule__Marker_CREATE__SRC__s1();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG s2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_S2 = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__s2();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG sh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SH = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__sh();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG sp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CREATE_TRG_SP = eINSTANCE.getNurseToStaffRule__Marker_CREATE__TRG__sp();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG v</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__TRG__v();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR htov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV = eINSTANCE.getNurseToStaffRule__Marker_CONTEXT__CORR__htov();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR stot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT = eINSTANCE.getNurseToStaffRule__Marker_CREATE__CORR__stot();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.PatientInReception__MarkerImpl <em>Patient In Reception Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.PatientInReception__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientInReception__Marker()
		 * @generated
		 */
		EClass PATIENT_IN_RECEPTION_MARKER = eINSTANCE.getPatientInReception__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H = eINSTANCE.getPatientInReception__Marker_CONTEXT__SRC__h();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1 = eINSTANCE.getPatientInReception__Marker_CREATE__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC r</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R = eINSTANCE.getPatientInReception__Marker_CONTEXT__SRC__r();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2 = eINSTANCE.getPatientInReception__Marker_CREATE__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG v</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V = eINSTANCE.getPatientInReception__Marker_CONTEXT__TRG__v();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR htov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV = eINSTANCE.getPatientInReception__Marker_CONTEXT__CORR__htov();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR pTop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP = eINSTANCE.getPatientInReception__Marker_CREATE__CORR__pTop();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.PatientInRoom__MarkerImpl <em>Patient In Room Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.PatientInRoom__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getPatientInRoom__Marker()
		 * @generated
		 */
		EClass PATIENT_IN_ROOM_MARKER = eINSTANCE.getPatientInRoom__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_D = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC h</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_H = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__h();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC p1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CREATE_SRC_P1 = eINSTANCE.getPatientInRoom__Marker_CREATE__SRC__p1();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC ro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CONTEXT_SRC_RO = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__ro();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG p2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CREATE_TRG_P2 = eINSTANCE.getPatientInRoom__Marker_CREATE__TRG__p2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG v</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CONTEXT_TRG_V = eINSTANCE.getPatientInRoom__Marker_CONTEXT__TRG__v();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR htov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CONTEXT_CORR_HTOV = eINSTANCE.getPatientInRoom__Marker_CONTEXT__CORR__htov();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR pTop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_IN_ROOM_MARKER__CREATE_CORR_PTOP = eINSTANCE.getPatientInRoom__Marker_CREATE__CORR__pTop();

		/**
		 * The meta object literal for the '{@link Hospital2Administration.impl.RoomRule__MarkerImpl <em>Room Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hospital2Administration.impl.RoomRule__MarkerImpl
		 * @see Hospital2Administration.impl.Hospital2AdministrationPackageImpl#getRoomRule__Marker()
		 * @generated
		 */
		EClass ROOM_RULE_MARKER = eINSTANCE.getRoomRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RULE_MARKER__CONTEXT_SRC_D = eINSTANCE.getRoomRule__Marker_CONTEXT__SRC__d();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC ro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RULE_MARKER__CREATE_SRC_RO = eINSTANCE.getRoomRule__Marker_CREATE__SRC__ro();

	}

} //Hospital2AdministrationPackage
