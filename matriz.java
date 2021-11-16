import java.util.Random;

public class matriz {
	public static void main(String[] args) {
		
		System.out.println("Array tipo matriz");
		int[][] matrizDeInteiros = {
				{9, 9, 6, 1, 9, 0},
				{1, 9, 0, 4, 1, 5},
				{4, 8, 1, 5,  6, 1, 9, 0},
		};
		for(int linha = 0; linha < matrizDeInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizDeInteiros[linha].length; coluna++) {
				System.out.print(matrizDeInteiros[linha][coluna]);
			}
			System.out.println("");
		}
		System.out.println("tamanho da linha 1: " + matrizDeInteiros[0].length);			// verifica o tamanho da linha da matriz
		System.out.println("tamanho da linha 2: " + matrizDeInteiros[1].length);			// verifica o tamanho da linha da matriz
		System.out.println("tamanho da linha 3: " + matrizDeInteiros[2].length);			// verifica o tamanho da linha da matriz

	}

}
