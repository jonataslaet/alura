package br.com.alura.rh.model;

import java.math.BigDecimal;

import br.com.alura.rh.ValidacaoException;

public class Terceirizado extends Funcionario {

	private String empresa;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super(nome, cpf, cargo, salario);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void promover(Cargo proximoCargo) {
		throw new ValidacaoException("Terceirizado não pode ser promovido!");
	}
	
	@Override
	public void atualizarSalario(BigDecimal salario) {
		throw new ValidacaoException("Terceirizado não pode ter seu salário atualizado!");
	}

}
