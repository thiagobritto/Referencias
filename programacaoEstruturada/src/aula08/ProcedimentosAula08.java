package aula08;

import java.util.Scanner;

public class ProcedimentosAula08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a prmeira nota");
		double nota1 = leitor.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = leitor.nextDouble();
		String saida = resultado(media(nota1,nota2));
		saidaRefinada(nota1,nota2,saida);
	}
	
	public static void saidaRefinada(double n1, double n2, String s) {
		System.out.println("O aluno obteve a media "+(media(n1, n2))+" e sua situação é: "+(s));		
	}
	
	public static double media(double n1, double n2) {
		return (n1+n2)/2.0;
	}
	
	public static String resultado(double m) {
		if (m >= 7) return "Aprovado";
		return "Reprovado";
	}
}
