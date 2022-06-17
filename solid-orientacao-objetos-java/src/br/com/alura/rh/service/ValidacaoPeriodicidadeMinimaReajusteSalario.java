package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeMinimaReajusteSalario {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("A periodicidade entre reajuste deve ser de no mínimo 6 meses!");
		}
	}
}
