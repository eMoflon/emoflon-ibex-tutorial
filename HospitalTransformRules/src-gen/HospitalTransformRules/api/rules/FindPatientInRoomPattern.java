package HospitalTransformRules.api.rules;

import HospitalExample.Patient;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindPatientInRoomMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@174acaef (name: room), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@733aaa18 (name: somepatient)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindPatientInRoomPattern extends GraphTransformationPattern<FindPatientInRoomMatch, FindPatientInRoomPattern> {
	private static String patternName = "findPatientInRoom";

	/**
	 * Creates a new pattern findPatientInRoom().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindPatientInRoomPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindPatientInRoomMatch convertMatch(final IMatch match) {
		return new FindPatientInRoomMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("room");
		names.add("somepatient");
		return names;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInRoomPattern bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInRoomPattern unbindRoom() {
		parameters.remove("room");
		return this;
	}

	/**
	 * Binds the node somepatient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInRoomPattern bindSomepatient(final Patient object) {
		parameters.put("somepatient", Objects.requireNonNull(object, "somepatient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node somepatient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindPatientInRoomPattern unbindSomepatient() {
		parameters.remove("somepatient");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "	somepatient --> " + parameters.get("somepatient") + System.lineSeparator();
		s += "}";
		return s;
	}
}
