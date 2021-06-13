package AdministrationTransformRule.api.matches;

import AdministrationExample.Staff;
import AdministrationTransformRule.api.rules.FindStaffPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findStaff()</code>.
 */
public class FindStaffMatch extends GraphTransformationMatch<FindStaffMatch, FindStaffPattern> {
	private Staff varStaff;

	/**
	 * Creates a new match for the pattern <code>findStaff()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindStaffMatch(final FindStaffPattern pattern, final IMatch match) {
		super(pattern, match);
		varStaff = (Staff) match.get("staff");
	}

	/**
	 * Returns the staff.
	 *
	 * @return the staff
	 */
	public Staff getStaff() {
		return varStaff;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	staff --> " + varStaff + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
