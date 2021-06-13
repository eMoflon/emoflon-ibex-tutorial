/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Administration;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.PatientInReception__Marker;
import Hospital2Administration.PatientToPatient;

import HospitalExample.Hospital;
import HospitalExample.Patient;
import HospitalExample.Reception;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient In Reception Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCREATE__SRC__p1 <em>CREATE SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCREATE__TRG__p2 <em>CREATE TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}</li>
 *   <li>{@link Hospital2Administration.impl.PatientInReception__MarkerImpl#getCREATE__CORR__pTop <em>CREATE CORR pTop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientInReception__MarkerImpl extends TGGRuleApplicationImpl implements PatientInReception__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__h() <em>CONTEXT SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__h()
	 * @generated
	 * @ordered
	 */
	protected Hospital contexT__SRC__h;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__p1() <em>CREATE SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__p1()
	 * @generated
	 * @ordered
	 */
	protected Patient creatE__SRC__p1;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__r() <em>CONTEXT SRC r</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__r()
	 * @generated
	 * @ordered
	 */
	protected Reception contexT__SRC__r;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__p2() <em>CREATE TRG p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__p2()
	 * @generated
	 * @ordered
	 */
	protected AdministrationExample.Patient creatE__TRG__p2;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__v() <em>CONTEXT TRG v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__v()
	 * @generated
	 * @ordered
	 */
	protected Administration contexT__TRG__v;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__htov() <em>CONTEXT CORR htov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__htov()
	 * @generated
	 * @ordered
	 */
	protected HospitalToAdministration contexT__CORR__htov;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__pTop() <em>CREATE CORR pTop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__pTop()
	 * @generated
	 * @ordered
	 */
	protected PatientToPatient creatE__CORR__pTop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientInReception__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.PATIENT_IN_RECEPTION_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital getCONTEXT__SRC__h() {
		if (contexT__SRC__h != null && contexT__SRC__h.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__h = (InternalEObject)contexT__SRC__h;
			contexT__SRC__h = (Hospital)eResolveProxy(oldCONTEXT__SRC__h);
			if (contexT__SRC__h != oldCONTEXT__SRC__h) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
			}
		}
		return contexT__SRC__h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital basicGetCONTEXT__SRC__h() {
		return contexT__SRC__h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__h(Hospital newCONTEXT__SRC__h) {
		Hospital oldCONTEXT__SRC__h = contexT__SRC__h;
		contexT__SRC__h = newCONTEXT__SRC__h;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getCREATE__SRC__p1() {
		if (creatE__SRC__p1 != null && creatE__SRC__p1.eIsProxy()) {
			InternalEObject oldCREATE__SRC__p1 = (InternalEObject)creatE__SRC__p1;
			creatE__SRC__p1 = (Patient)eResolveProxy(oldCREATE__SRC__p1);
			if (creatE__SRC__p1 != oldCREATE__SRC__p1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1, oldCREATE__SRC__p1, creatE__SRC__p1));
			}
		}
		return creatE__SRC__p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetCREATE__SRC__p1() {
		return creatE__SRC__p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__p1(Patient newCREATE__SRC__p1) {
		Patient oldCREATE__SRC__p1 = creatE__SRC__p1;
		creatE__SRC__p1 = newCREATE__SRC__p1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1, oldCREATE__SRC__p1, creatE__SRC__p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getCONTEXT__SRC__r() {
		if (contexT__SRC__r != null && contexT__SRC__r.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__r = (InternalEObject)contexT__SRC__r;
			contexT__SRC__r = (Reception)eResolveProxy(oldCONTEXT__SRC__r);
			if (contexT__SRC__r != oldCONTEXT__SRC__r) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R, oldCONTEXT__SRC__r, contexT__SRC__r));
			}
		}
		return contexT__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception basicGetCONTEXT__SRC__r() {
		return contexT__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__r(Reception newCONTEXT__SRC__r) {
		Reception oldCONTEXT__SRC__r = contexT__SRC__r;
		contexT__SRC__r = newCONTEXT__SRC__r;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R, oldCONTEXT__SRC__r, contexT__SRC__r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Patient getCREATE__TRG__p2() {
		if (creatE__TRG__p2 != null && creatE__TRG__p2.eIsProxy()) {
			InternalEObject oldCREATE__TRG__p2 = (InternalEObject)creatE__TRG__p2;
			creatE__TRG__p2 = (AdministrationExample.Patient)eResolveProxy(oldCREATE__TRG__p2);
			if (creatE__TRG__p2 != oldCREATE__TRG__p2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2, oldCREATE__TRG__p2, creatE__TRG__p2));
			}
		}
		return creatE__TRG__p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Patient basicGetCREATE__TRG__p2() {
		return creatE__TRG__p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__p2(AdministrationExample.Patient newCREATE__TRG__p2) {
		AdministrationExample.Patient oldCREATE__TRG__p2 = creatE__TRG__p2;
		creatE__TRG__p2 = newCREATE__TRG__p2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2, oldCREATE__TRG__p2, creatE__TRG__p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administration getCONTEXT__TRG__v() {
		if (contexT__TRG__v != null && contexT__TRG__v.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__v = (InternalEObject)contexT__TRG__v;
			contexT__TRG__v = (Administration)eResolveProxy(oldCONTEXT__TRG__v);
			if (contexT__TRG__v != oldCONTEXT__TRG__v) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V, oldCONTEXT__TRG__v, contexT__TRG__v));
			}
		}
		return contexT__TRG__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administration basicGetCONTEXT__TRG__v() {
		return contexT__TRG__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__v(Administration newCONTEXT__TRG__v) {
		Administration oldCONTEXT__TRG__v = contexT__TRG__v;
		contexT__TRG__v = newCONTEXT__TRG__v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V, oldCONTEXT__TRG__v, contexT__TRG__v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalToAdministration getCONTEXT__CORR__htov() {
		if (contexT__CORR__htov != null && contexT__CORR__htov.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__htov = (InternalEObject)contexT__CORR__htov;
			contexT__CORR__htov = (HospitalToAdministration)eResolveProxy(oldCONTEXT__CORR__htov);
			if (contexT__CORR__htov != oldCONTEXT__CORR__htov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV, oldCONTEXT__CORR__htov, contexT__CORR__htov));
			}
		}
		return contexT__CORR__htov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalToAdministration basicGetCONTEXT__CORR__htov() {
		return contexT__CORR__htov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__htov(HospitalToAdministration newCONTEXT__CORR__htov) {
		HospitalToAdministration oldCONTEXT__CORR__htov = contexT__CORR__htov;
		contexT__CORR__htov = newCONTEXT__CORR__htov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV, oldCONTEXT__CORR__htov, contexT__CORR__htov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient getCREATE__CORR__pTop() {
		if (creatE__CORR__pTop != null && creatE__CORR__pTop.eIsProxy()) {
			InternalEObject oldCREATE__CORR__pTop = (InternalEObject)creatE__CORR__pTop;
			creatE__CORR__pTop = (PatientToPatient)eResolveProxy(oldCREATE__CORR__pTop);
			if (creatE__CORR__pTop != oldCREATE__CORR__pTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP, oldCREATE__CORR__pTop, creatE__CORR__pTop));
			}
		}
		return creatE__CORR__pTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient basicGetCREATE__CORR__pTop() {
		return creatE__CORR__pTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__pTop(PatientToPatient newCREATE__CORR__pTop) {
		PatientToPatient oldCREATE__CORR__pTop = creatE__CORR__pTop;
		creatE__CORR__pTop = newCREATE__CORR__pTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP, oldCREATE__CORR__pTop, creatE__CORR__pTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H:
				if (resolve) return getCONTEXT__SRC__h();
				return basicGetCONTEXT__SRC__h();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1:
				if (resolve) return getCREATE__SRC__p1();
				return basicGetCREATE__SRC__p1();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R:
				if (resolve) return getCONTEXT__SRC__r();
				return basicGetCONTEXT__SRC__r();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2:
				if (resolve) return getCREATE__TRG__p2();
				return basicGetCREATE__TRG__p2();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V:
				if (resolve) return getCONTEXT__TRG__v();
				return basicGetCONTEXT__TRG__v();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV:
				if (resolve) return getCONTEXT__CORR__htov();
				return basicGetCONTEXT__CORR__htov();
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP:
				if (resolve) return getCREATE__CORR__pTop();
				return basicGetCREATE__CORR__pTop();
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
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1:
				setCREATE__SRC__p1((Patient)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R:
				setCONTEXT__SRC__r((Reception)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2:
				setCREATE__TRG__p2((AdministrationExample.Patient)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V:
				setCONTEXT__TRG__v((Administration)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV:
				setCONTEXT__CORR__htov((HospitalToAdministration)newValue);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP:
				setCREATE__CORR__pTop((PatientToPatient)newValue);
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
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1:
				setCREATE__SRC__p1((Patient)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R:
				setCONTEXT__SRC__r((Reception)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2:
				setCREATE__TRG__p2((AdministrationExample.Patient)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V:
				setCONTEXT__TRG__v((Administration)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV:
				setCONTEXT__CORR__htov((HospitalToAdministration)null);
				return;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP:
				setCREATE__CORR__pTop((PatientToPatient)null);
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
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_H:
				return contexT__SRC__h != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_SRC_P1:
				return creatE__SRC__p1 != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_SRC_R:
				return contexT__SRC__r != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_TRG_P2:
				return creatE__TRG__p2 != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_TRG_V:
				return contexT__TRG__v != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CONTEXT_CORR_HTOV:
				return contexT__CORR__htov != null;
			case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION_MARKER__CREATE_CORR_PTOP:
				return creatE__CORR__pTop != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientInReception__MarkerImpl
