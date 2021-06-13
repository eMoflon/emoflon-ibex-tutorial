package HospitalTransformRules.api.matches;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalTransformRules.api.rules.FindOccupiedDocPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findOccupiedDoc()</code>.
 */
public class FindOccupiedDocMatch extends GraphTransformationMatch<FindOccupiedDocMatch, FindOccupiedDocPattern> {
	private Doctor varDoctor;
	private Patient varSomepatient;

	/**
	 * Creates a new match for the pattern <code>findOccupiedDoc()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindOccupiedDocMatch(final FindOccupiedDocPattern pattern, final IMatch match) {
		super(pattern, match);
		varDoctor = (Doctor) match.get("doctor");
		varSomepatient = (Patient) match.get("somepatient");
	}

	/**
	 * Returns the doctor.
	 *
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return varDoctor;
	}

	/**
	 * Returns the somepatient.
	 *
	 * @return the somepatient
	 */
	public Patient getSomepatient() {
		return varSomepatient;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	doctor --> " + varDoctor + System.lineSeparator();
		s += "	somepatient --> " + varSomepatient + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
