package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary;

import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraintVariable;

public class IncrementingDepartmentID extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint incrementingDepartmentID(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -INCREMENTINGDEPARTMENTID- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

	  	switch(bindingStates) {
	  		case "F": 
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}
