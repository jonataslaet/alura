package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import exception.DomainException;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Este orçamento não pode ser reprovado!");
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Este orçamento não pode ser aprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Este orçamento não pode ser finalizado!");
	}
	

}
