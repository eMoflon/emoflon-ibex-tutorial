/**
 */
package Hospital2Administration;

import HospitalExample.Department;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.RoomRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.RoomRule__Marker#getCREATE__SRC__ro <em>CREATE SRC ro</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomRule__Marker()
 * @model
 * @generated
 */
public interface RoomRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #setCONTEXT__SRC__d(Department)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomRule__Marker_CONTEXT__SRC__d()
	 * @model required="true"
	 * @generated
	 */
	Department getCONTEXT__SRC__d();

	/**
	 * Sets the value of the '{@link Hospital2Administration.RoomRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 */
	void setCONTEXT__SRC__d(Department value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC ro</em>' reference.
	 * @see #setCREATE__SRC__ro(Room)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getRoomRule__Marker_CREATE__SRC__ro()
	 * @model required="true"
	 * @generated
	 */
	Room getCREATE__SRC__ro();

	/**
	 * Sets the value of the '{@link Hospital2Administration.RoomRule__Marker#getCREATE__SRC__ro <em>CREATE SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC ro</em>' reference.
	 * @see #getCREATE__SRC__ro()
	 * @generated
	 */
	void setCREATE__SRC__ro(Room value);

} // RoomRule__Marker
