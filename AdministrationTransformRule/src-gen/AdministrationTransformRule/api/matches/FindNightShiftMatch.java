package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.FindNightShiftPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findNightShift()</code>.
 */
public class FindNightShiftMatch extends GraphTransformationMatch<FindNightShiftMatch, FindNightShiftPattern> {
	private Shift varNightshift;

	/**
	 * Creates a new match for the pattern <code>findNightShift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindNightShiftMatch(final FindNightShiftPattern pattern, final IMatch match) {
		super(pattern, match);
		varNightshift = (Shift) match.get("nightshift");
	}

	/**
	 * Returns the nightshift.
	 *
	 * @return the nightshift
	 */
	public Shift getNightshift() {
		return varNightshift;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	nightshift --> " + varNightshift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
