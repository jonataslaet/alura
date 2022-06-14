package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class TestesPedido {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geradorHandler = new GeraPedidoHandler(/**/);
		geradorHandler.execute(gerador);
		
	}

}
