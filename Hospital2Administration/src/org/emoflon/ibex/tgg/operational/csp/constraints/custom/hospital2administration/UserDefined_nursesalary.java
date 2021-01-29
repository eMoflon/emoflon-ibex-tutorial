package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration;

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
			v0.bindToValue(3000.0);
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
