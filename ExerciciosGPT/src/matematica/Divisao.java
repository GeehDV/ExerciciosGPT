package matematica;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		//double divisao = 50/3;
		//System.out.println(" Resultado é:" + divisao);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = input.nextInt();
		
		final double divisao = num1 / num2;
		System.out.println(" O resultado da divisão é: " + divisao);
		
		
	}
}
