package aula04;

import java.util.Scanner;

public class MultiploDeDois {

	public static void main(String[] args) {
		System.out.println("Digite 5 numeros inteiros");
		
		Scanner scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		int numero4 = scan.nextInt();
		int numero5 = scan.nextInt();
		int soma = (numero1+numero2+numero3+numero4+numero5);
		
		if (soma%2==0) System.out.println("Múltiplo de 2");
		
	}

}
