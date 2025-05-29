package poo.exer4;

public class Aluno {

	String nome;
	String curso;
	double notaFinal;
	
	void avaliarDesempenho() {
		if (notaFinal >= 7) {
			System.out.println(nome + " estudante de " + curso + " foi aprovado! ");
		} else {
			System.out.println(nome + " estudante de " + curso + " foi reprovado. ");
		}
	}
}
