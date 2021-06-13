package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.FindRoomInDepartmentPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findRoomInDepartment()</code>.
 */
public class FindRoomInDepartmentMatch extends GraphTransformationMatch<FindRoomInDepartmentMatch, FindRoomInDepartmentPattern> {
	private Department varDepartment;
	private Room varOtherroom;

	/**
	 * Creates a new match for the pattern <code>findRoomInDepartment()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindRoomInDepartmentMatch(final FindRoomInDepartmentPattern pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varOtherroom = (Room) match.get("otherroom");
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
	 * Returns the otherroom.
	 *
	 * @return the otherroom
	 */
	public Room getOtherroom() {
		return varOtherroom;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	otherroom --> " + varOtherroom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
