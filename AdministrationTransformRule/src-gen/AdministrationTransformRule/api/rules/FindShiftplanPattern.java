package AdministrationTransformRule.api.rules;

import AdministrationExample.Shiftplan;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindShiftplanMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@6465c03a (name: shiftlpan)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindShiftplanPattern extends GraphTransformationPattern<FindShiftplanMatch, FindShiftplanPattern> {
	private static String patternName = "findShiftplan";

	/**
	 * Creates a new pattern findShiftplan().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindShiftplanPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindShiftplanMatch convertMatch(final IMatch match) {
		return new FindShiftplanMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("shiftlpan");
		return names;
	}

	/**
	 * Binds the node shiftlpan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindShiftplanPattern bindShiftlpan(final Shiftplan object) {
		parameters.put("shiftlpan", Objects.requireNonNull(object, "shiftlpan must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node shiftlpan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindShiftplanPattern unbindShiftlpan() {
		parameters.remove("shiftlpan");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	shiftlpan --> " + parameters.get("shiftlpan") + System.lineSeparator();
		s += "}";
		return s;
	}
}
