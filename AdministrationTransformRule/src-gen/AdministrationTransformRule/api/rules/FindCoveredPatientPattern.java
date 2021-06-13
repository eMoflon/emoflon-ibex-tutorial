package AdministrationTransformRule.api.rules;

import AdministrationExample.Patient;
import AdministrationExample.Shiftplan;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindCoveredPatientMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@5f5baaed (name: patient), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@42ba599b (name: shiftPlan)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindCoveredPatientPattern extends GraphTransformationPattern<FindCoveredPatientMatch, FindCoveredPatientPattern> {
	private static String patternName = "findCoveredPatient";

	/**
	 * Creates a new pattern findCoveredPatient().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindCoveredPatientPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindCoveredPatientMatch convertMatch(final IMatch match) {
		return new FindCoveredPatientMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("patient");
		names.add("shiftPlan");
		return names;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindCoveredPatientPattern bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindCoveredPatientPattern unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node shiftPlan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindCoveredPatientPattern bindShiftPlan(final Shiftplan object) {
		parameters.put("shiftPlan", Objects.requireNonNull(object, "shiftPlan must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node shiftPlan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindCoveredPatientPattern unbindShiftPlan() {
		parameters.remove("shiftPlan");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	shiftPlan --> " + parameters.get("shiftPlan") + System.lineSeparator();
		s += "}";
		return s;
	}
}
