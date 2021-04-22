package aula05;

import java.util.Scanner;

public class EcreveImpares {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		for (int i=0; i<10; i++) {
			numero = leitor.nextInt();
			if (numero%2!=0) System.out.println(numero);
		}
	}

}
