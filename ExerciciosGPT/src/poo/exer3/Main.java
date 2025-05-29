package poo.exer3;

public class Main {
	
	public static void main(String[] args) {
	
	RestauranteJapones rJ = new RestauranteJapones();
	rJ.nome = "Xing Ling";
	rJ.notaAvaliacao = 4.5;
	rJ.exibirInfo();
	
	RestauranteBrasileiro rB = new RestauranteBrasileiro();
	rB.nome = "Comida Caseira da Jay";
	rB.notaAvaliacao = 5.5;
	rB.exibirInfo();
	
	}

}
