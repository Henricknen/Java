import java.util.Scanner;		// impotação da biblioteca "Scanner", que auxilia a fazer a entrada de dados

public class Comando_de_Entrada {
	
	public static void main(String[] args) {
		
		int vInteiro;				// declaração da variavel
		double vDouble;				// declaração da variavel
		String vString;				// declaração da variavel
		String vFrase;				// declaração da variavel
		float vFloat;				// declaração da variavel
		
		Scanner entrada = new Scanner(System.in);		// criando um objeto
		
		System.out.printf("Informe uma frase: ");
		vFrase = entrada.nextLine();				// é uma frase inteira 
		System.out.println("A frase é: " + vFrase);
		
		
		System.out.printf("Informe um inteiro: ");
		vInteiro = entrada.nextInt();					
		System.out.println("A inteiro é: " + vInteiro);

		
		System.out.printf("Informe um double: ");
		vDouble = entrada.nextDouble();					
		System.out.println("A double é: " + vDouble);
		
		
		System.out.printf("Informe um float: ");
		vFloat = entrada.nextFloat();					
		System.out.println("A double é: " + vFloat);
		
		
		System.out.printf("Informe uma palavra: ");
		vString = entrada.next();					// é apenas uma palavra
		System.out.println("A palavra é: " + vString);
		
	}
}
