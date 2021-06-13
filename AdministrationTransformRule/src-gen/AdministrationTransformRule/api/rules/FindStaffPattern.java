package AdministrationTransformRule.api.rules;

import AdministrationExample.Staff;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;
import AdministrationTransformRule.api.matches.FindStaffMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@152ab0cf (name: staff)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindStaffPattern extends GraphTransformationPattern<FindStaffMatch, FindStaffPattern> {
	private static String patternName = "findStaff";

	/**
	 * Creates a new pattern findStaff().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindStaffPattern(final AdministrationTransformRuleAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindStaffMatch convertMatch(final IMatch match) {
		return new FindStaffMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("staff");
		return names;
	}

	/**
	 * Binds the node staff to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindStaffPattern bindStaff(final Staff object) {
		parameters.put("staff", Objects.requireNonNull(object, "staff must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node staff to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindStaffPattern unbindStaff() {
		parameters.remove("staff");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	staff --> " + parameters.get("staff") + System.lineSeparator();
		s += "}";
		return s;
	}
}
