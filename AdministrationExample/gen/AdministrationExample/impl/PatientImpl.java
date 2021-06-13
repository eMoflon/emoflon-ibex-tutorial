/**
 */
package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.Patient;
import AdministrationExample.Shiftplan;
import AdministrationExample.Treatment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.impl.PatientImpl#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link AdministrationExample.impl.PatientImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link AdministrationExample.impl.PatientImpl#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends PersonImpl implements Patient {
	/**
	 * The default value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected int patientID = PATIENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected Treatment treatment;

	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Shiftplan> coveredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdministrationExamplePackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatientID() {
		return patientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientID(int newPatientID) {
		int oldPatientID = patientID;
		patientID = newPatientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.PATIENT__PATIENT_ID,
					oldPatientID, patientID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Treatment getTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreatment(Treatment newTreatment, NotificationChain msgs) {
		Treatment oldTreatment = treatment;
		treatment = newTreatment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdministrationExamplePackage.PATIENT__TREATMENT, oldTreatment, newTreatment);
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
	public void setTreatment(Treatment newTreatment) {
		if (newTreatment != treatment) {
			NotificationChain msgs = null;
			if (treatment != null)
				msgs = ((InternalEObject) treatment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdministrationExamplePackage.PATIENT__TREATMENT, null, msgs);
			if (newTreatment != null)
				msgs = ((InternalEObject) newTreatment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdministrationExamplePackage.PATIENT__TREATMENT, null, msgs);
			msgs = basicSetTreatment(newTreatment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdministrationExamplePackage.PATIENT__TREATMENT,
					newTreatment, newTreatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shiftplan> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<Shiftplan>(Shiftplan.class, this,
					AdministrationExamplePackage.PATIENT__COVERED_BY, AdministrationExamplePackage.SHIFTPLAN__COVERS);
		}
		return coveredBy;
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
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCoveredBy()).basicAdd(otherEnd, msgs);
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
		case AdministrationExamplePackage.PATIENT__TREATMENT:
			return basicSetTreatment(null, msgs);
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			return ((InternalEList<?>) getCoveredBy()).basicRemove(otherEnd, msgs);
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
		case AdministrationExamplePackage.PATIENT__PATIENT_ID:
			return getPatientID();
		case AdministrationExamplePackage.PATIENT__TREATMENT:
			return getTreatment();
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			return getCoveredBy();
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
		case AdministrationExamplePackage.PATIENT__PATIENT_ID:
			setPatientID((Integer) newValue);
			return;
		case AdministrationExamplePackage.PATIENT__TREATMENT:
			setTreatment((Treatment) newValue);
			return;
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			getCoveredBy().clear();
			getCoveredBy().addAll((Collection<? extends Shiftplan>) newValue);
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
		case AdministrationExamplePackage.PATIENT__PATIENT_ID:
			setPatientID(PATIENT_ID_EDEFAULT);
			return;
		case AdministrationExamplePackage.PATIENT__TREATMENT:
			setTreatment((Treatment) null);
			return;
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			getCoveredBy().clear();
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
		case AdministrationExamplePackage.PATIENT__PATIENT_ID:
			return patientID != PATIENT_ID_EDEFAULT;
		case AdministrationExamplePackage.PATIENT__TREATMENT:
			return treatment != null;
		case AdministrationExamplePackage.PATIENT__COVERED_BY:
			return coveredBy != null && !coveredBy.isEmpty();
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
		result.append(" (patientID: ");
		result.append(patientID);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
