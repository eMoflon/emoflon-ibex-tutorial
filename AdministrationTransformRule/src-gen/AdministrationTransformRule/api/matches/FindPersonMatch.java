package AdministrationTransformRule.api.matches;

import AdministrationExample.Person;
import AdministrationTransformRule.api.rules.FindPersonPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findPerson()</code>.
 */
public class FindPersonMatch extends GraphTransformationMatch<FindPersonMatch, FindPersonPattern> {
	private Person varPerson;

	/**
	 * Creates a new match for the pattern <code>findPerson()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindPersonMatch(final FindPersonPattern pattern, final IMatch match) {
		super(pattern, match);
		varPerson = (Person) match.get("person");
	}

	/**
	 * Returns the person.
	 *
	 * @return the person
	 */
	public Person getPerson() {
		return varPerson;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	person --> " + varPerson + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
