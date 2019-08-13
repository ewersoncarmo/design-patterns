package state;

public class Gate {

	private GateState gateState;
	
	public Gate() {
		this.gateState = new ClosedGateState(this);
	}
	
	public void changeState(GateState gateState) {
		this.gateState = gateState;
	}
	
	public void enter() {
		this.gateState.enter();
	}
	
	public void pay() {
		this.gateState.pay();
	}
	
	public void payOk() {
		this.gateState.payOk();
	}
	
	public void payFailed() {
		this.gateState.payFailed();
	}
	
}
