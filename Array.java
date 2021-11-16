import java.util.Random;			// função gera numeros aleatorios
public class Array {
	public static void main(String[] rgs) {
		
		System.out.println("Array de String");
		String[] nomes = {"Luis", "Henrique", "Silva", "Ferreira"};
		for(int cont =0; cont < nomes.length; cont++) {
			System.out.println(nomes[cont]);
		}
		
		
		System.out.println("Array de Double");
		double[] numerosDouble = new double[10];
		for(int cont = 0; cont < numerosDouble.length; cont++) {
			numerosDouble[cont] = cont + 1;
			System.out.println(numerosDouble[cont]);
		}
		
		
		System.out.println("Array de inteiros aleatorios");
		Random geraNumero = new Random();
		int[] inteirosAleatorios = new int[10];
		for(int i =0; i < inteirosAleatorios.length; i++) {
			inteirosAleatorios[i] = geraNumero.nextInt(20);
			System.out.println(inteirosAleatorios[i]);
		}
	}

}
