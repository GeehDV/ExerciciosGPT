package poo.exer5;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Fábio";
		pessoa.sobrenome = "Pinto";
		pessoa.idade = 43;
		pessoa.apresentar();
		
		Funcionario func = new Funcionario();
		func.cargo = "Analista de Sistemas";
		func.notaDesempenho = 11.0;
		func.avaliarPromoção();
	}
}
