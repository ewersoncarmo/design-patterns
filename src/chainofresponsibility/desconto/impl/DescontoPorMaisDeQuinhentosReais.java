package chainofresponsibility.desconto.impl;

import chainofresponsibility.desconto.Desconto;
import chainofresponsibility.modelo.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		System.out.println("Calculando desconto por mais de quinhentos reais");
		if (orcamento.getValor() > 500.0) 
			return orcamento.getValor() * 0.07;
		else 
			return this.proximoDesconto.calcula(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
