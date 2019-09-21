package visitor.expression;

import visitor.printer.Visitor;

public interface Expression {

	int validate();
	void accept(Visitor visitor);
}
