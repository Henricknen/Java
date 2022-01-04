package java_cfb;

public class comandos_impressao {
	public static void main(String[] args) {				//  \n_e_%n - executa_quebra_de_linha
		
		
		int num = 30;		// criancao_da_variavel_num
		String cursos = "Tecnico_de_informatica/_tecnico_de_eletroeletronica/_front_end/_Logica_de_programacao";
		
		
		System.out.print(" Luis_henrique_silva_ferreira\n");					// comando_de_impressaoque_nao_executa_quebra_de_linhas
		System.out.println("Developer:Full_Stack");			// comando_de_impressao_executa_uebra_de_linha_no_final
		System.out.printf("Formado_em:%s%nAno:%d%n","Analise_e_desenvolvimento_de_sistemas",2022); 		// impressao_formatada
		System.out.printf("Idade:%d%nCursos:%s",num, cursos);
	}
}
