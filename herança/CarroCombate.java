package herança;

public class CarroCombate extends Carro{		private static final int Armamento = 0;
// a_classe_CarroCombate_herda_todas_cracteristicas_da_classe_Carro
	private final int MAX_ARMAMENTO = 100;	// limita_uma_quantidade_maxima_de_armamento
	private final int MIN_ARMAMENTO = 0;	// limita_uma_quantidade_minima_de_armamento
	private int qtdArmamento;
	
	public CarroCombate(String nome, int blindagem) {// construtor_da_classe_CarroCombate
		super(nome);	// chama_o_construtor_da_classe_pai
		super.setArmamento(true);
		setBlindagen(blindagem);		// sem_a_necessidade_de_usar_o_"super"
		this.qtdArmamento = 100;
	}
	
	public void setQtdArmamento(int Armamento, int qtdArmamento) { // implementacao_dos_metodos_da_classe_filho
		this.qtdArmamento = qtdArmamento;
		if(this.qtdArmamento > MAX_ARMAMENTO) {
			this.qtdArmamento = MAX_ARMAMENTO;
		}
		
		if(this.qtdArmamento < MIN_ARMAMENTO) {
			this.qtdArmamento = MIN_ARMAMENTO;
		}
	}
	
	public int QtdArmamento() {
		return CarroCombate.Armamento;
	}

	public void atirar() {
		if(this.qtdArmamento > MIN_ARMAMENTO);
		setArmamento(-1);
	} else {
		System.out.println("Sem armamento....");
	}
	
	public void info() {
		super.info();
		System.out.printf("Qtd.Armamen........:%d%n",this.getArmamento() ? "Sim" : "Nao");

	}
}
