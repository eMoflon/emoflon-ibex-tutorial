package org.emoflon.ibex.tgg.run.hospital2administration.config;

import java.io.IOException;
	
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;

public class _DefaultRegistrationHelper implements IRegistrationHelper{

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		new HiPERegistrationHelper().registerMetamodels(rs, executable);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		return new HiPERegistrationHelper().createIbexOptions();
	}
}
