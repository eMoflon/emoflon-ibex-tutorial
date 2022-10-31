package AdministrationTransformRule.api.matches;

import AdministrationExample.Administration;
import AdministrationTransformRule.api.rules.FindAdministrationPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findAdministration()</code>.
 */
public class FindAdministrationMatch extends GraphTransformationMatch<FindAdministrationMatch, FindAdministrationPattern> {
	private Administration varAdministration;

	/**
	 * Creates a new match for the pattern <code>findAdministration()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindAdministrationMatch(final FindAdministrationPattern pattern, final IMatch match) {
		super(pattern, match);
		varAdministration = (Administration) match.get("administration");
	}

	/**
	 * Returns the administration.
	 *
	 * @return the administration
	 */
	public Administration getAdministration() {
		return varAdministration;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	administration --> " + varAdministration + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
