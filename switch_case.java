package swith_case;

public class Java {
	public static void main(String[] args) {
		
		int nota = 8;
		String resp = "";
		
		switch(nota) {
		case 10: case 9: case 8: case 7:		// Testando_varios_casos
			resp = "Aprovado...";
			break;
			
		case 6: case 5: case 4:		
			resp = "Recuperacao...";
			break;
			
		case 3: case 2: case 1: case 0:		
			resp = "Reprovado...";
			break;
			
		default:
			resp = "Nota Invalida";
			
		}
		
		System.out.printf("Resultado: %s%n...",resp);
		
		
		
		int n1, n2, res;
		String op = "*";
		
		res = 0;n1 = 10; n2 = 5;		// inicializacao_das_variaveis

		switch(op) {		// "switch"_indico_o_que_sera_avaliado
		case "+":		// testando_o_valor_de_"posicao"
			res = n1 + n2;
			break;
			
		case "-":
			res = n1 - n2;
			break;		
			
		case "*":
			res = n1 * n2;
			break;
			
		case "/":
			res = n1 / n2;
			break;
			
		default:		
			System.out.printf("%s%n", " Operacao invalida...");
			break;
			
		}
		
		System.out.printf("Operacao:%s - resultado:%d%n", op, res);
		
		
		int posicao = 1;
		
		switch(posicao) {		// "switch"_indico_o_que_sera_avaliado
		case 1:		// testando_o_valor_de_"posicao"
			System.out.printf("%s%n", "Medalha de Ouro...");
			break;
			
		case 2:
			System.out.printf("%s%n", "Medalha de Prata...");
			break;		
			
		case 3:
			System.out.printf("%s%n", "Medalha de Bronze...");
			break;
			
		default:		// se_"posicao"_nao_se_enquadra_em_nunhum_dos_casos_acima,_a_condicao_cai_no_"default"
			System.out.printf("%s%n", "Sem Medalha...");
			break;
			
		}
	}

}
