package AdministrationTransformRule.api.rules;

import AdministrationExample.Staff;
import AdministrationExample.Treatment;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindTreatmentMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2e2f1a97 (name: someStaff), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@3c91952b (name: treatment)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindTreatmentPattern extends GraphTransformationPattern<FindTreatmentMatch, FindTreatmentPattern> {
	private static String patternName = "findTreatment";

	/**
	 * Creates a new pattern findTreatment().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindTreatmentPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindTreatmentMatch convertMatch(final IMatch match) {
		return new FindTreatmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("someStaff");
		names.add("treatment");
		return names;
	}

	/**
	 * Binds the node someStaff to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindTreatmentPattern bindSomeStaff(final Staff object) {
		parameters.put("someStaff", Objects.requireNonNull(object, "someStaff must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node someStaff to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindTreatmentPattern unbindSomeStaff() {
		parameters.remove("someStaff");
		return this;
	}

	/**
	 * Binds the node treatment to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindTreatmentPattern bindTreatment(final Treatment object) {
		parameters.put("treatment", Objects.requireNonNull(object, "treatment must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node treatment to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindTreatmentPattern unbindTreatment() {
		parameters.remove("treatment");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	someStaff --> " + parameters.get("someStaff") + System.lineSeparator();
		s += "	treatment --> " + parameters.get("treatment") + System.lineSeparator();
		s += "}";
		return s;
	}
}
