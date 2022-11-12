package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration;

import java.util.Random;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;



public class UserDefined_nursesalary extends RuntimeTGGAttributeConstraint {

	/**
	 * Constraint nursesalary(v0)
	 * 
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -NURSESALARY- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);
		
		switch (bindingStates) {
		case "F":
			Random random = new Random();
			double minsalary = 0.0;
			double maxsalary = 5999;
			double randomsalary = minsalary + (random.nextDouble()*(maxsalary-minsalary));
			double roundedsalary = Math.round(randomsalary*100)/100.0;
			v0.bindToValue(roundedsalary);
			setSatisfied(true);
			break;
		case "B":
			setSatisfied((double) v0.getValue() < 6000);
			break;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);

		}
	}
}
