package HospitalTransformRules.api.matches;

import HospitalExample.Doctor;
import HospitalTransformRules.api.rules.FindDoctorPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findDoctor()</code>.
 */
public class FindDoctorMatch extends GraphTransformationMatch<FindDoctorMatch, FindDoctorPattern> {
	private Doctor varDoctor;

	/**
	 * Creates a new match for the pattern <code>findDoctor()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindDoctorMatch(final FindDoctorPattern pattern, final IMatch match) {
		super(pattern, match);
		varDoctor = (Doctor) match.get("doctor");
	}

	/**
	 * Returns the doctor.
	 *
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return varDoctor;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	doctor --> " + varDoctor + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
