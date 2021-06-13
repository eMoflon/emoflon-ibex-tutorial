/**
 */
package Hospital2Administration;

import AdministrationExample.Shiftplan;

import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room To Shiftplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.RoomToShiftplan#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2Administration.RoomToShiftplan#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomToShiftplan()
 * @model
 * @generated
 */
public interface RoomToShiftplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Room)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomToShiftplan_Source()
	 * @model
	 * @generated
	 */
	Room getSource();

	/**
	 * Sets the value of the '{@link Hospital2Administration.RoomToShiftplan#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Room value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Shiftplan)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomToShiftplan_Target()
	 * @model
	 * @generated
	 */
	Shiftplan getTarget();

	/**
	 * Sets the value of the '{@link Hospital2Administration.RoomToShiftplan#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Shiftplan value);

} // RoomToShiftplan
