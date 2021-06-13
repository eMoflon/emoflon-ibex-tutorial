/**
 */
package AdministrationExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Treatment#getMedication <em>Medication</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getTreatment()
 * @model
 * @generated
 */
public interface Treatment extends EObject {
	/**
	 * Returns the value of the '<em><b>Medication</b></em>' attribute.
	 * The literals are from the enumeration {@link AdministrationExample.Medication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' attribute.
	 * @see AdministrationExample.Medication
	 * @see #setMedication(Medication)
	 * @see AdministrationExample.AdministrationExamplePackage#getTreatment_Medication()
	 * @model
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link AdministrationExample.Treatment#getMedication <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' attribute.
	 * @see AdministrationExample.Medication
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Medication value);

} // Treatment
