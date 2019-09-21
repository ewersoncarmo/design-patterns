package visitor.printer;

import visitor.expression.impl.Number;
import visitor.expression.impl.Subtraction;
import visitor.expression.impl.Sum;

public interface Visitor {

	void visitSum(Sum sum);
	void visitSubtraction(Subtraction subtraction);
	void visitNumber(Number number);
}
