package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	
	public GeraPedidoHandler() {
	}
	
	
	public void execute(GeraPedido gerador) {
		Orcamento orcamento = new Orcamento(gerador.getValorOrcamento(), gerador.getQuantidadeItens());
		
		Pedido pedido = new Pedido(gerador.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no Banco de dados");
		System.out.println("Enviar email com dados do novo pedido");
		
	}

}
