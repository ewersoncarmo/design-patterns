package chainofresponsibility;

import chainofresponsibility.discount.Discount;
import chainofresponsibility.discount.impl.DiscountForFiveItems;
import chainofresponsibility.discount.impl.DiscountForMoreThanFiveHundredReais;
import chainofresponsibility.discount.impl.NoDiscount;
import chainofresponsibility.model.Budget;

public class DiscountsCalculator {

	public double calcula(Budget budget) {
		Discount discount1 = new DiscountForFiveItems();
		Discount discount2 = new DiscountForMoreThanFiveHundredReais();
		Discount discount3 = new NoDiscount();
		
		discount1.setNext(discount2);
		discount2.setNext(discount3);
		
		return discount1.calculate(budget);
	}
}
