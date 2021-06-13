/**
 */
package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.Medication;
import AdministrationExample.Treatment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.impl.TreatmentImpl#getMedication <em>Medication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreatmentImpl extends EObjectImpl implements Treatment {
	/**
	 * The default value of the '{@link #getMedication() <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected static final Medication MEDICATION_EDEFAULT = Medication.WEAK;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected Medication medication = MEDICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdministrationExamplePackage.Literals.TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medication getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedication(Medication newMedication) {
		Medication oldMedication = medication;
		medication = newMedication == null ? MEDICATION_EDEFAULT : newMedication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.TREATMENT__MEDICATION,
					oldMedication, medication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdministrationExamplePackage.TREATMENT__MEDICATION:
			return getMedication();
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
		case AdministrationExamplePackage.TREATMENT__MEDICATION:
			setMedication((Medication) newValue);
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
		case AdministrationExamplePackage.TREATMENT__MEDICATION:
			setMedication(MEDICATION_EDEFAULT);
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
		case AdministrationExamplePackage.TREATMENT__MEDICATION:
			return medication != MEDICATION_EDEFAULT;
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
		result.append(" (medication: ");
		result.append(medication);
		result.append(')');
		return result.toString();
	}

} //TreatmentImpl
