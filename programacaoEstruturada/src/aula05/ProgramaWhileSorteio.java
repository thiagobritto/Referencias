package aula05;

import java.util.Scanner;

public class ProgramaWhileSorteio {

	public static void main(String[] args) {
		long numero = Math.round(Math.random()*(10)), chute;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 1 e 10");
		chute = leitor.nextLong();
		
		while (numero != chute) {
			System.out.println("Digite um n�mero entre 1 e 10");
			chute = leitor.nextLong();
		}
		
		System.out.println("Voc� acertou!");
	}

}
