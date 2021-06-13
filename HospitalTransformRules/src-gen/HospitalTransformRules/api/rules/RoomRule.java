package HospitalTransformRules.api.rules;

import HospitalExample.Carelevel;
import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.RoomMatch;
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
 * The rule <code>room(cap, carelvl)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class RoomRule extends GraphTransformationRule<RoomMatch, RoomRule> {
	private static String patternName = "room";

	/**
	 * Creates a new rule room(cap, carelvl).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param capValue
	 *            the value for the parameter cap
	 * @param carelvlValue
	 *            the value for the parameter carelvl
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public RoomRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final int capValue, final Carelevel carelvlValue) {
		super(api, interpreter, patternName, Optional.empty());
		setCap(capValue);
		setCarelvl(carelvlValue);
	}

	@Override
	public RoomMatch convertMatch(final IMatch match) {
		return new RoomMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("hospital");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomRule bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomRule unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}
/**
 * Sets the parameter cap.
 *
 * @param value
 *            the value to set
 */
public RoomRule setCap(final int value) {
	parameters.put("cap", Objects.requireNonNull(value, "cap must not be null!"));
	return this;
}
/**
 * Sets the parameter carelvl.
 *
 * @param value
 *            the value to set
 */
public RoomRule setCarelvl(final Carelevel value) {
	parameters.put("carelvl", Objects.requireNonNull(value, "carelvl must not be null!"));
	return this;
}
	@Override
	public boolean isMatchValid(IMatch match){
		return 
		((Department) match.get("department")).getMaxRoomCount()>interpreter.getFilteredMatchStream("findRoomInDepartment").parallel()
				.filter(localMatch -> match.get("department").equals(localMatch.get("department")))
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
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	cap --> " + parameters.get("cap") + System.lineSeparator();
		s += "	carelvl --> " + parameters.get("carelvl") + System.lineSeparator();
		s += "}";
		return s;
	}
}
