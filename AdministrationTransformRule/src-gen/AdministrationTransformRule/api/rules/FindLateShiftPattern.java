package AdministrationTransformRule.api.rules;

import AdministrationExample.Shift;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindLateShiftMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@661ab222 (name: lateshift)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindLateShiftPattern extends GraphTransformationPattern<FindLateShiftMatch, FindLateShiftPattern> {
	private static String patternName = "findLateShift";

	/**
	 * Creates a new pattern findLateShift().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindLateShiftPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindLateShiftMatch convertMatch(final IMatch match) {
		return new FindLateShiftMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("lateshift");
		return names;
	}

	/**
	 * Binds the node lateshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindLateShiftPattern bindLateshift(final Shift object) {
		parameters.put("lateshift", Objects.requireNonNull(object, "lateshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node lateshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindLateShiftPattern unbindLateshift() {
		parameters.remove("lateshift");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	lateshift --> " + parameters.get("lateshift") + System.lineSeparator();
		s += "}";
		return s;
	}
}
