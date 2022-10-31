package AdministrationTransformRule.api;

import AdministrationExample.AdministrationExamplePackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the AdministrationTransformRuleAPI.
 */
public class AdministrationTransformRuleApp extends GraphTransformationApp<AdministrationTransformRuleAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public AdministrationTransformRuleApp(final IContextPatternInterpreter engine) {
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
	public AdministrationTransformRuleApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(AdministrationExamplePackage.eINSTANCE);
	}

	@Override
	public AdministrationTransformRuleAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new AdministrationTransformRuleAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new AdministrationTransformRuleAPI(engine, resourceSet, workspacePath);
	}
}
