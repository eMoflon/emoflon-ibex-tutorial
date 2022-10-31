package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.NightshiftRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>nightshift()</code>.
 */
public class NightshiftMatch extends GraphTransformationMatch<NightshiftMatch, NightshiftRule> {
	private Shift varNightshift;
	private Shift varShift;

	/**
	 * Creates a new match for the rule <code>nightshift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public NightshiftMatch(final NightshiftRule pattern, final IMatch match) {
		super(pattern, match);
		varNightshift = (Shift) match.get("nightshift");
		varShift = (Shift) match.get("shift");
	}

	/**
	 * Returns the nightshift.
	 *
	 * @return the nightshift
	 */
	public Shift getNightshift() {
		return varNightshift;
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
		s += "	nightshift --> " + varNightshift + System.lineSeparator();
		s += "	shift --> " + varShift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
