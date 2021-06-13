/**
 */
package Hospital2Administration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Hospital2Administration.Hospital2AdministrationPackage
 * @generated
 */
public interface Hospital2AdministrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hospital2AdministrationFactory eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hospital To Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital To Administration</em>'.
	 * @generated
	 */
	HospitalToAdministration createHospitalToAdministration();

	/**
	 * Returns a new object of class '<em>Staff To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff To Staff</em>'.
	 * @generated
	 */
	StaffToStaff createStaffToStaff();

	/**
	 * Returns a new object of class '<em>Patient To Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient To Patient</em>'.
	 * @generated
	 */
	PatientToPatient createPatientToPatient();

	/**
	 * Returns a new object of class '<em>Room To Shiftplan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room To Shiftplan</em>'.
	 * @generated
	 */
	RoomToShiftplan createRoomToShiftplan();

	/**
	 * Returns a new object of class '<em>Doctor To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor To Staff</em>'.
	 * @generated
	 */
	DoctorToStaff createDoctorToStaff();

	/**
	 * Returns a new object of class '<em>Nurse To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nurse To Staff</em>'.
	 * @generated
	 */
	NurseToStaff createNurseToStaff();

	/**
	 * Returns a new object of class '<em>Department Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department Rule Marker</em>'.
	 * @generated
	 */
	DepartmentRule__Marker createDepartmentRule__Marker();

	/**
	 * Returns a new object of class '<em>Doc To Staff Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc To Staff Rule Marker</em>'.
	 * @generated
	 */
	DocToStaffRule__Marker createDocToStaffRule__Marker();

	/**
	 * Returns a new object of class '<em>Doctor Shiftplan Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor Shiftplan Rule Marker</em>'.
	 * @generated
	 */
	DoctorShiftplanRule__Marker createDoctorShiftplanRule__Marker();

	/**
	 * Returns a new object of class '<em>Doctor To Patient Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor To Patient Marker</em>'.
	 * @generated
	 */
	DoctorToPatient__Marker createDoctorToPatient__Marker();

	/**
	 * Returns a new object of class '<em>Hospitalto Administration Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospitalto Administration Rule Marker</em>'.
	 * @generated
	 */
	HospitaltoAdministrationRule__Marker createHospitaltoAdministrationRule__Marker();

	/**
	 * Returns a new object of class '<em>Nurse Shiftplan Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nurse Shiftplan Rule Marker</em>'.
	 * @generated
	 */
	NurseShiftplanRule__Marker createNurseShiftplanRule__Marker();

	/**
	 * Returns a new object of class '<em>Nurse To Room Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nurse To Room Rule Marker</em>'.
	 * @generated
	 */
	NurseToRoomRule__Marker createNurseToRoomRule__Marker();

	/**
	 * Returns a new object of class '<em>Nurse To Staff Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nurse To Staff Rule Marker</em>'.
	 * @generated
	 */
	NurseToStaffRule__Marker createNurseToStaffRule__Marker();

	/**
	 * Returns a new object of class '<em>Patient In Reception Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient In Reception Marker</em>'.
	 * @generated
	 */
	PatientInReception__Marker createPatientInReception__Marker();

	/**
	 * Returns a new object of class '<em>Patient In Room Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient In Room Marker</em>'.
	 * @generated
	 */
	PatientInRoom__Marker createPatientInRoom__Marker();

	/**
	 * Returns a new object of class '<em>Room Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Rule Marker</em>'.
	 * @generated
	 */
	RoomRule__Marker createRoomRule__Marker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hospital2AdministrationPackage getHospital2AdministrationPackage();

} //Hospital2AdministrationFactory
