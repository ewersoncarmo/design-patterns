package builder.model;

public class Item {

	private String name;
	private double value;
	
	public Item(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", value=" + value + "]";
	}

}	
