package builder;

import builder.modelo.Item;
import builder.modelo.NotaFiscal;

public class Programa {

	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
			.paraEmpresa("Consultório Vida Animal")
			.comCnpj("30.959.864/0001-04")
			.comItem(new Item("item 1", 200.0))
			.comItem(new Item("item 2", 400.0))
			.comObservacoes("observações")
			.naDataAtual()
			.constroi();

		System.out.println(notaFiscal);
	}
}
