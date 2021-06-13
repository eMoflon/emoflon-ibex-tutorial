package HospitalTransformRules.api.rules;

import HospitalExample.Doctor;
import HospitalExample.Patient;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.ReleasePatientMatch;
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
 * The rule <code>releasePatient(patientID)</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class ReleasePatientRule extends GraphTransformationRule<ReleasePatientMatch, ReleasePatientRule> {
	private static String patternName = "releasePatient";

	/**
	 * Creates a new rule releasePatient(patientID).
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 * @param patientIDValue
	 *            the value for the parameter patientID
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public ReleasePatientRule(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter,
			final int patientIDValue) {
		super(api, interpreter, patternName, Optional.empty());
		setPatientID(patientIDValue);
	}

	@Override
	public ReleasePatientMatch convertMatch(final IMatch match) {
		return new ReleasePatientMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("doctor");
		names.add("patient");
		names.add("room");
		return names;
	}

	/**
	 * Binds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule bindDoctor(final Doctor object) {
		parameters.put("doctor", Objects.requireNonNull(object, "doctor must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node doctor to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule unbindDoctor() {
		parameters.remove("doctor");
		return this;
	}

	/**
	 * Binds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule bindPatient(final Patient object) {
		parameters.put("patient", Objects.requireNonNull(object, "patient must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node patient to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule unbindPatient() {
		parameters.remove("patient");
		return this;
	}

	/**
	 * Binds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule bindRoom(final Room object) {
		parameters.put("room", Objects.requireNonNull(object, "room must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node room to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ReleasePatientRule unbindRoom() {
		parameters.remove("room");
		return this;
	}
/**
 * Sets the parameter patientID.
 *
 * @param value
 *            the value to set
 */
public ReleasePatientRule setPatientID(final int value) {
	parameters.put("patientID", Objects.requireNonNull(value, "patientID must not be null!"));
	return this;
}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	doctor --> " + parameters.get("doctor") + System.lineSeparator();
		s += "	patient --> " + parameters.get("patient") + System.lineSeparator();
		s += "	room --> " + parameters.get("room") + System.lineSeparator();
		s += "	patientID --> " + parameters.get("patientID") + System.lineSeparator();
		s += "}";
		return s;
	}
}
