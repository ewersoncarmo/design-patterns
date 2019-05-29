package decorator;

public class Tea extends Beverage {

	@Override
	public double cost() {
		System.out.println(this.toString());
		return 2.0;
	}

	@Override
	public String toString() {
		return "Tea ";
	}
}
