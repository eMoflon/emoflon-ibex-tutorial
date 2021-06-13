/**
 */
package Hospital2Administration.util;

import Hospital2Administration.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Hospital2Administration.Hospital2AdministrationPackage
 * @generated
 */
public class Hospital2AdministrationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hospital2AdministrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationSwitch() {
		if (modelPackage == null) {
			modelPackage = Hospital2AdministrationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Hospital2AdministrationPackage.HOSPITAL_TO_ADMINISTRATION: {
				HospitalToAdministration hospitalToAdministration = (HospitalToAdministration)theEObject;
				T result = caseHospitalToAdministration(hospitalToAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.STAFF_TO_STAFF: {
				StaffToStaff staffToStaff = (StaffToStaff)theEObject;
				T result = caseStaffToStaff(staffToStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.PATIENT_TO_PATIENT: {
				PatientToPatient patientToPatient = (PatientToPatient)theEObject;
				T result = casePatientToPatient(patientToPatient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN: {
				RoomToShiftplan roomToShiftplan = (RoomToShiftplan)theEObject;
				T result = caseRoomToShiftplan(roomToShiftplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.DOCTOR_TO_STAFF: {
				DoctorToStaff doctorToStaff = (DoctorToStaff)theEObject;
				T result = caseDoctorToStaff(doctorToStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.NURSE_TO_STAFF: {
				NurseToStaff nurseToStaff = (NurseToStaff)theEObject;
				T result = caseNurseToStaff(nurseToStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER: {
				DepartmentRule__Marker departmentRule__Marker = (DepartmentRule__Marker)theEObject;
				T result = caseDepartmentRule__Marker(departmentRule__Marker);
				if (result == null) result = caseTGGRuleApplication(departmentRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER: {
				DocToStaffRule__Marker docToStaffRule__Marker = (DocToStaffRule__Marker)theEObject;
				T result = caseDocToStaffRule__Marker(docToStaffRule__Marker);
				if (result == null) result = caseTGGRuleApplication(docToStaffRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.DOCTOR_SHIFTPLAN_RULE_MARKER: {
				DoctorShiftplanRule__Marker doctorShiftplanRule__Marker = (DoctorShiftplanRule__Marker)theEObject;
				T result = caseDoctorShiftplanRule__Marker(doctorShiftplanRule__Marker);
				if (result == null) result = caseTGGRuleApplication(doctorShiftplanRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER: {
				DoctorToPatient__Marker doctorToPatient__Marker = (DoctorToPatient__Marker)theEObject;
				T result = caseDoctorToPatient__Marker(doctorToPatient__Marker);
				if (result == null) result = caseTGGRuleApplication(doctorToPatient__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER: {
				HospitaltoAdministrationRule__Marker hospitaltoAdministrationRule__Marker = (HospitaltoAdministrationRule__Marker)theEObject;
				T result = caseHospitaltoAdministrationRule__Marker(hospitaltoAdministrationRule__Marker);
				if (result == null) result = caseTGGRuleApplication(hospitaltoAdministrationRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER: {
				NurseShiftplanRule__Marker nurseShiftplanRule__Marker = (NurseShiftplanRule__Marker)theEObject;
				T result = caseNurseShiftplanRule__Marker(nurseShiftplanRule__Marker);
				if (result == null) result = caseTGGRuleApplication(nurseShiftplanRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER: {
				NurseToRoomRule__Marker nurseToRoomRule__Marker = (NurseToRoomRule__Marker)theEObject;
				T result = caseNurseToRoomRule__Marker(nurseToRoomRule__Marker);
				if (result == null) result = caseTGGRuleApplication(nurseToRoomRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.NURSE_TO_STAFF_RULE_MARKER: {
				NurseToStaffRule__Marker nurseToStaffRule__Marker = (NurseToStaffRule__Marker)theEObject;
				T result = caseNurseToStaffRule__Marker(nurseToStaffRule__Marker);
				if (result == null) result = caseTGGRuleApplication(nurseToStaffRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER: {
				PatientInReception__Marker patientInReception__Marker = (PatientInReception__Marker)theEObject;
				T result = casePatientInReception__Marker(patientInReception__Marker);
				if (result == null) result = caseTGGRuleApplication(patientInReception__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.PATIENT_IN_ROOM_MARKER: {
				PatientInRoom__Marker patientInRoom__Marker = (PatientInRoom__Marker)theEObject;
				T result = casePatientInRoom__Marker(patientInRoom__Marker);
				if (result == null) result = caseTGGRuleApplication(patientInRoom__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER: {
				RoomRule__Marker roomRule__Marker = (RoomRule__Marker)theEObject;
				T result = caseRoomRule__Marker(roomRule__Marker);
				if (result == null) result = caseTGGRuleApplication(roomRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital To Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital To Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalToAdministration(HospitalToAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff To Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffToStaff(StaffToStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient To Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient To Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientToPatient(PatientToPatient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room To Shiftplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room To Shiftplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomToShiftplan(RoomToShiftplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor To Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctorToStaff(DoctorToStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nurse To Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nurse To Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNurseToStaff(NurseToStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartmentRule__Marker(DepartmentRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc To Staff Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc To Staff Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocToStaffRule__Marker(DocToStaffRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor Shiftplan Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor Shiftplan Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctorShiftplanRule__Marker(DoctorShiftplanRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor To Patient Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor To Patient Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctorToPatient__Marker(DoctorToPatient__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospitalto Administration Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospitalto Administration Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitaltoAdministrationRule__Marker(HospitaltoAdministrationRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nurse Shiftplan Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nurse Shiftplan Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNurseShiftplanRule__Marker(NurseShiftplanRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nurse To Room Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nurse To Room Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNurseToRoomRule__Marker(NurseToRoomRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nurse To Staff Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nurse To Staff Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNurseToStaffRule__Marker(NurseToStaffRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient In Reception Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient In Reception Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientInReception__Marker(PatientInReception__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient In Room Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient In Room Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientInRoom__Marker(PatientInRoom__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomRule__Marker(RoomRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGRuleApplication(TGGRuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Hospital2AdministrationSwitch
