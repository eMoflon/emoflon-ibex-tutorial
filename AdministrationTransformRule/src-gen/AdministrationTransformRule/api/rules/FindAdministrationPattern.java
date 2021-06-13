package AdministrationTransformRule.api.rules;

import AdministrationExample.Administration;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindAdministrationMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@3e3803a5 (name: administration)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindAdministrationPattern extends GraphTransformationPattern<FindAdministrationMatch, FindAdministrationPattern> {
	private static String patternName = "findAdministration";

	/**
	 * Creates a new pattern findAdministration().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindAdministrationPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindAdministrationMatch convertMatch(final IMatch match) {
		return new FindAdministrationMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("administration");
		return names;
	}

	/**
	 * Binds the node administration to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindAdministrationPattern bindAdministration(final Administration object) {
		parameters.put("administration", Objects.requireNonNull(object, "administration must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node administration to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindAdministrationPattern unbindAdministration() {
		parameters.remove("administration");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	administration --> " + parameters.get("administration") + System.lineSeparator();
		s += "}";
		return s;
	}
}
