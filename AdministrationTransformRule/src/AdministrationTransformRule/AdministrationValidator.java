package AdministrationTransformRule;

import org.eclipse.emf.common.util.URI;

import AdministrationTransformRule.api.AdministrationTransformRuleDemoclesApp;
import AdministrationTransformRule.api.AdministrationTransformRuleHiPEApp;

public class AdministrationValidator extends AdministrationTransformRuleHiPEApp {

	public AdministrationValidator() {
		
		
		String filePathUrl = workspacePath + "Hospital2Administration/instances/trg.xmi";
		
		loadModel(URI.createFileURI(filePathUrl));
		
	}

}