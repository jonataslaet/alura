package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ImpostoISS extends Imposto{

	public ImpostoISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal getTaxa(Orcamento orcamento) {
		return new BigDecimal("0.1").multiply(orcamento.getValor());
	}

}
