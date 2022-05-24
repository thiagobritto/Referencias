package aula04;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		System.out.println("--------------DIGITE--------------");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		System.out.println("--------------------1--------------");
		if (num%2==0) {
			System.out.println("O numero "+(num)+" e par");
		} else {
			System.out.println("O numero "+(num)+" e impar");
		}
	}
}
