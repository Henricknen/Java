
public class Jogador {
	
	private final int maxVidas = 3;		// numero_maximo_de_vidas
	
	private int num = 0;	// declaracao_de_variacel_com_modificador "private"_so_pode_ser_acessa_dentro_da_clasee
	private int vidas = 0;
	static boolean alerta = false;		// "static"_permite_acessar_a_variavel_sem_precisar_fazer_a_intancia_do_jogador_na_classe_"Jogador"
	static int qtdJogadores = 0;
	static int pontosJogadores = 0;
	
	public Jogador(int num) { // metodo_contrutor_precisa_ter_o_mesmo_nome_da_classe
		
		this.num = num;		// especificando_que_num_da_classe_e_o_do_parametro_de_entrada
		this.vidas = 1;
		System.out.printf("jogador numero %d criado%n", num);
		qtdJogadores++;
		
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
	
	static void pontos() {		// metodo_"static"
		pontosJogadores += 10;
	}
	
	public void info() {
		System.out.printf("%nJogador:%d", this.num);
		System.out.printf("%nVida:%d", this.vidas);
		System.out.printf("%nAlerta:%s", (alerta ? "Sim" : "Nao"));		// por_ser_"static"_nao_se_usa_o_"this"
		System.out.printf("%nJogadores:%d", qtdJogadores);
		System.out.printf("%nPontos Jogadores:%d", pontosJogadores);

		System.out.printf("%n---------------------------------------%n");


		}
	
	
}


