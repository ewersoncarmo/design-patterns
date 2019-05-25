package strategy;

import strategy.model.Budget;
import strategy.tax.Tax;
import strategy.tax.impl.ICMS;
import strategy.tax.impl.ISS;

/**
 * Interacts with the 'Strategy' interface in order to request the chosen algorithm.
 * 
 * @author user
 *
 */
public class Context {

	public static void main(String[] args) {
		Tax icms = new ICMS();
		Tax iss = new ISS();

		Budget budget = new Budget(500.0);
		
		TaxCalculator taxCalculator = new TaxCalculator();
		System.out.println(taxCalculator.calculate(budget, icms));
		System.out.println(taxCalculator.calculate(budget, iss));
	}

}
