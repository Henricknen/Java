package java_cfb;

public class comandos_de_decisao {
	public static void main(String[] args) {
		
		int pos = 1;
		
		switch(pos) {		// switch case - permite_a_execusao_em_varias_condicoes
		case 1:
			System.out.println("Primeiro_Lugar...");
			break;
		case 2:
			System.out.println("Segundro_Lugar...");
			break;
		case 3:
			System.out.println("Terçeiro_Lugar...");
			break;
		case 4: case5: case6:
			System.out.println("Premio_de_participacao...");
			break;
		default:
			System.out.println("Não_ganhou_premio...");
			break;
		}
		
			
		/*
		int nota = 85;
		int faltas = 10;
		int maxFaltas = 5;
		int media = 60;
		String res;
		
				// operação ternaria
		res = (nota >= media ? "Aprovado..." : "Reprovado...");		 
			System.out.println("REsultado: " + res);

		
				// "if-Se, &&-And"
		if((nota >=media) && (faltas <= maxFaltas)) {		
			System.out.println("Aprovado...");
		} else if (nota >= 40){
			System.out.println("Recuperacao...");
		} else {								// é_um_caso_contrario_do_if_"Senão"
			System.out.println("Reprovado...");
		}
		System.out.println("Fim_do_programa...");		*/
	} 
}				
