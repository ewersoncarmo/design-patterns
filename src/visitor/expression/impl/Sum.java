package visitor.expression.impl;

import visitor.expression.Expression;
import visitor.printer.Visitor;

public class Sum implements Expression {

	private Expression left;
	private Expression right;

	public Sum(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int validate() {
		return left.validate() + right.validate();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSum(this);
	}
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}
	
}
