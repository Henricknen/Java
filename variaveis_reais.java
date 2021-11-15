
public class variaveis_reais {
	public static void main(String[] args) {
		System.out.println("variavel_float");
		float varFloat = 3.1459265f; 								// variaveis float tem 8 bytes
		
		System.out.println(varFloat);							
		System.out.println(" Menor valor da variavel: " + Float.MIN_VALUE);		// mostra o menor valor desta variavel float
		System.out.println(" Maior valor da variavel: " + Float.MAX_VALUE);		// mostra o maior valor desta variavel float
		
		System.out.println("variavel_double");
		double varDouble = 3.14592653589793;						// variaveis double tem 1 byte
		
		System.out.println(varDouble);
		System.out.println(" Menor valor da variavel: " + Double.MIN_VALUE);		// mostra o menor valor desta variavel double
		System.out.println(" Maior valor da variavel: " + Double.MAX_VALUE);		// mostra o maior valor desta variavel double
	}

}
