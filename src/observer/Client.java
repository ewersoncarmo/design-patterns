package observer;

public class Client {

	public static void main(String[] args) {
		Restaurant restaurant = new McDonalds();
		restaurant.addCustomer(new PersonCustomer());
		restaurant.addCustomer(new Delivery());
		
		restaurant.notifyCustomers();
	}
}
