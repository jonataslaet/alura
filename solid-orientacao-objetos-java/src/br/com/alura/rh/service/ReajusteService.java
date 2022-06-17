package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajusteSalario> validacoesReajuste;
	

	public ReajusteService(List<ValidacaoReajusteSalario> validacoesReajuste) {
		this.validacoesReajuste = validacoesReajuste;
	}

	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoesReajuste.forEach(validacao -> validacao.validar(funcionario, aumento));
		funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
	}
}
