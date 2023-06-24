package HospitalTransformRules;

import org.eclipse.emf.common.util.URI;
import HospitalTransformRules.api.HospitalTransformRulesHiPEApp;

public class HospitalValidator extends HospitalTransformRulesHiPEApp  {
	
	public static String hospitalFilePath = "hospital.xmi";
	
	public HospitalValidator() {
		createModel(URI.createURI(hospitalFilePath));
	}	

}
