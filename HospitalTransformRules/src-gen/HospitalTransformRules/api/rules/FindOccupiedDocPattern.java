package HospitalTransformRules.api.rules;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindOccupiedDocMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@343842ac (name: doctor), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@5f5f5545 (name: somepatient)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindOccupiedDocPattern extends GraphTransformationPattern<FindOccupiedDocMatch, FindOccupiedDocPattern> {
	private static String patternName = "findOccupiedDoc";

	/**
	 * Creates a new pattern findOccupiedDoc().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindOccupiedDocPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindOccupiedDocMatch convertMatch(final IMatch match) {
		return new FindOccupiedDocMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("doctor");
		names.add("somepatient");
		return names;
	}

	/**
	 * Binds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindOccupiedDocPattern bindDoctor(final Doctor object) {
		parameters.put("doctor", Objects.requireNonNull(object, "doctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindOccupiedDocPattern unbindDoctor() {
		parameters.remove("doctor");
		return this;
	}

	/**
	 * Binds the node somepatient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindOccupiedDocPattern bindSomepatient(final Patient object) {
		parameters.put("somepatient", Objects.requireNonNull(object, "somepatient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node somepatient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindOccupiedDocPattern unbindSomepatient() {
		parameters.remove("somepatient");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	doctor --> " + parameters.get("doctor") + System.lineSeparator();
		s += "	somepatient --> " + parameters.get("somepatient") + System.lineSeparator();
		s += "}";
		return s;
	}
}
