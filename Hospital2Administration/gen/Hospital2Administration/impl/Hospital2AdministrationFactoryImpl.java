/**
 */
package Hospital2Administration.impl;

import Hospital2Administration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hospital2AdministrationFactoryImpl extends EFactoryImpl implements Hospital2AdministrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hospital2AdministrationFactory init() {
		try {
			Hospital2AdministrationFactory theHospital2AdministrationFactory = (Hospital2AdministrationFactory)EPackage.Registry.INSTANCE.getEFactory(Hospital2AdministrationPackage.eNS_URI);
			if (theHospital2AdministrationFactory != null) {
				return theHospital2AdministrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hospital2AdministrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Hospital2AdministrationPackage.HOSPITAL_TO_ADMINISTRATION: return createHospitalToAdministration();
			case Hospital2AdministrationPackage.STAFF_TO_STAFF: return createStaffToStaff();
			case Hospital2AdministrationPackage.PATIENT_TO_PATIENT: return createPatientToPatient();
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN: return createRoomToShiftplan();
			case Hospital2AdministrationPackage.DOCTOR_TO_STAFF: return createDoctorToStaff();
			case Hospital2AdministrationPackage.NURSE_TO_STAFF: return createNurseToStaff();
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER: return createDepartmentRule__Marker();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER: return createDocToStaffRule__Marker();
			case Hospital2AdministrationPackage.DOCTOR_SHIFTPLAN_RULE_MARKER: return createDoctorShiftplanRule__Marker();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER: return createDoctorToPatient__Marker();
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER: return createHospitaltoAdministrationRule__Marker();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER: return createNurseShiftplanRule__Marker();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER: return createNurseToRoomRule__Marker();
			case Hospital2AdministrationPackage.NURSE_TO_STAFF_RULE_MARKER: return createNurseToStaffRule__Marker();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER: return createPatientInReception__Marker();
			case Hospital2AdministrationPackage.PATIENT_IN_ROOM_MARKER: return createPatientInRoom__Marker();
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER: return createRoomRule__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalToAdministration createHospitalToAdministration() {
		HospitalToAdministrationImpl hospitalToAdministration = new HospitalToAdministrationImpl();
		return hospitalToAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff createStaffToStaff() {
		StaffToStaffImpl staffToStaff = new StaffToStaffImpl();
		return staffToStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient createPatientToPatient() {
		PatientToPatientImpl patientToPatient = new PatientToPatientImpl();
		return patientToPatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomToShiftplan createRoomToShiftplan() {
		RoomToShiftplanImpl roomToShiftplan = new RoomToShiftplanImpl();
		return roomToShiftplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorToStaff createDoctorToStaff() {
		DoctorToStaffImpl doctorToStaff = new DoctorToStaffImpl();
		return doctorToStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NurseToStaff createNurseToStaff() {
		NurseToStaffImpl nurseToStaff = new NurseToStaffImpl();
		return nurseToStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentRule__Marker createDepartmentRule__Marker() {
		DepartmentRule__MarkerImpl departmentRule__Marker = new DepartmentRule__MarkerImpl();
		return departmentRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocToStaffRule__Marker createDocToStaffRule__Marker() {
		DocToStaffRule__MarkerImpl docToStaffRule__Marker = new DocToStaffRule__MarkerImpl();
		return docToStaffRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorShiftplanRule__Marker createDoctorShiftplanRule__Marker() {
		DoctorShiftplanRule__MarkerImpl doctorShiftplanRule__Marker = new DoctorShiftplanRule__MarkerImpl();
		return doctorShiftplanRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorToPatient__Marker createDoctorToPatient__Marker() {
		DoctorToPatient__MarkerImpl doctorToPatient__Marker = new DoctorToPatient__MarkerImpl();
		return doctorToPatient__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitaltoAdministrationRule__Marker createHospitaltoAdministrationRule__Marker() {
		HospitaltoAdministrationRule__MarkerImpl hospitaltoAdministrationRule__Marker = new HospitaltoAdministrationRule__MarkerImpl();
		return hospitaltoAdministrationRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NurseShiftplanRule__Marker createNurseShiftplanRule__Marker() {
		NurseShiftplanRule__MarkerImpl nurseShiftplanRule__Marker = new NurseShiftplanRule__MarkerImpl();
		return nurseShiftplanRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NurseToRoomRule__Marker createNurseToRoomRule__Marker() {
		NurseToRoomRule__MarkerImpl nurseToRoomRule__Marker = new NurseToRoomRule__MarkerImpl();
		return nurseToRoomRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NurseToStaffRule__Marker createNurseToStaffRule__Marker() {
		NurseToStaffRule__MarkerImpl nurseToStaffRule__Marker = new NurseToStaffRule__MarkerImpl();
		return nurseToStaffRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientInReception__Marker createPatientInReception__Marker() {
		PatientInReception__MarkerImpl patientInReception__Marker = new PatientInReception__MarkerImpl();
		return patientInReception__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientInRoom__Marker createPatientInRoom__Marker() {
		PatientInRoom__MarkerImpl patientInRoom__Marker = new PatientInRoom__MarkerImpl();
		return patientInRoom__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomRule__Marker createRoomRule__Marker() {
		RoomRule__MarkerImpl roomRule__Marker = new RoomRule__MarkerImpl();
		return roomRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationPackage getHospital2AdministrationPackage() {
		return (Hospital2AdministrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hospital2AdministrationPackage getPackage() {
		return Hospital2AdministrationPackage.eINSTANCE;
	}

} //Hospital2AdministrationFactoryImpl
