package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Barbeador", 35.50);
		Produto produto2 = new Produto("Caneta Bic", 3.50);
		Produto produto3 = new Produto("Caderno", 4.80);
		
		Cliente cliente1 = new Cliente();
		cliente1.nomeCliente = "Renato";

		Compra compra1 = new Compra();
		compra1.adicionaItem(5, produto1);
		compra1.adicionaItem(3, produto2);
		compra1.adicionaItem(1, produto1);
		compra1.adicionaItem(3, produto3);
		
		cliente1.adicionarCompra( compra1 );
		System.out.println( compra1.toString() );
		
		Compra compra2 = new Compra();
		compra2.adicionaItem(5, produto1);
		compra2.adicionaItem(3, produto3);
		
		cliente1.adicionarCompra( compra2 );
		System.out.println( compra2.toString() );
		
		System.out.println( "Total das compras de " + cliente1.nomeCliente + " = " + cliente1.obterValorTotal() );
		
		System.out.println("---------------------------");
		
		Cliente cliente2 = new Cliente();
		cliente2.nomeCliente = "Thiago";
		
		Compra compra3 = new Compra();
		compra3.adicionaItem(5, produto1);
		compra3.adicionaItem(1, produto1);
		compra3.adicionaItem(3, produto3);
		
		Compra compra4 = new Compra();
		compra4.adicionaItem(2, produto1);
		compra4.adicionaItem(1, produto3);
		
		cliente2.adicionarCompra( compra3 );
		cliente2.adicionarCompra( compra4 );
		System.out.println( compra3.toString() );
		System.out.println( compra4.toString() );
		
		System.out.println( "Total das compras de " + cliente2.nomeCliente + " = " + cliente2.obterValorTotal() );
		

	}

}
