/**
 */
package Hospital2Administration.impl;

import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.StaffToStaff;

import HospitalExample.Staff;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff To Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2Administration.impl.StaffToStaffImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2Administration.impl.StaffToStaffImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffToStaffImpl extends MinimalEObjectImpl.Container implements StaffToStaff {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Staff source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AdministrationExample.Staff target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffToStaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationPackage.Literals.STAFF_TO_STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Staff)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Staff newSource) {
		Staff oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Staff getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AdministrationExample.Staff)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Staff basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AdministrationExample.Staff newTarget) {
		AdministrationExample.Staff oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET:
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
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE:
				setSource((Staff)newValue);
				return;
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET:
				setTarget((AdministrationExample.Staff)newValue);
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
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE:
				setSource((Staff)null);
				return;
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET:
				setTarget((AdministrationExample.Staff)null);
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
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__SOURCE:
				return source != null;
			case Hospital2AdministrationPackage.STAFF_TO_STAFF__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //StaffToStaffImpl
