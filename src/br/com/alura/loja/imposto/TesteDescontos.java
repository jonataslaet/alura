package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {
	
	public static void main(String[] args) {
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		System.out.println(calculadoraDeDescontos.calcular(new Orcamento(new BigDecimal("200"), 5)));
	}

}
