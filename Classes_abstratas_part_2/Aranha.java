package Classes_abstratas;

public class Aranha extends Animal {
	private int veneno;
	public Aranha(int vel, int massa, int forca, int veneno) {
		super( vel,  massa,  forca);
		this.veneno = veneno;		// caracteristica_da_aranha
	}
	
	@Override		// indicacao_que_estou_sobrecrevendo_o_metodo_"atacar"
	public void atacar(Animal a) {		
		if(this.getVivo()) {							
			if(this.getForca() <= a.getForca()) {
				this.setForca(this.getForca() + a.getMassa());
			} 
			
			if((this.getForca() + this.veneno) > a.getForca()) {		// implementacao_de_um_ataque_se_a_"forca_+_veneno_for_maior_que_a_do_outro_Animal
				this.setForca(this.getForca() + a.getMassa());
				a.setVivo(false);
			} else {
				this.setVivo(false);
			}
			
			
		} else {
			System.out.println("-----------------------------");
			System.out.println("este animal morto...");				
			System.out.println("-----------------------------");

		}
	}
}
