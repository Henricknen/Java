
public class condicionais {
	public static void main(String[] args) {
		
		double notaA, notaB, media;
		notaA = 4;
		notaB = 6;
		media = (notaA + notaB) / 2;
		
		if(media >= 6) {
			System.out.println(media + " Aprovado");
		} else {
			System.out.println(media + " Reprovado");
		} 
		
		if(media >= 6) {
			System.out.println(media + " Aprovado");
		} else if (media >= 4.5 && media < 6) {
			System.out.println(media + " Recuperação");			
		} else {
			System.out.println(media + " Reprovado");
		}
		
	}
	
}
