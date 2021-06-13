package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalTransformRules.api.rules.DoctorInDepartmentPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>doctorInDepartment()</code>.
 */
public class DoctorInDepartmentMatch extends GraphTransformationMatch<DoctorInDepartmentMatch, DoctorInDepartmentPattern> {
	private Department varDepartment;
	private Doctor varSomeDoctor;

	/**
	 * Creates a new match for the pattern <code>doctorInDepartment()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public DoctorInDepartmentMatch(final DoctorInDepartmentPattern pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varSomeDoctor = (Doctor) match.get("someDoctor");
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
	 * Returns the someDoctor.
	 *
	 * @return the someDoctor
	 */
	public Doctor getSomeDoctor() {
		return varSomeDoctor;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	someDoctor --> " + varSomeDoctor + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
