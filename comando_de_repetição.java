
public class comando_de_repetição {
	public static void main(String[] args) {
		
		int contador = 1;
		System.out.println("while");
		while(contador <= 10) { 					//enquanto
			System.out.println(contador);
			contador ++;			
		}
		
		
		int contadorDois = 1;
		System.out.println("do while");
		do {										// faça enquanto
			System.out.println(contadorDois);
			contadorDois++;
		}while(contadorDois <= 10);
		
		
		System.out.println("for");
		for(int cont = 1; cont <= 10; cont++) {		// até
			System.out.println(cont);
		}
		
		System.out.println("Arrays");
		String[] frutas = {"Maça", "Pera", "Caju", "Banana"};	 // arrays "lista"
		for(int cont =0; cont< frutas.length; cont++ ) {
			System.out.println(frutas[cont]);
			
		}
		
	}

}
