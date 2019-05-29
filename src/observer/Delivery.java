package observer;

public class Delivery implements Customer {

	@Override
	public void deliver() {
		System.out.println("Order is ready for delivering");
	}

}
