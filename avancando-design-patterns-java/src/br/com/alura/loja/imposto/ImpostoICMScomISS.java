package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ImpostoICMScomISS implements Imposto {

	@Override
	public BigDecimal getTaxa(Orcamento orcamento) {
		BigDecimal taxaICMS = new ImpostoICMS().getTaxa(orcamento);
		BigDecimal taxaISS = new ImpostoISS().getTaxa(orcamento);
		return taxaICMS.add(taxaISS);
	}

}
