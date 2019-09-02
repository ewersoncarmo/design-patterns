package memento;

import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		Historico historico = new Historico();
		
		// Novo
		Contrato contrato = new Contrato(LocalDate.now(), "Cliente", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());

		// Em andamento
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		// Acertado
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		// Concluído
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		System.out.println("Estado atual: " + contrato.getTipo());
		System.out.println("Estado anterior: " + historico.pega(2).getContrato().getTipo());
	}
}
