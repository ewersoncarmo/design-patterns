package state;

public class ClosedGateState implements GateState {

	private Gate gate;

	public ClosedGateState(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void enter() {
		throw new RuntimeException("The gate is closed. You need to pay first");
	}

	@Override
	public void pay() {
		System.out.println("Processing payment...");
		this.gate.changeState(new ProcessingGateState(this.gate));
	}

	@Override
	public void payOk() {
		System.out.println("Payment ok");
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payFailed() {
		throw new RuntimeException("Payment failed");
	}

}
