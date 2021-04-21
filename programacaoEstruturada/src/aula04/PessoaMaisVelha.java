package aula04;

import java.util.Scanner;

public class PessoaMaisVelha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("Digite seu nome");
		String nome1 = in.nextLine();
		System.out.println("Digite outro nome");
		String nome2 = in.nextLine();
		
		System.out.println("Olá "+(nome1)+" qual a sua idade?");
		int idade1 = in.nextInt();		
		System.out.println("Olá "+(nome2)+" qual a sua idade?");
		int idade2 = in.nextInt();
		
		System.out.println("------------------Results------------------");
		if (idade1>idade2) {
			System.out.println((nome1)+" é mais velho com "+(idade1)+" anos.");
		} else {
			System.out.println((nome2)+" é mais velho com "+(idade2)+" anos.");
		}
	}

}
