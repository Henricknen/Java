
public class Variaveis_Int {
	public static void main(String[] args) {
		
		// variaveis inteiras
		
		System.out.println("variavel_inteira");
		int varInt = 100;  							// variaveis inteiras tem 4 bytes
		
		System.out.println(varInt);				
		System.out.println(" Menor valor da variavel: " + Integer.MIN_VALUE);		// mostra o menor valor desta variavel inteira		
		System.out.println("Maior valor da variavel: " + Integer.MAX_VALUE);		// mostra o maior valor desta variavel inteira
		
		System.out.println("variavel_Long");
		long varLong1 = 4444;						// variaveis long tem 8 bytes
		long varLong2 = 50000000000L;		// para mostrar na tela acima de 9 caracteres é necessario colocar o "L"
		
		System.out.println(varLong1);
		System.out.println(varLong2);
		System.out.println(" Menor valor da variavel: " + Long.MIN_VALUE);		// mostra o menor valor desta variavel long
		System.out.println(" Maior valor da variavel: " + Long.MAX_VALUE);		// mostra o maior valor desta variavel long
		
		System.out.println("variavel_Short");
		short varShort;								// variaveis short tem 2 bytes
		varShort = 23456;
		
		System.out.println(varShort);
		System.out.println(" Menor valor da variavel: " + Short.MIN_VALUE);		// mostra o menor valor desta variavel short
		System.out.println(" Maior valor da variavel: " + Short.MAX_VALUE);		// mostra o maior valor desta variavel short

		System.out.println("variavel_byte");
		byte varByte = 115;							// variaveis byte tem 1 bytes
		System.out.println(varByte);
		
		System.out.println(" Menor valor da variavel: " + Byte.MIN_VALUE);		// mostra o menor valor desta variavel byte
		System.out.println(" Maior valor da variavel: " + Byte.MAX_VALUE);		// mostra o maior valor desta variavel byte

		
		
	}

}
