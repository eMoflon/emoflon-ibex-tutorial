package HospitalTransformRules.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the HospitalTransformRulesAPI with HiPE.
 */
public class HospitalTransformRulesHiPEApp extends HospitalTransformRulesApp {

	/**
	 * Creates the application with HiPE.
	 */
	public HospitalTransformRulesHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public HospitalTransformRulesHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
