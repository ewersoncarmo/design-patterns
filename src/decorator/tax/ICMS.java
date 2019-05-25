package decorator.tax;

import decorator.model.Budget;

/**
 * Concrete decorator: Adds responsibility to the component. 
 * 
 * @author Ewerson Carmo
 *
 */
public class ICMS extends Tax {

	public ICMS() {}
	
	public ICMS(Tax otherTax) {
		super(otherTax);
	}
	
	@Override
	public double calculate(Budget budget) {
		System.out.println("Calculating ICMS");
		return budget.getAmount() * 0.1 + super.otherTaxCalculation(budget);
	}

}
