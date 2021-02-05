package org.emoflon.ibex.tgg.operational.csp.constraints.factories.hospital2administration;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nursesalary;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_carelevelToMedication;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nametoname;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("doctorsalary", () -> new UserDefined_doctorsalary());
		creators.put("nursesalary", () -> new UserDefined_nursesalary());
		creators.put("carelevelToMedication", () -> new UserDefined_carelevelToMedication());
		creators.put("nametoname", () -> new UserDefined_nametoname());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
