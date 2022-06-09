package aula06;

import java.util.Scanner;

public class AULA06 {

	public static void main(String[] args) {
		int[] valores = new int[5];
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

}
