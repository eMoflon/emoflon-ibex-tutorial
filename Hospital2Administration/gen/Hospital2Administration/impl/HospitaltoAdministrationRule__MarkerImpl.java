/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Administration;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.HospitaltoAdministrationRule__Marker;

import HospitalExample.Hospital;
import HospitalExample.Reception;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospitalto Administration Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl#getCREATE__SRC__h <em>CREATE SRC h</em>}</li>
 *   <li>{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl#getCREATE__SRC__r <em>CREATE SRC r</em>}</li>
 *   <li>{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl#getCREATE__TRG__v <em>CREATE TRG v</em>}</li>
 *   <li>{@link Hospital2Administration.impl.HospitaltoAdministrationRule__MarkerImpl#getCREATE__CORR__htov <em>CREATE CORR htov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HospitaltoAdministrationRule__MarkerImpl extends TGGRuleApplicationImpl implements HospitaltoAdministrationRule__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__h() <em>CREATE SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__h()
	 * @generated
	 * @ordered
	 */
	protected Hospital creatE__SRC__h;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__r() <em>CREATE SRC r</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__r()
	 * @generated
	 * @ordered
	 */
	protected Reception creatE__SRC__r;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__v() <em>CREATE TRG v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__v()
	 * @generated
	 * @ordered
	 */
	protected Administration creatE__TRG__v;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__htov() <em>CREATE CORR htov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__htov()
	 * @generated
	 * @ordered
	 */
	protected HospitalToAdministration creatE__CORR__htov;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitaltoAdministrationRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.HOSPITALTO_ADMINISTRATION_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital getCREATE__SRC__h() {
		if (creatE__SRC__h != null && creatE__SRC__h.eIsProxy()) {
			InternalEObject oldCREATE__SRC__h = (InternalEObject)creatE__SRC__h;
			creatE__SRC__h = (Hospital)eResolveProxy(oldCREATE__SRC__h);
			if (creatE__SRC__h != oldCREATE__SRC__h) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H, oldCREATE__SRC__h, creatE__SRC__h));
			}
		}
		return creatE__SRC__h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital basicGetCREATE__SRC__h() {
		return creatE__SRC__h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__h(Hospital newCREATE__SRC__h) {
		Hospital oldCREATE__SRC__h = creatE__SRC__h;
		creatE__SRC__h = newCREATE__SRC__h;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H, oldCREATE__SRC__h, creatE__SRC__h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getCREATE__SRC__r() {
		if (creatE__SRC__r != null && creatE__SRC__r.eIsProxy()) {
			InternalEObject oldCREATE__SRC__r = (InternalEObject)creatE__SRC__r;
			creatE__SRC__r = (Reception)eResolveProxy(oldCREATE__SRC__r);
			if (creatE__SRC__r != oldCREATE__SRC__r) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R, oldCREATE__SRC__r, creatE__SRC__r));
			}
		}
		return creatE__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception basicGetCREATE__SRC__r() {
		return creatE__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__r(Reception newCREATE__SRC__r) {
		Reception oldCREATE__SRC__r = creatE__SRC__r;
		creatE__SRC__r = newCREATE__SRC__r;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R, oldCREATE__SRC__r, creatE__SRC__r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administration getCREATE__TRG__v() {
		if (creatE__TRG__v != null && creatE__TRG__v.eIsProxy()) {
			InternalEObject oldCREATE__TRG__v = (InternalEObject)creatE__TRG__v;
			creatE__TRG__v = (Administration)eResolveProxy(oldCREATE__TRG__v);
			if (creatE__TRG__v != oldCREATE__TRG__v) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V, oldCREATE__TRG__v, creatE__TRG__v));
			}
		}
		return creatE__TRG__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administration basicGetCREATE__TRG__v() {
		return creatE__TRG__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__v(Administration newCREATE__TRG__v) {
		Administration oldCREATE__TRG__v = creatE__TRG__v;
		creatE__TRG__v = newCREATE__TRG__v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V, oldCREATE__TRG__v, creatE__TRG__v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalToAdministration getCREATE__CORR__htov() {
		if (creatE__CORR__htov != null && creatE__CORR__htov.eIsProxy()) {
			InternalEObject oldCREATE__CORR__htov = (InternalEObject)creatE__CORR__htov;
			creatE__CORR__htov = (HospitalToAdministration)eResolveProxy(oldCREATE__CORR__htov);
			if (creatE__CORR__htov != oldCREATE__CORR__htov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV, oldCREATE__CORR__htov, creatE__CORR__htov));
			}
		}
		return creatE__CORR__htov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalToAdministration basicGetCREATE__CORR__htov() {
		return creatE__CORR__htov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__htov(HospitalToAdministration newCREATE__CORR__htov) {
		HospitalToAdministration oldCREATE__CORR__htov = creatE__CORR__htov;
		creatE__CORR__htov = newCREATE__CORR__htov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV, oldCREATE__CORR__htov, creatE__CORR__htov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H:
				if (resolve) return getCREATE__SRC__h();
				return basicGetCREATE__SRC__h();
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R:
				if (resolve) return getCREATE__SRC__r();
				return basicGetCREATE__SRC__r();
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V:
				if (resolve) return getCREATE__TRG__v();
				return basicGetCREATE__TRG__v();
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV:
				if (resolve) return getCREATE__CORR__htov();
				return basicGetCREATE__CORR__htov();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H:
				setCREATE__SRC__h((Hospital)newValue);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R:
				setCREATE__SRC__r((Reception)newValue);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V:
				setCREATE__TRG__v((Administration)newValue);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV:
				setCREATE__CORR__htov((HospitalToAdministration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H:
				setCREATE__SRC__h((Hospital)null);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R:
				setCREATE__SRC__r((Reception)null);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V:
				setCREATE__TRG__v((Administration)null);
				return;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV:
				setCREATE__CORR__htov((HospitalToAdministration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_H:
				return creatE__SRC__h != null;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_SRC_R:
				return creatE__SRC__r != null;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_TRG_V:
				return creatE__TRG__v != null;
			case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE_MARKER__CREATE_CORR_HTOV:
				return creatE__CORR__htov != null;
		}
		return super.eIsSet(featureID);
	}

} //HospitaltoAdministrationRule__MarkerImpl
