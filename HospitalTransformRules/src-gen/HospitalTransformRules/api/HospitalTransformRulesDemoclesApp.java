package HospitalTransformRules.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the HospitalTransformRulesAPI with Democles.
 */
public class HospitalTransformRulesDemoclesApp extends HospitalTransformRulesApp {

	/**
	 * Creates the application with Democles.
	 */
	public HospitalTransformRulesDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public HospitalTransformRulesDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
