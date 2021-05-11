package aula12;

import java.util.Scanner;

public class ProgramaEnum {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite o dia da semana (1 a 7, onde 1 representa o domingo):"); 
		EnumDiaSemana diaSemana = pegarDiaSemana(leitor.nextInt()); 
		// aqui o programa faz o que ele precisa fazer 
		// ...		
		System.out.println("Você selecionou o dia da semana de "+ nomeDiaSemana(diaSemana)); 
	}
	
	public static EnumDiaSemana pegarDiaSemana(int diaSemanaInt) {
		EnumDiaSemana disSemana = EnumDiaSemana.SABADO;
		switch (diaSemanaInt) {
			case 1:
				disSemana = EnumDiaSemana.DOMINGO;
				break;
			case 2:
				disSemana = EnumDiaSemana.SEGUNDA_FEIRA;
				break;
			case 3:
				disSemana = EnumDiaSemana.TERCA_FEIRA;
				break;
			case 4:
				disSemana = EnumDiaSemana.QUARTA_FEIRA;
				break;
			case 5:
				disSemana = EnumDiaSemana.QUINTA_FEIRA;
				break;
			case 6:
				disSemana = EnumDiaSemana.SEXTA_FEIRA;
				break;
		}
		return disSemana;
	}
	
	public static String nomeDiaSemana(EnumDiaSemana diaSemana) {
		String nome = "Sábado";
		switch (diaSemana) {
			case DOMINGO:
				nome = "Domingo";
				break;
			case SEGUNDA_FEIRA:
				nome = "Segunda-Feiro";
				break;
			case TERCA_FEIRA:
				nome = "Terça-Feira";
				break;
			case QUARTA_FEIRA:
				nome = "Quarta-Feira";
				break;
			case QUINTA_FEIRA:
				nome = "Quinta-Feira";
				break;
			case SEXTA_FEIRA:
				nome = "Sexta-Feira";
				break;
		}
		return nome;
	}
}
