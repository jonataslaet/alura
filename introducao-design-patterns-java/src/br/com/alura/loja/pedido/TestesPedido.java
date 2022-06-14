package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {

	public static void main(String[] args) {
		String cliente = "Jonatas";
		BigDecimal valorOrcamento = new BigDecimal("45000");
		int quantidadeItens = Integer.parseInt("3");

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geradorHandler = new GeraPedidoHandler(
				Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados()));
		geradorHandler.execute(gerador);

	}

}
