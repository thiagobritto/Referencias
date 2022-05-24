package aula05;

import java.util.Scanner;

public class Maior10 {

	public static void main(String[] args) {
		int numero;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Por favor, digite um numero:");
			numero = leitor.nextInt();
		} while (numero<10);
		
		System.out.println("Finalmente você digitou um numero maior que 10. Obrigado :p");
	}

}
