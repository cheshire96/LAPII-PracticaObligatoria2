package po;

public class LG extends Celular{
	
	public String modelo;
	
	//constructor de la clase LG
	public LG(String modelo, String compania, int numero) {
		super(compania, numero);
		this.marca="LG";
		this.modelo=modelo;
	}

}
