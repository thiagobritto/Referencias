package aula04;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Dogite \'s\' para sim e \'n\' para não:");
		char letra = leitor.nextLine().charAt(0);
		
		switch (letra) {
			case 's': 
				System.out.println("O usuário escolheu a opção SIM");
				break;
			case 'n':
				System.out.println("O usuário escolheu a opção NÃO");
				break;
			default:
				System.out.println("O usuário digitou uma letra não cadastrada!");
		}
	}

}
