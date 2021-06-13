package AdministrationTransformRule.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the AdministrationTransformRuleAPI with HiPE.
 */
public class AdministrationTransformRuleHiPEApp extends AdministrationTransformRuleApp {

	/**
	 * Creates the application with HiPE.
	 */
	public AdministrationTransformRuleHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public AdministrationTransformRuleHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
