package aula03;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String aluno = imput.nextLine();
		System.out.println("Digite a disciplina");
		String disciplina = imput.nextLine();
		System.out.println("Infome a primeira nota do aluno");
		float nota1 = imput.nextFloat();
		System.out.println("Infome a segund nota do aluno");
		float nota2 = imput.nextFloat();
		System.out.println("Infome a terceira nota do aluno");
		float nota3 = imput.nextFloat();
		System.out.println("Infome a quarta nota do aluno");
		float nota4 = imput.nextFloat();
		
		System.out.println("O "+(aluno)+" teve média "+((nota1+nota2+nota3+nota4)/4)+" na disciplina: "+(disciplina));
	}

}
