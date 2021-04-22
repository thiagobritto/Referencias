package aula05;

import java.util.Scanner;

public class ProgramaWhileSorteio2 {

	public static void main(String[] args) {
		long numero = Math.round(Math.random()*(10)), chute = -1;
		Scanner leitor = new Scanner(System.in);
				
		while (numero != chute) {
			System.out.println("Digite um número entre 1 e 10");
			chute = leitor.nextLong();
		}
		
		System.out.println("Você acertou!");
	}

}
