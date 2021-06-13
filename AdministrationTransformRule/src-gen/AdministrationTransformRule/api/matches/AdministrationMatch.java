package AdministrationTransformRule.api.matches;

import AdministrationExample.Administration;
import AdministrationTransformRule.api.rules.AdministrationRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>administration()</code>.
 */
public class AdministrationMatch extends GraphTransformationMatch<AdministrationMatch, AdministrationRule> {
	private Administration varAdministration;

	/**
	 * Creates a new match for the rule <code>administration()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AdministrationMatch(final AdministrationRule pattern, final IMatch match) {
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
