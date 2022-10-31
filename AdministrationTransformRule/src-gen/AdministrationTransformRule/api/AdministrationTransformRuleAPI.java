package AdministrationTransformRule.api;

import AdministrationExample.Daytime;
import AdministrationTransformRule.api.rules.AdministrationRule;
import AdministrationTransformRule.api.rules.EarlyshiftRule;
import AdministrationTransformRule.api.rules.FindAdministrationPattern;
import AdministrationTransformRule.api.rules.FindCoveredPatientPattern;
import AdministrationTransformRule.api.rules.FindEarlyShiftPattern;
import AdministrationTransformRule.api.rules.FindLateShiftPattern;
import AdministrationTransformRule.api.rules.FindNightShiftPattern;
import AdministrationTransformRule.api.rules.FindPatientPattern;
import AdministrationTransformRule.api.rules.FindPersonPattern;
import AdministrationTransformRule.api.rules.FindShiftplanPattern;
import AdministrationTransformRule.api.rules.FindStaffPattern;
import AdministrationTransformRule.api.rules.FindTreatmentPattern;
import AdministrationTransformRule.api.rules.LateshiftRule;
import AdministrationTransformRule.api.rules.NightshiftRule;
import AdministrationTransformRule.api.rules.PatientCoveredRule;
import AdministrationTransformRule.api.rules.PatientRule;
import AdministrationTransformRule.api.rules.StaffRule;
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
 * The AdministrationTransformRuleAPI with 7 rules and 18 patterns.
 */
public class AdministrationTransformRuleAPI extends GraphTransformationAPI {
	
	public static String patternPath = "AdministrationTransformRule/src-gen/AdministrationTransformRule/api/ibex-patterns.xmi";

