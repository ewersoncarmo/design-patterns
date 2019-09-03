package builder;

import builder.model.Item;
import builder.model.Bill;

public class Programa {

	public static void main(String[] args) {
		Bill bill = new BillBuilder()
			.forCorporate("Corporate Express")
			.withCnpj("30.959.864/0001-04")
			.withItems(new Item("item 1", 200.0))
			.withItems(new Item("item 2", 400.0))
			.withComments("Comments")
			.onCurrentDate()
			.build();

		System.out.println(bill);
	}
}
