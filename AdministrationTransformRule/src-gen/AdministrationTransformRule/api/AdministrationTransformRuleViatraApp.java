package AdministrationTransformRule.api;

import org.emoflon.ibex.gt.viatra.runtime.ViatraGTEngine;

/**
 * An application using the AdministrationTransformRuleAPI with Viatra.
 */
public class AdministrationTransformRuleViatraApp extends AdministrationTransformRuleApp {

	/**
	 * Creates the application with Viatra.
	 */
	public AdministrationTransformRuleViatraApp() {
		super(new ViatraGTEngine());
	}

	/**
	 * Creates the application with Viatra.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public AdministrationTransformRuleViatraApp(final String workspacePath) {
		super(new ViatraGTEngine(), workspacePath);
	}
}
