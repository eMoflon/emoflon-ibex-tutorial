package AdministrationTransformRule.api.rules;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindNightShiftMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@17d85f09 (name: nightshift)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindNightShiftPattern extends GraphTransformationPattern<FindNightShiftMatch, FindNightShiftPattern> {
	private static String patternName = "findNightShift";

	/**
	 * Creates a new pattern findNightShift().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindNightShiftPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindNightShiftMatch convertMatch(final IMatch match) {
		return new FindNightShiftMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("nightshift");
		return names;
	}

	/**
	 * Binds the node nightshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNightShiftPattern bindNightshift(final Shift object) {
		parameters.put("nightshift", Objects.requireNonNull(object, "nightshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node nightshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNightShiftPattern unbindNightshift() {
		parameters.remove("nightshift");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	nightshift --> " + parameters.get("nightshift") + System.lineSeparator();
		s += "}";
		return s;
	}
}
