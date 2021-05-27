package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	public boolean ligarTurbo = false;
	public boolean ligarAr = false;
	
	public Ferrari() {
		this(350);
	}
	
	public Ferrari( int velocidadeMaxima ) {
		super( velocidadeMaxima );
	}
	
	// O professor fez está classe iniciando com valor de delta diferente, não precisando sobrescever o método acelerar
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}

}
