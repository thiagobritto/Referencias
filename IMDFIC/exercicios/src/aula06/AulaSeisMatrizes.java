package aula06;

import java.util.Scanner;

public class AulaSeisMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < 5; x++) {
				if (i+x == 4 || i==x) {
					matriz[i][x] = 1;
				} else {
					matriz[i][x] = 0;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < 5; x++) {
				System.out.print(matriz[i][x]);
			}
			System.out.println();
		}
	}

}
