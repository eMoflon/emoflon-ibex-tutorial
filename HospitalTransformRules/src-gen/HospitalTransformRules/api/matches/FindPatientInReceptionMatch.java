package HospitalTransformRules.api.matches;

import HospitalExample.Patient;
import HospitalExample.Reception;
import HospitalTransformRules.api.rules.FindPatientInReceptionPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findPatientInReception()</code>.
 */
public class FindPatientInReceptionMatch extends GraphTransformationMatch<FindPatientInReceptionMatch, FindPatientInReceptionPattern> {
	private Patient varPatient;
	private Reception varReception;

	/**
	 * Creates a new match for the pattern <code>findPatientInReception()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindPatientInReceptionMatch(final FindPatientInReceptionPattern pattern, final IMatch match) {
		super(pattern, match);
		varPatient = (Patient) match.get("patient");
		varReception = (Reception) match.get("reception");
	}

	/**
	 * Returns the patient.
	 *
	 * @return the patient
	 */
	public Patient getPatient() {
		return varPatient;
	}

	/**
	 * Returns the reception.
	 *
	 * @return the reception
	 */
	public Reception getReception() {
		return varReception;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	reception --> " + varReception + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
