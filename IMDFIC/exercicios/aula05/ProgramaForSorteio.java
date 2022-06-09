package aula05;

import java.util.Scanner;

public class ProgramaForSorteio {

	public static void main(String[] args) {
		long numero = Math.round(Math.random()*(10)), chute;
		Scanner leitor = new Scanner(System.in);
		
		for (int i=0; i==0;) {
			System.out.println("Digite um número entre 1 e 10");
			chute = leitor.nextLong();
			if (numero == chute) i=1;
		}
		
		System.out.println("Você acertou!");
	}

}
