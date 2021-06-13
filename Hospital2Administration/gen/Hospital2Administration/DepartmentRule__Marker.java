/**
 */
package Hospital2Administration;

import HospitalExample.Department;
import HospitalExample.Hospital;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.DepartmentRule__Marker#getCREATE__SRC__d <em>CREATE SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.DepartmentRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getDepartmentRule__Marker()
 * @model
 * @generated
 */
public interface DepartmentRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC d</em>' reference.
	 * @see #setCREATE__SRC__d(Department)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDepartmentRule__Marker_CREATE__SRC__d()
	 * @model required="true"
	 * @generated
	 */
	Department getCREATE__SRC__d();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DepartmentRule__Marker#getCREATE__SRC__d <em>CREATE SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC d</em>' reference.
	 * @see #getCREATE__SRC__d()
	 * @generated
	 */
	void setCREATE__SRC__d(Department value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #setCONTEXT__SRC__h(Hospital)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getDepartmentRule__Marker_CONTEXT__SRC__h()
	 * @model required="true"
	 * @generated
	 */
	Hospital getCONTEXT__SRC__h();

	/**
	 * Sets the value of the '{@link Hospital2Administration.DepartmentRule__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #getCONTEXT__SRC__h()
	 * @generated
	 */
	void setCONTEXT__SRC__h(Hospital value);

} // DepartmentRule__Marker
