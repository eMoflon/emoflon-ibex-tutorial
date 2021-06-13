package HospitalTransformRules.api.matches;

import HospitalExample.Patient;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.FindPatientInRoomPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findPatientInRoom()</code>.
 */
public class FindPatientInRoomMatch extends GraphTransformationMatch<FindPatientInRoomMatch, FindPatientInRoomPattern> {
	private Room varRoom;
	private Patient varSomepatient;

	/**
	 * Creates a new match for the pattern <code>findPatientInRoom()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindPatientInRoomMatch(final FindPatientInRoomPattern pattern, final IMatch match) {
		super(pattern, match);
		varRoom = (Room) match.get("room");
		varSomepatient = (Patient) match.get("somepatient");
	}

	/**
	 * Returns the room.
	 *
	 * @return the room
	 */
	public Room getRoom() {
		return varRoom;
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
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "	somepatient --> " + varSomepatient + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
