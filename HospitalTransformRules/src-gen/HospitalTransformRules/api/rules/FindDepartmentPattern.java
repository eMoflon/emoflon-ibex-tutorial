package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindDepartmentMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@7027e0e8 (name: department)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindDepartmentPattern extends GraphTransformationPattern<FindDepartmentMatch, FindDepartmentPattern> {
	private static String patternName = "findDepartment";

	/**
	 * Creates a new pattern findDepartment().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindDepartmentPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindDepartmentMatch convertMatch(final IMatch match) {
		return new FindDepartmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDepartmentPattern bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindDepartmentPattern unbindDepartment() {
		parameters.remove("department");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "}";
		return s;
	}
}
