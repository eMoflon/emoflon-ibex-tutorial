package HospitalTransformRules.api.matches;

import HospitalExample.Doctor;
import HospitalTransformRules.api.rules.FindDocWithPatientPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findDocWithPatient()</code>.
 */
public class FindDocWithPatientMatch extends GraphTransformationMatch<FindDocWithPatientMatch, FindDocWithPatientPattern> {
	private Doctor varSomedoctor;

	/**
	 * Creates a new match for the pattern <code>findDocWithPatient()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindDocWithPatientMatch(final FindDocWithPatientPattern pattern, final IMatch match) {
		super(pattern, match);
		varSomedoctor = (Doctor) match.get("somedoctor");
	}

	/**
	 * Returns the somedoctor.
	 *
	 * @return the somedoctor
	 */
	public Doctor getSomedoctor() {
		return varSomedoctor;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	somedoctor --> " + varSomedoctor + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
