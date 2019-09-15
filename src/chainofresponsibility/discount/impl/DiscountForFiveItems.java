package chainofresponsibility.discount.impl;

import chainofresponsibility.discount.Discount;
import chainofresponsibility.model.Budget;

public class DiscountForFiveItems implements Discount {

	private Discount nextDiscount;

	@Override
	public double calculate(Budget budget) {
		System.out.println("Calculating discount for five items");
		if (budget.getItems().size() >= 5) 
			return budget.getValue() * 0.1;
		else 
			return this.nextDiscount.calculate(budget);
	}

	@Override
	public void setNext(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}
}
