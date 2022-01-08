package java_;

import java.security.SecureRandom;		// produz_numeros_aleatorios

public class matrizes {
	public static void main(String[] args) {
		
		final int linhas = 3;			// constante
		final int colunas = 3;			// constante
		int [][] numeros = new int[linhas][colunas];
		int [][] num = {{34, 56, 76, 12, 98}, {0, 1, 2, 3, 4}, {10, 20, 30, 40, 50}};		// criando_martriz_com_os_elementos_dentro
		
		for(int l = 0; l < linhas; l++) {
			for(int c = 0; c < colunas; c++) {
				numeros [l][c] = new SecureRandom().nextInt(100);
			}
		}
		
		for(int l = 0; l < linhas; l++) {
			for(int c = 0; c < colunas; c++) {
				System.out.printf("%2d | ", numeros [l][c]);		// "%2d"_formata_a_matriz_quando_aparecer_um_digito_ex:(9)
				numeros [l][c] = new SecureRandom().nextInt(100);
			}
			System.out.printf("%n");		// pula_linha_formando_a_matriz
		}
		
		System.out.println("for_proprio para arrays");
		for(int[] n: num) {			
			for(int v: n) {
				System.out.printf("%3d | ", v);
			}
			System.out.printf("%n");
		}

	}

}
