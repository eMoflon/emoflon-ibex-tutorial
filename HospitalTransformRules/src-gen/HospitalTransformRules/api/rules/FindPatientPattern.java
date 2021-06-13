package HospitalTransformRules.api.rules;

import HospitalExample.Patient;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindPatientMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@4193e12e (name: patient)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindPatientPattern extends GraphTransformationPattern<FindPatientMatch, FindPatientPattern> {
	private static String patternName = "findPatient";

	/**
	 * Creates a new pattern findPatient().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindPatientPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindPatientMatch convertMatch(final IMatch match) {
		return new FindPatientMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("patient");
		return names;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientPattern bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientPattern unbindPatient() {
		parameters.remove("patient");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "}";
		return s;
	}
}
