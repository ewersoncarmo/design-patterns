package visitor.impressora;

import visitor.expressao.impl.Numero;
import visitor.expressao.impl.Soma;
import visitor.expressao.impl.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);
	void visitaSubracao(Subtracao subracao);
	void visitaNumero(Numero numero);
}
