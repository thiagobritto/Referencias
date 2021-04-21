package aula04;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma nota");
		double nota = leitor.nextDouble();
		
		System.out.println("RESULTS---------------------");
		if (nota>=0&&nota<=3) {
			System.out.println("Você precisa melhorar muito!");
		} else if (nota>3&&nota<7) {
			System.out.println("Você está quase conseguindo!");
		} else if (nota>=7&&nota<9) {
			System.out.println("Você conseguil!");
		} else {
			System.out.println("Você conseguiu com distinção!");
		}
	}

}
