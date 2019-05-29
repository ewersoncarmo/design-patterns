package observer;

/**
 * Observable: This object will notify its observers
 * 
 * @author Ewerson Carmo
 *
 */
public interface Restaurant {

	void addCustomer(Customer customer);
	void notifyCustomers();
}
