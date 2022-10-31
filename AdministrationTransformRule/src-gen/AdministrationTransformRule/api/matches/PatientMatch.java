package AdministrationTransformRule.api.matches;

import AdministrationExample.Patient;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.rules.PatientRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>patient()</code>.
 */
public class PatientMatch extends GraphTransformationMatch<PatientMatch, PatientRule> {
	private Treatment varT;
	private Patient varPerson;

	/**
	 * Creates a new match for the rule <code>patient()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PatientMatch(final PatientRule pattern, final IMatch match) {
		super(pattern, match);
		varT = (Treatment) match.get("t");
		varPerson = (Patient) match.get("person");
	}

	/**
	 * Returns the t.
	 *
	 * @return the t
	 */
	public Treatment getT() {
		return varT;
	}

	/**
	 * Returns the person.
	 *
	 * @return the person
	 */
	public Patient getPerson() {
		return varPerson;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "	person --> " + varPerson + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
