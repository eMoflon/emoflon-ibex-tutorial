package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_incrementingStaffID extends RuntimeTGGAttributeConstraint
{private static int idIncrement = 1;

   /**
    * Constraint incrementingStaffID(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -INCREMENTINGSTAFFID- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

	  	switch(bindingStates) {
	  	case "F":
			v0.bindToValue(idIncrement++);
		case "B":
			setSatisfied(true);
			return; 
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

