package po;

import java.math.BigDecimal;

public class MonumentoArtificial extends Monumento{
	//constructor de la clase monumento artificial
	public MonumentoArtificial(String nombre, String historia, String pais,
			String ciudad, BigDecimal longitud, BigDecimal latitud) {
		super(nombre, historia, pais, ciudad, longitud, latitud);
		this.tipo="Monumento Artificial";
	}

	

}
