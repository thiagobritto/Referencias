package aula04;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("ESCOLHA UMA OPÇÃO EM CAIXA ALTA-------------");
		System.out.println("A - multiplicar | B - somar");
		char opcao = leitor.nextLine().charAt(0);
		
		System.out.println("Digite um valor:");
		int value1 = leitor.nextInt();
		
		System.out.println("Digite outro valor:");
		int value2 = leitor.nextInt();
		
		System.out.println("RESULTS--------------------");
		if (opcao=='A') System.out.println(value1*value2);
		if (opcao=='B') System.out.println(value1+value2);
		
	}

}
