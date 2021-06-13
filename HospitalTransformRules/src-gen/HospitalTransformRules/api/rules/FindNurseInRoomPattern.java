package HospitalTransformRules.api.rules;

import HospitalExample.Nurse;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindNurseInRoomMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@7224e5b0 (name: room), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2e3b5308 (name: somenurse)] which does the following:
 * First condition to forbid finding a Nurse in a Room when she already has a room
 */
@SuppressWarnings("unused")
public class FindNurseInRoomPattern extends GraphTransformationPattern<FindNurseInRoomMatch, FindNurseInRoomPattern> {
	private static String patternName = "findNurseInRoom";

	/**
	 * Creates a new pattern findNurseInRoom().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindNurseInRoomPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindNurseInRoomMatch convertMatch(final IMatch match) {
		return new FindNurseInRoomMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("room");
		names.add("somenurse");
		return names;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNurseInRoomPattern bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNurseInRoomPattern unbindRoom() {
		parameters.remove("room");
		return this;
	}

	/**
	 * Binds the node somenurse to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNurseInRoomPattern bindSomenurse(final Nurse object) {
		parameters.put("somenurse", Objects.requireNonNull(object, "somenurse must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node somenurse to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindNurseInRoomPattern unbindSomenurse() {
		parameters.remove("somenurse");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "	somenurse --> " + parameters.get("somenurse") + System.lineSeparator();
		s += "}";
		return s;
	}
}
