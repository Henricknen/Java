package Classes_abstratas;

public class java {

	public static void main(String[] args) {
		
		Aranha a2 = new Aranha(5, 5,5, 3);
		Formiga a3 = new Formiga(2, 2, 2);
		Vegetal v1 = new Vegetal(1);
		Vegetal v2 = new Vegetal(5);
		Vegetal v3 = new Vegetal(10);
		
		a2.info();
		a2.atacar(a3);
		a2.info();
		
		System.out.println(a3.getVivo());
		
	}
}
