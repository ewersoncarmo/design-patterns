package chainofresponsibility.discount;

import chainofresponsibility.model.Budget;

public interface Discount {

	double calculate(Budget budget);
	void setNext(Discount nextDiscount);
}
