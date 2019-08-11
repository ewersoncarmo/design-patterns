package iterator;

public interface InventoryIterator {
	boolean hasNext();
	void next();
	Item current();
}
