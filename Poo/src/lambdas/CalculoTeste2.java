package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// função anonima - lambda function que bate com a execução do método da interface
		Calculo calculo = (x,y) -> {
			return x + y;
		};
		
		System.out.println(calculo.executar(2, 3));
		
		// sem as chaves, automaticamente retorna o que está na sentença de código ( retorno implicito )
		calculo = (x,y) -> x * y;
		
		System.out.println(calculo.executar(2, 3));

	}

}
