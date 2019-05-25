package decorator.tax;

import decorator.model.Budget;

/**
 * Decorator: Abstract class which defines an interface to be implemented by its concrete classes.
 * It decorates other components.
 * 
 * @author Ewerson Carmo
 *
 */
public abstract class Tax {

	protected Tax otherTax;

	public Tax() {}
	
	public Tax(Tax otherTax) {
		this.otherTax = otherTax;
	}
	
	public abstract double calculate(Budget budget);
	
	protected double otherTaxCalculation(Budget budget) {
		if (this.otherTax == null)
			return 0;
		
		return this.otherTax.calculate(budget);
	}
}
