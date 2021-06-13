/**
 */
package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;
import AdministrationExample.Treatment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.impl.StaffImpl#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link AdministrationExample.impl.StaffImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link AdministrationExample.impl.StaffImpl#getShiftPlan <em>Shift Plan</em>}</li>
 *   <li>{@link AdministrationExample.impl.StaffImpl#getDInt <em>DInt</em>}</li>
 *   <li>{@link AdministrationExample.impl.StaffImpl#getTreatment <em>Treatment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffImpl extends PersonImpl implements Staff {
	/**
	 * The default value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected int staffID = STAFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected double salary = SALARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShiftPlan() <em>Shift Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftPlan()
	 * @generated
	 * @ordered
	 */
	protected Shiftplan shiftPlan;

	/**
	 * The default value of the '{@link #getDInt() <em>DInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDInt()
	 * @generated
	 * @ordered
	 */
	protected static final int DINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDInt() <em>DInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDInt()
	 * @generated
	 * @ordered
	 */
	protected int dInt = DINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected EList<Treatment> treatment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdministrationExamplePackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStaffID() {
		return staffID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaffID(int newStaffID) {
		int oldStaffID = staffID;
		staffID = newStaffID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.STAFF__STAFF_ID,
					oldStaffID, staffID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.STAFF__SALARY, oldSalary,
					salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shiftplan getShiftPlan() {
		return shiftPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShiftPlan(Shiftplan newShiftPlan, NotificationChain msgs) {
		Shiftplan oldShiftPlan = shiftPlan;
		shiftPlan = newShiftPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdministrationExamplePackage.STAFF__SHIFT_PLAN, oldShiftPlan, newShiftPlan);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShiftPlan(Shiftplan newShiftPlan) {
		if (newShiftPlan != shiftPlan) {
			NotificationChain msgs = null;
			if (shiftPlan != null)
				msgs = ((InternalEObject) shiftPlan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdministrationExamplePackage.STAFF__SHIFT_PLAN, null, msgs);
			if (newShiftPlan != null)
				msgs = ((InternalEObject) newShiftPlan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdministrationExamplePackage.STAFF__SHIFT_PLAN, null, msgs);
			msgs = basicSetShiftPlan(newShiftPlan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.STAFF__SHIFT_PLAN,
					newShiftPlan, newShiftPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDInt() {
		return dInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDInt(int newDInt) {
		int oldDInt = dInt;
		dInt = newDInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.STAFF__DINT, oldDInt,
					dInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Treatment> getTreatment() {
		if (treatment == null) {
			treatment = new EObjectResolvingEList<Treatment>(Treatment.class, this,
					AdministrationExamplePackage.STAFF__TREATMENT);
		}
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdministrationExamplePackage.STAFF__SHIFT_PLAN:
			return basicSetShiftPlan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdministrationExamplePackage.STAFF__STAFF_ID:
			return getStaffID();
		case AdministrationExamplePackage.STAFF__SALARY:
			return getSalary();
		case AdministrationExamplePackage.STAFF__SHIFT_PLAN:
			return getShiftPlan();
		case AdministrationExamplePackage.STAFF__DINT:
			return getDInt();
		case AdministrationExamplePackage.STAFF__TREATMENT:
			return getTreatment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AdministrationExamplePackage.STAFF__STAFF_ID:
			setStaffID((Integer) newValue);
			return;
		case AdministrationExamplePackage.STAFF__SALARY:
			setSalary((Double) newValue);
			return;
		case AdministrationExamplePackage.STAFF__SHIFT_PLAN:
			setShiftPlan((Shiftplan) newValue);
			return;
		case AdministrationExamplePackage.STAFF__DINT:
			setDInt((Integer) newValue);
			return;
		case AdministrationExamplePackage.STAFF__TREATMENT:
			getTreatment().clear();
			getTreatment().addAll((Collection<? extends Treatment>) newValue);
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
		case AdministrationExamplePackage.STAFF__STAFF_ID:
			setStaffID(STAFF_ID_EDEFAULT);
			return;
		case AdministrationExamplePackage.STAFF__SALARY:
			setSalary(SALARY_EDEFAULT);
			return;
		case AdministrationExamplePackage.STAFF__SHIFT_PLAN:
			setShiftPlan((Shiftplan) null);
			return;
		case AdministrationExamplePackage.STAFF__DINT:
			setDInt(DINT_EDEFAULT);
			return;
		case AdministrationExamplePackage.STAFF__TREATMENT:
			getTreatment().clear();
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
		case AdministrationExamplePackage.STAFF__STAFF_ID:
			return staffID != STAFF_ID_EDEFAULT;
		case AdministrationExamplePackage.STAFF__SALARY:
			return salary != SALARY_EDEFAULT;
		case AdministrationExamplePackage.STAFF__SHIFT_PLAN:
			return shiftPlan != null;
		case AdministrationExamplePackage.STAFF__DINT:
			return dInt != DINT_EDEFAULT;
		case AdministrationExamplePackage.STAFF__TREATMENT:
			return treatment != null && !treatment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (staffID: ");
		result.append(staffID);
		result.append(", salary: ");
		result.append(salary);
		result.append(", dInt: ");
		result.append(dInt);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
