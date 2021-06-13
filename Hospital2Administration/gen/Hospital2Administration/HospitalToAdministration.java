/**
 */
package Hospital2Administration;

import AdministrationExample.Administration;

import HospitalExample.Hospital;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital To Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.HospitalToAdministration#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2Administration.HospitalToAdministration#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitalToAdministration()
 * @model
 * @generated
 */
public interface HospitalToAdministration extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Hospital)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitalToAdministration_Source()
	 * @model
	 * @generated
	 */
	Hospital getSource();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitalToAdministration#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Hospital value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Administration)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitalToAdministration_Target()
	 * @model
	 * @generated
	 */
	Administration getTarget();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitalToAdministration#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Administration value);

} // HospitalToAdministration
