package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {
	
	public static void main(String[] args) {
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcula(new Orcamento(new BigDecimal("100"), 1), new ImpostoICMS()));
	}

}
