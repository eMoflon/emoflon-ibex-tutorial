package HospitalTransformRules.api.rules;

import HospitalExample.Patient;
import HospitalExample.Reception;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindPatientInReceptionMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@7c4b7be2 (name: patient), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@228f7fd4 (name: reception)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindPatientInReceptionPattern extends GraphTransformationPattern<FindPatientInReceptionMatch, FindPatientInReceptionPattern> {
	private static String patternName = "findPatientInReception";

	/**
	 * Creates a new pattern findPatientInReception().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindPatientInReceptionPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindPatientInReceptionMatch convertMatch(final IMatch match) {
		return new FindPatientInReceptionMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("patient");
		names.add("reception");
		return names;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInReceptionPattern bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInReceptionPattern unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInReceptionPattern bindReception(final Reception object) {
		parameters.put("reception", Objects.requireNonNull(object, "reception must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node reception to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInReceptionPattern unbindReception() {
		parameters.remove("reception");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	reception --> " + parameters.get("reception") + System.lineSeparator();
		s += "}";
		return s;
	}
}
