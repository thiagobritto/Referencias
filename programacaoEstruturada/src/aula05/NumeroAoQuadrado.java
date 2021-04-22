package aula05;

import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		long numero;
		do {
			System.out.println("Digite um número entre");
			numero = leitor.nextLong();
			System.out.println(numero*numero);
		} while ((numero*numero) != 0);
		
	}

}
