package HospitalTransformRules.api.matches;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalTransformRules.api.rules.FindPatientWithDocPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findPatientWithDoc()</code>.
 */
public class FindPatientWithDocMatch extends GraphTransformationMatch<FindPatientWithDocMatch, FindPatientWithDocPattern> {
	private Patient varPatient;
	private Doctor varSomedoctor;

	/**
	 * Creates a new match for the pattern <code>findPatientWithDoc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindPatientWithDocMatch(final FindPatientWithDocPattern pattern, final IMatch match) {
		super(pattern, match);
		varPatient = (Patient) match.get("patient");
		varSomedoctor = (Doctor) match.get("somedoctor");
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
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	somedoctor --> " + varSomedoctor + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
