package java_;

import java.util.Arrays;

public class loop {
	public static void main(String[] args) {
		
		final int tam = 10;
		int[] num = {3, 6, 2,9, 4, 1, 5, 7, 8, 10 };
		int[] numeros = new int[tam];
		int p = 3;
		int pos;
		
// ------------------------------------------------------------------------------------------
		
  	System.arraycopy(num, 0, numeros, 0, tam);		// faz_a_copia_de_um_array_para_outro_array
		
// ------------------------------------------------------------------------------------------

		System.out.printf("Arrays sao iguais:%s", Arrays.equals(num, numeros) ? "Sim" : "Nao");		// comparacao_de_arrays

// ------------------------------------------------------------------------------------------

		Arrays.sort(num);
		pos = Arrays.binarySearch(num, p);
		System.out.printf("%nO elemento %d esta no array? %s na posicao %d", p,pos > 0 ? "Sim" : "Nao", pos);		// verifica_se_existe_um_elemento_dentro_do_array
		
// ------------------------------------------------------------------------------------------
		
		Arrays.sort(num);		// metodo_que_vai_ordenadar_o_array_crescente
		
// ------------------------------------------------------------------------------------------
		
		for(int n: num) {		// for_mais_simplificado_para_ler_elementos_de_um_array
			System.out.printf("%n%d - ", n);
		}
		
// ------------------------------------------------------------------------------------------
		
		Arrays.fill(numeros, 10);		// preenche_um_array_com_um_valor_especifico
		
		for(int n: numeros) {
			System.out.printf("%n%d ", n);
		}
		
// ------------------------------------------------------------------------------------------
		}
	}
		