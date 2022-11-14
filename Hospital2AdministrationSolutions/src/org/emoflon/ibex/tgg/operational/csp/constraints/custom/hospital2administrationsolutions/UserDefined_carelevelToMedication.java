package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions;

import java.util.Random;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

import AdministrationExample.Medication;
import HospitalExample.Carelevel;

public class UserDefined_carelevelToMedication extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint carelevelToMedication(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -CARELEVELTOMEDICATION- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);
		
		
		int lengthMeds = Medication.values().length-1;
		int randMedNumber = new Random().nextInt(lengthMeds);
		
		int lengthCare = Carelevel.values().length-1;
		int randCareNumber = new Random().nextInt(lengthCare);
		
		
		
		

	  	switch(bindingStates) {
	  		case "BB": {
	  			setSatisfied(v0.getValue().equals(v1.getValue()));
	  			break;
	  		}
	  		case "BF": {
	  			switch((Carelevel)v0.getValue()) {
					case MEDIUM:
						v1.bindToValue(Medication.MEDIUM);
						break;
					case STRONG:
						v1.bindToValue(Medication.STRONG);
						break;
					case WEAK:
						v1.bindToValue(Medication.WEAK);
						break;
					case PENDING:
						v1.bindToValue(Medication.PENDING);
						break;
	  			}
	  			setSatisfied(true);
	  		}
	  		case "FB": {
	  			switch((Medication)v1.getValue()) {
					case MEDIUM:
						v0.bindToValue(Carelevel.MEDIUM);
						break;
					case STRONG:
						v0.bindToValue(Carelevel.STRONG);
						break;
					case WEAK:
						v0.bindToValue(Carelevel.WEAK);
						break;
					case PENDING:
						v0.bindToValue(Carelevel.PENDING);
						break;
	  			}
	  			setSatisfied(true);
	  		}
	  		case "FF":
	  			v0.bindToValue(Carelevel.values()[randCareNumber]);
				v1.bindToValue(Medication.values()[randCareNumber]);
	  			setSatisfied(true);
	  			break;
	  			
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);


	  		}
	  	}
}

