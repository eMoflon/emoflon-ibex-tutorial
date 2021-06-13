package HospitalTransformRules.api.matches;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.ReleasePatientRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>releasePatient(patientID)</code>.
 */
public class ReleasePatientMatch extends GraphTransformationMatch<ReleasePatientMatch, ReleasePatientRule> {
	private Doctor varDoctor;
	private Patient varPatient;
	private Room varRoom;

	/**
	 * Creates a new match for the rule <code>releasePatient(patientID)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ReleasePatientMatch(final ReleasePatientRule pattern, final IMatch match) {
		super(pattern, match);
		varDoctor = (Doctor) match.get("doctor");
		varPatient = (Patient) match.get("patient");
		varRoom = (Room) match.get("room");
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
	 * Returns the patient.
	 *
	 * @return the patient
	 */
	public Patient getPatient() {
		return varPatient;
	}

	/**
	 * Returns the room.
	 *
	 * @return the room
	 */
	public Room getRoom() {
		return varRoom;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	doctor --> " + varDoctor + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
