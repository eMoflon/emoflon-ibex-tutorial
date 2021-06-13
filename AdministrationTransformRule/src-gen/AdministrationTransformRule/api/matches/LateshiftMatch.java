package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.LateshiftRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>lateshift()</code>.
 */
public class LateshiftMatch extends GraphTransformationMatch<LateshiftMatch, LateshiftRule> {
	private Shift varLateshift;
	private Shift varShift;

	/**
	 * Creates a new match for the rule <code>lateshift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public LateshiftMatch(final LateshiftRule pattern, final IMatch match) {
		super(pattern, match);
		varLateshift = (Shift) match.get("lateshift");
		varShift = (Shift) match.get("shift");
	}

	/**
	 * Returns the lateshift.
	 *
	 * @return the lateshift
	 */
	public Shift getLateshift() {
		return varLateshift;
	}

	/**
	 * Returns the shift.
	 *
	 * @return the shift
	 */
	public Shift getShift() {
		return varShift;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	lateshift --> " + varLateshift + System.lineSeparator();
		s += "	shift --> " + varShift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
