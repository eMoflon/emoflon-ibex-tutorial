/**
 */
package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.Patient;
import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shiftplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.impl.ShiftplanImpl#getCovers <em>Covers</em>}</li>
 *   <li>{@link AdministrationExample.impl.ShiftplanImpl#getShifts <em>Shifts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftplanImpl extends EObjectImpl implements Shiftplan {
	/**
	 * The cached value of the '{@link #getCovers() <em>Covers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovers()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> covers;

	/**
	 * The cached value of the '{@link #getShifts() <em>Shifts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<Shift> shifts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdministrationExamplePackage.Literals.SHIFTPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getCovers() {
		if (covers == null) {
			covers = new EObjectWithInverseResolvingEList.ManyInverse<Patient>(Patient.class, this,
					AdministrationExamplePackage.SHIFTPLAN__COVERS, AdministrationExamplePackage.PATIENT__COVERED_BY);
		}
		return covers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shift> getShifts() {
		if (shifts == null) {
			shifts = new EObjectContainmentEList<Shift>(Shift.class, this,
					AdministrationExamplePackage.SHIFTPLAN__SHIFTS);
		}
		return shifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			return ((InternalEList<?>) getCovers()).basicRemove(otherEnd, msgs);
		case AdministrationExamplePackage.SHIFTPLAN__SHIFTS:
			return ((InternalEList<?>) getShifts()).basicRemove(otherEnd, msgs);
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
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			return getCovers();
		case AdministrationExamplePackage.SHIFTPLAN__SHIFTS:
			return getShifts();
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
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			getCovers().clear();
			getCovers().addAll((Collection<? extends Patient>) newValue);
			return;
		case AdministrationExamplePackage.SHIFTPLAN__SHIFTS:
			getShifts().clear();
			getShifts().addAll((Collection<? extends Shift>) newValue);
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
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			getCovers().clear();
			return;
		case AdministrationExamplePackage.SHIFTPLAN__SHIFTS:
			getShifts().clear();
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
		case AdministrationExamplePackage.SHIFTPLAN__COVERS:
			return covers != null && !covers.isEmpty();
		case AdministrationExamplePackage.SHIFTPLAN__SHIFTS:
			return shifts != null && !shifts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShiftplanImpl
