package visitor.expression.impl;

import visitor.expression.Expression;
import visitor.printer.Visitor;

public class Number implements Expression {

	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int validate() {
		return number;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNumber(this);
	}
	
	public int getNumber() {
		return number;
	}
}
