package decorator.tax;

import decorator.model.Budget;

/**
 * Concrete decorator: Adds responsibility to the component. 
 * 
 * @author Ewerson Carmo
 *
 */
public class ISS extends Tax {

	public ISS() {}
	
	public ISS(Tax otherTax) {
		super(otherTax);
	}
	
	@Override
	public double calculate(Budget budget) {
		System.out.println("Calculating ISS");
		return budget.getAmount() * 0.06 + super.otherTaxCalculation(budget);
	}

}
