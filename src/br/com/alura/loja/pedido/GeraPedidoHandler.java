package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	List<AcoesAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcoesAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido gerador) {
		Orcamento orcamento = new Orcamento(gerador.getValorOrcamento(), gerador.getQuantidadeItens());

		Pedido pedido = new Pedido(gerador.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(acao -> {
			acao.executarAcoes(pedido);
		});

	}

}
