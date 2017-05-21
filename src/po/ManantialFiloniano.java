package po;

import java.math.BigDecimal;

public final class ManantialFiloniano extends Manantial{
	//constructor de la clase manantial filoniano
	public ManantialFiloniano(String nombre, double caudal, BigDecimal longitud, BigDecimal latitud) {
		super(nombre, caudal, longitud, latitud);

		this.tipo="Manantial Filoniano";//establece el tipo de manantial que es
	}

}
