package aula08;

import java.util.Scanner;

public class ProgramaFuncaoQuadrado {
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite um n�mero:"); 
		double num = leitor.nextDouble(); 
		System.out.println("O quadrado desse n�mero �:" + quadrado(num)); 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Depois de muito c�digo, precisa-se calcular 
		// ...    novamente o quadrado 
		double num2 = leitor.nextDouble(); 
		System.out.println("O quadrado do segundo n�mero digitado �:" + quadrado(num2)); 
	}

	public static double quadrado(double numero) { 
		return numero*numero; 
	}
}
