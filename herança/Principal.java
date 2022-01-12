package herança;

public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Golf");		// criando_carro
		Carro c2 = new Carro("Bmw");
		CarroCombate c3 = new CarroCombate("]falcao", 100);
		CarroCombate c4 = new CarroCombate("]tigre", 50);

		
		c1.setLigado(true);		// vai_iniciar_com_carro_ligado_
		c1.info();		// imprime_as_inormacoes_deste_carro
		c2.info();
		c3.info();
		c4.info();
		
	}
}
