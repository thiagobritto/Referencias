package aula03;

import java.util.Scanner;

public class Leitor {

	public static void main(String[] args) {
		
		// Declaração de variaveis
		String nome;
		double peso;
		int idade;
		Scanner leitor = new Scanner(System.in);
	
		// Emtrada dos DADOS
		System.out.println("Digite seu nome");
		nome = leitor.nextLine();
		System.out.println("Digite seu peso");
		peso = leitor.nextDouble();
		System.out.println("Digite sua idade");
		idade = leitor.nextInt();
	
		// Saida dos DADOS
		System.out.println("---------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Idade: " + idade);
		System.out.println("---------------------------------");
	}

}
