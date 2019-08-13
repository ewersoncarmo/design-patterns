package state;

public class OpenGateState implements GateState {

	private Gate gate;

	public OpenGateState(Gate gate) {
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		System.out.println("Entering...");
		this.gate.changeState(new ClosedGateState(this.gate));
		System.out.println("Closing gate");
	}

	@Override
	public void pay() {
		System.out.println("The gate is open");
	}

	@Override
	public void payOk() {
		System.out.println("The gate is open");
	}

	@Override
	public void payFailed() {
		throw new RuntimeException("Payment failed");
	}

}
