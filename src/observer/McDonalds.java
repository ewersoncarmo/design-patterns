package observer;

import java.util.ArrayList;
import java.util.List;

public class McDonalds implements Restaurant {

	private List<Customer> customers;
	
	public McDonalds() {
		this.customers = new ArrayList<>();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	@Override
	public void notifyCustomers() {
		this.customers.forEach(c -> c.deliver());
	}

}
