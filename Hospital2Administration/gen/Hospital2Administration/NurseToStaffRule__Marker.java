/**
 */
package Hospital2Administration;

import AdministrationExample.Administration;
import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.Nurse;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nurse To Staff Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__SRC__s1 <em>CREATE SRC s1</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__s2 <em>CREATE TRG s2</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sh <em>CREATE TRG sh</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sp <em>CREATE TRG sp</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}</li>
 *   <li>{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__CORR__stot <em>CREATE CORR stot</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker()
 * @model
 * @generated
 */
public interface NurseToStaffRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #setCONTEXT__SRC__d(Department)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CONTEXT__SRC__d()
	 * @model required="true"
	 * @generated
	 */
	Department getCONTEXT__SRC__d();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 */
	void setCONTEXT__SRC__d(Department value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #setCONTEXT__SRC__h(Hospital)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CONTEXT__SRC__h()
	 * @model required="true"
	 * @generated
	 */
	Hospital getCONTEXT__SRC__h();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #getCONTEXT__SRC__h()
	 * @generated
	 */
	void setCONTEXT__SRC__h(Hospital value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC s1</em>' reference.
	 * @see #setCREATE__SRC__s1(Nurse)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CREATE__SRC__s1()
	 * @model required="true"
	 * @generated
	 */
	Nurse getCREATE__SRC__s1();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__SRC__s1 <em>CREATE SRC s1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC s1</em>' reference.
	 * @see #getCREATE__SRC__s1()
	 * @generated
	 */
	void setCREATE__SRC__s1(Nurse value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG s2</em>' reference.
	 * @see #setCREATE__TRG__s2(Staff)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CREATE__TRG__s2()
	 * @model required="true"
	 * @generated
	 */
	Staff getCREATE__TRG__s2();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__s2 <em>CREATE TRG s2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG s2</em>' reference.
	 * @see #getCREATE__TRG__s2()
	 * @generated
	 */
	void setCREATE__TRG__s2(Staff value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG sh</em>' reference.
	 * @see #setCREATE__TRG__sh(Shift)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CREATE__TRG__sh()
	 * @model required="true"
	 * @generated
	 */
	Shift getCREATE__TRG__sh();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sh <em>CREATE TRG sh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG sh</em>' reference.
	 * @see #getCREATE__TRG__sh()
	 * @generated
	 */
	void setCREATE__TRG__sh(Shift value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG sp</em>' reference.
	 * @see #setCREATE__TRG__sp(Shiftplan)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CREATE__TRG__sp()
	 * @model required="true"
	 * @generated
	 */
	Shiftplan getCREATE__TRG__sp();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__TRG__sp <em>CREATE TRG sp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG sp</em>' reference.
	 * @see #getCREATE__TRG__sp()
	 * @generated
	 */
	void setCREATE__TRG__sp(Shiftplan value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG v</em>' reference.
	 * @see #setCONTEXT__TRG__v(Administration)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CONTEXT__TRG__v()
	 * @model required="true"
	 * @generated
	 */
	Administration getCONTEXT__TRG__v();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG v</em>' reference.
	 * @see #getCONTEXT__TRG__v()
	 * @generated
	 */
	void setCONTEXT__TRG__v(Administration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR htov</em>' reference.
	 * @see #setCONTEXT__CORR__htov(HospitalToAdministration)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CONTEXT__CORR__htov()
	 * @model required="true"
	 * @generated
	 */
	HospitalToAdministration getCONTEXT__CORR__htov();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR htov</em>' reference.
	 * @see #getCONTEXT__CORR__htov()
	 * @generated
	 */
	void setCONTEXT__CORR__htov(HospitalToAdministration value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR stot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR stot</em>' reference.
	 * @see #setCREATE__CORR__stot(StaffToStaff)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getNurseToStaffRule__Marker_CREATE__CORR__stot()
	 * @model required="true"
	 * @generated
	 */
	StaffToStaff getCREATE__CORR__stot();

	/**
	 * Sets the value of the '{@link Hospital2Administration.NurseToStaffRule__Marker#getCREATE__CORR__stot <em>CREATE CORR stot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR stot</em>' reference.
	 * @see #getCREATE__CORR__stot()
	 * @generated
	 */
	void setCREATE__CORR__stot(StaffToStaff value);

} // NurseToStaffRule__Marker
