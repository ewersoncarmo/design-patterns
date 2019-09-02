package chainofresponsibility.desconto.impl;

import chainofresponsibility.desconto.Desconto;
import chainofresponsibility.modelo.Orcamento;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double calcula(Orcamento orcamento) {
		System.out.println("Calculando desconto por cinco itens");
		if (orcamento.getItens().size() >= 5) 
			return orcamento.getValor() * 0.1;
		else 
			return this.proximoDesconto.calcula(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
