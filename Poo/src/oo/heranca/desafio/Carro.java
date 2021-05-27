package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	 Carro( int velocidadeMaxima ) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}

	public void acelerar() {
		
		if( velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA ) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			System.out.println( "Máximo - " + toString() );
		} else {
			this.velocidadeAtual += getDelta();
			System.out.println( "Carro acelerando - " + toString() );
		}	
		
	}
	
	public void freiar() {
		
		if ( velocidadeAtual >= 5 ) {
			velocidadeAtual -= 5;
			System.out.println( "Freiando - " + toString() );
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		return " VelocidadeAtual = " + velocidadeAtual + "km/h";
	}
	
	

}
