package aula04;

import java.util.Scanner;

public class NumerosIguais {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num1 = leitor.nextInt();
		System.out.println("Digite outro numero");
		int num2 = leitor.nextInt();
		
		System.out.println("RESULTS----------------------");
		if (num1==num2) {
			System.out.println("Os numeros são iguais");
		} else if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

}
