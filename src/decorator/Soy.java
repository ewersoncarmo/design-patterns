package decorator;

public class Soy extends Decorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double cost() {
		System.out.println(this.toString());
		return super.beverage.cost() + 1.0;
	}

	@Override
	public String toString() {
		return "Soy ";
	}
}
