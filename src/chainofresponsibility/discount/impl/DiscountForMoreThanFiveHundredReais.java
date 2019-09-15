package chainofresponsibility.discount.impl;

import chainofresponsibility.discount.Discount;
import chainofresponsibility.model.Budget;

public class DiscountForMoreThanFiveHundredReais implements Discount {

	private Discount nextDiscount;

	@Override
	public double calculate(Budget budget) {
		System.out.println("Calculating discount for more than five hundred reais");
		if (budget.getValue() > 500.0) 
			return budget.getValue() * 0.07;
		else 
			return this.nextDiscount.calculate(budget);
	}

	@Override
	public void setNext(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}
}
