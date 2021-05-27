package oo.heranca;

public class Monstro extends Jogador {
	
	// Duas formas de instanciar o monstro
		
	public Monstro() { 
		this(0, 0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}

}
