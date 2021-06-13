package HospitalTransformRules.api.rules;

import HospitalExample.Reception;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindReceptionMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@42b6de8b (name: reception)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindReceptionPattern extends GraphTransformationPattern<FindReceptionMatch, FindReceptionPattern> {
	private static String patternName = "findReception";

	/**
	 * Creates a new pattern findReception().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindReceptionPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindReceptionMatch convertMatch(final IMatch match) {
		return new FindReceptionMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("reception");
		return names;
	}

	/**
	 * Binds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindReceptionPattern bindReception(final Reception object) {
		parameters.put("reception", Objects.requireNonNull(object, "reception must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindReceptionPattern unbindReception() {
		parameters.remove("reception");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	reception --> " + parameters.get("reception") + System.lineSeparator();
		s += "}";
		return s;
	}
}
