package org.emoflon.ibex.tgg.run.hospital2administrationsolutions.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.hospital2administrationsolutions.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import AdministrationExample.impl.AdministrationExamplePackageImpl;
import Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage;
import Hospital2AdministrationSolutions.impl.Hospital2AdministrationSolutionsPackageImpl;
import HospitalExample.impl.HospitalExamplePackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage hospitalexamplePack = null;
		EPackage administrationexamplePack = null;
		EPackage hospital2administrationsolutionsPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/AdministrationExample/model/AdministrationExample.ecore");
			administrationexamplePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Hospital2AdministrationSolutions/model/Hospital2AdministrationSolutions.ecore");
			hospital2administrationsolutionsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/HospitalExample/model/HospitalExample.ecore");
			hospitalexamplePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Hospital2Administrationsolutions/model/Hospital2AdministrationSolutions.ecore");
			hospital2administrationsolutionsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(hospitalexamplePack == null)
			hospitalexamplePack = HospitalExamplePackageImpl.init();
				
		if(administrationexamplePack == null)
			administrationexamplePack = AdministrationExamplePackageImpl.init();
		
		if(hospital2administrationsolutionsPack == null) {
			hospital2administrationsolutionsPack = Hospital2AdministrationSolutionsPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Hospital2AdministrationSolutions/model/Hospital2AdministrationSolutions.ecore", Hospital2AdministrationSolutionsPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Hospital2AdministrationSolutions/model/Hospital2AdministrationSolutions.ecore", Hospital2AdministrationSolutionsPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/HospitalExample/model/HospitalExample.ecore", hospitalexamplePack);
	    rs.getPackageRegistry().put("platform:/plugin/HospitalExample/model/HospitalExample.ecore", hospitalexamplePack);	
			
		rs.getPackageRegistry().put("platform:/resource/AdministrationExample/model/AdministrationExample.ecore", administrationexamplePack);
		rs.getPackageRegistry().put("platform:/plugin/AdministrationExample/model/AdministrationExample.ecore", administrationexamplePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Hospital2AdministrationSolutions");
		options.project.path("Hospital2AdministrationSolutions");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
