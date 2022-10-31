package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.FindLateShiftPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findLateShift()</code>.
 */
public class FindLateShiftMatch extends GraphTransformationMatch<FindLateShiftMatch, FindLateShiftPattern> {
	private Shift varLateshift;

	/**
	 * Creates a new match for the pattern <code>findLateShift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindLateShiftMatch(final FindLateShiftPattern pattern, final IMatch match) {
		super(pattern, match);
		varLateshift = (Shift) match.get("lateshift");
	}

	/**
	 * Returns the lateshift.
	 *
	 * @return the lateshift
	 */
	public Shift getLateshift() {
		return varLateshift;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	lateshift --> " + varLateshift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
