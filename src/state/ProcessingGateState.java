package state;

public class ProcessingGateState implements GateState {

	private Gate gate;

	public ProcessingGateState(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void enter() {
		throw new RuntimeException("Processing payment, please wait");
	}

	@Override
	public void pay() {
		throw new RuntimeException("Processing payment, please wait");
	}

	@Override
	public void payOk() {
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payFailed() {
		this.gate.changeState(new ClosedGateState(this.gate));
	}

}
