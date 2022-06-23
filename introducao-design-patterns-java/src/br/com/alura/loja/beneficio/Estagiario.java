package br.com.alura.loja.beneficio;

import java.math.BigDecimal;

public class Estagiario extends Funcionario implements Beneficio {

	@Override
	public BigDecimal valor() {
		return this.getSalario().multiply(new BigDecimal("0.3"));
	}

	@Override
	public BigDecimal tributo() {
		return BigDecimal.ZERO;
	}

}
