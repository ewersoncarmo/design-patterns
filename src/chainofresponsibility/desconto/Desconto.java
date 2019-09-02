package chainofresponsibility.desconto;

import chainofresponsibility.modelo.Orcamento;

public interface Desconto {

	double calcula(Orcamento orcamento);
	void setProximo(Desconto proximoDesconto);
}
