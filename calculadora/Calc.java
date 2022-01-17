package cauculadora;

import java.util.Scanner;		// para_ultilizar_entradas_do_tecldo
public class Calc {
	static public void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			Num n1 = new Num();
			Num n2 = new Num();
			Num res = new Num();
			String opc = "S";
			
			
			while (opc.equals("s") || opc.equals("S")) {			// loop_para_fazer_calculo_de_outros_valores
				System.out.printf("%nDigite o valor 1: ");		// digitando_um_numero
				n1.setValor(scan.nextInt());				// armarzenda_o_numero_digitado_no_objeto"n1"
				
				System.out.printf("%nDigite o valor 2: ");		// digitando_outro_numero
				n2.setValor(scan.nextInt());				// armarzenda_o_numero_digitado_no_objeto"n2"
				
				res.setValor(n1.getValor() + n2.getValor());
				System.out.printf("A soma de %d com %d é:%d ", n1.getValor(), n2.getValor(), res.getValor());
				
				System.out.printf("%n%n%nDeseja somar outro valor ?");
				opc = scan.next();
				System.out.printf("%n%n");
			}
			
		}

	
	}

}
