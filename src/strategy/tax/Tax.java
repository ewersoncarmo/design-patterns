package strategy.tax;

import strategy.model.Budget;

/**
 * Strategy: Defines an interface to be implemented by its concrete classes.
 * 
 * @author Ewerson Carmo
 * 
 */
public interface Tax {

	double calculate(Budget budget);
}
