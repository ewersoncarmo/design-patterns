package templatemethod;

public abstract class Vehicle {

	public void checkSecurityItems() {
		this.checkTire();
		this.checkBreak();
	}

	protected abstract void checkTire();
	protected abstract void checkBreak();
}
