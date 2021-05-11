package aula12;

import java.util.Scanner;

public class ProgramaLeitorEndereco {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("-- Digite seu primeiro endere�o --");
		Endereco end1 = lerEndereco(leitor);
		System.out.println("-- Digite seu segundo endere�o --");
		Endereco end2 = lerEndereco(leitor);		
		System.out.println("-- Seu primeiro endere�o � --");
		imprimeEnereco(end1);
		System.out.println("-- Seu segundo endere�o � --");
		imprimeEnereco(end2);
	}
	
	public static Endereco lerEndereco(Scanner leitor) {
		Endereco end = new Endereco();
		System.out.println("Digite a rua onde voc� mora");
		end.rua = leitor.nextLine();
		System.out.println("Digite n�mero da residencia");
		end.numero = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Digite o bairro");
		end.bairro = leitor.nextLine();
		System.out.println("Digite a cidade");
		end.cidade = leitor.nextLine();
		System.out.println("Digite o estado");
		end.estado = leitor.nextLine();
		System.out.println("Digite o CEP");
		end.cep = leitor.nextLine();
		return end;
	}
	
	public static void imprimeEnereco(Endereco end) {
		System.out.println(end.rua + ", " + end.numero);
		System.out.println(end.bairro + ", " + end.cidade);
		System.out.println(end.cep + ", " + end.estado);
	}

}
