package poo.exer1;

public class Main {

	public static void main(String[] args) {
		
	
	Pessoa pessoa = new Pessoa();
	pessoa.nome = "Geovanna";
	pessoa.idade = 21;
	pessoa.cumprimentar();
	
	Carro carro = new Carro();
	carro.ano = 2003;
	carro.marca = "Fiat";
	carro.vendas();
	
	Livro livro = new Livro();
	livro.autor = "Dom Casmurro";
	livro.titulo = "O poeta";
	livro.informações();
	
	}
}
