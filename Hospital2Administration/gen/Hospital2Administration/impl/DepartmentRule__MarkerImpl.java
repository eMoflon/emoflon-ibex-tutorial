/**
 */
package Hospital2Administration.impl;

import Hospital2Administration.DepartmentRule__Marker;
import Hospital2Administration.Hospital2AdministrationPackage;

import HospitalExample.Department;
import HospitalExample.Hospital;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.DepartmentRule__MarkerImpl#getCREATE__SRC__d <em>CREATE SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.impl.DepartmentRule__MarkerImpl#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentRule__MarkerImpl extends TGGRuleApplicationImpl implements DepartmentRule__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__d() <em>CREATE SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__d()
	 * @generated
	 * @ordered
	 */
	protected Department creatE__SRC__d;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getCREATE__SRC__d() {
		if (creatE__SRC__d != null && creatE__SRC__d.eIsProxy()) {
			InternalEObject oldCREATE__SRC__d = (InternalEObject)creatE__SRC__d;
			creatE__SRC__d = (Department)eResolveProxy(oldCREATE__SRC__d);
			if (creatE__SRC__d != oldCREATE__SRC__d) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D, oldCREATE__SRC__d, creatE__SRC__d));
			}
		}
		return creatE__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetCREATE__SRC__d() {
		return creatE__SRC__d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__d(Department newCREATE__SRC__d) {
		Department oldCREATE__SRC__d = creatE__SRC__d;
		creatE__SRC__d = newCREATE__SRC__d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D, oldCREATE__SRC__d, creatE__SRC__d));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H, oldCONTEXT__SRC__h, contexT__SRC__h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D:
				if (resolve) return getCREATE__SRC__d();
				return basicGetCREATE__SRC__d();
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H:
				if (resolve) return getCONTEXT__SRC__h();
				return basicGetCONTEXT__SRC__h();
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
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D:
				setCREATE__SRC__d((Department)newValue);
				return;
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)newValue);
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
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D:
				setCREATE__SRC__d((Department)null);
				return;
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H:
				setCONTEXT__SRC__h((Hospital)null);
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
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CREATE_SRC_D:
				return creatE__SRC__d != null;
			case Hospital2AdministrationPackage.DEPARTMENT_RULE_MARKER__CONTEXT_SRC_H:
				return contexT__SRC__h != null;
		}
		return super.eIsSet(featureID);
	}

} //DepartmentRule__MarkerImpl
