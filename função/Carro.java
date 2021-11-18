package função;

public class Carro {

	public String nome = "Camaro";			// atributos
	
	public String modelo = "Coupe";			// atributos
	
	public int ano = 2021;					// atributos
	
	String[] acessorios = {							// array-atributos de acessorios
			"Xenon",
			"Completo",
			"Air bag",
			"Teto solar"
			
	};
	
	public void acelerar() {
		System.out.println("Vruumm....");			//é apenas um procedimento, metodo porque não retorna nada
	}
	
	public double calculaConsumo(double KM) {		// função
		return KM / 9.81;					
	}
	
}
