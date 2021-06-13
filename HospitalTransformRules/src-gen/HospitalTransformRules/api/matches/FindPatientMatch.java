package HospitalTransformRules.api.matches;

import HospitalExample.Patient;
import HospitalTransformRules.api.rules.FindPatientPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findPatient()</code>.
 */
public class FindPatientMatch extends GraphTransformationMatch<FindPatientMatch, FindPatientPattern> {
	private Patient varPatient;

	/**
	 * Creates a new match for the pattern <code>findPatient()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindPatientMatch(final FindPatientPattern pattern, final IMatch match) {
		super(pattern, match);
		varPatient = (Patient) match.get("patient");
	}

	/**
	 * Returns the patient.
	 *
	 * @return the patient
	 */
	public Patient getPatient() {
		return varPatient;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
