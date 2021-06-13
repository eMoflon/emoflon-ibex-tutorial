package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.AssignNurseToRoomMatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.arithmetic.Probability;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>assignNurseToRoom(name, staffID)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class AssignNurseToRoomRule extends GraphTransformationRule<AssignNurseToRoomMatch, AssignNurseToRoomRule> {
	private static String patternName = "assignNurseToRoom";

	/**
	 * Creates a new rule assignNurseToRoom(name, staffID).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param nameValue
	 *            the value for the parameter name
	 * @param staffIDValue
	 *            the value for the parameter staffID
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public AssignNurseToRoomRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final java.lang.String nameValue, final int staffIDValue) {
		super(api, interpreter, patternName, Optional.empty());
		setName(nameValue);
		setStaffID(staffIDValue);
	}

	@Override
	public AssignNurseToRoomMatch convertMatch(final IMatch match) {
		return new AssignNurseToRoomMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("hospital");
		names.add("room");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignNurseToRoomRule unbindRoom() {
		parameters.remove("room");
		return this;
	}
/**
 * Sets the parameter name.
 *
 * @param value
 *            the value to set
 */
public AssignNurseToRoomRule setName(final java.lang.String value) {
	parameters.put("name", Objects.requireNonNull(value, "name must not be null!"));
	return this;
}
/**
 * Sets the parameter staffID.
 *
 * @param value
 *            the value to set
 */
public AssignNurseToRoomRule setStaffID(final int value) {
	parameters.put("staffID", Objects.requireNonNull(value, "staffID must not be null!"));
	return this;
}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "	name --> " + parameters.get("name") + System.lineSeparator();
		s += "	staffID --> " + parameters.get("staffID") + System.lineSeparator();
		s += "}";
		return s;
	}
}
