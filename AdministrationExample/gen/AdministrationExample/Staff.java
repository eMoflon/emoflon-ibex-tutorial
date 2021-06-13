/**
 */
package AdministrationExample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AdministrationExample.Staff#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link AdministrationExample.Staff#getSalary <em>Salary</em>}</li>
 *   <li>{@link AdministrationExample.Staff#getShiftPlan <em>Shift Plan</em>}</li>
 *   <li>{@link AdministrationExample.Staff#getDInt <em>DInt</em>}</li>
 *   <li>{@link AdministrationExample.Staff#getTreatment <em>Treatment</em>}</li>
 * </ul>
 *
 * @see AdministrationExample.AdministrationExamplePackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends Person {
	/**
	 * Returns the value of the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff ID</em>' attribute.
	 * @see #setStaffID(int)
	 * @see AdministrationExample.AdministrationExamplePackage#getStaff_StaffID()
	 * @model required="true"
	 * @generated
	 */
	int getStaffID();

	/**
	 * Sets the value of the '{@link AdministrationExample.Staff#getStaffID <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff ID</em>' attribute.
	 * @see #getStaffID()
	 * @generated
	 */
	void setStaffID(int value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see AdministrationExample.AdministrationExamplePackage#getStaff_Salary()
	 * @model
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link AdministrationExample.Staff#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

	/**
	 * Returns the value of the '<em><b>Shift Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Plan</em>' containment reference.
	 * @see #setShiftPlan(Shiftplan)
	 * @see AdministrationExample.AdministrationExamplePackage#getStaff_ShiftPlan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Shiftplan getShiftPlan();

	/**
	 * Sets the value of the '{@link AdministrationExample.Staff#getShiftPlan <em>Shift Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Plan</em>' containment reference.
	 * @see #getShiftPlan()
	 * @generated
	 */
	void setShiftPlan(Shiftplan value);

	/**
	 * Returns the value of the '<em><b>DInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DInt</em>' attribute.
	 * @see #setDInt(int)
	 * @see AdministrationExample.AdministrationExamplePackage#getStaff_DInt()
	 * @model required="true"
	 * @generated
	 */
	int getDInt();

	/**
	 * Sets the value of the '{@link AdministrationExample.Staff#getDInt <em>DInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DInt</em>' attribute.
	 * @see #getDInt()
	 * @generated
	 */
	void setDInt(int value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference list.
	 * The list contents are of type {@link AdministrationExample.Treatment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference list.
	 * @see AdministrationExample.AdministrationExamplePackage#getStaff_Treatment()
	 * @model
	 * @generated
	 */
	EList<Treatment> getTreatment();

} // Staff
