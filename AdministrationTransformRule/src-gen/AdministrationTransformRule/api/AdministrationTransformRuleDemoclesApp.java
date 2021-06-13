package AdministrationTransformRule.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the AdministrationTransformRuleAPI with Democles.
 */
public class AdministrationTransformRuleDemoclesApp extends AdministrationTransformRuleApp {

	/**
	 * Creates the application with Democles.
	 */
	public AdministrationTransformRuleDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public AdministrationTransformRuleDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
