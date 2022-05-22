package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcula(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
			case ISS:
				return new BigDecimal("0.1").multiply(orcamento.getValor());
			case ICMC:
				return new BigDecimal("0.2").multiply(orcamento.getValor());

			default:
				return BigDecimal.ZERO;
		}
	}

}
