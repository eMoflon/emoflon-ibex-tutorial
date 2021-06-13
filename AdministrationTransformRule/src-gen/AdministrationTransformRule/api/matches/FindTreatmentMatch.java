package AdministrationTransformRule.api.matches;

import AdministrationExample.Staff;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.rules.FindTreatmentPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findTreatment()</code>.
 */
public class FindTreatmentMatch extends GraphTransformationMatch<FindTreatmentMatch, FindTreatmentPattern> {
	private Staff varSomeStaff;
	private Treatment varTreatment;

	/**
	 * Creates a new match for the pattern <code>findTreatment()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindTreatmentMatch(final FindTreatmentPattern pattern, final IMatch match) {
		super(pattern, match);
		varSomeStaff = (Staff) match.get("someStaff");
		varTreatment = (Treatment) match.get("treatment");
	}

	/**
	 * Returns the someStaff.
	 *
	 * @return the someStaff
	 */
	public Staff getSomeStaff() {
		return varSomeStaff;
	}

	/**
	 * Returns the treatment.
	 *
	 * @return the treatment
	 */
	public Treatment getTreatment() {
		return varTreatment;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	someStaff --> " + varSomeStaff + System.lineSeparator();
		s += "	treatment --> " + varTreatment + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
