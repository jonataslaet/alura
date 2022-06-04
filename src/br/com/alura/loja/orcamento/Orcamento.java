package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private String situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = "EM ANALISE";
	}
	
	public void aplicarDescontoExstra() {
		BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
		if (situacao.equals("EM ANALISE")) {
			valorDoDescontoExtra = new BigDecimal("0.05");
		} else if (situacao.equals("APROVADO")) {
			valorDoDescontoExtra = new BigDecimal("0.02");
		}
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao = "APROVADO";
	}

	public void reprovar() {
		this.situacao = "REPROVADO";
	}
	
	public void finalizar() {
		this.situacao = "FINALIZADO";
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
}
