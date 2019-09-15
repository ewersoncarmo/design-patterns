package chainofresponsibility.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

	private double value;
	private List<Item> items;
	
	public Budget(double value) {
		this.value = value;
		this.items = new ArrayList<>();
	}

	public double getValue() {
		return value;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}
}
