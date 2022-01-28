package Classes_abstratas;

abstract class Animal implements SerVivo{		// indica_que_esta_e_uma_classe_abstrata
	public Animal() {}						// classes_abstratas_so_podem_ser_herdadas_e_nao_instanciadas
	
	public void mover() {};
	public void comer(int massa) {};		// e_obrigatorio_fazer_a_implementao_destes_metodos
	public void info() {};
}