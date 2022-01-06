package java_cfb;

public class array_vetor {
	public static void main (String[] args) {
		
		final int tam = 5;		//constante_de_tamanho_5  
		
		int[] num = new int[tam];		// criando_array_colchetes_indica_que_é_uma_colecao_de_variaveis_contendo_constante_tam
		
		int [] numeros = {10, 45, 6, 15, 0};		// criando_array_com_elementos_ja_adicionados
		
		
		num[0] = 10;		// adiciondo_elementos_no_array
		num[1] = 5;
		num[2] = 15;
		num[3] = 0;
		num[4] = 8;
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d%n -", numeros[i]);		// vai_imprimir_todos_valores_da_array
		}
		
		
		System.out.printf("%d", numeros[3]);	// vai_imprimir_o_valor_da_3_posicao_da_array_numeros

	}
}
