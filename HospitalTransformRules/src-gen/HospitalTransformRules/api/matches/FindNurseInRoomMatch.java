package HospitalTransformRules.api.matches;

import HospitalExample.Nurse;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.FindNurseInRoomPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findNurseInRoom()</code>.
 */
public class FindNurseInRoomMatch extends GraphTransformationMatch<FindNurseInRoomMatch, FindNurseInRoomPattern> {
	private Room varRoom;
	private Nurse varSomenurse;

	/**
	 * Creates a new match for the pattern <code>findNurseInRoom()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindNurseInRoomMatch(final FindNurseInRoomPattern pattern, final IMatch match) {
		super(pattern, match);
		varRoom = (Room) match.get("room");
		varSomenurse = (Nurse) match.get("somenurse");
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
	 * Returns the somenurse.
	 *
	 * @return the somenurse
	 */
	public Nurse getSomenurse() {
		return varSomenurse;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "	somenurse --> " + varSomenurse + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
