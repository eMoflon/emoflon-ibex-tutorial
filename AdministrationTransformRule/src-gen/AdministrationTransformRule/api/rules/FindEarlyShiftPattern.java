package AdministrationTransformRule.api.rules;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindEarlyShiftMatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@3a059b76 (name: earlyshift)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindEarlyShiftPattern extends GraphTransformationPattern<FindEarlyShiftMatch, FindEarlyShiftPattern> {
	private static String patternName = "findEarlyShift";

	/**
	 * Creates a new pattern findEarlyShift().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindEarlyShiftPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindEarlyShiftMatch convertMatch(final IMatch match) {
		return new FindEarlyShiftMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("earlyshift");
		return names;
	}

	/**
	 * Binds the node earlyshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindEarlyShiftPattern bindEarlyshift(final Shift object) {
		parameters.put("earlyshift", Objects.requireNonNull(object, "earlyshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node earlyshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindEarlyShiftPattern unbindEarlyshift() {
		parameters.remove("earlyshift");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	earlyshift --> " + parameters.get("earlyshift") + System.lineSeparator();
		s += "}";
		return s;
	}
}
