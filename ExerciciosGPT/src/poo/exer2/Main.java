package poo.exer2;

public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.nome = "Júlio";
		gato.raca = "Siamês";
		gato.emitirSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Mário";
		cachorro.raca = "Pastor-alemão";
		cachorro.emitirSom();
	}
}
