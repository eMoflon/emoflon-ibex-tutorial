package HospitalTransformRules.api.rules;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindPatientWithDocMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2ec4c211 (name: patient), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@6b7eeaa0 (name: somedoctor)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindPatientWithDocPattern extends GraphTransformationPattern<FindPatientWithDocMatch, FindPatientWithDocPattern> {
	private static String patternName = "findPatientWithDoc";

	/**
	 * Creates a new pattern findPatientWithDoc().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindPatientWithDocPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindPatientWithDocMatch convertMatch(final IMatch match) {
		return new FindPatientWithDocMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("patient");
		names.add("somedoctor");
		return names;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientWithDocPattern bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientWithDocPattern unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node somedoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientWithDocPattern bindSomedoctor(final Doctor object) {
		parameters.put("somedoctor", Objects.requireNonNull(object, "somedoctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node somedoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientWithDocPattern unbindSomedoctor() {
		parameters.remove("somedoctor");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	somedoctor --> " + parameters.get("somedoctor") + System.lineSeparator();
		s += "}";
		return s;
	}
}
