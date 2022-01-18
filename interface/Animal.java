public class Animal implements SerVivo {		// Animal_implementa_a_interfaceSerVivo
	
	public Animal() {}		// contrutor
	
	public void mover() {}
	public void comer(int massa) {}		// metodos_que_a_classe_é_obrigada_a_implementar
	public void info() {
		System.out.printf("Vivo:%s%n",SerVivo.vivo ? "Sim" : "Nao");
	}

}
