package if_else.exer1;

import java.util.Scanner;

public class Pokémon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o nome do seu pokémon:");
		String pokemon = scanner.nextLine();
		pokemon = pokemon.toLowerCase(); // deixa tudo minusculo 
		scanner.close();
		
		if(pokemon.equals("pikachu")) {
			System.out.println("Tipo: Elétrico");
		} else if (pokemon.equals("charmander")) {
			System.out.println("Tipo: Fogo");
		} else if (pokemon.equals("bulbasaur")) {
			System.out.println("Tipo: Planta");
		} else if (pokemon.equals("squirtle")) {
			System.out.println("Tipo: Água");
		} else if (pokemon.equals("jigglypuff")) {
			System.out.println("Tipo: Fada");
		} else {
			System.out.println("Tipo desconhecido");
		}
	}
}
