package decorator;

public class Client {

	public static void main(String[] args) {
		Beverage beverage = new Caramel(new Espresso());
		System.out.println(beverage.cost());
	}
}
