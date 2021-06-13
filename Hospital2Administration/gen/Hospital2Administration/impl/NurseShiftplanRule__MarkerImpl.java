/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.NurseShiftplanRule__Marker;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.StaffToStaff;

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
 * An implementation of the model object '<em><b>Nurse Shiftplan Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__SRC__s1 <em>CONTEXT SRC s1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__TRG__s2 <em>CONTEXT TRG s2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__TRG__sh <em>CONTEXT TRG sh</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__TRG__sp <em>CONTEXT TRG sp</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}</li>
 *   <li>{@link Hospital2Administration.impl.NurseShiftplanRule__MarkerImpl#getCONTEXT__CORR__sToS <em>CONTEXT CORR sTo S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NurseShiftplanRule__MarkerImpl extends TGGRuleApplicationImpl implements NurseShiftplanRule__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__ro() <em>CONTEXT SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__ro()
	 * @generated
	 * @ordered
	 */
	protected Room contexT__SRC__ro;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__s1() <em>CONTEXT SRC s1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__s1()
	 * @generated
	 * @ordered
	 */
	protected Nurse contexT__SRC__s1;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__s2() <em>CONTEXT TRG s2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__s2()
	 * @generated
	 * @ordered
	 */
	protected Staff contexT__TRG__s2;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__sh() <em>CONTEXT TRG sh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__sh()
	 * @generated
	 * @ordered
	 */
	protected Shift contexT__TRG__sh;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__sp() <em>CONTEXT TRG sp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__sp()
	 * @generated
	 * @ordered
	 */
	protected Shiftplan contexT__TRG__sp;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__pToP() <em>CONTEXT CORR pTo P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__pToP()
	 * @generated
	 * @ordered
	 */
	protected PatientToPatient contexT__CORR__pToP;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__sToS() <em>CONTEXT CORR sTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__sToS()
	 * @generated
	 * @ordered
	 */
	protected StaffToStaff contexT__CORR__sToS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NurseShiftplanRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE_MARKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getCONTEXT__SRC__ro() {
		if (contexT__SRC__ro != null && contexT__SRC__ro.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__ro = (InternalEObject)contexT__SRC__ro;
			contexT__SRC__ro = (Room)eResolveProxy(oldCONTEXT__SRC__ro);
			if (contexT__SRC__ro != oldCONTEXT__SRC__ro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO, oldCONTEXT__SRC__ro, contexT__SRC__ro));
			}
		}
		return contexT__SRC__ro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCONTEXT__SRC__ro() {
		return contexT__SRC__ro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__ro(Room newCONTEXT__SRC__ro) {
		Room oldCONTEXT__SRC__ro = contexT__SRC__ro;
		contexT__SRC__ro = newCONTEXT__SRC__ro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO, oldCONTEXT__SRC__ro, contexT__SRC__ro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nurse getCONTEXT__SRC__s1() {
		if (contexT__SRC__s1 != null && contexT__SRC__s1.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__s1 = (InternalEObject)contexT__SRC__s1;
			contexT__SRC__s1 = (Nurse)eResolveProxy(oldCONTEXT__SRC__s1);
			if (contexT__SRC__s1 != oldCONTEXT__SRC__s1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1, oldCONTEXT__SRC__s1, contexT__SRC__s1));
			}
		}
		return contexT__SRC__s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nurse basicGetCONTEXT__SRC__s1() {
		return contexT__SRC__s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__s1(Nurse newCONTEXT__SRC__s1) {
		Nurse oldCONTEXT__SRC__s1 = contexT__SRC__s1;
		contexT__SRC__s1 = newCONTEXT__SRC__s1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1, oldCONTEXT__SRC__s1, contexT__SRC__s1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff getCONTEXT__TRG__s2() {
		if (contexT__TRG__s2 != null && contexT__TRG__s2.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__s2 = (InternalEObject)contexT__TRG__s2;
			contexT__TRG__s2 = (Staff)eResolveProxy(oldCONTEXT__TRG__s2);
			if (contexT__TRG__s2 != oldCONTEXT__TRG__s2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2, oldCONTEXT__TRG__s2, contexT__TRG__s2));
			}
		}
		return contexT__TRG__s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetCONTEXT__TRG__s2() {
		return contexT__TRG__s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__s2(Staff newCONTEXT__TRG__s2) {
		Staff oldCONTEXT__TRG__s2 = contexT__TRG__s2;
		contexT__TRG__s2 = newCONTEXT__TRG__s2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2, oldCONTEXT__TRG__s2, contexT__TRG__s2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift getCONTEXT__TRG__sh() {
		if (contexT__TRG__sh != null && contexT__TRG__sh.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__sh = (InternalEObject)contexT__TRG__sh;
			contexT__TRG__sh = (Shift)eResolveProxy(oldCONTEXT__TRG__sh);
			if (contexT__TRG__sh != oldCONTEXT__TRG__sh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH, oldCONTEXT__TRG__sh, contexT__TRG__sh));
			}
		}
		return contexT__TRG__sh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift basicGetCONTEXT__TRG__sh() {
		return contexT__TRG__sh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__sh(Shift newCONTEXT__TRG__sh) {
		Shift oldCONTEXT__TRG__sh = contexT__TRG__sh;
		contexT__TRG__sh = newCONTEXT__TRG__sh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH, oldCONTEXT__TRG__sh, contexT__TRG__sh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan getCONTEXT__TRG__sp() {
		if (contexT__TRG__sp != null && contexT__TRG__sp.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__sp = (InternalEObject)contexT__TRG__sp;
			contexT__TRG__sp = (Shiftplan)eResolveProxy(oldCONTEXT__TRG__sp);
			if (contexT__TRG__sp != oldCONTEXT__TRG__sp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP, oldCONTEXT__TRG__sp, contexT__TRG__sp));
			}
		}
		return contexT__TRG__sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan basicGetCONTEXT__TRG__sp() {
		return contexT__TRG__sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__sp(Shiftplan newCONTEXT__TRG__sp) {
		Shiftplan oldCONTEXT__TRG__sp = contexT__TRG__sp;
		contexT__TRG__sp = newCONTEXT__TRG__sp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP, oldCONTEXT__TRG__sp, contexT__TRG__sp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient getCONTEXT__CORR__pToP() {
		if (contexT__CORR__pToP != null && contexT__CORR__pToP.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__pToP = (InternalEObject)contexT__CORR__pToP;
			contexT__CORR__pToP = (PatientToPatient)eResolveProxy(oldCONTEXT__CORR__pToP);
			if (contexT__CORR__pToP != oldCONTEXT__CORR__pToP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P, oldCONTEXT__CORR__pToP, contexT__CORR__pToP));
			}
		}
		return contexT__CORR__pToP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientToPatient basicGetCONTEXT__CORR__pToP() {
		return contexT__CORR__pToP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__pToP(PatientToPatient newCONTEXT__CORR__pToP) {
		PatientToPatient oldCONTEXT__CORR__pToP = contexT__CORR__pToP;
		contexT__CORR__pToP = newCONTEXT__CORR__pToP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P, oldCONTEXT__CORR__pToP, contexT__CORR__pToP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff getCONTEXT__CORR__sToS() {
		if (contexT__CORR__sToS != null && contexT__CORR__sToS.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__sToS = (InternalEObject)contexT__CORR__sToS;
			contexT__CORR__sToS = (StaffToStaff)eResolveProxy(oldCONTEXT__CORR__sToS);
			if (contexT__CORR__sToS != oldCONTEXT__CORR__sToS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S, oldCONTEXT__CORR__sToS, contexT__CORR__sToS));
			}
		}
		return contexT__CORR__sToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff basicGetCONTEXT__CORR__sToS() {
		return contexT__CORR__sToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__sToS(StaffToStaff newCONTEXT__CORR__sToS) {
		StaffToStaff oldCONTEXT__CORR__sToS = contexT__CORR__sToS;
		contexT__CORR__sToS = newCONTEXT__CORR__sToS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S, oldCONTEXT__CORR__sToS, contexT__CORR__sToS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1:
				if (resolve) return getCONTEXT__SRC__p1();
				return basicGetCONTEXT__SRC__p1();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO:
				if (resolve) return getCONTEXT__SRC__ro();
				return basicGetCONTEXT__SRC__ro();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1:
				if (resolve) return getCONTEXT__SRC__s1();
				return basicGetCONTEXT__SRC__s1();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2:
				if (resolve) return getCONTEXT__TRG__p2();
				return basicGetCONTEXT__TRG__p2();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2:
				if (resolve) return getCONTEXT__TRG__s2();
				return basicGetCONTEXT__TRG__s2();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH:
				if (resolve) return getCONTEXT__TRG__sh();
				return basicGetCONTEXT__TRG__sh();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP:
				if (resolve) return getCONTEXT__TRG__sp();
				return basicGetCONTEXT__TRG__sp();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P:
				if (resolve) return getCONTEXT__CORR__pToP();
				return basicGetCONTEXT__CORR__pToP();
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S:
				if (resolve) return getCONTEXT__CORR__sToS();
				return basicGetCONTEXT__CORR__sToS();
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
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO:
				setCONTEXT__SRC__ro((Room)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1:
				setCONTEXT__SRC__s1((Nurse)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2:
				setCONTEXT__TRG__s2((Staff)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH:
				setCONTEXT__TRG__sh((Shift)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP:
				setCONTEXT__TRG__sp((Shiftplan)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P:
				setCONTEXT__CORR__pToP((PatientToPatient)newValue);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S:
				setCONTEXT__CORR__sToS((StaffToStaff)newValue);
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
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO:
				setCONTEXT__SRC__ro((Room)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1:
				setCONTEXT__SRC__s1((Nurse)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2:
				setCONTEXT__TRG__s2((Staff)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH:
				setCONTEXT__TRG__sh((Shift)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP:
				setCONTEXT__TRG__sp((Shiftplan)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P:
				setCONTEXT__CORR__pToP((PatientToPatient)null);
				return;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S:
				setCONTEXT__CORR__sToS((StaffToStaff)null);
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
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_P1:
				return contexT__SRC__p1 != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_RO:
				return contexT__SRC__ro != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_SRC_S1:
				return contexT__SRC__s1 != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_P2:
				return contexT__TRG__p2 != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_S2:
				return contexT__TRG__s2 != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SH:
				return contexT__TRG__sh != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_TRG_SP:
				return contexT__TRG__sp != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_PTO_P:
				return contexT__CORR__pToP != null;
			case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE_MARKER__CONTEXT_CORR_STO_S:
				return contexT__CORR__sToS != null;
		}
		return super.eIsSet(featureID);
	}

} //NurseShiftplanRule__MarkerImpl
