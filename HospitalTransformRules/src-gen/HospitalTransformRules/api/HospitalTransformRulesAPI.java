package HospitalTransformRules.api;

import HospitalExample.Carelevel;
import HospitalTransformRules.api.rules.AssignNurseToRoomRule;
import HospitalTransformRules.api.rules.AssignPatientToRoomRule;
import HospitalTransformRules.api.rules.DepartmentRule;
import HospitalTransformRules.api.rules.DoctorInDepartmentPattern;
import HospitalTransformRules.api.rules.DoctorRule;
import HospitalTransformRules.api.rules.FindDepartmentPattern;
import HospitalTransformRules.api.rules.FindDepartmentWithoutDoctorPattern;
import HospitalTransformRules.api.rules.FindDoctorPattern;
import HospitalTransformRules.api.rules.FindDocWithPatientPattern;
import HospitalTransformRules.api.rules.FindHospitalPattern;
import HospitalTransformRules.api.rules.FindNurseInRoomPattern;
import HospitalTransformRules.api.rules.FindNursePattern;
import HospitalTransformRules.api.rules.FindOccupiedDocPattern;
import HospitalTransformRules.api.rules.FindPatientInReceptionPattern;
import HospitalTransformRules.api.rules.FindPatientInRoomPattern;
import HospitalTransformRules.api.rules.FindPatientPattern;
import HospitalTransformRules.api.rules.FindPatientWithDocPattern;
import HospitalTransformRules.api.rules.FindReceptionPattern;
import HospitalTransformRules.api.rules.FindRoomInDepartmentPattern;
import HospitalTransformRules.api.rules.FindRoomPattern;
import HospitalTransformRules.api.rules.FindRoomWithoutNursePattern;
import HospitalTransformRules.api.rules.HospitalRule;
import HospitalTransformRules.api.rules.PatientRule;
import HospitalTransformRules.api.rules.ReceptionRule;
import HospitalTransformRules.api.rules.ReleasePatientRule;
import HospitalTransformRules.api.rules.RoomRule;
import java.util.function.Supplier;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;

/**
 * The HospitalTransformRulesAPI with 9 rules and 32 patterns.
 */
public class HospitalTransformRulesAPI extends GraphTransformationAPI {
	
	public static String patternPath = "HospitalTransformRules/src-gen/HospitalTransformRules/api/ibex-patterns.xmi";

