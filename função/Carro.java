package fun��o;

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
		System.out.println("Vruumm....");			//� apenas um procedimento, metodo porque n�o retorna nada
	}
	
	public double calculaConsumo(double KM) {		// fun��o
		return KM / 9.81;					
	}
	
}
