import java.lang.Math;				// importando a biblioteca Math para a potencia��o

public class operadores {
	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		//Soma
		int total = numA + numB;
		System.out.println(total);
		
		//Subtra��o
		total = numA - numB;
		System.out.println(total);
		
		//Multiplica��o
		total = numA * numB;
		System.out.println(total);
		
		//Divis�o
		total = numA / numB;		// mostra a parte inteira da divis�o "int"
		System.out.println(total);
		
		double numC, numD, totalDouble;
		numC = 5;
		numD =2;					// mostra a divis�o completa "float"
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
		//Resto da divis�o
		total = numA % numB;		// mostra o resto da divis�o
		System.out.println(total);
		
		//Potencia��o
		double numE, numF, potencia;
		numE = 5;
		numF = 2;
		potencia = Math.pow(numE, numF);
		System.out.println(potencia);
		
		//Raiz quadrada
		double raiz;
		raiz = Math.sqrt(81);
		System.out.println(raiz);
		
		//Raiz cubica
		raiz = Math.cbrt(27);
		System.out.println(raiz);
		
	}

}
