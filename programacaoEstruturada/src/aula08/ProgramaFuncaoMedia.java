package aula08;

import java.util.Scanner;

public class ProgramaFuncaoMedia {
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite a primeira nota:"); 
		double nota1 = leitor.nextDouble(); 
		System.out.println("Digite a segunda nota:"); 
		double nota2 = leitor.nextDouble(); 
		System.out.println("Digite a terceira nota:"); 
		double nota3 = leitor.nextDouble(); 
		System.out.println("Digite a quarta nota:"); 
		double nota4 = leitor.nextDouble(); 
		double media = calcularMedia(nota1, nota2, nota3, nota4); 
		System.out.println("Sua média foi: " + media); 
	}

	public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) { 
		return (nota1 + nota2 + nota3 + nota4)/4; 
	}	
}
