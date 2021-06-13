package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Hospital;
import HospitalExample.Patient;
import HospitalExample.Reception;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.AssignPatientToRoomMatch;
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
 * The rule <code>assignPatientToRoom()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class AssignPatientToRoomRule extends GraphTransformationRule<AssignPatientToRoomMatch, AssignPatientToRoomRule> {
	private static String patternName = "assignPatientToRoom";

	/**
	 * Creates a new rule assignPatientToRoom().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public AssignPatientToRoomRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.empty());
	}

	@Override
	public AssignPatientToRoomMatch convertMatch(final IMatch match) {
		return new AssignPatientToRoomMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("doctor");
		names.add("hospital");
		names.add("patient");
		names.add("reception");
		names.add("room");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindDoctor(final Doctor object) {
		parameters.put("doctor", Objects.requireNonNull(object, "doctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindDoctor() {
		parameters.remove("doctor");
		return this;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindReception(final Reception object) {
		parameters.put("reception", Objects.requireNonNull(object, "reception must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindReception() {
		parameters.remove("reception");
		return this;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AssignPatientToRoomRule unbindRoom() {
		parameters.remove("room");
		return this;
	}
	@Override
	public boolean isMatchValid(IMatch match){
		return 
		((Room) match.get("room")).getCapacity()>interpreter.getFilteredMatchStream("findPatientInRoom").parallel()
				.filter(localMatch -> match.get("room").equals(localMatch.get("room")))
			.count()&&
		((Doctor) match.get("doctor")).getPatientCapacity()>interpreter.getFilteredMatchStream("findOccupiedDoc").parallel()
				.filter(localMatch -> match.get("doctor").equals(localMatch.get("doctor")))
			.count()
		;
	}
	
	@Override
	public boolean containsArithmeticExpressions() {
		return true;
	}
	@Override
	public boolean containsCountExpressions() {
		return true;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "	doctor --> " + parameters.get("doctor") + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	reception --> " + parameters.get("reception") + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "}";
		return s;
	}
}
