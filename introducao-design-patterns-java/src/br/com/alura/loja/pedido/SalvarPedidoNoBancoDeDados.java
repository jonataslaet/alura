package br.com.alura.loja.pedido;

public class SalvarPedidoNoBancoDeDados implements AcoesAposGerarPedido {

	public void executarAcoes(Pedido pedido) {
		System.out.println("Salvar pedido no Banco de dados");
	}

}
