package HospitalTransformRules.api.rules;

import HospitalExample.Nurse;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindNurseMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@4d2293ea (name: nurse)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindNursePattern extends GraphTransformationPattern<FindNurseMatch, FindNursePattern> {
	private static String patternName = "findNurse";

	/**
	 * Creates a new pattern findNurse().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindNursePattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindNurseMatch convertMatch(final IMatch match) {
		return new FindNurseMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("nurse");
		return names;
	}

	/**
	 * Binds the node nurse to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNursePattern bindNurse(final Nurse object) {
		parameters.put("nurse", Objects.requireNonNull(object, "nurse must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node nurse to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNursePattern unbindNurse() {
		parameters.remove("nurse");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	nurse --> " + parameters.get("nurse") + System.lineSeparator();
		s += "}";
		return s;
	}
}
