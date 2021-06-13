package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.RoomRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>room(cap, carelvl)</code>.
 */
public class RoomMatch extends GraphTransformationMatch<RoomMatch, RoomRule> {
	private Department varDepartment;
	private Hospital varHospital;
	private Room varRoom;

	/**
	 * Creates a new match for the rule <code>room(cap, carelvl)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public RoomMatch(final RoomRule pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varHospital = (Hospital) match.get("hospital");
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
	 * Returns the hospital.
	 *
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return varHospital;
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
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
