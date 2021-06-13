package AdministrationTransformRule.api.rules;

import AdministrationExample.Person;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindPersonMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@445acecf (name: person)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindPersonPattern extends GraphTransformationPattern<FindPersonMatch, FindPersonPattern> {
	private static String patternName = "findPerson";

	/**
	 * Creates a new pattern findPerson().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindPersonPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindPersonMatch convertMatch(final IMatch match) {
		return new FindPersonMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("person");
		return names;
	}

	/**
	 * Binds the node person to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPersonPattern bindPerson(final Person object) {
		parameters.put("person", Objects.requireNonNull(object, "person must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node person to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPersonPattern unbindPerson() {
		parameters.remove("person");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	person --> " + parameters.get("person") + System.lineSeparator();
		s += "}";
		return s;
	}
}
