package aula06;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidades de \'linhas\' x \'colunas\'");
		int linha = leitor.nextInt();
		int coluna = leitor.nextInt();
		int[][] matriz = new int[linha][coluna];
		
		System.out.println("Digite os valores");
		for (int i = 0; i < linha; i++) {
			for (int x = 0; x < coluna; x++) {
				matriz[i][x] = leitor.nextInt();
			}
		}
		int menor = matriz[0][0];
		for (int i = 0; i < linha; i++) {
			for (int x = 0; x < coluna; x++) {
				if (menor > matriz[i][x]) menor = matriz[i][x];
			}
		}
		System.out.print(menor);
		
	}

}
