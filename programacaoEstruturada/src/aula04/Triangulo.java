package aula04;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		System.out.println("Digite 3 numeros inteiros");
		
		Scanner scan = new Scanner(System.in);
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();
		int l3 = scan.nextInt();
		
		if (l1<l2+l3 && l2<l1+l3 && l3<l1+l2) System.out.println("Os numeros fomão um triangulo");
	}

}
