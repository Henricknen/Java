package Classes_abstratas;		// classes_abstratas_so_podem_ser_herdadas_e_nao_instanciadas


abstract class Animal implements SerVivo{		// indica_que_esta_e_uma_classe_abstrata
	
	private Boolean vivo;		// atributo_privado_para_nao_poder_ser_modificado_de_fora_da_classe
	private int massa;
	private int x;
	private int y;
	private int vel;
	private int forca;

	
	public Animal(int vel, int massa, int forca) {		// contrutor_com_atributos_do_Animal_instanciado
		this.vivo = true;		
		this.massa = massa;
		this.x = 0;			// iniciando_as_variaveis
		this.y = 0;
		this.forca = forca;
		this.vel = vel;
	}
	
	public void setVivo(Boolean vivo) {		// metodo_para_definir_se_animal_esta_vivo
		this.vivo = vivo;
	}
	
	public Boolean getVivo() {
		return this.vivo;
	}
	
	public void setForca(int forca) {		
		this.forca = forca;
	}
	
	public int getForca() {
		return this.forca;
	}
	
	public void setMassa(int massa) {		
		this.massa = massa;
	}
	
	public int getMassa() {
		return this.massa;
	}
	
	public void atacar(Animal a) {		// indica_quem_esta_sendo_atacado_pelo_Annimal
		if(this.vivo) {							
			if(this.forca > a.forca) {
				this.forca += a.getMassa();
				a.vivo = false;
			} else {
				this.vivo = false;
			}
		} else {
			System.out.println("-----------------------------");
			System.out.println(this.getClass().toGenericString() + "esta morto, nao pode atacar...");		// se_"this.vivo"_for_false		
			System.out.println("-----------------------------");

		}
	}
	
	public void mover() {
		if(this.vivo) {		// posso_mover_se_estiver_vivo
			this.x += this.vel;
			this.y += this.vel;
		} else {
			System.out.println("-----------------------------");
			System.out.println(this.getClass().toGenericString() + "esta morto, nao pode se mover...");				
			System.out.println("-----------------------------");

		}
	}
	
	public void comer(int massa) {			// e_obrigatorio_fazer_a_implementao_destes_metodos
		if(this.vivo) {
			this.forca += massa;
		} else {
			System.out.println("-----------------------------");
			System.out.println(this.getClass().toGenericString() + "esta morto, nao pode comer...");			
			System.out.println("-----------------------------");

		}
	};
	
	public void info() {
		System.out.printf("Tipo.:%s%n", getClass().toString());
		System.out.printf("Vivo.:%s%n", this.getVivo() ? "Sim" : "Nao");
		System.out.printf("Massa.:%d%n", this.massa);
		System.out.printf("Vel.:%d%n", this.vel);
		System.out.printf("Forca.:%d%n", this.forca);
		System.out.println("-----------------------------");


	};
}