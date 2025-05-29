package matematica;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		 
		//Ou Scanner input = new Scanner
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		final int soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		//Outro modo mais simples:
		//int soma1 = 74 + 36;
		//System.out.println("Soma é: " + soma1);
	}
}
