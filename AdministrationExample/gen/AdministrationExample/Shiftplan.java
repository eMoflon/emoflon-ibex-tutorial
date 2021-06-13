/**
 */
package AdministrationExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shiftplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Shiftplan#getCovers <em>Covers</em>}</li>
 *   <li>{@link AdministrationExample.Shiftplan#getShifts <em>Shifts</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getShiftplan()
 * @model
 * @generated
 */
public interface Shiftplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Covers</b></em>' reference list.
	 * The list contents are of type {@link AdministrationExample.Patient}.
	 * It is bidirectional and its opposite is '{@link AdministrationExample.Patient#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers</em>' reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getShiftplan_Covers()
	 * @see AdministrationExample.Patient#getCoveredBy
	 * @model opposite="coveredBy"
	 * @generated
	 */
	EList<Patient> getCovers();

	/**
	 * Returns the value of the '<em><b>Shifts</b></em>' containment reference list.
	 * The list contents are of type {@link AdministrationExample.Shift}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts</em>' containment reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getShiftplan_Shifts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shift> getShifts();

} // Shiftplan
