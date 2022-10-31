package AdministrationTransformRule.api.matches;

import AdministrationExample.Shiftplan;
import AdministrationTransformRule.api.rules.FindShiftplanPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findShiftplan()</code>.
 */
public class FindShiftplanMatch extends GraphTransformationMatch<FindShiftplanMatch, FindShiftplanPattern> {
	private Shiftplan varShiftlpan;

	/**
	 * Creates a new match for the pattern <code>findShiftplan()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindShiftplanMatch(final FindShiftplanPattern pattern, final IMatch match) {
		super(pattern, match);
		varShiftlpan = (Shiftplan) match.get("shiftlpan");
	}

	/**
	 * Returns the shiftlpan.
	 *
	 * @return the shiftlpan
	 */
	public Shiftplan getShiftlpan() {
		return varShiftlpan;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	shiftlpan --> " + varShiftlpan + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
