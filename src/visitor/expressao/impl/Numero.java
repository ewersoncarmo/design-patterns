package visitor.expressao.impl;

import visitor.expressao.Expressao;
import visitor.impressora.Visitor;

public class Numero implements Expressao {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
	}
}
