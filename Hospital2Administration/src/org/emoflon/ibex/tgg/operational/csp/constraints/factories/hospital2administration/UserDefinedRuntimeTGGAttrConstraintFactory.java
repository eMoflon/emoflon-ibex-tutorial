package org.emoflon.ibex.tgg.operational.csp.constraints.factories.hospital2administration;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nursesalary;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("doctorsalary", () -> new UserDefined_doctorsalary());
		creators.put("nursesalary", () -> new UserDefined_nursesalary());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
