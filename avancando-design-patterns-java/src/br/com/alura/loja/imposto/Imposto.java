package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	protected abstract BigDecimal getTaxa(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal taxaDesteImposto = getTaxa(orcamento);
		BigDecimal taxaOutroImposto = BigDecimal.ZERO;
		if (this.outroImposto != null) {
			taxaOutroImposto = outroImposto.getTaxa(orcamento);
		}
		
		return taxaDesteImposto.add(taxaOutroImposto);
	}
}
