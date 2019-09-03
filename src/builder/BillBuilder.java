package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import builder.model.Item;
import builder.model.Bill;

public class BillBuilder {

	private String corporateName;
	private String cnpj;
	private LocalDate date;
	private double value;
	private double taxes;
	private List<Item> items = new ArrayList<>();
	private String comments;
	
	public BillBuilder forCorporate(String corporateName) {
		this.corporateName = corporateName;
		return this;
	}
	
	public BillBuilder withCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public BillBuilder withItems(Item item) {
		this.items.add(item);
		this.value += item.getValue();
		this.taxes += item.getValue() * 0.05;
		return this;
	}
	
	public BillBuilder withComments(String comments) {
		this.comments = comments;
		return this;
	}
	
	public BillBuilder onCurrentDate() {
		this.date = LocalDate.now();
		return this;
	}
	
	public Bill build() {
		return new Bill(corporateName, cnpj, date, value, taxes, items, comments);
	}
}
