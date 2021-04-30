package testes;

import java.util.Scanner;

public class teste {

	public static void main(String args[]){

        Scanner leitor=new Scanner(System.in);

        System.out.println("Digite uma palavra");

        String palavra=leitor.next();

        letraImpar(palavra);               

    }

    public static void imprime(char a){

        System.out.print(a);

    }  

    public static void letraImpar(String c){

        char[] d=c.toCharArray();

        for(int i=0;i<d.length;i++){

            if(i%2==1){

                imprime(d[i]);

            }   

        }

    }
	

}
