package memento;

import java.time.LocalDate;

public class Contrato {

	private LocalDate data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(LocalDate data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	public void avanca() {
		if (this.tipo == TipoContrato.NOVO)
			this.tipo = TipoContrato.EM_ANDAMENTO;
		else if (this.tipo == TipoContrato.EM_ANDAMENTO)
			this.tipo = TipoContrato.ACERTADO;
		else if (this.tipo == TipoContrato.ACERTADO)
			this.tipo = TipoContrato.CONCLUIDO;
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}
}
