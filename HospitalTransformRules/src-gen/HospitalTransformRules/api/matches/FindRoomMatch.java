package HospitalTransformRules.api.matches;

import HospitalExample.Room;
import HospitalTransformRules.api.rules.FindRoomPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findRoom()</code>.
 */
public class FindRoomMatch extends GraphTransformationMatch<FindRoomMatch, FindRoomPattern> {
	private Room varRoom;

	/**
	 * Creates a new match for the pattern <code>findRoom()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindRoomMatch(final FindRoomPattern pattern, final IMatch match) {
		super(pattern, match);
		varRoom = (Room) match.get("room");
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
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
