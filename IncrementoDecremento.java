
public class IncrementoDecremento {
	public static void main(String[] args) {
		
		int a = 1;
		//Pos incremento
		System.out.println("Pos incremento");
		System.out.println(a++);		// so esta incrementano e apresentara o valor normal da variavel
		System.out.println(a);  		// a variavel aparecera incrementada com + 1 "++"
		
		//Pre  incremento
		System.out.println("Pre incrremento");
		System.out.println(++a);		// antes da variavel ser apresentadda, el recebe um incremento
		System.out.println(a);
		
		//Pos decremento
		System.out.println("Pos decremento");
		System.out.println(a--); 		// aqui vai fazer o decremento, mostrando o valor total da variavel
		System.out.println(a); 			// e aqui mostrara a variavel decrementada
		
		//Pre decremento
		System.out.println("Pre decremento");
		System.out.println(--a);
		System.out.println(a);
		
	}

}
