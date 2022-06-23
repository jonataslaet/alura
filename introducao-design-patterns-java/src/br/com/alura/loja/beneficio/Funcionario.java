package br.com.alura.loja.beneficio;

import java.math.BigDecimal;

public abstract class Funcionario {
	private String nome;
	private BigDecimal salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
