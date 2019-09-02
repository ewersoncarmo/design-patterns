package visitor.impressora.impl;

import visitor.expressao.impl.Numero;
import visitor.expressao.impl.Soma;
import visitor.expressao.impl.Subtracao;
import visitor.impressora.Visitor;

public class ImpressoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		soma.getEsquerda().aceita(this);
		
		System.out.print(" + ");
		
		soma.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitaSubracao(Subtracao subracao) {
		System.out.print("(");
		
		subracao.getEsquerda().aceita(this);
		
		System.out.print(" - ");
		
		subracao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
}
