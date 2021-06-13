package HospitalTransformRules.api.rules;

import HospitalExample.Carelevel;
import HospitalExample.Hospital;
import HospitalExample.Reception;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.PatientMatch;
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
 * The rule <code>patient(name, patientId, level)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class PatientRule extends GraphTransformationRule<PatientMatch, PatientRule> {
	private static String patternName = "patient";

	/**
	 * Creates a new rule patient(name, patientId, level).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param nameValue
	 *            the value for the parameter name
	 * @param patientIdValue
	 *            the value for the parameter patientId
	 * @param levelValue
	 *            the value for the parameter level
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public PatientRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final java.lang.String nameValue, final int patientIdValue, final Carelevel levelValue) {
		super(api, interpreter, patternName, Optional.empty());
		setName(nameValue);
		setPatientId(patientIdValue);
		setLevel(levelValue);
	}

	@Override
	public PatientMatch convertMatch(final IMatch match) {
		return new PatientMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("hospital");
		names.add("reception");
		return names;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}

	/**
	 * Binds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientRule bindReception(final Reception object) {
		parameters.put("reception", Objects.requireNonNull(object, "reception must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientRule unbindReception() {
		parameters.remove("reception");
		return this;
	}
/**
 * Sets the parameter name.
 *
 * @param value
 *            the value to set
 */
public PatientRule setName(final java.lang.String value) {
	parameters.put("name", Objects.requireNonNull(value, "name must not be null!"));
	return this;
}
/**
 * Sets the parameter patientId.
 *
 * @param value
 *            the value to set
 */
public PatientRule setPatientId(final int value) {
	parameters.put("patientId", Objects.requireNonNull(value, "patientId must not be null!"));
	return this;
}
/**
 * Sets the parameter level.
 *
 * @param value
 *            the value to set
 */
public PatientRule setLevel(final Carelevel value) {
	parameters.put("level", Objects.requireNonNull(value, "level must not be null!"));
	return this;
}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "	reception --> " + parameters.get("reception") + System.lineSeparator();
		s += "	name --> " + parameters.get("name") + System.lineSeparator();
		s += "	patientId --> " + parameters.get("patientId") + System.lineSeparator();
		s += "	level --> " + parameters.get("level") + System.lineSeparator();
		s += "}";
		return s;
	}
}
