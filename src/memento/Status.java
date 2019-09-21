package memento;

public class Status {

	private Contract contract;

	public Status(Contract contract) {
		this.contract = contract;
	}
	
	public Contract getContract() {
		return this.contract;
	}
}
