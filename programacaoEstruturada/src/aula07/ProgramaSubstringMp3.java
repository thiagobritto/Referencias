package aula07;

public class ProgramaSubstringMp3 {

	public static void main(String[] args) {
		String arquivo = "musica.mp3";
		if (arquivo.substring(arquivo.indexOf(".")).equalsIgnoreCase(".mp3")) {
			System.out.println("Aequivo de música");
		} else {
			System.out.println("Aequivo dedesconhecido");			
		}
	}

}
