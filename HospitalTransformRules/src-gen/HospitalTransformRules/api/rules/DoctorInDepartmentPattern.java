package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.DoctorInDepartmentMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@44fadca0 (name: department), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2db31080 (name: someDoctor)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class DoctorInDepartmentPattern extends GraphTransformationPattern<DoctorInDepartmentMatch, DoctorInDepartmentPattern> {
	private static String patternName = "doctorInDepartment";

	/**
	 * Creates a new pattern doctorInDepartment().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public DoctorInDepartmentPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public DoctorInDepartmentMatch convertMatch(final IMatch match) {
		return new DoctorInDepartmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("someDoctor");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorInDepartmentPattern bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorInDepartmentPattern unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node someDoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorInDepartmentPattern bindSomeDoctor(final Doctor object) {
		parameters.put("someDoctor", Objects.requireNonNull(object, "someDoctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node someDoctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public DoctorInDepartmentPattern unbindSomeDoctor() {
		parameters.remove("someDoctor");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "	someDoctor --> " + parameters.get("someDoctor") + System.lineSeparator();
		s += "}";
		return s;
	}
}
