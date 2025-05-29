package matematica;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Primeiro número de entrada: " );
		int num1 = scan.nextInt();
		
		System.out.println("Segundo número de entrada: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
		
		// mais fácil
		//int x = 25;
		//int y = 5;
		
		//System.out.println(x + "x"+ y + "=" + x*y );
	}
}
