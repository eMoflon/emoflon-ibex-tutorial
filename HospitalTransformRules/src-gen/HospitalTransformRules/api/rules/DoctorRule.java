package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.DoctorMatch;
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
 * The rule <code>doctor(capacity, name, staffID)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class DoctorRule extends GraphTransformationRule<DoctorMatch, DoctorRule> {
	private static String patternName = "doctor";

	/**
	 * Creates a new rule doctor(capacity, name, staffID).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param capacityValue
	 *            the value for the parameter capacity
	 * @param nameValue
	 *            the value for the parameter name
	 * @param staffIDValue
	 *            the value for the parameter staffID
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public DoctorRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final int capacityValue, final java.lang.String nameValue, final int staffIDValue) {
		super(api, interpreter, patternName, Optional.empty());
		setCapacity(capacityValue);
		setName(nameValue);
		setStaffID(staffIDValue);
	}

	@Override
	public DoctorMatch convertMatch(final IMatch match) {
		return new DoctorMatch(this, match);
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
	public DoctorRule bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorRule unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}
/**
 * Sets the parameter capacity.
 *
 * @param value
 *            the value to set
 */
public DoctorRule setCapacity(final int value) {
	parameters.put("capacity", Objects.requireNonNull(value, "capacity must not be null!"));
	return this;
}
/**
 * Sets the parameter name.
 *
 * @param value
 *            the value to set
 */
public DoctorRule setName(final java.lang.String value) {
	parameters.put("name", Objects.requireNonNull(value, "name must not be null!"));
	return this;
}
/**
 * Sets the parameter staffID.
 *
 * @param value
 *            the value to set
 */
public DoctorRule setStaffID(final int value) {
	parameters.put("staffID", Objects.requireNonNull(value, "staffID must not be null!"));
	return this;
}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	capacity --> " + parameters.get("capacity") + System.lineSeparator();
		s += "	name --> " + parameters.get("name") + System.lineSeparator();
		s += "	staffID --> " + parameters.get("staffID") + System.lineSeparator();
		s += "}";
		return s;
	}
}
