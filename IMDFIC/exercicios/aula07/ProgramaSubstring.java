package aula07;

import java.util.Scanner;

public class ProgramaSubstring {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite seu nome completo:"); 
		String nome = leitor.next(); 
		if (nome.length() >=4 && nome.substring(0, 4).equalsIgnoreCase("Jo�o")) { 
			System.out.println("Ol� Jo�o!"); 
		} else { 
			System.out.println("Epa, voc� n�o � Jo�o!"); 
		} 
	}

}
