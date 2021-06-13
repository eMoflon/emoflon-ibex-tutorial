package HospitalTransformRules.api;

import HospitalExample.HospitalExamplePackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the HospitalTransformRulesAPI.
 */
public class HospitalTransformRulesApp extends GraphTransformationApp<HospitalTransformRulesAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public HospitalTransformRulesApp(final IContextPatternInterpreter engine) {
		super(engine);
	}

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 * @param workspacePath
	 *            the workspace path
	 */
	public HospitalTransformRulesApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(HospitalExamplePackage.eINSTANCE);
	}

	@Override
	public HospitalTransformRulesAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new HospitalTransformRulesAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new HospitalTransformRulesAPI(engine, resourceSet, workspacePath);
	}
}
