package java_;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
																// for "Até"
		/*for (int cont = 0; cont < 5; cont++) {			// inicializacao_controle_incremento
		System.out.println(cont + "-Luis_Henrique_Silva_ferreira...");
		}public class loops {

		*/
		/*
		//Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int cont = 0;
		while(cont < max) {										// while "Enquanto"
			System.out.println(cont + "-Developer_Fullstack...");
			cont++;
		} 
		*/
		
		
		int cont = 0;			// inicializar_o_controle_fora_do_loop
		do {				// primeiro_faz
			System.out.println(cont + "-Analise_e_desenvolvimento_de_sistemas...");
			cont++;
		} while(cont < 0);		// depois_testa */
		
		System.out.println("Fim....."); 
	}
}
