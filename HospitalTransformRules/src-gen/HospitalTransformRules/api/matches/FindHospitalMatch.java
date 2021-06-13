package HospitalTransformRules.api.matches;

import HospitalExample.Hospital;
import HospitalTransformRules.api.rules.FindHospitalPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findHospital()</code>.
 */
public class FindHospitalMatch extends GraphTransformationMatch<FindHospitalMatch, FindHospitalPattern> {
	private Hospital varHospital;

	/**
	 * Creates a new match for the pattern <code>findHospital()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindHospitalMatch(final FindHospitalPattern pattern, final IMatch match) {
		super(pattern, match);
		varHospital = (Hospital) match.get("hospital");
	}

	/**
	 * Returns the hospital.
	 *
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return varHospital;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
