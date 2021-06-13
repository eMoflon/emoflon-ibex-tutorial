package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.RoomInDepartmentPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>roomInDepartment()</code>.
 */
public class RoomInDepartmentMatch extends GraphTransformationMatch<RoomInDepartmentMatch, RoomInDepartmentPattern> {
	private Department varDepartment;
	private Room varRoom;

	/**
	 * Creates a new match for the pattern <code>roomInDepartment()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public RoomInDepartmentMatch(final RoomInDepartmentPattern pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varRoom = (Room) match.get("room");
	}

	/**
	 * Returns the department.
	 *
	 * @return the department
	 */
	public Department getDepartment() {
		return varDepartment;
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
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
