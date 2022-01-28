package Classes_abstratas;

public class Vegetal {
	private Boolean vivo;
	private int massa;
	public Vegetal(int massa) {
		this.vivo = true;
		this.massa = massa;
	}
	
	public int getMassa() {
		return this.massa;
	}
	
	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}
}
