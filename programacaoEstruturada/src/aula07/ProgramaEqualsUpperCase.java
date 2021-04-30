package aula07;

import java.util.Scanner;

public class ProgramaEqualsUpperCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro nome:");
		String nome1 = leitor.next();
		System.out.println("Digite o segundo nome:");
		String nome2 = leitor.next();
		// ou nome1.toLowerCase();
		nome1 = nome1.toUpperCase();
		// ou nome2.toLowerCase();
		nome2 = nome2.toUpperCase();
		if (nome1.equals(nome2)) {
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
		System.out.println(nome1);
		System.out.println(nome2);
	}

}
