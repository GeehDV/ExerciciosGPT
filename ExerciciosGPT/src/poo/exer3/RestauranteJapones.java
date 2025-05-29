package poo.exer3;

public class RestauranteJapones extends Restaurante {
	
	@Override 
	void exibirInfo() {
		System.out.println("\nRestaurante Japonês \"" + nome + "\", possui nota de: " + notaAvaliacao + " estrelas.");
	}

}
