package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary;

import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraintVariable;

public class Nametoname extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint nametoname(v0, v1, v2, v3)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 4)
			throw new RuntimeException("The CSP -NAMETONAME- needs exactly 4 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		RuntimeTGGAttributeConstraintVariable v2 = variables.get(2);
		RuntimeTGGAttributeConstraintVariable v3 = variables.get(3);
		String bindingStates = getBindingStates(v0, v1, v2, v3);

	  	switch(bindingStates) {
	  		case "BBBB": 
	  		case "BBBF": 
	  		case "BBFB": 
	  		case "BFFB": 
	  		case "BFBB": 
	  		case "BFBF": 
	  		case "BBFF": 
	  		case "BFFF": 
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

