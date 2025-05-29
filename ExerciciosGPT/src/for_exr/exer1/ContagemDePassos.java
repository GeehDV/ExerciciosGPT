package for_exr.exer1;

import java.util.Scanner;

public class ContagemDePassos {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		scan.close();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Subindo o degrau " + i);
		}
	}
}
