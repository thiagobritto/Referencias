package aula04;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite um numero:");
		double valor = leitor.nextDouble();
		
		System.out.println("------------------Results------------------");
		if (valor>=10&&valor<=20) {
			System.out.println("Valor digitado entre 10 e 20");
		}else{
			System.out.println("Valor fora do intervalo");
		}
	}

}
