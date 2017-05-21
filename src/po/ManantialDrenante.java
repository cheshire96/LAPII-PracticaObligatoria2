package po;

import java.math.BigDecimal;

public final class ManantialDrenante extends Manantial{
	//constructor de la clase manantial drenante
	public ManantialDrenante(String nombre, double caudal, BigDecimal longitud, BigDecimal latitud) {
		super(nombre, caudal, longitud, latitud);

		this.tipo="Manantial Drenante";//establece el tipo de manantial que es
	}


}
