package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.rules.EarlyshiftRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>earlyshift()</code>.
 */
public class EarlyshiftMatch extends GraphTransformationMatch<EarlyshiftMatch, EarlyshiftRule> {
	private Shift varEarlyshift;
	private Shift varShift;

	/**
	 * Creates a new match for the rule <code>earlyshift()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public EarlyshiftMatch(final EarlyshiftRule pattern, final IMatch match) {
		super(pattern, match);
		varEarlyshift = (Shift) match.get("earlyshift");
		varShift = (Shift) match.get("shift");
	}

	/**
	 * Returns the earlyshift.
	 *
	 * @return the earlyshift
	 */
	public Shift getEarlyshift() {
		return varEarlyshift;
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
		s += "	earlyshift --> " + varEarlyshift + System.lineSeparator();
		s += "	shift --> " + varShift + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
