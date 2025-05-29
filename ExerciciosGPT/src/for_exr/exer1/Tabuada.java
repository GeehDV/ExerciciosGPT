package for_exr.exer1;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int N = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}
}
