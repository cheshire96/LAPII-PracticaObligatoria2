package po;

public class Samsung extends Celular{
	
	public String modelo;
	
	//constructor de la clase samsung
	public Samsung(String modelo, String compania, int numero) {
		super(compania, numero);
		this.marca="SAMSUNG";
		this.modelo=modelo;
	}

}
