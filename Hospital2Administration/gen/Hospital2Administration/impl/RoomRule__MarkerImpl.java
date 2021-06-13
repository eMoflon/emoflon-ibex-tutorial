/**
 */
package Hospital2Administration.impl;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.RoomRule__Marker;

import HospitalExample.Department;
import HospitalExample.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.RoomRule__MarkerImpl#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2Administration.impl.RoomRule__MarkerImpl#getCREATE__SRC__ro <em>CREATE SRC ro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomRule__MarkerImpl extends TGGRuleApplicationImpl implements RoomRule__Marker {
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
	 * The cached value of the '{@link #getCREATE__SRC__ro() <em>CREATE SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__ro()
	 * @generated
	 * @ordered
	 */
	protected Room creatE__SRC__ro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.ROOM_RULE_MARKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D, oldCONTEXT__SRC__d, contexT__SRC__d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getCREATE__SRC__ro() {
		if (creatE__SRC__ro != null && creatE__SRC__ro.eIsProxy()) {
			InternalEObject oldCREATE__SRC__ro = (InternalEObject)creatE__SRC__ro;
			creatE__SRC__ro = (Room)eResolveProxy(oldCREATE__SRC__ro);
			if (creatE__SRC__ro != oldCREATE__SRC__ro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO, oldCREATE__SRC__ro, creatE__SRC__ro));
			}
		}
		return creatE__SRC__ro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCREATE__SRC__ro() {
		return creatE__SRC__ro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__ro(Room newCREATE__SRC__ro) {
		Room oldCREATE__SRC__ro = creatE__SRC__ro;
		creatE__SRC__ro = newCREATE__SRC__ro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO, oldCREATE__SRC__ro, creatE__SRC__ro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D:
				if (resolve) return getCONTEXT__SRC__d();
				return basicGetCONTEXT__SRC__d();
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO:
				if (resolve) return getCREATE__SRC__ro();
				return basicGetCREATE__SRC__ro();
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
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Department)newValue);
				return;
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO:
				setCREATE__SRC__ro((Room)newValue);
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
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D:
				setCONTEXT__SRC__d((Department)null);
				return;
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO:
				setCREATE__SRC__ro((Room)null);
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
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CONTEXT_SRC_D:
				return contexT__SRC__d != null;
			case Hospital2AdministrationPackage.ROOM_RULE_MARKER__CREATE_SRC_RO:
				return creatE__SRC__ro != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomRule__MarkerImpl
