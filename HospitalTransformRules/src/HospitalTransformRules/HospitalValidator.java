package HospitalTransformRules;


import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.common.emf.EMFSaveUtils;
import org.moflon.core.utilities.eMoflonEMFUtil;

import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesDemoclesApp;
import HospitalTransformRules.api.HospitalTransformRulesHiPEApp;



public class HospitalValidator extends HospitalTransformRulesHiPEApp  {
	
	public HospitalValidator() {
		createModel(URI.createURI("hospital.xmi"));
		
		
		
		//eMoflonEMFUtil.saveModel(, "C:\\Users\\asfas\\HospitalEmoflonTutorial\\git\\emoflon-ibex-tutorial\\Hospital2Administration\\instances\\trg.xmi");
		//EMFSaveUtils.saveModel(, workspacePath+"hospital,xmi");
	
		
	
	
}	
	
	
	
	

}
