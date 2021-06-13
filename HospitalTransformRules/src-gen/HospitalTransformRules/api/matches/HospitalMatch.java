package HospitalTransformRules.api.matches;

import HospitalExample.Hospital;
import HospitalTransformRules.api.rules.HospitalRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>hospital()</code>.
 */
public class HospitalMatch extends GraphTransformationMatch<HospitalMatch, HospitalRule> {
	private Hospital varHospital;

	/**
	 * Creates a new match for the rule <code>hospital()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public HospitalMatch(final HospitalRule pattern, final IMatch match) {
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
