package template_method;

public class Client {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.checkSecurityItems();

		Vehicle truck = new Truck();
		truck.checkSecurityItems();
	}
}
