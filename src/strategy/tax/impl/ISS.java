package strategy.tax.impl;

import strategy.model.Budget;
import strategy.tax.Tax;

/**
 * Concrete strategy: Implements the algorithm using the interface.
 * 
 * @author user
 *
 */
public class ISS implements Tax {

	@Override
	public double calculate(Budget orcamento) {
		System.out.println("Calculating ISS");
		return orcamento.getAmount() * 0.06;
	}

}
