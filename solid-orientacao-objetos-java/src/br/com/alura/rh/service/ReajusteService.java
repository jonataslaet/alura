package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salario = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, LocalDate.now());
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("A periodicidade entre reajuste deve ser de no mínimo 6 meses!");
		}
		funcionario.atualizarSalario(salario);
	}
}
