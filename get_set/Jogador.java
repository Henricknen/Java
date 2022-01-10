package get_set;


public class Jogador {
	
	private final int maxVidas = 3;		// numero_maximo_de_vidas
	
	private int num = 0;	// declaracao_de_variacel_com_modificador "private"_so_pode_ser_acessa_dentro_da_clasee
	private int vidas = 1;
	
	public Jogador(int num) { // metodo_contrutor_precisa_ter_o_mesmo_nome_da_classe
		
		this.num = num;		// especificando_que_num_da_classe_e_o_do_parametro_de_entrada
		System.out.printf("jogador numero %d criado%n", num);
		
	}
	
	public int getVidas() {				// metodo_Get
		return this.vidas;		// retornando_a_variavel_vidas
	}
	
	public void setVidas(int vidas) {	// set_atribui_valores_as_variaveis_private
		if(vidas > maxVidas) {
			this.vidas = maxVidas;
		} else if(vidas < 0) {
			this.vidas = 0;
		} else {
			this.vidas = vidas;
		}
	}
	
}


