/**
 */
package AdministrationExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Administration#getStaff <em>Staff</em>}</li>
 *   <li>{@link AdministrationExample.Administration#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getAdministration()
 * @model
 * @generated
 */
public interface Administration extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link AdministrationExample.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getAdministration_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<Staff> getStaff();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
	 * The list contents are of type {@link AdministrationExample.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getAdministration_Patient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getPatient();

} // Administration
