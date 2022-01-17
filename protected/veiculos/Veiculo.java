package veiculos;
public class Veiculo {
	protected String nome;
	protected int tipo;		// "protected"_permite_que_acesse_de_fora_da_classe_,_somente_por_classes_que_estão_dentro_do_mesmo_pacote
	
	public Veiculo(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void info() {		// metodo
		System.out.printf("Nome:%s%n",this.nome);
		System.out.printf("Tipo:%d%n",this.tipo);

	}
}
