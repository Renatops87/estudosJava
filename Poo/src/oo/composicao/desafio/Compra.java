package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	static int numPedido;
	
	Compra() {
		numPedido += 1;
	}
	
	void adicionaItem( int qtd, Produto produto ) {
		Item item = new Item(qtd, produto);
		this.itens.add(item); // OBS: dá para instanciar o item dentro do parâmetro do método add
	}
	
	// abaixo metodo feito pelo professor para simplificar
	void adicionarItem( String nome, double preco, int qtde ) {
		this.itens.add( new Item( qtde, new Produto( nome, preco ) ) );
	}
	
	double obterValorTotalCompra() {
		double valorTotalCompra = 0;
		
		for (Item item : itens) {
			valorTotalCompra += item.qtde * item.produto.preco;
		}
		
		return valorTotalCompra;
	}
	
	public String toString() {
		
		return  "Compra Num: " + numPedido 
							   + "\n"
				               + "Itens : " + itens.toString() 
					           + "\n"
						       + "Total: "  + obterValorTotalCompra()
		                       + "\n";
	}

}
