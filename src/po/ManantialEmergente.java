package po;

import java.math.BigDecimal;

public final class ManantialEmergente extends Manantial{
	//constructor de la clase manantial emergente
	public ManantialEmergente(String nombre, double caudal, BigDecimal longitud, BigDecimal latitud) {
		super(nombre, caudal, longitud, latitud);
			
		this.tipo="Manantial Emergente";//establece el tipo de manantial que es
	}

}
