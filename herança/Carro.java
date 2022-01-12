package herança;

public class Carro {
	private String nome;			// atributos
	private Boolean ligado;
	private Boolean destruido;
	private int blindagem;
	private Boolean armamento;
	
	public Carro(String nome) {		// construtor_a_classe_com_atributo_nome
		this.nome = nome;
		this.ligado = false;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}
	
	public String getNome() {		// metodo_Get_para_permiti_a_manipulacao_do_que_eu_quero_manipular
		return this.nome;			// pode_verifica
	}
	
	public Boolean getLigado() {		// pode_verifica
		return this.ligado;
	}
	
	public void setLigado(Boolean ligado) {		// ou_alterar
		this.ligado = ligado;
	}
	
	public Boolean getDestruido() {		// pode_verifica
		return this.destruido;
	}
	
	public void setDestruido(Boolean destruido) {		// ou_alterar
		this.destruido = destruido;
	}
	
	public Boolean getArmamento() {
		return this.armamento;
	}
	
	public void setArmamento(Boolean armamento) {
		this.armamento = armamento;
	}
	
	public int getBlindagem() {
		return this.blindagem;
	}
	
	public void setBlindagen(int blindagem) {
		this.blindagem = blindagem;
	}
	
	public void  sofrerDano(int dano) {		// metodo_sofrerdano
		this.blindagem = dano;
		if(this.blindagem <= 0) {
			this.blindagem = 0;
			this.ligado = false;
			this.destruido = true;
		}
	}
	
	public void info() {
		System.out.println("-----------------------------");
		System.out.printf("Nome........:%s%n",this.nome);
		System.out.printf("Ligado.......:%s%n",this.ligado ? "Sim" : "Nao");
		System.out.printf("Destruido......:%s%n",this.destruido ? "Sim" : "Nao");
		System.out.printf("Blindagem.......:%s%n",this.blindagem);
		System.out.printf("Armamento........:%s%n",this.armamento ? "Sim" : "Nao");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
