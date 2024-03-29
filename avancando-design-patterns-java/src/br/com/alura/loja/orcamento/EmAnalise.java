package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
