package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.RoomInDepartmentMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@50003c02 (name: department), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@1c59d830 (name: room)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class RoomInDepartmentPattern extends GraphTransformationPattern<RoomInDepartmentMatch, RoomInDepartmentPattern> {
	private static String patternName = "roomInDepartment";

	/**
	 * Creates a new pattern roomInDepartment().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public RoomInDepartmentPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public RoomInDepartmentMatch convertMatch(final IMatch match) {
		return new RoomInDepartmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("room");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomInDepartmentPattern bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomInDepartmentPattern unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomInDepartmentPattern bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public RoomInDepartmentPattern unbindRoom() {
		parameters.remove("room");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	department --> " + parameters.get("department") + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "}";
		return s;
	}
}
