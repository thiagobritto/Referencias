package aula04;

import java.util.Scanner;

public class Pais {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a primeira letra de um pais");
		char letra = leitor.nextLine().charAt(0);
		
		switch (letra) {
			case 'a':
				System.out.println("Argentina");
				break;
			case 'b':
				System.out.println("Brasil");
				break;
			case 'c':
				System.out.println("Croacia");
				break;
			default:
				System.out.println("ainda não temos um pais com essa letra: \'"+(letra)+"\'");
		}
	}

}
