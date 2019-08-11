package iterator;

public class Client {

	public static void main(String[] args) {
		Inventory inventory = new HandHeldInventory(new ItemImpl(), new ItemImpl());
		InventoryIterator iterator = inventory.getIterator();
		
		while (iterator.hasNext()) {
			iterator.current();
			iterator.next();
		}
	}
}
