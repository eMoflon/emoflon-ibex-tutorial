package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalTransformRules.api.rules.FindDepartmentWithoutDoctorPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findDepartmentWithoutDoctor()</code>.
 */
public class FindDepartmentWithoutDoctorMatch extends GraphTransformationMatch<FindDepartmentWithoutDoctorMatch, FindDepartmentWithoutDoctorPattern> {
	private Department varDepartment;

	/**
	 * Creates a new match for the pattern <code>findDepartmentWithoutDoctor()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindDepartmentWithoutDoctorMatch(final FindDepartmentWithoutDoctorPattern pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
	}

	/**
	 * Returns the department.
	 *
	 * @return the department
	 */
	public Department getDepartment() {
		return varDepartment;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
