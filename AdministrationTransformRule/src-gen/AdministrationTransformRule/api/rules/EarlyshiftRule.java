package AdministrationTransformRule.api.rules;

import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.EarlyshiftMatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.arithmetic.Probability;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>earlyshift()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class EarlyshiftRule extends GraphTransformationRule<EarlyshiftMatch, EarlyshiftRule> {
	private static String patternName = "earlyshift";

	/**
	 * Creates a new rule earlyshift().
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

	public EarlyshiftRule(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.empty());
	}

	@Override
	public EarlyshiftMatch convertMatch(final IMatch match) {
		return new EarlyshiftMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		return names;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "}";
		return s;
	}
}
