package visitor;

import visitor.expressao.Expressao;
import visitor.expressao.impl.Numero;
import visitor.expressao.impl.Soma;
import visitor.expressao.impl.Subtracao;
import visitor.impressora.Visitor;
import visitor.impressora.impl.ImpressoraVisitor;

public class Programa {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		
		Expressao soma = new Soma(esquerda, direita);
		System.out.println(soma.avalia());
		
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
	}
}
