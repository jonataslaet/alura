package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ImpostoISS implements Imposto{

	@Override
	public BigDecimal getTaxa(Orcamento orcamento) {
		return new BigDecimal("0.1").multiply(orcamento.getValor());
	}

}
