package AdministrationTransformRule.api.rules;

import AdministrationExample.Patient;
import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.PatientCoveredMatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.arithmetic.Probability;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The rule <code>patientCovered()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class PatientCoveredRule extends GraphTransformationRule<PatientCoveredMatch, PatientCoveredRule> {
	private static String patternName = "patientCovered";

	/**
	 * Creates a new rule patientCovered().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public PatientCoveredRule(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.empty());
	}

	@Override
	public PatientCoveredMatch convertMatch(final IMatch match) {
		return new PatientCoveredMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("earlyshift");
		names.add("lateshift");
		names.add("nightshift");
		names.add("patient");
		names.add("s");
		names.add("s1");
		names.add("shiftPlan");
		names.add("shiftPlan2");
		names.add("t");
		return names;
	}

	/**
	 * Binds the node earlyshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindEarlyshift(final Shift object) {
		parameters.put("earlyshift", Objects.requireNonNull(object, "earlyshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node earlyshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindEarlyshift() {
		parameters.remove("earlyshift");
		return this;
	}

	/**
	 * Binds the node lateshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindLateshift(final Shift object) {
		parameters.put("lateshift", Objects.requireNonNull(object, "lateshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node lateshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindLateshift() {
		parameters.remove("lateshift");
		return this;
	}

	/**
	 * Binds the node nightshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindNightshift(final Shift object) {
		parameters.put("nightshift", Objects.requireNonNull(object, "nightshift must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node nightshift to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindNightshift() {
		parameters.remove("nightshift");
		return this;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindS(final Staff object) {
		parameters.put("s", Objects.requireNonNull(object, "s must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node s to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindS() {
		parameters.remove("s");
		return this;
	}

	/**
	 * Binds the node s1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindS1(final Staff object) {
		parameters.put("s1", Objects.requireNonNull(object, "s1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node s1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindS1() {
		parameters.remove("s1");
		return this;
	}

	/**
	 * Binds the node shiftPlan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindShiftPlan(final Shiftplan object) {
		parameters.put("shiftPlan", Objects.requireNonNull(object, "shiftPlan must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node shiftPlan to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindShiftPlan() {
		parameters.remove("shiftPlan");
		return this;
	}

	/**
	 * Binds the node shiftPlan2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindShiftPlan2(final Shiftplan object) {
		parameters.put("shiftPlan2", Objects.requireNonNull(object, "shiftPlan2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node shiftPlan2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindShiftPlan2() {
		parameters.remove("shiftPlan2");
		return this;
	}

	/**
	 * Binds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule bindT(final Treatment object) {
		parameters.put("t", Objects.requireNonNull(object, "t must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node t to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public PatientCoveredRule unbindT() {
		parameters.remove("t");
		return this;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	earlyshift --> " + parameters.get("earlyshift") + System.lineSeparator();
		s += "	lateshift --> " + parameters.get("lateshift") + System.lineSeparator();
		s += "	nightshift --> " + parameters.get("nightshift") + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	s --> " + parameters.get("s") + System.lineSeparator();
		s += "	s1 --> " + parameters.get("s1") + System.lineSeparator();
		s += "	shiftPlan --> " + parameters.get("shiftPlan") + System.lineSeparator();
		s += "	shiftPlan2 --> " + parameters.get("shiftPlan2") + System.lineSeparator();
		s += "	t --> " + parameters.get("t") + System.lineSeparator();
		s += "}";
		return s;
	}
}
