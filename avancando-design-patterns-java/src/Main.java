import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ImpostoICMS;
import br.com.alura.loja.imposto.ImpostoISS;
import br.com.alura.loja.orcamento.Orcamento;

public class Main {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100.0"), 100);
		orcamento.aprovar();
		orcamento.finalizar();
		
//		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
//		registroDeOrcamento.registrar(orcamento);
		
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		BigDecimal impostoCalculado = calculadoraDeImpostos.calcula(orcamento, new ImpostoICMS(new ImpostoISS(null)));
		System.out.println("Imposto calculado = " + impostoCalculado);
	}

}
