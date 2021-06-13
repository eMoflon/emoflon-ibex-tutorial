package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.Nurse;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.AssignNurseToRoomRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>assignNurseToRoom(name, staffID)</code>.
 */
public class AssignNurseToRoomMatch extends GraphTransformationMatch<AssignNurseToRoomMatch, AssignNurseToRoomRule> {
	private Department varDepartment;
	private Hospital varHospital;
	private Room varRoom;
	private Nurse varStaff;

	/**
	 * Creates a new match for the rule <code>assignNurseToRoom(name, staffID)</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AssignNurseToRoomMatch(final AssignNurseToRoomRule pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varHospital = (Hospital) match.get("hospital");
		varRoom = (Room) match.get("room");
		varStaff = (Nurse) match.get("staff");
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

	/**
	 * Returns the staff.
	 *
	 * @return the staff
	 */
	public Nurse getStaff() {
		return varStaff;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "	staff --> " + varStaff + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
