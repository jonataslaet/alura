package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {
	
	public static void main(String[] args) {
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 5);
		Orcamento segundo = new Orcamento(new BigDecimal("501"), 5);
		
		System.out.println(calculadoraDeDescontos.calcular(primeiro));
		System.out.println(calculadoraDeDescontos.calcular(segundo));
	}

}
