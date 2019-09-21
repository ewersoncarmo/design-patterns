package memento;

import java.time.LocalDate;

public class Contract {

	private LocalDate date;
	private String client;
	private ContractStatus status;

	public Contract(LocalDate date, String client, ContractStatus status) {
		this.date = date;
		this.client = client;
		this.status = status;
	}

	public void changeStatus() {
		if (this.status == ContractStatus.NEW)
			this.status = ContractStatus.IN_PROGRESS;
		else if (this.status == ContractStatus.IN_PROGRESS)
			this.status = ContractStatus.OK;
		else if (this.status == ContractStatus.OK)
			this.status = ContractStatus.RESOLVED;
	}
	
	public Status saveStatus() {
		return new Status(new Contract(this.date, this.client, this.status));
	}

	public ContractStatus getStatus() {
		return status;
	}
	
}
