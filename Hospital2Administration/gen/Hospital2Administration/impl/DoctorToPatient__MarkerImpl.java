/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Staff;
import AdministrationExample.Treatment;

import Hospital2Administration.DoctorToPatient__Marker;
import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.StaffToStaff;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor To Patient Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__SRC__dep <em>CONTEXT SRC dep</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__TRG__s <em>CONTEXT TRG s</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCREATE__TRG__t <em>CREATE TRG t</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__CORR__dToS <em>CONTEXT CORR dTo S</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DoctorToPatient__MarkerImpl#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorToPatient__MarkerImpl extends TGGRuleApplicationImpl implements DoctorToPatient__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__d() <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 * @ordered
	 */
	protected Doctor contexT__SRC__d;

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
	 * The cached value of the '{@link #getCREATE__TRG__t() <em>CREATE TRG t</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__t()
	 * @generated
	 * @ordered
	 */
	protected Treatment creatE__TRG__t;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__dToS() <em>CONTEXT CORR dTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__dToS()
	 * @generated
	 * @ordered
	 */
	protected StaffToStaff contexT__CORR__dToS;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorToPatient__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.DOCTOR_TO_PATIENT_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor getCONTEXT__SRC__d() {
		if (contexT__SRC__d != null && contexT__SRC__d.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__d = (InternalEObject)contexT__SRC__d;
			contexT__SRC__d = (Doctor)eResolveProxy(oldCONTEXT__SRC__d);
			if (contexT__SRC__d != oldCONTEXT__SRC__d) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
			}
		}
		return contexT__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor basicGetCONTEXT__SRC__d() {
		return contexT__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__d(Doctor newCONTEXT__SRC__d) {
		Doctor oldCONTEXT__SRC__d = contexT__SRC__d;
		contexT__SRC__d = newCONTEXT__SRC__d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP, oldCONTEXT__SRC__dep, contexT__SRC__dep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP, oldCONTEXT__SRC__dep, contexT__SRC__dep));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1, oldCONTEXT__SRC__p1, contexT__SRC__p1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO, oldCONTEXT__SRC__ro, contexT__SRC__ro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO, oldCONTEXT__SRC__ro, contexT__SRC__ro));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2, oldCONTEXT__TRG__p2, contexT__TRG__p2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S, oldCONTEXT__TRG__s, contexT__TRG__s));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S, oldCONTEXT__TRG__s, contexT__TRG__s));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment getCREATE__TRG__t() {
		if (creatE__TRG__t != null && creatE__TRG__t.eIsProxy()) {
			InternalEObject oldCREATE__TRG__t = (InternalEObject)creatE__TRG__t;
			creatE__TRG__t = (Treatment)eResolveProxy(oldCREATE__TRG__t);
			if (creatE__TRG__t != oldCREATE__TRG__t) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T, oldCREATE__TRG__t, creatE__TRG__t));
			}
		}
		return creatE__TRG__t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment basicGetCREATE__TRG__t() {
		return creatE__TRG__t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__t(Treatment newCREATE__TRG__t) {
		Treatment oldCREATE__TRG__t = creatE__TRG__t;
		creatE__TRG__t = newCREATE__TRG__t;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T, oldCREATE__TRG__t, creatE__TRG__t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff getCONTEXT__CORR__dToS() {
		if (contexT__CORR__dToS != null && contexT__CORR__dToS.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__dToS = (InternalEObject)contexT__CORR__dToS;
			contexT__CORR__dToS = (StaffToStaff)eResolveProxy(oldCONTEXT__CORR__dToS);
			if (contexT__CORR__dToS != oldCONTEXT__CORR__dToS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S, oldCONTEXT__CORR__dToS, contexT__CORR__dToS));
			}
		}
		return contexT__CORR__dToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffToStaff basicGetCONTEXT__CORR__dToS() {
		return contexT__CORR__dToS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__dToS(StaffToStaff newCONTEXT__CORR__dToS) {
		StaffToStaff oldCONTEXT__CORR__dToS = contexT__CORR__dToS;
		contexT__CORR__dToS = newCONTEXT__CORR__dToS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S, oldCONTEXT__CORR__dToS, contexT__CORR__dToS));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P, oldCONTEXT__CORR__pToP, contexT__CORR__pToP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P, oldCONTEXT__CORR__pToP, contexT__CORR__pToP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D:
				if (resolve) return getCONTEXT__SRC__d();
				return basicGetCONTEXT__SRC__d();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP:
				if (resolve) return getCONTEXT__SRC__dep();
				return basicGetCONTEXT__SRC__dep();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1:
				if (resolve) return getCONTEXT__SRC__p1();
				return basicGetCONTEXT__SRC__p1();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO:
				if (resolve) return getCONTEXT__SRC__ro();
				return basicGetCONTEXT__SRC__ro();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2:
				if (resolve) return getCONTEXT__TRG__p2();
				return basicGetCONTEXT__TRG__p2();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S:
				if (resolve) return getCONTEXT__TRG__s();
				return basicGetCONTEXT__TRG__s();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T:
				if (resolve) return getCREATE__TRG__t();
				return basicGetCREATE__TRG__t();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S:
				if (resolve) return getCONTEXT__CORR__dToS();
				return basicGetCONTEXT__CORR__dToS();
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P:
				if (resolve) return getCONTEXT__CORR__pToP();
				return basicGetCONTEXT__CORR__pToP();
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
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Doctor)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP:
				setCONTEXT__SRC__dep((Department)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO:
				setCONTEXT__SRC__ro((Room)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S:
				setCONTEXT__TRG__s((Staff)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T:
				setCREATE__TRG__t((Treatment)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S:
				setCONTEXT__CORR__dToS((StaffToStaff)newValue);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P:
				setCONTEXT__CORR__pToP((PatientToPatient)newValue);
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
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Doctor)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP:
				setCONTEXT__SRC__dep((Department)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1:
				setCONTEXT__SRC__p1((Patient)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO:
				setCONTEXT__SRC__ro((Room)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2:
				setCONTEXT__TRG__p2((AdministrationExample.Patient)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S:
				setCONTEXT__TRG__s((Staff)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T:
				setCREATE__TRG__t((Treatment)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S:
				setCONTEXT__CORR__dToS((StaffToStaff)null);
				return;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P:
				setCONTEXT__CORR__pToP((PatientToPatient)null);
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
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_D:
				return contexT__SRC__d != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_DEP:
				return contexT__SRC__dep != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_P1:
				return contexT__SRC__p1 != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_SRC_RO:
				return contexT__SRC__ro != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_P2:
				return contexT__TRG__p2 != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_TRG_S:
				return contexT__TRG__s != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CREATE_TRG_T:
				return creatE__TRG__t != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_DTO_S:
				return contexT__CORR__dToS != null;
			case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT_MARKER__CONTEXT_CORR_PTO_P:
				return contexT__CORR__pToP != null;
		}
		return super.eIsSet(featureID);
	}

} //DoctorToPatient__MarkerImpl
