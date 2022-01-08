package cfb;

public class metodos {
	public static void main(String[] args) {		// metodo_principal_com_(modificaorDeacesso_retorno_nome_parametro__
		
		for(int i = 0; i < 10; i++) {		// faz_a_chamada_do_metodo_10x
			profissional();	//chamada_do_metodo_profissional
			
		}
		
		msg("Luis Henrique Silva Ferreira", 3);		
		
		int a;
		a = idade(1991, 2022);		// valores_para_calculo_do_metodo_idade
		System.out.printf("Tenho %d anos %n", a);
		
		System.out.println("A soma do metodo soma - int deu:");
		System.out.println(soma(2, 6, 8, 25));		// valores_aleatorios_para_calcular_soma_do_metodo_soma
		
		System.out.println("A soma do metodo soma - Duble deu:");
		System.out.println(soma(2.5, 2.5));
	}
	
	public static int soma(int... numeros) {		// lista_de_parametros_"n"_numero_de_parametros
		int res = 0;
		for(int n: numeros) {
			res += n;
		}
		return res;

	}
	
	public static Double soma(Double... numeros) {		// metodo_com_mesmo_nome_mas_argumento_de_entrada_diferente_"se_chama_Sobrecarga"		
		Double res = 0.0;
		for(Double n: numeros) {
			res += n;
		}
		return res;

	}
	
	public static int idade(int a_nasc, int a_atual) {		// "a_nasc_/_a_atual"_ano_de_nascimento_e_ano_atual
		int res = a_nasc - a_atual;		
		return res;		// return_é_necessario_quando_retorno_nao_for_void
	}

	public static void profissional() {		
		System.out.println("Profissional de TI");
	}
	
	public static void msg(String m, int l) {		// paramentro_de_entrada_para_o_metodo
		for(int i = 0; i < l; i++) {
			System.out.println(m);
		}
	}
	
}
