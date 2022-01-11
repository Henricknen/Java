
public class Principal {

	public static void main(String[] args) {		// programa_principal_tem_o_main
		
		int num = 0;
		
		//System.out.printf("%nAlerta:%s%n",Jogador.alerta ? "Sim" : "Nao");		// acessando_alerta_da_classe_Jogador_antes_de_instancia_qualquer_objeto
		
		Jogador.pontos();		// chamando_o_metodo_"static"_pontos
		Jogador.pontos();
		Jogador.pontos();
		
		Jogador j1 = new Jogador(++num);			// criando_objeto_jogador_da_classe_"Jogador"
		Jogador j2 = new Jogador(++num);		// "++num"_pre_incremento_incrementa_o_valor_apos_usa
		Jogador j3 = new Jogador(++num);
		Jogador j4 = new Jogador(++num);
		
		Jogador.alerta = true;
		
		j1.info();		// chama_o_metodo_"info()"_para_o_jogador_1
		j2.info();
		j3.info();		// todos_estes_objeto_ocupam_o_mesmo_enderec_de_memoia
		j4.info();
		
		//System.out.printf("%nVidas do jogador 1:%d",j1.getVidas());		// get_serve_para_obter_valores_de_variaveis_de_uma_classe
		
		
		
	}
}


