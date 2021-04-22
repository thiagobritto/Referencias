package aula05;

import java.util.Scanner;

public class ProgramaDoWhileSorteio {

	public static void main(String[] args) {
		long numero = Math.round(Math.random()*(10)), chute;
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.println("Digite um número entre 1 e 10");
			chute = leitor.nextLong();
		} while (numero != chute);
		System.out.println("Você acertou!");
	}

}