	/**
	 * Creates a new AdministrationTransformRuleAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public AdministrationTransformRuleAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
		patternMap = initiatePatternMap();
		gillespieMap = initiateGillespieMap();
	}

	/**
	 * Creates a new AdministrationTransformRuleAPI.
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
	public AdministrationTransformRuleAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
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
		map.put("administration", () -> administration());
		map.put("earlyshift", () -> earlyshift());
		map.put("lateshift", () -> lateshift());
		map.put("nightshift", () -> nightshift());
		map.put("patient", () -> patient());
		map.put("patientCovered", () -> patientCovered());
		map.put("findAdministration", () -> findAdministration());
		map.put("findCoveredPatient", () -> findCoveredPatient());
		map.put("findEarlyShift", () -> findEarlyShift());
		map.put("findLateShift", () -> findLateShift());
		map.put("findNightShift", () -> findNightShift());
		map.put("findPatient", () -> findPatient());
		map.put("findPerson", () -> findPerson());
		map.put("findShiftplan", () -> findShiftplan());
		map.put("findStaff", () -> findStaff());
		map.put("findTreatment", () -> findTreatment());
		return map;
	}
	
	@Override
	protected Map<GraphTransformationRule<?,?>, double[]> initiateGillespieMap(){
		Map<GraphTransformationRule<?,?>, double[]> map = 
			new HashMap<>();
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>administration()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public AdministrationRule administration() {
		try{
			AdministrationRule rule = (AdministrationRule) interpreter.getRegisteredGraphTransformationPattern("administration");
			return rule;
		} catch(Exception e) {
			return new AdministrationRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>earlyshift()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public EarlyshiftRule earlyshift() {
		try{
			EarlyshiftRule rule = (EarlyshiftRule) interpreter.getRegisteredGraphTransformationPattern("earlyshift");
			return rule;
		} catch(Exception e) {
			return new EarlyshiftRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>lateshift()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public LateshiftRule lateshift() {
		try{
			LateshiftRule rule = (LateshiftRule) interpreter.getRegisteredGraphTransformationPattern("lateshift");
			return rule;
		} catch(Exception e) {
			return new LateshiftRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>nightshift()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public NightshiftRule nightshift() {
		try{
			NightshiftRule rule = (NightshiftRule) interpreter.getRegisteredGraphTransformationPattern("nightshift");
			return rule;
		} catch(Exception e) {
			return new NightshiftRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>patient()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public PatientRule patient() {
		try{
			PatientRule rule = (PatientRule) interpreter.getRegisteredGraphTransformationPattern("patient");
			return rule;
		} catch(Exception e) {
			return new PatientRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>patientCovered()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public PatientCoveredRule patientCovered() {
		try{
			PatientCoveredRule rule = (PatientCoveredRule) interpreter.getRegisteredGraphTransformationPattern("patientCovered");
			return rule;
		} catch(Exception e) {
			return new PatientCoveredRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>staff(time1, time2)</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the ruleÂ»
	*/
	public StaffRule staff(final Daytime time1Value, final Daytime time2Value) {
		try{
			StaffRule rule = (StaffRule) interpreter.getRegisteredGraphTransformationPattern("staff");
			rule.setTime1(time1Value);
			rule.setTime2(time2Value);
			return rule;
		} catch(Exception e) {
			return new StaffRule(this, interpreter, time1Value, time2Value);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findAdministration()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindAdministrationPattern findAdministration() {
		try{
			FindAdministrationPattern pattern = (FindAdministrationPattern) interpreter.getRegisteredGraphTransformationPattern("findAdministration");
			return pattern;
		} catch(Exception e) {
			return new FindAdministrationPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findCoveredPatient()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindCoveredPatientPattern findCoveredPatient() {
		try{
			FindCoveredPatientPattern pattern = (FindCoveredPatientPattern) interpreter.getRegisteredGraphTransformationPattern("findCoveredPatient");
			return pattern;
		} catch(Exception e) {
			return new FindCoveredPatientPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findEarlyShift()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindEarlyShiftPattern findEarlyShift() {
		try{
			FindEarlyShiftPattern pattern = (FindEarlyShiftPattern) interpreter.getRegisteredGraphTransformationPattern("findEarlyShift");
			return pattern;
		} catch(Exception e) {
			return new FindEarlyShiftPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findLateShift()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindLateShiftPattern findLateShift() {
		try{
			FindLateShiftPattern pattern = (FindLateShiftPattern) interpreter.getRegisteredGraphTransformationPattern("findLateShift");
			return pattern;
		} catch(Exception e) {
			return new FindLateShiftPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findNightShift()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindNightShiftPattern findNightShift() {
		try{
			FindNightShiftPattern pattern = (FindNightShiftPattern) interpreter.getRegisteredGraphTransformationPattern("findNightShift");
			return pattern;
		} catch(Exception e) {
			return new FindNightShiftPattern(this, interpreter);
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
	* Creates a new instance of the pattern <code>findPerson()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindPersonPattern findPerson() {
		try{
			FindPersonPattern pattern = (FindPersonPattern) interpreter.getRegisteredGraphTransformationPattern("findPerson");
			return pattern;
		} catch(Exception e) {
			return new FindPersonPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findShiftplan()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindShiftplanPattern findShiftplan() {
		try{
			FindShiftplanPattern pattern = (FindShiftplanPattern) interpreter.getRegisteredGraphTransformationPattern("findShiftplan");
			return pattern;
		} catch(Exception e) {
			return new FindShiftplanPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findStaff()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindStaffPattern findStaff() {
		try{
			FindStaffPattern pattern = (FindStaffPattern) interpreter.getRegisteredGraphTransformationPattern("findStaff");
			return pattern;
		} catch(Exception e) {
			return new FindStaffPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>findTreatment()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the patternÂ»
	*/
	public FindTreatmentPattern findTreatment() {
		try{
			FindTreatmentPattern pattern = (FindTreatmentPattern) interpreter.getRegisteredGraphTransformationPattern("findTreatment");
			return pattern;
		} catch(Exception e) {
			return new FindTreatmentPattern(this, interpreter);
		}
	}
}
