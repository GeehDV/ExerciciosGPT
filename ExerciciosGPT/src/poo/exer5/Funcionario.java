package poo.exer5;

public class Funcionario extends Pessoa {

	String cargo;
	double notaDesempenho;
	
	void avaliarPromoção() {
		if (notaDesempenho < 0 || notaDesempenho > 10){
		System.out.println("Nota Inválida: " + notaDesempenho);
		} else if(notaDesempenho < 8 ){
		System.out.println("Desculpe, você não está apto(a) para a promoção.");
		} else if (notaDesempenho >= 8) {
			System.out.println("Parabéns você foi aprovado(a)!");
		} else {
			System.out.println("Quem sabe na próxima...");
		}
	}
			
	@Override
	void apresentar() {
		System.out.println("\nOlá! Me chamo " + nome + " , tenho" + idade + " anos.");
	}
}
