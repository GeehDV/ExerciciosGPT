package if_else.exer1;
import java.util.*;

public class Hora {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System. in);
		int Hora = scanner.nextInt();
		
		/*"Boa madrugada" se hora for entre 0 e 5.

		"Bom dia" se hora for entre 6 e 11.

		"Boa tarde" se hora for entre 12 e 17.

		"Boa noite" se hora for entre 18 e 23.*/
		
		if (Hora >= 0 && Hora <= 5) {
			System.out.println("Boa madrugada");
		} else if (Hora >= 6 && Hora <= 11) {
			System.out.println("Bom dia!");
		} else if (Hora >= 12 && Hora <= 17) {
			System.out.println("Boa tarde!");
		} else if (Hora >= 18 && Hora <= 23){
			System.out.println("Boa noite!");
		} else {
			System.out.println("Hora inválida");
		}
	}
}
