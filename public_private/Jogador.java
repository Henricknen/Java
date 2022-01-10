package public_private;

public class Jogador {
	
	private int num = 0;	// declaracao_de_variacel_com_modificador "private"_so_pode_ser_acessa_dentro_da_clasee
	private int vidas = 0;
	
	public Jogador(int num) { // metodo_contrutor_precisa_ter_o_mesmo_nome_da_classe
		
		this.num = num;		// especificando_que_num_da_classe_e_o_do_parametro_de_entrada
		System.out.printf("jogador numero %d criado%n", num);
		
	}
	
}
