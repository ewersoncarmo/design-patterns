package observer;

public class PersonCustomer implements Customer {

	@Override
	public void deliver() {
		System.out.println("Order is ready for eating");
	}

}
