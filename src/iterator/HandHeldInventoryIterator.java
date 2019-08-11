package iterator;

public class HandHeldInventoryIterator implements InventoryIterator {

	private HandHeldInventory handHeldInventory;
	private int index = 0;

	public HandHeldInventoryIterator(HandHeldInventory handHeldInventory) {
		this.handHeldInventory = handHeldInventory;
	}

	@Override
	public boolean hasNext() {
		System.out.println("Validating if there is next item");
		return this.index < 2;
	}

	@Override
	public void next() {
		System.out.println("Getting next item");
		this.index++;
	}

	@Override
	public Item current() {
		System.out.println("Getting current item");
		switch (this.index) {
		case 0:
			return this.handHeldInventory.getRight();
		case 1:
			return this.handHeldInventory.getLeft();
		default:
			return null;
		}
	}

}
