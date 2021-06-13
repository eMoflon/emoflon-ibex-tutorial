package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Hospital;
import HospitalTransformRules.api.rules.DoctorRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>doctor(capacity, name, staffID)</code>.
 */
public class DoctorMatch extends GraphTransformationMatch<DoctorMatch, DoctorRule> {
	private Department varDepartment;
	private Hospital varHospital;
	private Doctor varStaff;

	/**
	 * Creates a new match for the rule <code>doctor(capacity, name, staffID)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public DoctorMatch(final DoctorRule pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varHospital = (Hospital) match.get("hospital");
		varStaff = (Doctor) match.get("staff");
	}

	/**
	 * Returns the department.
	 *
	 * @return the department
	 */
	public Department getDepartment() {
		return varDepartment;
	}

	/**
	 * Returns the hospital.
	 *
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return varHospital;
	}

	/**
	 * Returns the staff.
	 *
	 * @return the staff
	 */
	public Doctor getStaff() {
		return varStaff;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	staff --> " + varStaff + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
