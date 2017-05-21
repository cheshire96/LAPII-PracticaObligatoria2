package po;

import java.math.BigDecimal;

public final class PozoArtesiano extends Manantial {
	//constructor de la clase pozo artesiano
	public PozoArtesiano(String nombre, double caudal, BigDecimal longitud, BigDecimal latitud) {
		super(nombre, caudal, longitud, latitud);
		this.tipo="Pozo Artesiano";//establece el tipo de manantial que es
	}

}
