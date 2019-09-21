package memento;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		Historic historic = new Historic();
		
		// New
		Contract contract = new Contract(LocalDate.now(), "Client", ContractStatus.NEW);
		historic.add(contract.saveStatus());

		// In Progress
		contract.changeStatus();
		historic.add(contract.saveStatus());

		// Ok
		contract.changeStatus();
		historic.add(contract.saveStatus());
		
		// Resolved
		contract.changeStatus();
		historic.add(contract.saveStatus());
		
		System.out.println("Actual status: " + contract.getStatus());
		System.out.println("Previous statusr: " + historic.get(2).getContract().getStatus());
	}
}
