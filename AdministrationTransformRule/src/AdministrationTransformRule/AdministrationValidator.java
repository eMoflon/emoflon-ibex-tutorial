package AdministrationTransformRule;

import org.eclipse.emf.common.util.URI;

import AdministrationTransformRule.api.AdministrationTransformRuleDemoclesApp;

public class AdministrationValidator extends AdministrationTransformRuleDemoclesApp {

	public AdministrationValidator() {
		
		
		String filePathUrl = workspacePath + "Hospital2Administration/instances/trg.xmi";
		
		loadModel(URI.createFileURI(filePathUrl));
		
	}

}