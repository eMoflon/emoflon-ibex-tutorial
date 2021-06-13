package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalTransformRules.api.rules.DepartmentRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>department(dID, maxRoomCount)</code>.
 */
public class DepartmentMatch extends GraphTransformationMatch<DepartmentMatch, DepartmentRule> {
	private Hospital varHospital;
	private Department varDepartment;

	/**
	 * Creates a new match for the rule <code>department(dID, maxRoomCount)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public DepartmentMatch(final DepartmentRule pattern, final IMatch match) {
		super(pattern, match);
		varHospital = (Hospital) match.get("hospital");
		varDepartment = (Department) match.get("department");
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
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
