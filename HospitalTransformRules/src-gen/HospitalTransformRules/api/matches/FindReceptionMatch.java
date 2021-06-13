package HospitalTransformRules.api.matches;

import HospitalExample.Reception;
import HospitalTransformRules.api.rules.FindReceptionPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findReception()</code>.
 */
public class FindReceptionMatch extends GraphTransformationMatch<FindReceptionMatch, FindReceptionPattern> {
	private Reception varReception;

	/**
	 * Creates a new match for the pattern <code>findReception()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindReceptionMatch(final FindReceptionPattern pattern, final IMatch match) {
		super(pattern, match);
		varReception = (Reception) match.get("reception");
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
		s += "	reception --> " + varReception + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
