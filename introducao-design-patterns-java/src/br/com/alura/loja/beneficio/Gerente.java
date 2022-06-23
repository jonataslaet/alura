package br.com.alura.loja.beneficio;

import java.math.BigDecimal;

public class Gerente extends Funcionario implements Beneficio {

	@Override
	public BigDecimal valor() {
		return this.getSalario().multiply(new BigDecimal("0.45"));
	}

	@Override
	public BigDecimal tributo() {
		return this.getSalario().multiply(new BigDecimal("0.07"));
	}
}
