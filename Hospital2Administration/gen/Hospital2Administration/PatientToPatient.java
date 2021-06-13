/**
 */
package Hospital2Administration;

import HospitalExample.Patient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient To Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.PatientToPatient#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2Administration.PatientToPatient#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getPatientToPatient()
 * @model
 * @generated
 */
public interface PatientToPatient extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getPatientToPatient_Source()
	 * @model
	 * @generated
	 */
	Patient getSource();

	/**
	 * Sets the value of the '{@link Hospital2Administration.PatientToPatient#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Patient value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AdministrationExample.Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getPatientToPatient_Target()
	 * @model
	 * @generated
	 */
	AdministrationExample.Patient getTarget();

	/**
	 * Sets the value of the '{@link Hospital2Administration.PatientToPatient#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AdministrationExample.Patient value);

} // PatientToPatient
