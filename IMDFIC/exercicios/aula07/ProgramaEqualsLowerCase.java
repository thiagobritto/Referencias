package aula07;

import java.util.Scanner;

public class ProgramaEqualsLowerCase {
	
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro nome:");
		String nome1 = leitor.next().toLowerCase();
		System.out.println("Digite o segund nome:");
		String nome2 = leitor.next().toLowerCase();
		
		if (nome1.equals(nome2)) {
			System.out.println("Nomes iguais");			
		} else {
			System.out.println("Nomes diferentes");			
		}
		System.out.println(nome1);			
		System.out.println(nome2);			
	}
	
}
