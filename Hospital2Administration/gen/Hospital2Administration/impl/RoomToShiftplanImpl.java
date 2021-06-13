/**
 */
package Hospital2Administration.impl;

import AdministrationExample.Shiftplan;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.RoomToShiftplan;

import HospitalExample.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room To Shiftplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.RoomToShiftplanImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2Administration.impl.RoomToShiftplanImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomToShiftplanImpl extends MinimalEObjectImpl.Container implements RoomToShiftplan {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Room source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Shiftplan target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomToShiftplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.ROOM_TO_SHIFTPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Room)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Room newSource) {
		Room oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Shiftplan)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shiftplan basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Shiftplan newTarget) {
		Shiftplan oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE:
				setSource((Room)newValue);
				return;
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET:
				setTarget((Shiftplan)newValue);
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
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE:
				setSource((Room)null);
				return;
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET:
				setTarget((Shiftplan)null);
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
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__SOURCE:
				return source != null;
			case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomToShiftplanImpl
