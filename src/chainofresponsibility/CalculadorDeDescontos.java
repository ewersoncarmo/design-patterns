package chainofresponsibility;

import chainofresponsibility.desconto.Desconto;
import chainofresponsibility.desconto.impl.DescontoPorCincoItens;
import chainofresponsibility.desconto.impl.DescontoPorMaisDeQuinhentosReais;
import chainofresponsibility.desconto.impl.SemDesconto;
import chainofresponsibility.modelo.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto desconto1 = new DescontoPorCincoItens();
		Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto desconto3 = new SemDesconto();
		
		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto3);
		
		return desconto1.calcula(orcamento);
	}
}
