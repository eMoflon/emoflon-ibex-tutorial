package HospitalTransformRules.api.matches;

import HospitalExample.Hospital;
import HospitalExample.Reception;
import HospitalTransformRules.api.rules.ReceptionRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>reception()</code>.
 */
public class ReceptionMatch extends GraphTransformationMatch<ReceptionMatch, ReceptionRule> {
	private Hospital varHospital;
	private Reception varReception;

	/**
	 * Creates a new match for the rule <code>reception()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ReceptionMatch(final ReceptionRule pattern, final IMatch match) {
		super(pattern, match);
		varHospital = (Hospital) match.get("hospital");
		varReception = (Reception) match.get("reception");
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
	 * Returns the reception.
	 *
	 * @return the reception
	 */
	public Reception getReception() {
		return varReception;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	reception --> " + varReception + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
