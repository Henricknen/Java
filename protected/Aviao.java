import veiculos.Veiculo;		// importando_a_classe_Veiculo_da_pasta_veiculos

public class Aviao extends Veiculo {		// a_classe_Aviao_vai_herda_tudo_da_classe_Veiculo
	private int categoria;				// Veiculo_é_a_Super_classe_de_Avião
	
	public Aviao(String nome, int tipo, int categoria) {	// construtor
		super(nome, 10);		// "super"_pra referenciar_o_construtor_da_super_classe
		this.categoria = categoria;
	}

	public void info() {
		super.info();			// "super.info"_chama_o_metodo_da_super_classe
		System.out.printf("Categoria:%s%n",this.categoria);

	}
	
}
