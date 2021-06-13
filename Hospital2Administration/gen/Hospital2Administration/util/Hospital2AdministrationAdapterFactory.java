/**
 */
package Hospital2Administration.util;

import Hospital2Administration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Hospital2Administration.Hospital2AdministrationPackage
 * @generated
 */
public class Hospital2AdministrationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hospital2AdministrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Hospital2AdministrationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hospital2AdministrationSwitch<Adapter> modelSwitch =
		new Hospital2AdministrationSwitch<Adapter>() {
			@Override
			public Adapter caseHospitalToAdministration(HospitalToAdministration object) {
				return createHospitalToAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffToStaff(StaffToStaff object) {
				return createStaffToStaffAdapter();
			}
			@Override
			public Adapter casePatientToPatient(PatientToPatient object) {
				return createPatientToPatientAdapter();
			}
			@Override
			public Adapter caseRoomToShiftplan(RoomToShiftplan object) {
				return createRoomToShiftplanAdapter();
			}
			@Override
			public Adapter caseDoctorToStaff(DoctorToStaff object) {
				return createDoctorToStaffAdapter();
			}
			@Override
			public Adapter caseNurseToStaff(NurseToStaff object) {
				return createNurseToStaffAdapter();
			}
			@Override
			public Adapter caseDepartmentRule__Marker(DepartmentRule__Marker object) {
				return createDepartmentRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDocToStaffRule__Marker(DocToStaffRule__Marker object) {
				return createDocToStaffRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDoctorShiftplanRule__Marker(DoctorShiftplanRule__Marker object) {
				return createDoctorShiftplanRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDoctorToPatient__Marker(DoctorToPatient__Marker object) {
				return createDoctorToPatient__MarkerAdapter();
			}
			@Override
			public Adapter caseHospitaltoAdministrationRule__Marker(HospitaltoAdministrationRule__Marker object) {
				return createHospitaltoAdministrationRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseShiftplanRule__Marker(NurseShiftplanRule__Marker object) {
				return createNurseShiftplanRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseToRoomRule__Marker(NurseToRoomRule__Marker object) {
				return createNurseToRoomRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseToStaffRule__Marker(NurseToStaffRule__Marker object) {
				return createNurseToStaffRule__MarkerAdapter();
			}
			@Override
			public Adapter casePatientInReception__Marker(PatientInReception__Marker object) {
				return createPatientInReception__MarkerAdapter();
			}
			@Override
			public Adapter casePatientInRoom__Marker(PatientInRoom__Marker object) {
				return createPatientInRoom__MarkerAdapter();
			}
			@Override
			public Adapter caseRoomRule__Marker(RoomRule__Marker object) {
				return createRoomRule__MarkerAdapter();
			}
			@Override
			public Adapter caseTGGRuleApplication(TGGRuleApplication object) {
				return createTGGRuleApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.HospitalToAdministration <em>Hospital To Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.HospitalToAdministration
	 * @generated
	 */
	public Adapter createHospitalToAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.StaffToStaff <em>Staff To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.StaffToStaff
	 * @generated
	 */
	public Adapter createStaffToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.PatientToPatient <em>Patient To Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.PatientToPatient
	 * @generated
	 */
	public Adapter createPatientToPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.RoomToShiftplan <em>Room To Shiftplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.RoomToShiftplan
	 * @generated
	 */
	public Adapter createRoomToShiftplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.DoctorToStaff <em>Doctor To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.DoctorToStaff
	 * @generated
	 */
	public Adapter createDoctorToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.NurseToStaff <em>Nurse To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.NurseToStaff
	 * @generated
	 */
	public Adapter createNurseToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.DepartmentRule__Marker <em>Department Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.DepartmentRule__Marker
	 * @generated
	 */
	public Adapter createDepartmentRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.DocToStaffRule__Marker <em>Doc To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.DocToStaffRule__Marker
	 * @generated
	 */
	public Adapter createDocToStaffRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.DoctorShiftplanRule__Marker <em>Doctor Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.DoctorShiftplanRule__Marker
	 * @generated
	 */
	public Adapter createDoctorShiftplanRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.DoctorToPatient__Marker <em>Doctor To Patient Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.DoctorToPatient__Marker
	 * @generated
	 */
	public Adapter createDoctorToPatient__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker <em>Hospitalto Administration Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.HospitaltoAdministrationRule__Marker
	 * @generated
	 */
	public Adapter createHospitaltoAdministrationRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.NurseShiftplanRule__Marker <em>Nurse Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.NurseShiftplanRule__Marker
	 * @generated
	 */
	public Adapter createNurseShiftplanRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.NurseToRoomRule__Marker <em>Nurse To Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.NurseToRoomRule__Marker
	 * @generated
	 */
	public Adapter createNurseToRoomRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.NurseToStaffRule__Marker <em>Nurse To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.NurseToStaffRule__Marker
	 * @generated
	 */
	public Adapter createNurseToStaffRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.PatientInReception__Marker <em>Patient In Reception Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.PatientInReception__Marker
	 * @generated
	 */
	public Adapter createPatientInReception__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.PatientInRoom__Marker <em>Patient In Room Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.PatientInRoom__Marker
	 * @generated
	 */
	public Adapter createPatientInRoom__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2Administration.RoomRule__Marker <em>Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2Administration.RoomRule__Marker
	 * @generated
	 */
	public Adapter createRoomRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.TGGRuleApplication <em>TGG Rule Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.TGGRuleApplication
	 * @generated
	 */
	public Adapter createTGGRuleApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Hospital2AdministrationAdapterFactory
