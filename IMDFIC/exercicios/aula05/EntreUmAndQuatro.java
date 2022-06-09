package aula05;

import java.util.Scanner;

public class EntreUmAndQuatro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 4");
		int numero = leitor.nextInt();
		
			if (numero<1||numero>4) {
				System.out.println("Número inválido");								
			} else {
				System.out.println(numero);				
			}
	}

}
