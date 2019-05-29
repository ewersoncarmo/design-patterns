package decorator;

/**
 * Decorator: Attaches additional responsibilities to an object.
 * 
 * @author Ewerson Carmo
 *
 */
public abstract class Decorator extends Beverage {

	protected Beverage beverage;

	public Decorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
