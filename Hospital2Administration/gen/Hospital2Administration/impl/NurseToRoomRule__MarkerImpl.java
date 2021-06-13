/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Staff;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.NurseToRoomRule__Marker;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.StaffToStaff;

import HospitalExample.Department;
import HospitalExample.Nurse;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nurse To Room Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__SRC__n <em>CONTEXT SRC n</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__SRC__r <em>CONTEXT SRC r</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__CORR__nToS <em>CONTEXT CORR nTo S</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseToRoomRule__MarkerImpl#getCONTEXT__CORR__pTop <em>CONTEXT CORR pTop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NurseToRoomRule__MarkerImpl extends TGGRuleApplicationImpl implements NurseToRoomRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__dep() <em>CONTEXT SRC dep</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__dep()
	 * @generated
	 * @ordered
	 */
	protected Department contexT__SRC__dep;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__n() <em>CONTEXT SRC n</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__n()
	 * @generated
	 * @ordered
	 */
	protected Nurse contexT__SRC__n;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__p1() <em>CONTEXT SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__p1()
	 * @generated
	 * @ordered
	 */
	protected Patient contexT__SRC__p1;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__r() <em>CONTEXT SRC r</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__r()
	 * @generated
	 * @ordered
	 */
	protected Room contexT__SRC__r;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__p2() <em>CONTEXT TRG p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__p2()
	 * @generated
	 * @ordered
	 */
	protected AdministrationExample.Patient contexT__TRG__p2;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__s() <em>CONTEXT TRG s</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__s()
	 * @generated
	 * @ordered
	 */
	protected Staff contexT__TRG__s;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__nToS() <em>CONTEXT CORR nTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__nToS()
	 * @generated
	 * @ordered
	 */
	protected StaffToStaff contexT__CORR__nToS;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__pTop() <em>CONTEXT CORR pTop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__pTop()
	 * @generated
	 * @ordered
	 */
	protected PatientToPatient contexT__CORR__pTop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NurseToRoomRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getCONTEXT__SRC__dep() {
		if (contexT__SRC__dep != null && contexT__SRC__dep.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__dep = (InternalEObject)contexT__SRC__dep;
			contexT__SRC__dep = (Department)eResolveProxy(oldCONTEXT__SRC__dep);
			if (contexT__SRC__dep != oldCONTEXT__SRC__dep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP, oldCONTEXT__SRC__dep, contexT__SRC__dep));
			}
		}
		return contexT__SRC__dep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetCONTEXT__SRC__dep() {
		return contexT__SRC__dep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__dep(Department newCONTEXT__SRC__dep) {
		Department oldCONTEXT__SRC__dep = contexT__SRC__dep;
		contexT__SRC__dep = newCONTEXT__SRC__dep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP, oldCONTEXT__SRC__dep, contexT__SRC__dep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nurse getCONTEXT__SRC__n() {
		if (contexT__SRC__n != null && contexT__SRC__n.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__n = (InternalEObject)contexT__SRC__n;
			contexT__SRC__n = (Nurse)eResolveProxy(oldCONTEXT__SRC__n);
			if (contexT__SRC__n != oldCONTEXT__SRC__n) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N, oldCONTEXT__SRC__n, contexT__SRC__n));
			}
		}
		return contexT__SRC__n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nurse basicGetCONTEXT__SRC__n() {
		return contexT__SRC__n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__n(Nurse newCONTEXT__SRC__n) {
		Nurse oldCONTEXT__SRC__n = contexT__SRC__n;
		contexT__SRC__n = newCONTEXT__SRC__n;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N, oldCONTEXT__SRC__n, contexT__SRC__n));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getCONTEXT__SRC__p1() {
		if (contexT__SRC__p1 != null && contexT__SRC__p1.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__p1 = (InternalEObject)contexT__SRC__p1;
			contexT__SRC__p1 = (Patient)eResolveProxy(oldCONTEXT__SRC__p1);
			if (contexT__SRC__p1 != oldCONTEXT__SRC__p1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
			}
		}
		return contexT__SRC__p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetCONTEXT__SRC__p1() {
		return contexT__SRC__p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__p1(Patient newCONTEXT__SRC__p1) {
		Patient oldCONTEXT__SRC__p1 = contexT__SRC__p1;
		contexT__SRC__p1 = newCONTEXT__SRC__p1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getCONTEXT__SRC__r() {
		if (contexT__SRC__r != null && contexT__SRC__r.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__r = (InternalEObject)contexT__SRC__r;
			contexT__SRC__r = (Room)eResolveProxy(oldCONTEXT__SRC__r);
			if (contexT__SRC__r != oldCONTEXT__SRC__r) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R, oldCONTEXT__SRC__r, contexT__SRC__r));
			}
		}
		return contexT__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCONTEXT__SRC__r() {
		return contexT__SRC__r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__r(Room newCONTEXT__SRC__r) {
		Room oldCONTEXT__SRC__r = contexT__SRC__r;
		contexT__SRC__r = newCONTEXT__SRC__r;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R, oldCONTEXT__SRC__r, contexT__SRC__r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Patient getCONTEXT__TRG__p2() {
		if (contexT__TRG__p2 != null && contexT__TRG__p2.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__p2 = (InternalEObject)contexT__TRG__p2;
			contexT__TRG__p2 = (AdministrationExample.Patient)eResolveProxy(oldCONTEXT__TRG__p2);
			if (contexT__TRG__p2 != oldCONTEXT__TRG__p2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
			}
		}
		return contexT__TRG__p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Patient basicGetCONTEXT__TRG__p2() {
		return contexT__TRG__p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__p2(AdministrationExample.Patient newCONTEXT__TRG__p2) {
		AdministrationExample.Patient oldCONTEXT__TRG__p2 = contexT__TRG__p2;
		contexT__TRG__p2 = newCONTEXT__TRG__p2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff getCONTEXT__TRG__s() {
		if (contexT__TRG__s != null && contexT__TRG__s.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__s = (InternalEObject)contexT__TRG__s;
			contexT__TRG__s = (Staff)eResolveProxy(oldCONTEXT__TRG__s);
			if (contexT__TRG__s != oldCONTEXT__TRG__s) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S, oldCONTEXT__TRG__s, contexT__TRG__s));
			}
		}
		return contexT__TRG__s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetCONTEXT__TRG__s() {
		return contexT__TRG__s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__s(Staff newCONTEXT__TRG__s) {
		Staff oldCONTEXT__TRG__s = contexT__TRG__s;
		contexT__TRG__s = newCONTEXT__TRG__s;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S, oldCONTEXT__TRG__s, contexT__TRG__s));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff getCONTEXT__CORR__nToS() {
		if (contexT__CORR__nToS != null && contexT__CORR__nToS.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__nToS = (InternalEObject)contexT__CORR__nToS;
			contexT__CORR__nToS = (StaffToStaff)eResolveProxy(oldCONTEXT__CORR__nToS);
			if (contexT__CORR__nToS != oldCONTEXT__CORR__nToS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S, oldCONTEXT__CORR__nToS, contexT__CORR__nToS));
			}
		}
		return contexT__CORR__nToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff basicGetCONTEXT__CORR__nToS() {
		return contexT__CORR__nToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__nToS(StaffToStaff newCONTEXT__CORR__nToS) {
		StaffToStaff oldCONTEXT__CORR__nToS = contexT__CORR__nToS;
		contexT__CORR__nToS = newCONTEXT__CORR__nToS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S, oldCONTEXT__CORR__nToS, contexT__CORR__nToS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient getCONTEXT__CORR__pTop() {
		if (contexT__CORR__pTop != null && contexT__CORR__pTop.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__pTop = (InternalEObject)contexT__CORR__pTop;
			contexT__CORR__pTop = (PatientToPatient)eResolveProxy(oldCONTEXT__CORR__pTop);
			if (contexT__CORR__pTop != oldCONTEXT__CORR__pTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP, oldCONTEXT__CORR__pTop, contexT__CORR__pTop));
			}
		}
		return contexT__CORR__pTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient basicGetCONTEXT__CORR__pTop() {
		return contexT__CORR__pTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__pTop(PatientToPatient newCONTEXT__CORR__pTop) {
		PatientToPatient oldCONTEXT__CORR__pTop = contexT__CORR__pTop;
		contexT__CORR__pTop = newCONTEXT__CORR__pTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP, oldCONTEXT__CORR__pTop, contexT__CORR__pTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP:
				if (resolve) return getCONTEXT__SRC__dep();
				return basicGetCONTEXT__SRC__dep();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N:
				if (resolve) return getCONTEXT__SRC__n();
				return basicGetCONTEXT__SRC__n();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1:
				if (resolve) return getCONTEXT__SRC__p1();
				return basicGetCONTEXT__SRC__p1();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R:
				if (resolve) return getCONTEXT__SRC__r();
				return basicGetCONTEXT__SRC__r();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2:
				if (resolve) return getCONTEXT__TRG__p2();
				return basicGetCONTEXT__TRG__p2();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S:
				if (resolve) return getCONTEXT__TRG__s();
				return basicGetCONTEXT__TRG__s();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S:
				if (resolve) return getCONTEXT__CORR__nToS();
				return basicGetCONTEXT__CORR__nToS();
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP:
				if (resolve) return getCONTEXT__CORR__pTop();
				return basicGetCONTEXT__CORR__pTop();
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
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP:
				setCONTEXT__SRC__dep((Department)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N:
				setCONTEXT__SRC__n((Nurse)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R:
				setCONTEXT__SRC__r((Room)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S:
				setCONTEXT__TRG__s((Staff)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S:
				setCONTEXT__CORR__nToS((StaffToStaff)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP:
				setCONTEXT__CORR__pTop((PatientToPatient)newValue);
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
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP:
				setCONTEXT__SRC__dep((Department)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N:
				setCONTEXT__SRC__n((Nurse)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R:
				setCONTEXT__SRC__r((Room)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S:
				setCONTEXT__TRG__s((Staff)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S:
				setCONTEXT__CORR__nToS((StaffToStaff)null);
				return;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP:
				setCONTEXT__CORR__pTop((PatientToPatient)null);
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
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_DEP:
				return contexT__SRC__dep != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_N:
				return contexT__SRC__n != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_P1:
				return contexT__SRC__p1 != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_SRC_R:
				return contexT__SRC__r != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_P2:
				return contexT__TRG__p2 != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_TRG_S:
				return contexT__TRG__s != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_NTO_S:
				return contexT__CORR__nToS != null;
			case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE_MARKER__CONTEXT_CORR_PTOP:
				return contexT__CORR__pTop != null;
		}
		return super.eIsSet(featureID);
	}

} //NurseToRoomRule__MarkerImpl
