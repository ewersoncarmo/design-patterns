package chainofresponsibility;

import chainofresponsibility.model.Budget;
import chainofresponsibility.model.Item;

public class Client {

	public static void main(String[] args) {
		DiscountsCalculator calculator = new DiscountsCalculator();
		
		Budget budget = new Budget(600.0);
		budget.addItem(new Item("Pen", 250.0));
		budget.addItem(new Item("Pencil", 250.0));
		budget.addItem(new Item("Eraser", 250.0));
		budget.addItem(new Item("Notebook", 250.0));
		budget.addItem(new Item("Pencil sharpner", 250.0));
		
		System.out.println(calculator.calcula(budget));
	}

}
