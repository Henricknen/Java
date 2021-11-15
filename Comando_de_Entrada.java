import java.util.Scanner;		// impota��o da biblioteca "Scanner", que auxilia a fazer a entrada de dados

public class Comando_de_Entrada {
	
	public static void main(String[] args) {
		
		int vInteiro;				// declara��o da variavel
		double vDouble;				// declara��o da variavel
		String vString;				// declara��o da variavel
		String vFrase;				// declara��o da variavel
		float vFloat;				// declara��o da variavel
		
		Scanner entrada = new Scanner(System.in);		// criando um objeto
		
		System.out.printf("Informe uma frase: ");
		vFrase = entrada.nextLine();				// � uma frase inteira 
		System.out.println("A frase �: " + vFrase);
		
		
		System.out.printf("Informe um inteiro: ");
		vInteiro = entrada.nextInt();					
		System.out.println("A inteiro �: " + vInteiro);

		
		System.out.printf("Informe um double: ");
		vDouble = entrada.nextDouble();					
		System.out.println("A double �: " + vDouble);
		
		
		System.out.printf("Informe um float: ");
		vFloat = entrada.nextFloat();					
		System.out.println("A double �: " + vFloat);
		
		
		System.out.printf("Informe uma palavra: ");
		vString = entrada.next();					// � apenas uma palavra
		System.out.println("A palavra �: " + vString);
		
	}
}
