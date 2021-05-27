package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic( 30 );
		
		// carro1.freiar(carro1);
		
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		civic.acelerar();
//		
//		System.out.println();
//		
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
//		civic.freiar();
		
		System.out.println();
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
//		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		
	}

}
