package HospitalTransformRules.api.matches;

import HospitalExample.Nurse;
import HospitalTransformRules.api.rules.FindNursePattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findNurse()</code>.
 */
public class FindNurseMatch extends GraphTransformationMatch<FindNurseMatch, FindNursePattern> {
	private Nurse varNurse;

	/**
	 * Creates a new match for the pattern <code>findNurse()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindNurseMatch(final FindNursePattern pattern, final IMatch match) {
		super(pattern, match);
		varNurse = (Nurse) match.get("nurse");
	}

	/**
	 * Returns the nurse.
	 *
	 * @return the nurse
	 */
	public Nurse getNurse() {
		return varNurse;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	nurse --> " + varNurse + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
