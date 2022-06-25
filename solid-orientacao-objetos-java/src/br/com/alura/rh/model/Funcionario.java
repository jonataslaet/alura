package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	public void atualizarSalario(BigDecimal salario) {
		this.dadosPessoais.setSalario(salario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo proximoCargo) {
		this.dadosPessoais.setCargo(proximoCargo);
	}
	
	public DadosPessoais getDadosPessoais() {
		return this.dadosPessoais;
	}

}
