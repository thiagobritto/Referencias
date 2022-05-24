package aula07;

import java.util.Scanner;

public class ProgramaStringImpar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String nome1 = leitor.next();
		System.out.println("Inverso:");
		for (int i = 0; i < nome1.length(); i++) {
			if (i%2 != 0)
				System.out.print(nome1.charAt(i));
		}
	}
}
