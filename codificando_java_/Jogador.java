package codificando_java;

public class Jogador {		
	
	//public int num = 0;		// atributo_definido_public_posso_acessar_ou_modificar_o_valor_desse_atributo_de_fora_da_classe
	private int num = 0;	// - private_é_privado_so_pode_ser_usado_dentro_da_classe
	private int vidas = 0;		// no_geral_os_atributos_sao_criados_como_private_onde_terei_mais_controle_dos_objetos
	
	
	public Jogador(int num) {			// construtor_nao_tem_retorno_e_precisa_ter_o_mesmo_nome_da_classe_/_int_n_metodo_de_entrada
		this.num = num;		// especificando_num_com_this._que_faz_uma_referencia_para_propria_classe
		this.vidas = 3;
		System.out.printf("Jogador numero %d criado%n", num);
	}
}
