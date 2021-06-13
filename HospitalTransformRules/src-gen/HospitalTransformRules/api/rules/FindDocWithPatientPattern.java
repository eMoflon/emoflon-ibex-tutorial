package HospitalTransformRules.api.rules;

import HospitalExample.Doctor;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindDocWithPatientMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@1646b3b2 (name: somedoctor)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindDocWithPatientPattern extends GraphTransformationPattern<FindDocWithPatientMatch, FindDocWithPatientPattern> {
	private static String patternName = "findDocWithPatient";

	/**
	 * Creates a new pattern findDocWithPatient().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindDocWithPatientPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindDocWithPatientMatch convertMatch(final IMatch match) {
		return new FindDocWithPatientMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("somedoctor");
		return names;
	}

	/**
	 * Binds the node somedoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDocWithPatientPattern bindSomedoctor(final Doctor object) {
		parameters.put("somedoctor", Objects.requireNonNull(object, "somedoctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node somedoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDocWithPatientPattern unbindSomedoctor() {
		parameters.remove("somedoctor");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	somedoctor --> " + parameters.get("somedoctor") + System.lineSeparator();
		s += "}";
		return s;
	}
}
