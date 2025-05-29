package if_else.exer1;

import java.util.Scanner;

public class NivelAventureiro {

		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			
			/*
				"Iniciante" se o nível for de 1 a 20.

				"Aprendiz" se o nível for de 21 a 40.

				"Guerreiro" se o nível for de 41 a 60.

				"Veterano" se o nível for de 61 a 80.

				"Lendário" se o nível for de 81 a 100.

				"Nível inválido" se o número estiver fora desse intervalo.
				
				
				>= significa maior ou igual a

				<= significa menor ou igual a */
			
			int nível = scanner.nextInt();
			
			if (nível >= 1 && nível <= 20) {
				System.out.println("Iniciante");
			} else if (nível >= 21 && nível <= 40) {
				System.out.println("Aprendiz");
			} else if (nível >= 41 && nível <= 60) {
				System.out.println("Guerreiro");
			} else if (nível >= 61 && nível <= 80) {
				System.out.println("Veterano");
			} else if (nível >= 81 && nível <= 100) {
				System.out.println("Lendário");
			} else {
				System.out.println("Nível inválido!");
			}
		}
	}

