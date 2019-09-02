package templatemethod;

public class Car extends Vehicle {

	@Override
	protected void checkTire() {
		System.out.println("Checking car tires");
	}

	@Override
	protected void checkBreak() {
		System.out.println("Checking car break");
	}

}
