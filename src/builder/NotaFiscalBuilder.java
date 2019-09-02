package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import builder.modelo.Item;
import builder.modelo.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<Item> itens = new ArrayList<>();
	private String observacoes;
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(Item item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = LocalDate.now();
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
