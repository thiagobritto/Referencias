package testes;

import java.util.Scanner;

public class Start {
	
	private static final int QUANTIDADE_FILMES = 3;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Filme[] filme = new Filme[QUANTIDADE_FILMES];
		for (int i = 0; i < QUANTIDADE_FILMES; i++) {
			filme[i] = cadastro(input, i+1);
		}
		for (int i = 0; i < QUANTIDADE_FILMES; i++) {
			show(filme[i], i+1);
		}		
	}
	
	public static Filme cadastro(Scanner input, int indice) {
		Filme filme = new Filme();
		System.out.println("Digite o nome do filme "+(indice));
		filme.nome = input.nextLine();
		System.out.println("Digite o nome do autor do filme "+(indice));
		filme.autor = input.nextLine();
		System.out.println("Digite o ano do filme "+(indice));
		filme.ano = input.nextInt();
		System.out.println("Digite o preço do filme "+(indice));
		filme.preco = input.nextFloat();
		input.nextLine();
		return filme;
	}
	
	public static void show(Filme filme, int indice) {
		System.out.println("--------FILME "+(indice)+"--------");		
		System.out.println("Nome: " + filme.nome);		
		System.out.println("Autor: " + filme.autor);		
		System.out.println("Lançado em " + filme.ano);		
		System.out.println("R$ " + filme.preco);		
	}
}
