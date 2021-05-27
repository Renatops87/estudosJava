package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nomeCliente;
	final List<Compra> compras = new ArrayList<>();
	
	void adicionarCompra( Compra compra ) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		
		double valorTotal = 0;
		
		for (Compra compra : compras) {
			valorTotal += compra.obterValorTotalCompra();
		}
		
		return valorTotal;
		
	}
	
}
