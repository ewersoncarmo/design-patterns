package chainofresponsibility.discount.impl;

import chainofresponsibility.discount.Discount;
import chainofresponsibility.model.Budget;

public class NoDiscount implements Discount {

	@Override
	public double calculate(Budget budget) {
		System.out.println("No discount");
		return 0;
	}

	@Override
	public void setNext(Discount nextDiscount) {
		// End of the chain, no more discounts
	}

}
