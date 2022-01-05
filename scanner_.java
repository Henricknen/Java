package java_;

import java.util.Scanner;		// impotarcao_do_pacote_Scanner_que_faz_leitura

public class scanner_ {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		// criacao_do_leitor_e_criacao_do_objeto_Scanner
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;		// variaveis_ultilizadas_no_processamento
		final int media = 60;		// final_indica_que_media_é_uma_constante_que_nao_pode_ser_alterada
		String nome = "", res = "";
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextInt();		// n1_recebe_o_retorno_do_metodo_nextint()
		
		System.out.println("Digite a segunda nota : ");
		n2 = entrada.nextInt();		// n2_recebe_o_retorno_do_metodo_nextint()
		
		System.out.println("Digite a segunda nota : ");
		n3 = entrada.nextInt();		// n2_recebe_o_retorno_do_metodo_nextint()
		
		System.out.println("Digite a segunda nota : ");
		n4 = entrada.nextInt();		// n2_recebe_o_retorno_do_metodo_nextint()
		
		soma = n1 + n2 + n3 +n4;
		if(soma >= media) {
			res = "Aprovado";
		} else if(soma >= 40) {
			res = "Recuppperacao";
		} else {
			res = "Reprovado";
		}
		
		System.out.printf("Aluno %s foi %s com a nota %d",nome, res, soma);		// umpressao_do_resultado_da_variavel
		
	}

}
