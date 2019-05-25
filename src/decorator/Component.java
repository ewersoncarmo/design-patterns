package decorator;

import decorator.model.Budget;
import decorator.tax.ICMS;
import decorator.tax.ISS;
import decorator.tax.Tax;

/**
 * Defines an interface to objects which can have responsibilities added dynamically.
 * 
 * @author user
 *
 */
public class Component {

	public static void main(String[] args) {
		Tax iss = new ISS(new ICMS());
		
		Budget budget = new Budget(500.0);
		
		System.out.println(iss.calculate(budget));
	}
}
