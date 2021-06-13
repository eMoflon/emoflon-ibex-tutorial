package HospitalTransformRules.api.rules;

import HospitalExample.Doctor;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindDoctorMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@1ea91a97 (name: doctor)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindDoctorPattern extends GraphTransformationPattern<FindDoctorMatch, FindDoctorPattern> {
	private static String patternName = "findDoctor";

	/**
	 * Creates a new pattern findDoctor().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindDoctorPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindDoctorMatch convertMatch(final IMatch match) {
		return new FindDoctorMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("doctor");
		return names;
	}

	/**
	 * Binds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDoctorPattern bindDoctor(final Doctor object) {
		parameters.put("doctor", Objects.requireNonNull(object, "doctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDoctorPattern unbindDoctor() {
		parameters.remove("doctor");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	doctor --> " + parameters.get("doctor") + System.lineSeparator();
		s += "}";
		return s;
	}
}
