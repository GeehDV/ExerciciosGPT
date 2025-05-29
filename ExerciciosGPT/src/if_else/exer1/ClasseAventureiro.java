package if_else.exer1;

import java.util.Scanner;

public class ClasseAventureiro {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String classe = scanner.nextLine();
		classe = classe.toLowerCase();
		scanner.close();
		
		if(classe.equals("guerreiro")) {
			System.out.println("Combate corpo a corpo");
		} else if (classe.equals("mago")) {
			System.out.println("Magia ofensiva");
		} else if (classe.equals("arqueiro")) {
			System.out.println("Ataque a distância");
		} else if (classe.equals("curandeiro")) {
			System.out.println("Cura e suporte");
		} else if (classe.equals("ladino")) {
			System.out.println("Furtividade e agilidade ");
		} else {
			System.out.println("Classe desconhecida");
		}
	}
}
