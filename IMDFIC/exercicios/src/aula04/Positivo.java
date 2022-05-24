package aula04;

import java.util.Scanner;

public class Positivo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO-------------");
		int num = leitor.nextInt();
		
		if (num>0) {
			System.out.println(num*2);
		} else {
			System.out.println(num*4);
		}
	}

}
