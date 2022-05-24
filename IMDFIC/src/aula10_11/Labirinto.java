package aula10_11;

public class Labirinto {
	private static final char CAMINHO = '.';
	private static final char SEM_SAIDA = 'x';
	private static final char PAREDE_VERTICAL = '|';
	private static final char PAREDE_HORIZONTAL = '-';
	private static final char PAREDE_INTERNA = '@';
	private static final char VAZIO = ' ';
	private static final char INICIO = 'I';
	private static final char DESTINO = 'D';
	private static final char TAMANHO = 10;
	private static final double PROBABILIDADE = 0.8;
	private static int linhaInicio;
	private static int colunaInicio;
	private static char[][] tabuleiro;
	
	public static void inicializarMatriz() {
		int i, j;
		for (i = 0; i < TAMANHO; i++) {
			tabuleiro[i][0] = PAREDE_VERTICAL;
			tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
			tabuleiro[0][i] = PAREDE_HORIZONTAL;
			tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
		}
		
		for (i = 1; i < TAMANHO - 1; i++) {
			for (j = 1; j < TAMANHO - 1; j++) {
				if (Math.random() > PROBABILIDADE) {
					tabuleiro[i][j] = PAREDE_INTERNA;										
				} else {
					tabuleiro[i][j] = VAZIO;				
				}
			}
		}
		
		linhaInicio = geraNumero(1, TAMANHO/2-1);
		colunaInicio = geraNumero(1, TAMANHO/2-1);
		tabuleiro[linhaInicio][colunaInicio] = INICIO;
		
		int linhaDestino = geraNumero(TAMANHO/2, TAMANHO-2);
		int colunaDestino = geraNumero(TAMANHO/2, TAMANHO-2);
		tabuleiro[linhaDestino][colunaDestino] = DESTINO;
	}
	
	public static void imprimir() {
		try {
			Thread.sleep(1000);
			for (int i = 0; i < TAMANHO; i++) {
				for (int j = 0; j < TAMANHO; j++) {
					System.out.print(tabuleiro[i][j]);
				}
				System.out.println();			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int geraNumero(int minimo, int maximo) {
		int valor = (int) Math.round(Math.random()*(maximo-minimo));
		return minimo+valor;
	}
	
	public static boolean procuraCaminho(int linhaAtual, int colunaAtual) {
		boolean achou = false;
		// tenta subir
		int proximaLinha = linhaAtual-1;
		int proximaColuna = colunaAtual;
		achou = tentaCaminho(proximaLinha, proximaColuna);
		//tenta decer
		if (!achou) {
			proximaLinha = linhaAtual+1;
			proximaColuna = colunaAtual;
			achou = tentaCaminho(proximaLinha, proximaColuna);			
		}
		//tenta esquerda
		if (!achou) {
			proximaLinha = linhaAtual;
			proximaColuna = colunaAtual-1;
			achou = tentaCaminho(proximaLinha, proximaColuna);			
		}
		//tenta direita
		if (!achou) {
			proximaLinha = linhaAtual;
			proximaColuna = colunaAtual+1;
			achou = tentaCaminho(proximaLinha, proximaColuna);			
		}
		return achou;
	}
	
	public static boolean tentaCaminho(int proximaLanha,int proximaColuna) {
		boolean achou = false;
		if (tabuleiro[proximaLanha][proximaColuna] == DESTINO) {
			achou = true;
		} else if (posicaoVazia(proximaLanha, proximaColuna)) {
			// marcar
			tabuleiro[proximaLanha][proximaColuna] = CAMINHO;
			imprimir();
			achou = procuraCaminho(proximaLanha, proximaColuna);
			if (!achou) {
				tabuleiro[proximaLanha][proximaColuna] = SEM_SAIDA;
				imprimir();				
			}
		}
		return achou;
	}
	
	public static boolean posicaoVazia(int linha, int coluna) {
		boolean vazio = false;
		if (linha>=0 && coluna>=0 && linha<TAMANHO && coluna<TAMANHO) {
			vazio = (tabuleiro[linha][coluna] == VAZIO);
		}
		return vazio;
	}
	
	public static void main(String[] args) {
		tabuleiro = new char[TAMANHO][TAMANHO];
		inicializarMatriz();
		imprimir();
		System.out.println("\n- Procurando Solução -\n");
		boolean achou = procuraCaminho(linhaInicio, colunaInicio);
		if (achou) {
			System.out.println("ACHOU O CAMINHO!");			
		} else {
			System.out.println("Não tem caminho");						
		}
	}
}
