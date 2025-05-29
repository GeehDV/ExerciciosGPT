package poo.exer3;

public class RestauranteBrasileiro extends Restaurante {
	
	@Override 
	void exibirInfo() {
		System.out.println("\nRestaurante Brasileiro \"" + nome + "\", possui nota de: " + notaAvaliacao + " estrelas.");
	}
}
