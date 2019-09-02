package chainofresponsibility.desconto.impl;

import chainofresponsibility.desconto.Desconto;
import chainofresponsibility.modelo.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		System.out.println("Sem desconto");
		return 0;
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		// Fim da cadeia, não tem próximo desconto
	}

}
