package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println( c1.estaLigado() );
		
		// Carro c2 = new Carro();
		
		// c1.motor = c2.motor;
		
		c1.ligar();
		System.out.println( c1.estaLigado() );
		
		System.out.println( c1.motor.giros() );
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println( c1.motor.giros() );
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println( c1.motor.giros() );
		
		// Exemplo relação bi-direcional
		System.out.println( c1.motor.carro.motor.carro.motor.giros() );
		
		// Faltou encapsulamento
		// c1.motor.fatorInjecao = -30;
		

	}

}
