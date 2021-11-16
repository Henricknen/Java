
public class condicionaiss {
	public static void main(String[] args) {
		
		double notaA, notaB, media;
		notaA = 7;
		notaB = 5;
		media = (notaA + notaB) / 2;
		int faltas =10;
		if(media >= 5 && faltas <= 10) {			// os dois lados tem que ser verdadeiros para ser True
			System.out.println(" Aprovado " + faltas + " faltas - media " + media);
		}else if(media < 5 || faltas > 10) {		// se um dos lados ser verdade a sentença é verdadeira
			System.out.println(" Reprovado " + faltas + " faltas - media " + media);
		}else if(media >= 5 && media < 7  && faltas <= 10) {
			System.out.println(" Recuperação " + faltas + " faltas - media" + media);
		}
		
	}
	

}
