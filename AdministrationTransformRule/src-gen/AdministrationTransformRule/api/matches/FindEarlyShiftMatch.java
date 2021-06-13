package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.FindEarlyShiftPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findEarlyShift()</code>.
 */
public class FindEarlyShiftMatch extends GraphTransformationMatch<FindEarlyShiftMatch, FindEarlyShiftPattern> {
	private Shift varEarlyshift;

	/**
	 * Creates a new match for the pattern <code>findEarlyShift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindEarlyShiftMatch(final FindEarlyShiftPattern pattern, final IMatch match) {
		super(pattern, match);
		varEarlyshift = (Shift) match.get("earlyshift");
	}

	/**
	 * Returns the earlyshift.
	 *
	 * @return the earlyshift
	 */
	public Shift getEarlyshift() {
		return varEarlyshift;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	earlyshift --> " + varEarlyshift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
