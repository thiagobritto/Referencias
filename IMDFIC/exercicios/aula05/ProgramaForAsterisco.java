package aula05;

public class ProgramaForAsterisco {

	public static void main(String[] args) {
		String texto = "*";
		for (int i=0; i<10; i++) {
			System.out.println(texto);
			texto += " *";
		}
	}

}
