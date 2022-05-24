package aula03;

import java.util.Scanner;

public class Frases {

	public static void main(String[] args) {
		Scanner frases = new Scanner(System.in);
		
		System.out.println("Digite a primeira frase!");
		String frase1 = frases.nextLine(); 
		System.out.println("Digite a segunda frase!");
		String frase2 = frases.nextLine(); 
		System.out.println("Digite a terceira frase!");
		String frase3 = frases.nextLine(); 
		
		System.out.println("-----------------------------------------");
		System.out.println(frase3);
		System.out.println(frase2);
		System.out.println(frase1);
		System.out.println("-----------------------------------------");
	}

}