	/**
	 * Creates a new HospitalTransformRulesAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public HospitalTransformRulesAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
		patternMap = initiatePatternMap();
		gillespieMap = initiateGillespieMap();
	}

	/**
	 * Creates a new HospitalTransformRulesAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public HospitalTransformRulesAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
		patternMap = initiatePatternMap();
		gillespieMap = initiateGillespieMap();
	}
	
	@Override
	protected Map<String, Supplier<? extends GraphTransformationPattern<?,?>>> initiatePatternMap(){
		Map<String, Supplier<? extends GraphTransformationPattern<?,?>>> map = new HashMap<>();
		map.put("assignPatientToRoom", () -> assignPatientToRoom());
		map.put("hospital", () -> hospital());
		map.put("reception", () -> reception());
		map.put("doctorInDepartment", () -> doctorInDepartment());
		map.put("findDepartment", () -> findDepartment());
		map.put("findDepartmentWithoutDoctor", () -> findDepartmentWithoutDoctor());
		map.put("findDocWithPatient", () -> findDocWithPatient());
		map.put("findDoctor", () -> findDoctor());
		map.put("findHospital", () -> findHospital());
		map.put("findNurse", () -> findNurse());
		map.put("findNurseInRoom", () -> findNurseInRoom());
		map.put("findOccupiedDoc", () -> findOccupiedDoc());
		map.put("findPatient", () -> findPatient());
		map.put("findPatientInReception", () -> findPatientInReception());
		map.put("findPatientInRoom", () -> findPatientInRoom());
		map.put("findPatientWithDoc", () -> findPatientWithDoc());
		map.put("findReception", () -> findReception());
		map.put("findRoom", () -> findRoom());
		map.put("findRoomInDepartment", () -> findRoomInDepartment());
		map.put("findRoomWithoutNurse", () -> findRoomWithoutNurse());
		return map;
	}
	
	@Override
	protected Map<GraphTransformationRule<?,?>, double[]> initiateGillespieMap(){
		Map<GraphTransformationRule<?,?>, double[]> map = 
			new HashMap<>();
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>assignNurseToRoom(name, staffID)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public AssignNurseToRoomRule assignNurseToRoom(final java.lang.String nameValue, final int staffIDValue) {
		try{
			AssignNurseToRoomRule rule = (AssignNurseToRoomRule) interpreter.getRegisteredGraphTransformationPattern("assignNurseToRoom");
			rule.setName(nameValue);
			rule.setStaffID(staffIDValue);
			return rule;
		} catch(Exception e) {
			return new AssignNurseToRoomRule(this, interpreter, nameValue, staffIDValue);
		}
	}
	/**
	* Creates a new instance of the rule <code>assignPatientToRoom()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public AssignPatientToRoomRule assignPatientToRoom() {
		try{
			AssignPatientToRoomRule rule = (AssignPatientToRoomRule) interpreter.getRegisteredGraphTransformationPattern("assignPatientToRoom");
			return rule;
		} catch(Exception e) {
			return new AssignPatientToRoomRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>department(dID, maxRoomCount)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public DepartmentRule department(final int dIDValue, final int maxRoomCountValue) {
		try{
			DepartmentRule rule = (DepartmentRule) interpreter.getRegisteredGraphTransformationPattern("department");
			rule.setDID(dIDValue);
			rule.setMaxRoomCount(maxRoomCountValue);
			return rule;
		} catch(Exception e) {
			return new DepartmentRule(this, interpreter, dIDValue, maxRoomCountValue);
		}
	}
	/**
	* Creates a new instance of the rule <code>doctor(capacity, name, staffID)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public DoctorRule doctor(final int capacityValue, final java.lang.String nameValue, final int staffIDValue) {
		try{
			DoctorRule rule = (DoctorRule) interpreter.getRegisteredGraphTransformationPattern("doctor");
			rule.setCapacity(capacityValue);
			rule.setName(nameValue);
			rule.setStaffID(staffIDValue);
			return rule;
		} catch(Exception e) {
			return new DoctorRule(this, interpreter, capacityValue, nameValue, staffIDValue);
		}
	}
	/**
	* Creates a new instance of the rule <code>hospital()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public HospitalRule hospital() {
		try{
			HospitalRule rule = (HospitalRule) interpreter.getRegisteredGraphTransformationPattern("hospital");
			return rule;
		} catch(Exception e) {
			return new HospitalRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>patient(name, patientId, level)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public PatientRule patient(final java.lang.String nameValue, final int patientIdValue, final Carelevel levelValue) {
		try{
			PatientRule rule = (PatientRule) interpreter.getRegisteredGraphTransformationPattern("patient");
			rule.setName(nameValue);
			rule.setPatientId(patientIdValue);
			rule.setLevel(levelValue);
			return rule;
		} catch(Exception e) {
			return new PatientRule(this, interpreter, nameValue, patientIdValue, levelValue);
		}
	}
	/**
	* Creates a new instance of the rule <code>reception()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public ReceptionRule reception() {
		try{
			ReceptionRule rule = (ReceptionRule) interpreter.getRegisteredGraphTransformationPattern("reception");
			return rule;
		} catch(Exception e) {
			return new ReceptionRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>releasePatient(patientID)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public ReleasePatientRule releasePatient(final int patientIDValue) {
		try{
			ReleasePatientRule rule = (ReleasePatientRule) interpreter.getRegisteredGraphTransformationPattern("releasePatient");
			rule.setPatientID(patientIDValue);
			return rule;
		} catch(Exception e) {
			return new ReleasePatientRule(this, interpreter, patientIDValue);
		}
	}
	/**
	* Creates a new instance of the rule <code>room(cap, carelvl)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public RoomRule room(final int capValue, final Carelevel carelvlValue) {
		try{
			RoomRule rule = (RoomRule) interpreter.getRegisteredGraphTransformationPattern("room");
			rule.setCap(capValue);
			rule.setCarelvl(carelvlValue);
			return rule;
		} catch(Exception e) {
			return new RoomRule(this, interpreter, capValue, carelvlValue);
		}
	}
	/**
	* Creates a new instance of the pattern <code>doctorInDepartment()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public DoctorInDepartmentPattern doctorInDepartment() {
		try{
			DoctorInDepartmentPattern pattern = (DoctorInDepartmentPattern) interpreter.getRegisteredGraphTransformationPattern("doctorInDepartment");
			return pattern;
		} catch(Exception e) {
			return new DoctorInDepartmentPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findDepartment()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindDepartmentPattern findDepartment() {
		try{
			FindDepartmentPattern pattern = (FindDepartmentPattern) interpreter.getRegisteredGraphTransformationPattern("findDepartment");
			return pattern;
		} catch(Exception e) {
			return new FindDepartmentPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findDepartmentWithoutDoctor()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindDepartmentWithoutDoctorPattern findDepartmentWithoutDoctor() {
		try{
			FindDepartmentWithoutDoctorPattern pattern = (FindDepartmentWithoutDoctorPattern) interpreter.getRegisteredGraphTransformationPattern("findDepartmentWithoutDoctor");
			return pattern;
		} catch(Exception e) {
			return new FindDepartmentWithoutDoctorPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findDocWithPatient()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindDocWithPatientPattern findDocWithPatient() {
		try{
			FindDocWithPatientPattern pattern = (FindDocWithPatientPattern) interpreter.getRegisteredGraphTransformationPattern("findDocWithPatient");
			return pattern;
		} catch(Exception e) {
			return new FindDocWithPatientPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findDoctor()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindDoctorPattern findDoctor() {
		try{
			FindDoctorPattern pattern = (FindDoctorPattern) interpreter.getRegisteredGraphTransformationPattern("findDoctor");
			return pattern;
		} catch(Exception e) {
			return new FindDoctorPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findHospital()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindHospitalPattern findHospital() {
		try{
			FindHospitalPattern pattern = (FindHospitalPattern) interpreter.getRegisteredGraphTransformationPattern("findHospital");
			return pattern;
		} catch(Exception e) {
			return new FindHospitalPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findNurse()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindNursePattern findNurse() {
		try{
			FindNursePattern pattern = (FindNursePattern) interpreter.getRegisteredGraphTransformationPattern("findNurse");
			return pattern;
		} catch(Exception e) {
			return new FindNursePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findNurseInRoom()</code> which does the following:
	* First condition to forbid finding a Nurse in a Room when she already has a room
	*
	* @return the new instance of the patternÂ»
	*/
	public FindNurseInRoomPattern findNurseInRoom() {
		try{
			FindNurseInRoomPattern pattern = (FindNurseInRoomPattern) interpreter.getRegisteredGraphTransformationPattern("findNurseInRoom");
			return pattern;
		} catch(Exception e) {
			return new FindNurseInRoomPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findOccupiedDoc()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindOccupiedDocPattern findOccupiedDoc() {
		try{
			FindOccupiedDocPattern pattern = (FindOccupiedDocPattern) interpreter.getRegisteredGraphTransformationPattern("findOccupiedDoc");
			return pattern;
		} catch(Exception e) {
			return new FindOccupiedDocPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findPatient()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindPatientPattern findPatient() {
		try{
			FindPatientPattern pattern = (FindPatientPattern) interpreter.getRegisteredGraphTransformationPattern("findPatient");
			return pattern;
		} catch(Exception e) {
			return new FindPatientPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findPatientInReception()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindPatientInReceptionPattern findPatientInReception() {
		try{
			FindPatientInReceptionPattern pattern = (FindPatientInReceptionPattern) interpreter.getRegisteredGraphTransformationPattern("findPatientInReception");
			return pattern;
		} catch(Exception e) {
			return new FindPatientInReceptionPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findPatientInRoom()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindPatientInRoomPattern findPatientInRoom() {
		try{
			FindPatientInRoomPattern pattern = (FindPatientInRoomPattern) interpreter.getRegisteredGraphTransformationPattern("findPatientInRoom");
			return pattern;
		} catch(Exception e) {
			return new FindPatientInRoomPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findPatientWithDoc()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindPatientWithDocPattern findPatientWithDoc() {
		try{
			FindPatientWithDocPattern pattern = (FindPatientWithDocPattern) interpreter.getRegisteredGraphTransformationPattern("findPatientWithDoc");
			return pattern;
		} catch(Exception e) {
			return new FindPatientWithDocPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findReception()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindReceptionPattern findReception() {
		try{
			FindReceptionPattern pattern = (FindReceptionPattern) interpreter.getRegisteredGraphTransformationPattern("findReception");
			return pattern;
		} catch(Exception e) {
			return new FindReceptionPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findRoom()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindRoomPattern findRoom() {
		try{
			FindRoomPattern pattern = (FindRoomPattern) interpreter.getRegisteredGraphTransformationPattern("findRoom");
			return pattern;
		} catch(Exception e) {
			return new FindRoomPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findRoomInDepartment()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindRoomInDepartmentPattern findRoomInDepartment() {
		try{
			FindRoomInDepartmentPattern pattern = (FindRoomInDepartmentPattern) interpreter.getRegisteredGraphTransformationPattern("findRoomInDepartment");
			return pattern;
		} catch(Exception e) {
			return new FindRoomInDepartmentPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findRoomWithoutNurse()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindRoomWithoutNursePattern findRoomWithoutNurse() {
		try{
			FindRoomWithoutNursePattern pattern = (FindRoomWithoutNursePattern) interpreter.getRegisteredGraphTransformationPattern("findRoomWithoutNurse");
			return pattern;
		} catch(Exception e) {
			return new FindRoomWithoutNursePattern(this, interpreter);
		}
	}
}
