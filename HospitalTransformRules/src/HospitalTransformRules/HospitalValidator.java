package HospitalTransformRules;

import org.eclipse.emf.common.util.URI;
import HospitalTransformRules.api.HospitalTransformRulesHiPEApp;

public class HospitalValidator extends HospitalTransformRulesHiPEApp  {
	
	public HospitalValidator() {
		createModel(URI.createURI("hospital.xmi"));
	}	

}
