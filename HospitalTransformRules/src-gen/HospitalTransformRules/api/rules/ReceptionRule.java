package HospitalTransformRules.api.rules;

import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.ReceptionMatch;
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
 * The rule <code>reception()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class ReceptionRule extends GraphTransformationRule<ReceptionMatch, ReceptionRule> {
	private static String patternName = "reception";

	/**
	 * Creates a new rule reception().
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

	public ReceptionRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.empty());
	}

	@Override
	public ReceptionMatch convertMatch(final IMatch match) {
		return new ReceptionMatch(this, match);
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
	public ReceptionRule bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReceptionRule unbindHospital() {
		parameters.remove("hospital");
		return this;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "}";
		return s;
	}
}
