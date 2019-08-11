package iterator;

public class HandHeldInventory implements Inventory {

	private Item right;
	private Item left;
	
	public HandHeldInventory(Item right, Item left) {
		this.right = right;
		this.left = left;
	}

	public Item getRight() {
		return right;
	}

	public void setRight(Item right) {
		this.right = right;
	}
	
	public Item getLeft() {
		return left;
	}

	public void setLeft(Item left) {
		this.left = left;
	}

	@Override
	public InventoryIterator getIterator() {
		return new HandHeldInventoryIterator(this);
	}

}
