package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration;

import java.util.Random;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.emoflon.ibex.tgg.operational.csp.constraints.Concat;

public class UserDefined_nametoname extends Concat
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
		
		final String [] firstNames = {"Lars", "Sebastian", "Max"};
		final String [] lastNames = {"Fritsche", "Ehmes", "Klinge"};
		
		final Random random = new Random();

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
	  		case "BBFF": super.solve(); 
	  		break; 
	  		case "BFFF":
	  		
	  		String firstName = firstNames[random.nextInt(firstNames.length)];
	  			v1.bindToValue(firstName);
	  		String lastName = lastNames[random.nextInt(lastNames.length)];
	  			v2.bindToValue(lastName);
	  			v3.bindToValue(firstName + v0.getValue() + lastName);
	  		setSatisfied(true);	
	  			break;
	  			
	  			
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

