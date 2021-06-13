package HospitalTransformRules.api.matches;

import HospitalExample.Department;
import HospitalExample.Doctor;
import HospitalExample.Hospital;
import HospitalExample.Patient;
import HospitalExample.Reception;
import HospitalExample.Room;
import HospitalTransformRules.api.rules.AssignPatientToRoomRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>assignPatientToRoom()</code>.
 */
public class AssignPatientToRoomMatch extends GraphTransformationMatch<AssignPatientToRoomMatch, AssignPatientToRoomRule> {
	private Department varDepartment;
	private Doctor varDoctor;
	private Hospital varHospital;
	private Patient varPatient;
	private Reception varReception;
	private Room varRoom;

	/**
	 * Creates a new match for the rule <code>assignPatientToRoom()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public AssignPatientToRoomMatch(final AssignPatientToRoomRule pattern, final IMatch match) {
		super(pattern, match);
		varDepartment = (Department) match.get("department");
		varDoctor = (Doctor) match.get("doctor");
		varHospital = (Hospital) match.get("hospital");
		varPatient = (Patient) match.get("patient");
		varReception = (Reception) match.get("reception");
		varRoom = (Room) match.get("room");
	}

	/**
	 * Returns the department.
	 *
	 * @return the department
	 */
	public Department getDepartment() {
		return varDepartment;
	}

	/**
	 * Returns the doctor.
	 *
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return varDoctor;
	}

	/**
	 * Returns the hospital.
	 *
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return varHospital;
	}

	/**
	 * Returns the patient.
	 *
	 * @return the patient
	 */
	public Patient getPatient() {
		return varPatient;
	}

	/**
	 * Returns the reception.
	 *
	 * @return the reception
	 */
	public Reception getReception() {
		return varReception;
	}

	/**
	 * Returns the room.
	 *
	 * @return the room
	 */
	public Room getRoom() {
		return varRoom;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	department --> " + varDepartment + System.lineSeparator();
		s += "	doctor --> " + varDoctor + System.lineSeparator();
		s += "	hospital --> " + varHospital + System.lineSeparator();
		s += "	patient --> " + varPatient + System.lineSeparator();
		s += "	reception --> " + varReception + System.lineSeparator();
		s += "	room --> " + varRoom + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
