package org.emoflon.ibex.tgg.run.hospital2administrationsolutions;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.hospital2administrationsolutions.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.runtime.strategies.modules.TGGResourceHandler;

public class INTEGRATE_App extends INTEGRATE {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INTEGRATE_App() throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
				// Use the commented code below to implement saveModels individually.
				// source.save(null);
				// target.save(null);
				// corr.save(null);
				// protocol.save(null);
				
				super.saveModels();
			}
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				// source = loadResource(options.project.path() + "/instances/src.xmi");
				// target = createResource(options.project.path() + "/instances/trg.xmi");
				// corr = createResource(options.project.path() + "/instances/corr.xmi");
				// protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				
				super.loadModels();
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INTEGRATE");
		long tic = System.currentTimeMillis();
		INTEGRATE_App integrate = new INTEGRATE_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for INTEGRATE in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		integrate.integrate();
		toc = System.currentTimeMillis();
		logger.info("Completed INTEGRATE in: " + (toc - tic) + " ms");
		
		integrate.saveModels();
		integrate.terminate();
	}
}
