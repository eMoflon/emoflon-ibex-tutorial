package org.emoflon.ibex.tgg.run.hospital2administrationsolutions.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;

import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdapter.IBeXOperation;
import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdapter.VictoryIBeXAdapter;

import org.emoflon.ibex.tgg.run.hospital2administrationsolutions.config.*;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

public class MODELGEN_App extends MODELGEN {

	private static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public MODELGEN_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		boolean restart = true;
		while (restart) {
		    restart = false;
		    
		    logger.info("Starting MODELGEN_Debug");
		    long tic = System.currentTimeMillis();
		    MODELGEN_App generator = new MODELGEN_App();
		    long toc = System.currentTimeMillis();
		    logger.info("Completed init for MODELGEN_Debug in: " + (toc - tic) + " ms");
		
		    MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		    generator.setStopCriterion(stop);
		    
		    VictoryIBeXAdapter adapter = VictoryIBeXAdapter.create(generator, IBeXOperation.MODELGEN);
			restart = adapter.run(() -> {
			       adapter.register(generator);
			       try {
				    logger.info("Starting MODELGEN_Debug");
				    long runTic = System.currentTimeMillis();
				    generator.run();
				    long runToc = System.currentTimeMillis();
				    logger.info("Completed MODELGEN_Debug in: " + (runToc - runTic) + " ms");
		
				    generator.saveModels();
				    generator.terminate();
				      } catch (IOException pIOE) {
				    logger.error("MODELGEN_Debug threw an IOException", pIOE);
				      }
		    });
		}
	}
	
}
