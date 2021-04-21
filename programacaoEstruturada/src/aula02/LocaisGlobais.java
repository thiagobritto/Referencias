
package aula02;

public class LocaisGlobais {
	
	public static int variavel = 10;
	
	public static void main(String[] args) {
		System.out.println(variavel);
		
		if (variavel==10) {
			int variavel = 30;
			System.out.println(variavel);
		}
		
		System.out.println(variavel);
	}

}
