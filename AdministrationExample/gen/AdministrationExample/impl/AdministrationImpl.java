/**
 */
package AdministrationExample.impl;

import AdministrationExample.Administration;
import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.Patient;
import AdministrationExample.Staff;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.impl.AdministrationImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link AdministrationExample.impl.AdministrationImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrationImpl extends EObjectImpl implements Administration {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdministrationExamplePackage.Literals.ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Staff>(Staff.class, this,
					AdministrationExamplePackage.ADMINISTRATION__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatient() {
		if (patient == null) {
			patient = new EObjectContainmentEList<Patient>(Patient.class, this,
					AdministrationExamplePackage.ADMINISTRATION__PATIENT);
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdministrationExamplePackage.ADMINISTRATION__STAFF:
			return ((InternalEList<?>) getStaff()).basicRemove(otherEnd, msgs);
		case AdministrationExamplePackage.ADMINISTRATION__PATIENT:
			return ((InternalEList<?>) getPatient()).basicRemove(otherEnd, msgs);
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
		case AdministrationExamplePackage.ADMINISTRATION__STAFF:
			return getStaff();
		case AdministrationExamplePackage.ADMINISTRATION__PATIENT:
			return getPatient();
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
		case AdministrationExamplePackage.ADMINISTRATION__STAFF:
			getStaff().clear();
			getStaff().addAll((Collection<? extends Staff>) newValue);
			return;
		case AdministrationExamplePackage.ADMINISTRATION__PATIENT:
			getPatient().clear();
			getPatient().addAll((Collection<? extends Patient>) newValue);
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
		case AdministrationExamplePackage.ADMINISTRATION__STAFF:
			getStaff().clear();
			return;
		case AdministrationExamplePackage.ADMINISTRATION__PATIENT:
			getPatient().clear();
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
		case AdministrationExamplePackage.ADMINISTRATION__STAFF:
			return staff != null && !staff.isEmpty();
		case AdministrationExamplePackage.ADMINISTRATION__PATIENT:
			return patient != null && !patient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdministrationImpl
