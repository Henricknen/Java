package get_set;


public class Principal {

	public static void main(String[] args) {		// programa_principal_tem_o_main
		
		int num = 0;
		Jogador j1 = new Jogador(num++);			// criando_objeto_da_classe_jogador
		Jogador j2 = new Jogador(num++);		// "num++"_pos_incremento_incrementa_o_valor_apos_usa
		Jogador j3 = new Jogador(num++);
		Jogador j4 = new Jogador(num++);
		
		j1.setVidas(100);
		System.out.printf("%nVidas do jogador 1:%d",j1.getVidas());		// get_serve_para_obter_valores_de_variaveis_de_uma_classe
		System.out.printf("%nVidas do jogador 2:%d",j2.getVidas());
		System.out.printf("%nVidas do jogador 3:%d",j3.getVidas());
		System.out.printf("%nVidas do jogador 4:%d",j4.getVidas());
		
		/*
		j1.num = 10;		// atribuindo_um_valor_a_variavel_"j1.num"_de_fora_da_classe
		j2.num = 5;
		System.out.printf("%n%d",j1.num);		// acessando_o_valor_da_variavel_"j1.num"_de_fora_da_classe_Principal
		System.out.printf("%n%d",j2.num);
		*/
	}
}


