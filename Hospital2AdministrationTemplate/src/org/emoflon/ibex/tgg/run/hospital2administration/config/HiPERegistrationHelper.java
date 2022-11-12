package org.emoflon.ibex.tgg.run.hospital2administration.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.hospital2administration.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import AdministrationExample.impl.AdministrationExamplePackageImpl;
import Hospital2Administration.Hospital2AdministrationPackage;
import Hospital2Administration.impl.Hospital2AdministrationPackageImpl;
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
		EPackage hospital2administrationPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/AdministrationExample/model/AdministrationExample.ecore");
			administrationexamplePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore");
			hospital2administrationPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/HospitalExample/model/HospitalExample.ecore");
			hospitalexamplePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore");
			hospital2administrationPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(hospitalexamplePack == null)
			hospitalexamplePack = HospitalExamplePackageImpl.init();
				
		if(administrationexamplePack == null)
			administrationexamplePack = AdministrationExamplePackageImpl.init();
		
		if(hospital2administrationPack == null) {
			hospital2administrationPack = Hospital2AdministrationPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore", Hospital2AdministrationPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Hospital2Administration/model/Hospital2Administration.ecore", Hospital2AdministrationPackage.eINSTANCE);
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
		options.project.name("Hospital2Administration");
		options.project.path("Hospital2Administration");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
