package aula07;

import java.util.Scanner;

public class ProgramaStringPosicaoChar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String nome1 = leitor.next();
		char ponto = '.';
		System.out.println("A posi��o do ponto no texto �: " 
		+ nome1.indexOf(ponto));
	}
}
