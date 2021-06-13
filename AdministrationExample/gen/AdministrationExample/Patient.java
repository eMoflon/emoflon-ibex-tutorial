/**
 */
package AdministrationExample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Patient#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link AdministrationExample.Patient#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link AdministrationExample.Patient#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends Person {
	/**
	 * Returns the value of the '<em><b>Patient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient ID</em>' attribute.
	 * @see #setPatientID(int)
	 * @see AdministrationExample.AdministrationExamplePackage#getPatient_PatientID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getPatientID();

	/**
	 * Sets the value of the '{@link AdministrationExample.Patient#getPatientID <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient ID</em>' attribute.
	 * @see #getPatientID()
	 * @generated
	 */
	void setPatientID(int value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' containment reference.
	 * @see #setTreatment(Treatment)
	 * @see AdministrationExample.AdministrationExamplePackage#getPatient_Treatment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Treatment getTreatment();

	/**
	 * Sets the value of the '{@link AdministrationExample.Patient#getTreatment <em>Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' containment reference.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(Treatment value);

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link AdministrationExample.Shiftplan}.
	 * It is bidirectional and its opposite is '{@link AdministrationExample.Shiftplan#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getPatient_CoveredBy()
	 * @see AdministrationExample.Shiftplan#getCovers
	 * @model opposite="covers"
	 * @generated
	 */
	EList<Shiftplan> getCoveredBy();

} // Patient
