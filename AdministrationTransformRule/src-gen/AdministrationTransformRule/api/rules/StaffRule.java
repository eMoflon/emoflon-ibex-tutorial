package AdministrationTransformRule.api.rules;

import AdministrationExample.Daytime;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.StaffMatch;
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
 * The rule <code>staff(time1, time2)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class StaffRule extends GraphTransformationRule<StaffMatch, StaffRule> {
	private static String patternName = "staff";

	/**
	 * Creates a new rule staff(time1, time2).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param time1Value
	 *            the value for the parameter time1
	 * @param time2Value
	 *            the value for the parameter time2
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public StaffRule(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter,
			final Daytime time1Value, final Daytime time2Value) {
		super(api, interpreter, patternName, Optional.empty());
		setTime1(time1Value);
		setTime2(time2Value);
	}

	@Override
	public StaffMatch convertMatch(final IMatch match) {
		return new StaffMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("treatment");
		return names;
	}

	/**
	 * Binds the node treatment to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public StaffRule bindTreatment(final Treatment object) {
		parameters.put("treatment", Objects.requireNonNull(object, "treatment must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node treatment to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public StaffRule unbindTreatment() {
		parameters.remove("treatment");
		return this;
	}
/**
 * Sets the parameter time1.
 *
 * @param value
 *            the value to set
 */
public StaffRule setTime1(final Daytime value) {
	parameters.put("time1", Objects.requireNonNull(value, "time1 must not be null!"));
	return this;
}
/**
 * Sets the parameter time2.
 *
 * @param value
 *            the value to set
 */
public StaffRule setTime2(final Daytime value) {
	parameters.put("time2", Objects.requireNonNull(value, "time2 must not be null!"));
	return this;
}
	@Override
	public boolean isMatchValid(IMatch match){
		return 
		interpreter.getFilteredMatchStream("findTreatment").parallel()
				.filter(localMatch -> match.get("treatment").equals(localMatch.get("treatment")))
			.count()<3.0
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
		s += "	treatment --> " + parameters.get("treatment") + System.lineSeparator();
		s += "	time1 --> " + parameters.get("time1") + System.lineSeparator();
		s += "	time2 --> " + parameters.get("time2") + System.lineSeparator();
		s += "}";
		return s;
	}
}
