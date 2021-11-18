package função;
import java.util.Scanner;

public class testaCarro {
	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		
		System.out.println("Nome do carro: " + carroUm.nome);
		System.out.println("Modelo do carro: " + carroUm.modelo);
		System.out.println("Ano do carro: " + carroUm.ano);
		
		carroUm.acelerar();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a Kilometragem: ");
		int KM = entrada.nextInt();
		
		System.out.println(carroUm.calculaConsumo(KM));
		
		for(int cont = 0; cont < carroUm.acessorios.length; cont++) {
			System.out.println(carroUm.acessorios[cont]);
			
		}

	}

}
