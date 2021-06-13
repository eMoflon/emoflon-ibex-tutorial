/**
 */
package AdministrationExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Shift#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The literals are from the enumeration {@link AdministrationExample.Daytime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see AdministrationExample.Daytime
	 * @see #setTime(Daytime)
	 * @see AdministrationExample.AdministrationExamplePackage#getShift_Time()
	 * @model
	 * @generated
	 */
	Daytime getTime();

	/**
	 * Sets the value of the '{@link AdministrationExample.Shift#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see AdministrationExample.Daytime
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Daytime value);

} // Shift
