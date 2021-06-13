package HospitalTransformRules.api.rules;

import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.DepartmentMatch;
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
 * The rule <code>department(dID, maxRoomCount)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class DepartmentRule extends GraphTransformationRule<DepartmentMatch, DepartmentRule> {
	private static String patternName = "department";

	/**
	 * Creates a new rule department(dID, maxRoomCount).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param dIDValue
	 *            the value for the parameter dID
	 * @param maxRoomCountValue
	 *            the value for the parameter maxRoomCount
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public DepartmentRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final int dIDValue, final int maxRoomCountValue) {
		super(api, interpreter, patternName, Optional.empty());
		setDID(dIDValue);
		setMaxRoomCount(maxRoomCountValue);
	}

	@Override
	public DepartmentMatch convertMatch(final IMatch match) {
		return new DepartmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("hospital");
		return names;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DepartmentRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DepartmentRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}
/**
 * Sets the parameter dID.
 *
 * @param value
 *            the value to set
 */
public DepartmentRule setDID(final int value) {
	parameters.put("dID", Objects.requireNonNull(value, "dID must not be null!"));
	return this;
}
/**
 * Sets the parameter maxRoomCount.
 *
 * @param value
 *            the value to set
 */
public DepartmentRule setMaxRoomCount(final int value) {
	parameters.put("maxRoomCount", Objects.requireNonNull(value, "maxRoomCount must not be null!"));
	return this;
}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	dID --> " + parameters.get("dID") + System.lineSeparator();
		s += "	maxRoomCount --> " + parameters.get("maxRoomCount") + System.lineSeparator();
		s += "}";
		return s;
	}
}
