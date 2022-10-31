package AdministrationTransformRule.api.matches;

import AdministrationExample.Patient;
import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.rules.PatientCoveredRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>patientCovered()</code>.
 */
public class PatientCoveredMatch extends GraphTransformationMatch<PatientCoveredMatch, PatientCoveredRule> {
	private Shift varEarlyshift;
	private Shift varLateshift;
	private Shift varNightshift;
	private Patient varPatient;
	private Staff varS;
	private Staff varS1;
	private Shiftplan varShiftPlan;
	private Shiftplan varShiftPlan2;
	private Treatment varT;

	/**
	 * Creates a new match for the rule <code>patientCovered()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public PatientCoveredMatch(final PatientCoveredRule pattern, final IMatch match) {
		super(pattern, match);
		varEarlyshift = (Shift) match.get("earlyshift");
		varLateshift = (Shift) match.get("lateshift");
		varNightshift = (Shift) match.get("nightshift");
		varPatient = (Patient) match.get("patient");
		varS = (Staff) match.get("s");
		varS1 = (Staff) match.get("s1");
		varShiftPlan = (Shiftplan) match.get("shiftPlan");
		varShiftPlan2 = (Shiftplan) match.get("shiftPlan2");
		varT = (Treatment) match.get("t");
	}

	/**
	 * Returns the earlyshift.
	 *
	 * @return the earlyshift
	 */
	public Shift getEarlyshift() {
		return varEarlyshift;
	}

	/**
	 * Returns the lateshift.
	 *
	 * @return the lateshift
	 */
	public Shift getLateshift() {
		return varLateshift;
	}

	/**
	 * Returns the nightshift.
	 *
	 * @return the nightshift
	 */
	public Shift getNightshift() {
		return varNightshift;
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
	 * Returns the s.
	 *
	 * @return the s
	 */
	public Staff getS() {
		return varS;
	}

	/**
	 * Returns the s1.
	 *
	 * @return the s1
	 */
	public Staff getS1() {
		return varS1;
	}

	/**
	 * Returns the shiftPlan.
	 *
	 * @return the shiftPlan
	 */
	public Shiftplan getShiftPlan() {
		return varShiftPlan;
	}

	/**
	 * Returns the shiftPlan2.
	 *
	 * @return the shiftPlan2
	 */
	public Shiftplan getShiftPlan2() {
		return varShiftPlan2;
	}

	/**
	 * Returns the t.
	 *
	 * @return the t
	 */
	public Treatment getT() {
		return varT;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	earlyshift --> " + varEarlyshift + System.lineSeparator();
		s += "	lateshift --> " + varLateshift + System.lineSeparator();
		s += "	nightshift --> " + varNightshift + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	s --> " + varS + System.lineSeparator();
		s += "	s1 --> " + varS1 + System.lineSeparator();
		s += "	shiftPlan --> " + varShiftPlan + System.lineSeparator();
		s += "	shiftPlan2 --> " + varShiftPlan2 + System.lineSeparator();
		s += "	t --> " + varT + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
