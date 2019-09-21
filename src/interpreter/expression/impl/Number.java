package interpreter.expression.impl;

import interpreter.expression.Expression;

public class Number implements Expression {

	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int validate() {
		return number;
	}
}
