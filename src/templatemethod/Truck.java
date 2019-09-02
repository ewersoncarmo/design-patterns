package templatemethod;

public class Truck extends Vehicle {

	@Override
	protected void checkTire() {
		System.out.println("Checking truck tires");
	}

	@Override
	protected void checkBreak() {
		System.out.println("Checking truck break");
	}

}
