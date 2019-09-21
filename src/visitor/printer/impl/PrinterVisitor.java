package visitor.printer.impl;

import visitor.expression.impl.Number;
import visitor.expression.impl.Subtraction;
import visitor.expression.impl.Sum;
import visitor.printer.Visitor;

public class PrinterVisitor implements Visitor {

	@Override
	public void visitSum(Sum sum) {
		System.out.print("(");
		
		sum.getLeft().accept(this);
		
		System.out.print(" + ");
		
		sum.getRight().accept(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitSubtraction(Subtraction subtraction) {
		System.out.print("(");
		
		subtraction.getLeft().accept(this);
		
		System.out.print(" - ");
		
		subtraction.getRight().accept(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitNumber(Number number) {
		System.out.print(number.getNumber());
	}
}
