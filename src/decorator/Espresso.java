package decorator;

public class Espresso extends Beverage {

	@Override
	public double cost() {
		System.out.println(this.toString());
		return 3.0;
	}

	@Override
	public String toString() {
		return "Espresso ";
	}
}
