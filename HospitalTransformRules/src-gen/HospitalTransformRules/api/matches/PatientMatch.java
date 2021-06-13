package HospitalTransformRules.api.matches;

import HospitalExample.Hospital;
import HospitalExample.Patient;
import HospitalExample.Reception;
import HospitalTransformRules.api.rules.PatientRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>patient(name, patientId, level)</code>.
 */
public class PatientMatch extends GraphTransformationMatch<PatientMatch, PatientRule> {
	private Hospital varHospital;
	private Reception varReception;
	private Patient varPatient;

	/**
	 * Creates a new match for the rule <code>patient(name, patientId, level)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PatientMatch(final PatientRule pattern, final IMatch match) {
		super(pattern, match);
		varHospital = (Hospital) match.get("hospital");
		varReception = (Reception) match.get("reception");
		varPatient = (Patient) match.get("patient");
	}

	/**
	 * Returns the hospital.
	 *
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return varHospital;
	}

	/**
	 * Returns the reception.
	 *
	 * @return the reception
	 */
	public Reception getReception() {
		return varReception;
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
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	reception --> " + varReception + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
