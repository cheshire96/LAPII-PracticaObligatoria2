package po;

import java.math.BigDecimal;

public interface Georeferenciable {

	
	/*3) cree una interfaz georeferenciable, que nos permita localizar objetos 
	 * geograficamente. Haga que los manantiales del ejercicio 1 sean georeferencibles. 
	 * Cree al menos dos jerarquias de objetos georeferenciables, los elementos a 
	 * modelar quedan a su eleccion pero tenga en cuenta que alguna de las clases 
	 * sea abstracta y existan al menos un metodo final y una clase final
	 */
	
	
	void ubicacion(BigDecimal longitud, BigDecimal latitud);

	void gradoDecimalAGradoSexagecimal(BigDecimal gradoDecimal);
	
	BigDecimal calcular(BigDecimal valor);
	
	BigDecimal obtener(BigDecimal valor, BigDecimal entero);

}
