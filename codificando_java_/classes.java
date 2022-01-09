package codificando_java;

public class classes {
	public static void main(String[] args) {
		
		int num = 0;
		// operacao_de_pos_incremento
		Jogador j1 = new Jogador(num++); 		// criando_um_objeto_da_classe_Jogador
		
		Jogador j2 = new Jogador(num++);	// com_parametro_de_entrada_o_parenteses_nao_pode_estar_vazio
		// operacao_de_pre_incremento
		Jogador j3 = new Jogador(++num);	// incrementa_o_3_e_usa_o_3
		
		//j1.vidas = 10;
		//System.out.printf("Vidas do jogador 1:%d",j1.vidas);		// nao_posso_acessar_de_fora_da_clase
		
		/*j1.num = 10;
		j2.num = 5;
		System.out.println(j1.num);
		System.out.println(j2.num); */

		
	}

}
