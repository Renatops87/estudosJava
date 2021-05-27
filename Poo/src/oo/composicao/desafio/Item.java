package oo.composicao.desafio;

public class Item {
	
	final int qtde;
	final Produto produto;
	
	Item( int qtde, Produto produto ) {
		this.qtde = qtde;
		this.produto = produto; 
	}
	
	public String toString() {
		return produto.nome + " = " + qtde;
	}

}
