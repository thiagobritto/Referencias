package aula06;

import java.util.Scanner;

public class ProgramaNotasArray {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas a serem lidas");
		double[] notas = new double[leitor.nextInt()];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota de número "+(i));
			notas[i] = leitor.nextDouble();
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("notas["+(i)+"] = "+(notas[i])+";");
		}
	
	}

}
