package chainofresponsibility;

import chainofresponsibility.modelo.Item;
import chainofresponsibility.modelo.Orcamento;

public class Programa {

	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lápis", 250.0));
		orcamento.adicionaItem(new Item("Borracha", 250.0));
		orcamento.adicionaItem(new Item("Caderno", 250.0));
		orcamento.adicionaItem(new Item("Apontador", 250.0));
		
		System.out.println(calculador.calcula(orcamento));
	}

}
