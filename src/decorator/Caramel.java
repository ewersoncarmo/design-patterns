package decorator;

public class Caramel extends Decorator {

	public Caramel(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double cost() {
		System.out.println(this.toString());
		return super.beverage.cost() + 2.0;
	}

	@Override
	public String toString() {
		return "Caramel ";
	}
}
