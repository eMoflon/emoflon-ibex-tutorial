/**
 */
package Hospital2Administration;

import AdministrationExample.Staff;

import HospitalExample.Department;
import HospitalExample.Nurse;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nurse To Room Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__n <em>CONTEXT SRC n</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__nToS <em>CONTEXT CORR nTo S</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__pTop <em>CONTEXT CORR pTop</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker()
 * @model
 * @generated
 */
public interface NurseToRoomRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC dep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC dep</em>' reference.
	 * @see #setCONTEXT__SRC__dep(Department)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__SRC__dep()
	 * @model required="true"
	 * @generated
	 */
	Department getCONTEXT__SRC__dep();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC dep</em>' reference.
	 * @see #getCONTEXT__SRC__dep()
	 * @generated
	 */
	void setCONTEXT__SRC__dep(Department value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC n</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC n</em>' reference.
	 * @see #setCONTEXT__SRC__n(Nurse)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__SRC__n()
	 * @model required="true"
	 * @generated
	 */
	Nurse getCONTEXT__SRC__n();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__n <em>CONTEXT SRC n</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC n</em>' reference.
	 * @see #getCONTEXT__SRC__n()
	 * @generated
	 */
	void setCONTEXT__SRC__n(Nurse value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #setCONTEXT__SRC__p1(Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__SRC__p1()
	 * @model required="true"
	 * @generated
	 */
	Patient getCONTEXT__SRC__p1();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #getCONTEXT__SRC__p1()
	 * @generated
	 */
	void setCONTEXT__SRC__p1(Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC r</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC r</em>' reference.
	 * @see #setCONTEXT__SRC__r(Room)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__SRC__r()
	 * @model required="true"
	 * @generated
	 */
	Room getCONTEXT__SRC__r();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC r</em>' reference.
	 * @see #getCONTEXT__SRC__r()
	 * @generated
	 */
	void setCONTEXT__SRC__r(Room value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG p2</em>' reference.
	 * @see #setCONTEXT__TRG__p2(AdministrationExample.Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__TRG__p2()
	 * @model required="true"
	 * @generated
	 */
	AdministrationExample.Patient getCONTEXT__TRG__p2();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG p2</em>' reference.
	 * @see #getCONTEXT__TRG__p2()
	 * @generated
	 */
	void setCONTEXT__TRG__p2(AdministrationExample.Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG s</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG s</em>' reference.
	 * @see #setCONTEXT__TRG__s(Staff)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__TRG__s()
	 * @model required="true"
	 * @generated
	 */
	Staff getCONTEXT__TRG__s();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG s</em>' reference.
	 * @see #getCONTEXT__TRG__s()
	 * @generated
	 */
	void setCONTEXT__TRG__s(Staff value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR nTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR nTo S</em>' reference.
	 * @see #setCONTEXT__CORR__nToS(StaffToStaff)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__CORR__nToS()
	 * @model required="true"
	 * @generated
	 */
	StaffToStaff getCONTEXT__CORR__nToS();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__nToS <em>CONTEXT CORR nTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR nTo S</em>' reference.
	 * @see #getCONTEXT__CORR__nToS()
	 * @generated
	 */
	void setCONTEXT__CORR__nToS(StaffToStaff value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR pTop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR pTop</em>' reference.
	 * @see #setCONTEXT__CORR__pTop(PatientToPatient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToRoomRule__Marker_CONTEXT__CORR__pTop()
	 * @model required="true"
	 * @generated
	 */
	PatientToPatient getCONTEXT__CORR__pTop();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToRoomRule__Marker#getCONTEXT__CORR__pTop <em>CONTEXT CORR pTop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR pTop</em>' reference.
	 * @see #getCONTEXT__CORR__pTop()
	 * @generated
	 */
	void setCONTEXT__CORR__pTop(PatientToPatient value);

} // NurseToRoomRule__Marker
