package for_exr.exer1;

import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		scan.close();
		
		
		for (int i = N; i >= 1; i--) {
			System.out.println(i);
		}
		
			System.out.println("Lançamento!");
	}
}
