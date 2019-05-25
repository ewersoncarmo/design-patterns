package strategy;

import strategy.model.Budget;
import strategy.tax.Tax;

public class TaxCalculator {

	public double calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}
}
