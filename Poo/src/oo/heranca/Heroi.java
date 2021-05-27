package oo.heranca;

public class Heroi extends Jogador {
	
	// Heroi é um jogador
	
	public Heroi( int x, int y ) { // aqui, é parao caso de Jogador não ter construtor padrão
		super(x, y);
	}
	
	public boolean atacar( Jogador oponente ) {
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
		
	}

}
