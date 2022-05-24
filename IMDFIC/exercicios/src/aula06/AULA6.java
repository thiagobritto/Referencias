package aula06;

import java.util.Scanner;

public class AULA6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de palavras a serem digitadas");
		int quantidade = leitor.nextInt();
		String[] vetor_palavras = new String[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			vetor_palavras[i] = leitor.next();
		}
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print(vetor_palavras[i]+"-");
		}
	}

}
