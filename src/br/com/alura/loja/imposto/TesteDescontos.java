package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {
	
	public static void main(String[] args) {
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 5);
		Orcamento segundo = new Orcamento(new BigDecimal("521"), 5);
		
		System.out.println("Valor inicial do primeiro or�amento = " + primeiro.getValor());
		System.out.println("Desconto inicial do primeiro or�amento = "+calculadoraDeDescontos.calcular(primeiro));
		primeiro.aprovar();
		primeiro.aplicarDescontoExtra();
		System.out.println("Valor do primeiro or�amento ap�s desconto extra = "+primeiro.getValor());
		primeiro.finalizar();
		
		System.out.println();

		System.out.println("Valor inicial do segundo or�amento = " + segundo.getValor());
		System.out.println("Desconto inicial do segundo or�amento = "+calculadoraDeDescontos.calcular(segundo));
		segundo.aprovar();
		segundo.aplicarDescontoExtra();
		System.out.println("Valor do segundo or�amento ap�s desconto extra = "+segundo.getValor());
		segundo.finalizar();
		
	}

}
