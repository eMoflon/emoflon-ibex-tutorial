package AdministrationTransformRule.api.matches;

import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.rules.StaffRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>staff(time1, time2)</code>.
 */
public class StaffMatch extends GraphTransformationMatch<StaffMatch, StaffRule> {
	private Treatment varTreatment;
	private Staff varPerson;
	private Shift varShift;
	private Shift varShift2;
	private Shiftplan varShiftPlan;

	/**
	 * Creates a new match for the rule <code>staff(time1, time2)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public StaffMatch(final StaffRule pattern, final IMatch match) {
		super(pattern, match);
		varTreatment = (Treatment) match.get("treatment");
		varPerson = (Staff) match.get("person");
		varShift = (Shift) match.get("shift");
		varShift2 = (Shift) match.get("shift2");
		varShiftPlan = (Shiftplan) match.get("shiftPlan");
	}

	/**
	 * Returns the treatment.
	 *
	 * @return the treatment
	 */
	public Treatment getTreatment() {
		return varTreatment;
	}

	/**
	 * Returns the person.
	 *
	 * @return the person
	 */
	public Staff getPerson() {
		return varPerson;
	}

	/**
	 * Returns the shift.
	 *
	 * @return the shift
	 */
	public Shift getShift() {
		return varShift;
	}

	/**
	 * Returns the shift2.
	 *
	 * @return the shift2
	 */
	public Shift getShift2() {
		return varShift2;
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
		s += "	treatment --> " + varTreatment + System.lineSeparator();
		s += "	person --> " + varPerson + System.lineSeparator();
		s += "	shift --> " + varShift + System.lineSeparator();
		s += "	shift2 --> " + varShift2 + System.lineSeparator();
		s += "	shiftPlan --> " + varShiftPlan + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
