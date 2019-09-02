package visitor.expressao;

import visitor.impressora.Visitor;

public interface Expressao {

	int avalia();
	void aceita(Visitor impressora);
}
