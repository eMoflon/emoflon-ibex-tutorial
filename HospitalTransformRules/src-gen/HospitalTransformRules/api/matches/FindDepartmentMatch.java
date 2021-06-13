package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalTransformRules.api.rules.FindDepartmentPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findDepartment()</code>.
 */
public class FindDepartmentMatch extends GraphTransformationMatch<FindDepartmentMatch, FindDepartmentPattern> {
	private Department varDepartment;

	/**
	 * Creates a new match for the pattern <code>findDepartment()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindDepartmentMatch(final FindDepartmentPattern pattern, final IMatch match) {
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
