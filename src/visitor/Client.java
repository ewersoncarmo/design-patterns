package visitor;

import visitor.expression.Expression;
import visitor.expression.impl.Number;
import visitor.expression.impl.Subtraction;
import visitor.expression.impl.Sum;
import visitor.printer.Visitor;
import visitor.printer.impl.PrinterVisitor;

public class Client {

	public static void main(String[] args) {
		Expression left = new Subtraction(new Sum(new Number(5), new Number(7)), new Number(5));
		Expression right = new Sum(new Number(2), new Number(10));
		Expression sum = new Sum(left, right);

		System.out.println("expression value: " + sum.validate());
		
		Visitor printer = new PrinterVisitor();
		
		System.out.print("left => ");
		left.accept(printer);
		System.out.println();
		
		System.out.print("right => ");
		right.accept(printer);
		System.out.println();
		
		System.out.print("sum => ");
		sum.accept(printer);
	}
}
