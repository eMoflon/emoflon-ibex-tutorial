package HospitalTransformRules.api.rules;

import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindHospitalMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2694d15f (name: hospital)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindHospitalPattern extends GraphTransformationPattern<FindHospitalMatch, FindHospitalPattern> {
	private static String patternName = "findHospital";

	/**
	 * Creates a new pattern findHospital().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindHospitalPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindHospitalMatch convertMatch(final IMatch match) {
		return new FindHospitalMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("hospital");
		return names;
	}

	/**
	 * Binds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindHospitalPattern bindHospital(final Hospital object) {
		parameters.put("hospital", Objects.requireNonNull(object, "hospital must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node hospital to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindHospitalPattern unbindHospital() {
		parameters.remove("hospital");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	hospital --> " + parameters.get("hospital") + System.lineSeparator();
		s += "}";
		return s;
	}
}
