package aula04;

import java.util.Scanner;

public class PessoaMaisVelha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("Digite seu nome");
		String nome1 = in.nextLine();
		System.out.println("Digite outro nome");
		String nome2 = in.nextLine();
		
		System.out.println("Ol� "+(nome1)+" qual a sua idade?");
		int idade1 = in.nextInt();		
		System.out.println("Ol� "+(nome2)+" qual a sua idade?");
		int idade2 = in.nextInt();
		
		System.out.println("------------------Results------------------");
		if (idade1>idade2) {
			System.out.println((nome1)+" � mais velho com "+(idade1)+" anos.");
		} else {
			System.out.println((nome2)+" � mais velho com "+(idade2)+" anos.");
		}
	}

}
