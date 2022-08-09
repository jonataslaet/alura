package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.http.HttpAdapter;
import exception.DomainException;

public class RegistroDeOrcamento {
	
	private HttpAdapter httpAdapter;
	
	public RegistroDeOrcamento(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}



	public void registrar(Orcamento orcamento) {
		
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado");
		}
		
		String url = "http://api.externa/orcamento";
		
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidade", orcamento.getQuantidadeItens());
		
		httpAdapter.post(url, dados);
	}

}
