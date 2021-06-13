/**
 */
package Hospital2Administration;

import AdministrationExample.Staff;
import AdministrationExample.Treatment;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor To Patient Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCREATE__TRG__t <em>CREATE TRG t</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__dToS <em>CONTEXT CORR dTo S</em>}</li>
 *   <li>{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker()
 * @model
 * @generated
 */
public interface DoctorToPatient__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #setCONTEXT__SRC__d(Doctor)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__SRC__d()
	 * @model required="true"
	 * @generated
	 */
	Doctor getCONTEXT__SRC__d();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 */
	void setCONTEXT__SRC__d(Doctor value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC dep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC dep</em>' reference.
	 * @see #setCONTEXT__SRC__dep(Department)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__SRC__dep()
	 * @model required="true"
	 * @generated
	 */
	Department getCONTEXT__SRC__dep();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC dep</em>' reference.
	 * @see #getCONTEXT__SRC__dep()
	 * @generated
	 */
	void setCONTEXT__SRC__dep(Department value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #setCONTEXT__SRC__p1(Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__SRC__p1()
	 * @model required="true"
	 * @generated
	 */
	Patient getCONTEXT__SRC__p1();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #getCONTEXT__SRC__p1()
	 * @generated
	 */
	void setCONTEXT__SRC__p1(Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #setCONTEXT__SRC__ro(Room)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__SRC__ro()
	 * @model required="true"
	 * @generated
	 */
	Room getCONTEXT__SRC__ro();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #getCONTEXT__SRC__ro()
	 * @generated
	 */
	void setCONTEXT__SRC__ro(Room value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG p2</em>' reference.
	 * @see #setCONTEXT__TRG__p2(AdministrationExample.Patient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__TRG__p2()
	 * @model required="true"
	 * @generated
	 */
	AdministrationExample.Patient getCONTEXT__TRG__p2();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}' reference.
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
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__TRG__s()
	 * @model required="true"
	 * @generated
	 */
	Staff getCONTEXT__TRG__s();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG s</em>' reference.
	 * @see #getCONTEXT__TRG__s()
	 * @generated
	 */
	void setCONTEXT__TRG__s(Staff value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG t</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG t</em>' reference.
	 * @see #setCREATE__TRG__t(Treatment)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CREATE__TRG__t()
	 * @model required="true"
	 * @generated
	 */
	Treatment getCREATE__TRG__t();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCREATE__TRG__t <em>CREATE TRG t</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG t</em>' reference.
	 * @see #getCREATE__TRG__t()
	 * @generated
	 */
	void setCREATE__TRG__t(Treatment value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR dTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR dTo S</em>' reference.
	 * @see #setCONTEXT__CORR__dToS(StaffToStaff)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__CORR__dToS()
	 * @model required="true"
	 * @generated
	 */
	StaffToStaff getCONTEXT__CORR__dToS();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__dToS <em>CONTEXT CORR dTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR dTo S</em>' reference.
	 * @see #getCONTEXT__CORR__dToS()
	 * @generated
	 */
	void setCONTEXT__CORR__dToS(StaffToStaff value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR pTo P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR pTo P</em>' reference.
	 * @see #setCONTEXT__CORR__pToP(PatientToPatient)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDoctorToPatient__Marker_CONTEXT__CORR__pToP()
	 * @model required="true"
	 * @generated
	 */
	PatientToPatient getCONTEXT__CORR__pToP();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DoctorToPatient__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR pTo P</em>' reference.
	 * @see #getCONTEXT__CORR__pToP()
	 * @generated
	 */
	void setCONTEXT__CORR__pToP(PatientToPatient value);

} // DoctorToPatient__Marker
