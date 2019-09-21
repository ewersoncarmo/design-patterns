package interpreter.expression.impl;

import interpreter.expression.Expression;

public class Subtraction implements Expression {

	private Expression left;
	private Expression right;

	public Subtraction(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int validate() {
		return left.validate() - right.validate();
	}
}
