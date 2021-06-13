/**
 */
package Hospital2Administration;

import AdministrationExample.Administration;

import HospitalExample.Hospital;
import HospitalExample.Reception;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospitalto Administration Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__h <em>CREATE SRC h</em>}</li>
 *   <li>{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__r <em>CREATE SRC r</em>}</li>
 *   <li>{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__TRG__v <em>CREATE TRG v</em>}</li>
 *   <li>{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__CORR__htov <em>CREATE CORR htov</em>}</li>
 * </ul>
 *
 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitaltoAdministrationRule__Marker()
 * @model
 * @generated
 */
public interface HospitaltoAdministrationRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC h</em>' reference.
	 * @see #setCREATE__SRC__h(Hospital)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitaltoAdministrationRule__Marker_CREATE__SRC__h()
	 * @model required="true"
	 * @generated
	 */
	Hospital getCREATE__SRC__h();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__h <em>CREATE SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC h</em>' reference.
	 * @see #getCREATE__SRC__h()
	 * @generated
	 */
	void setCREATE__SRC__h(Hospital value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC r</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC r</em>' reference.
	 * @see #setCREATE__SRC__r(Reception)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitaltoAdministrationRule__Marker_CREATE__SRC__r()
	 * @model required="true"
	 * @generated
	 */
	Reception getCREATE__SRC__r();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__SRC__r <em>CREATE SRC r</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC r</em>' reference.
	 * @see #getCREATE__SRC__r()
	 * @generated
	 */
	void setCREATE__SRC__r(Reception value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG v</em>' reference.
	 * @see #setCREATE__TRG__v(Administration)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitaltoAdministrationRule__Marker_CREATE__TRG__v()
	 * @model required="true"
	 * @generated
	 */
	Administration getCREATE__TRG__v();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__TRG__v <em>CREATE TRG v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG v</em>' reference.
	 * @see #getCREATE__TRG__v()
	 * @generated
	 */
	void setCREATE__TRG__v(Administration value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR htov</em>' reference.
	 * @see #setCREATE__CORR__htov(HospitalToAdministration)
	 * @see Hospital2Administration.Hospital2AdministrationPackage#getHospitaltoAdministrationRule__Marker_CREATE__CORR__htov()
	 * @model required="true"
	 * @generated
	 */
	HospitalToAdministration getCREATE__CORR__htov();

	/**
	 * Sets the value of the '{@link Hospital2Administration.HospitaltoAdministrationRule__Marker#getCREATE__CORR__htov <em>CREATE CORR htov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR htov</em>' reference.
	 * @see #getCREATE__CORR__htov()
	 * @generated
	 */
	void setCREATE__CORR__htov(HospitalToAdministration value);

} // HospitaltoAdministrationRule__Marker
