package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
		return imposto.getTaxa(orcamento);
	}

}
