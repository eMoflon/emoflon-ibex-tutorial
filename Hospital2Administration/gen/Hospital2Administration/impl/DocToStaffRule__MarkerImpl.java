/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Administration;
import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;

import Hospital2Administration.DocToStaffRule__Marker;
import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.StaffToStaff;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Hospital;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc To Staff Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCREATE__SRC__s1 <em>CREATE SRC s1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCREATE__TRG__s2 <em>CREATE TRG s2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCREATE__TRG__sh <em>CREATE TRG sh</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCREATE__TRG__sp <em>CREATE TRG sp</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DocToStaffRule__MarkerImpl#getCREATE__CORR__stot <em>CREATE CORR stot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocToStaffRule__MarkerImpl extends TGGRuleApplicationImpl implements DocToStaffRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__d() <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 * @ordered
	 */
	protected Department contexT__SRC__d;

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
	 * The cached value of the '{@link #getCREATE__SRC__s1() <em>CREATE SRC s1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__s1()
	 * @generated
	 * @ordered
	 */
	protected Doctor creatE__SRC__s1;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__s2() <em>CREATE TRG s2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__s2()
	 * @generated
	 * @ordered
	 */
	protected Staff creatE__TRG__s2;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__sh() <em>CREATE TRG sh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__sh()
	 * @generated
	 * @ordered
	 */
	protected Shift creatE__TRG__sh;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__sp() <em>CREATE TRG sp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__sp()
	 * @generated
	 * @ordered
	 */
	protected Shiftplan creatE__TRG__sp;

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
	 * The cached value of the '{@link #getCREATE__CORR__stot() <em>CREATE CORR stot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__stot()
	 * @generated
	 * @ordered
	 */
	protected StaffToStaff creatE__CORR__stot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocToStaffRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.DOC_TO_STAFF_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getCONTEXT__SRC__d() {
		if (contexT__SRC__d != null && contexT__SRC__d.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__d = (InternalEObject)contexT__SRC__d;
			contexT__SRC__d = (Department)eResolveProxy(oldCONTEXT__SRC__d);
			if (contexT__SRC__d != oldCONTEXT__SRC__d) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
			}
		}
		return contexT__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetCONTEXT__SRC__d() {
		return contexT__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__d(Department newCONTEXT__SRC__d) {
		Department oldCONTEXT__SRC__d = contexT__SRC__d;
		contexT__SRC__d = newCONTEXT__SRC__d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor getCREATE__SRC__s1() {
		if (creatE__SRC__s1 != null && creatE__SRC__s1.eIsProxy()) {
			InternalEObject oldCREATE__SRC__s1 = (InternalEObject)creatE__SRC__s1;
			creatE__SRC__s1 = (Doctor)eResolveProxy(oldCREATE__SRC__s1);
			if (creatE__SRC__s1 != oldCREATE__SRC__s1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1, oldCREATE__SRC__s1, creatE__SRC__s1));
			}
		}
		return creatE__SRC__s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor basicGetCREATE__SRC__s1() {
		return creatE__SRC__s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__s1(Doctor newCREATE__SRC__s1) {
		Doctor oldCREATE__SRC__s1 = creatE__SRC__s1;
		creatE__SRC__s1 = newCREATE__SRC__s1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1, oldCREATE__SRC__s1, creatE__SRC__s1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff getCREATE__TRG__s2() {
		if (creatE__TRG__s2 != null && creatE__TRG__s2.eIsProxy()) {
			InternalEObject oldCREATE__TRG__s2 = (InternalEObject)creatE__TRG__s2;
			creatE__TRG__s2 = (Staff)eResolveProxy(oldCREATE__TRG__s2);
			if (creatE__TRG__s2 != oldCREATE__TRG__s2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2, oldCREATE__TRG__s2, creatE__TRG__s2));
			}
		}
		return creatE__TRG__s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetCREATE__TRG__s2() {
		return creatE__TRG__s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__s2(Staff newCREATE__TRG__s2) {
		Staff oldCREATE__TRG__s2 = creatE__TRG__s2;
		creatE__TRG__s2 = newCREATE__TRG__s2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2, oldCREATE__TRG__s2, creatE__TRG__s2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift getCREATE__TRG__sh() {
		if (creatE__TRG__sh != null && creatE__TRG__sh.eIsProxy()) {
			InternalEObject oldCREATE__TRG__sh = (InternalEObject)creatE__TRG__sh;
			creatE__TRG__sh = (Shift)eResolveProxy(oldCREATE__TRG__sh);
			if (creatE__TRG__sh != oldCREATE__TRG__sh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH, oldCREATE__TRG__sh, creatE__TRG__sh));
			}
		}
		return creatE__TRG__sh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift basicGetCREATE__TRG__sh() {
		return creatE__TRG__sh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__sh(Shift newCREATE__TRG__sh) {
		Shift oldCREATE__TRG__sh = creatE__TRG__sh;
		creatE__TRG__sh = newCREATE__TRG__sh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH, oldCREATE__TRG__sh, creatE__TRG__sh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan getCREATE__TRG__sp() {
		if (creatE__TRG__sp != null && creatE__TRG__sp.eIsProxy()) {
			InternalEObject oldCREATE__TRG__sp = (InternalEObject)creatE__TRG__sp;
			creatE__TRG__sp = (Shiftplan)eResolveProxy(oldCREATE__TRG__sp);
			if (creatE__TRG__sp != oldCREATE__TRG__sp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP, oldCREATE__TRG__sp, creatE__TRG__sp));
			}
		}
		return creatE__TRG__sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan basicGetCREATE__TRG__sp() {
		return creatE__TRG__sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__sp(Shiftplan newCREATE__TRG__sp) {
		Shiftplan oldCREATE__TRG__sp = creatE__TRG__sp;
		creatE__TRG__sp = newCREATE__TRG__sp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP, oldCREATE__TRG__sp, creatE__TRG__sp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V, oldCONTEXT__TRG__v, contexT__TRG__v));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V, oldCONTEXT__TRG__v, contexT__TRG__v));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV, oldCONTEXT__CORR__htov, contexT__CORR__htov));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV, oldCONTEXT__CORR__htov, contexT__CORR__htov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff getCREATE__CORR__stot() {
		if (creatE__CORR__stot != null && creatE__CORR__stot.eIsProxy()) {
			InternalEObject oldCREATE__CORR__stot = (InternalEObject)creatE__CORR__stot;
			creatE__CORR__stot = (StaffToStaff)eResolveProxy(oldCREATE__CORR__stot);
			if (creatE__CORR__stot != oldCREATE__CORR__stot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT, oldCREATE__CORR__stot, creatE__CORR__stot));
			}
		}
		return creatE__CORR__stot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff basicGetCREATE__CORR__stot() {
		return creatE__CORR__stot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__stot(StaffToStaff newCREATE__CORR__stot) {
		StaffToStaff oldCREATE__CORR__stot = creatE__CORR__stot;
		creatE__CORR__stot = newCREATE__CORR__stot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT, oldCREATE__CORR__stot, creatE__CORR__stot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D:
				if (resolve) return getCONTEXT__SRC__d();
				return basicGetCONTEXT__SRC__d();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H:
				if (resolve) return getCONTEXT__SRC__h();
				return basicGetCONTEXT__SRC__h();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1:
				if (resolve) return getCREATE__SRC__s1();
				return basicGetCREATE__SRC__s1();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2:
				if (resolve) return getCREATE__TRG__s2();
				return basicGetCREATE__TRG__s2();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH:
				if (resolve) return getCREATE__TRG__sh();
				return basicGetCREATE__TRG__sh();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP:
				if (resolve) return getCREATE__TRG__sp();
				return basicGetCREATE__TRG__sp();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V:
				if (resolve) return getCONTEXT__TRG__v();
				return basicGetCONTEXT__TRG__v();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV:
				if (resolve) return getCONTEXT__CORR__htov();
				return basicGetCONTEXT__CORR__htov();
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT:
				if (resolve) return getCREATE__CORR__stot();
				return basicGetCREATE__CORR__stot();
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
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Department)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1:
				setCREATE__SRC__s1((Doctor)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2:
				setCREATE__TRG__s2((Staff)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH:
				setCREATE__TRG__sh((Shift)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP:
				setCREATE__TRG__sp((Shiftplan)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V:
				setCONTEXT__TRG__v((Administration)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV:
				setCONTEXT__CORR__htov((HospitalToAdministration)newValue);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT:
				setCREATE__CORR__stot((StaffToStaff)newValue);
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
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Department)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1:
				setCREATE__SRC__s1((Doctor)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2:
				setCREATE__TRG__s2((Staff)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH:
				setCREATE__TRG__sh((Shift)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP:
				setCREATE__TRG__sp((Shiftplan)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V:
				setCONTEXT__TRG__v((Administration)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV:
				setCONTEXT__CORR__htov((HospitalToAdministration)null);
				return;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT:
				setCREATE__CORR__stot((StaffToStaff)null);
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
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_D:
				return contexT__SRC__d != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_SRC_H:
				return contexT__SRC__h != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_SRC_S1:
				return creatE__SRC__s1 != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_S2:
				return creatE__TRG__s2 != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SH:
				return creatE__TRG__sh != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_TRG_SP:
				return creatE__TRG__sp != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_TRG_V:
				return contexT__TRG__v != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CONTEXT_CORR_HTOV:
				return contexT__CORR__htov != null;
			case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE_MARKER__CREATE_CORR_STOT:
				return creatE__CORR__stot != null;
		}
		return super.eIsSet(featureID);
	}

} //DocToStaffRule__MarkerImpl
