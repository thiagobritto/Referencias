package aula04;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Dogite \'s\' para sim e \'n\' para n�o:");
		char letra = leitor.nextLine().charAt(0);
		
		switch (letra) {
			case 's': 
				System.out.println("O usu�rio escolheu a op��o SIM");
				break;
			case 'n':
				System.out.println("O usu�rio escolheu a op��o N�O");
				break;
			default:
				System.out.println("O usu�rio digitou uma letra n�o cadastrada!");
		}
	}

}
