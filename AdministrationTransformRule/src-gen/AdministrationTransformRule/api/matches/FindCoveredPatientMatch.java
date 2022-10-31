package AdministrationTransformRule.api.matches;

import AdministrationExample.Patient;
import AdministrationExample.Shiftplan;
import AdministrationTransformRule.api.rules.FindCoveredPatientPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findCoveredPatient()</code>.
 */
public class FindCoveredPatientMatch extends GraphTransformationMatch<FindCoveredPatientMatch, FindCoveredPatientPattern> {
	private Patient varPatient;
	private Shiftplan varShiftPlan;

	/**
	 * Creates a new match for the pattern <code>findCoveredPatient()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindCoveredPatientMatch(final FindCoveredPatientPattern pattern, final IMatch match) {
		super(pattern, match);
		varPatient = (Patient) match.get("patient");
		varShiftPlan = (Shiftplan) match.get("shiftPlan");
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
	 * Returns the shiftPlan.
	 *
	 * @return the shiftPlan
	 */
	public Shiftplan getShiftPlan() {
		return varShiftPlan;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	shiftPlan --> " + varShiftPlan + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
