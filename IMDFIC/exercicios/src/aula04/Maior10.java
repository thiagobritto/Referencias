package aula04;

import java.util.Scanner;

public class Maior10 {

	public static void main(String[] args) {
		System.out.println("Digite um valor inteiro: ");
		
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		
		if (numero>10) System.out.println("O numero "+(numero)+" é maior que 10 :D");
	}

}
