package po;

import java.math.BigDecimal;
import java.math.BigInteger;

/* 
 * 1) Implemente una estructura de clases que permita modelar manantiales acuiferos,
 * para cualquier manantial debe ser posible obtener su caudal y la magnitud del 
 * manantial a partir del mismo. Se debe implementar una especializacion de los 
 * manantiales en pozos artesianos, manantiales drenantes, manantiales emergentes 
 * y manantiales filonianos. No puede haber manantiales fuera de los tipos 
 * especificos que se definan. Debe proveerse una manera de saber el caudal 
 * acumulado de todos los manantiales conocidos.
 */


public abstract class Manantial implements Georeferenciable{
	
	public double caudal;//volumen de agua que fluye/descarga en l/s
	public String magnitud;//clasificacion de manantiales,
	public String tipo; //es el tipo de manantial que se crea
	public String nombre;
	private static double caudalAcumulado=0;//caudal acumulado de todos los manantiales
	public BigDecimal longitud;
	public BigDecimal latitud;
	public static final int MS=60;
	
	//constructor de clase manantial
	public Manantial(String nombre, double caudal, BigDecimal longitud, BigDecimal latitud) {
	
		this.caudal = caudal;
		this.nombre=nombre;
		
		this.longitud= longitud;
		this.latitud=latitud;
		
		//se obtiene el tipo de magnitud al que pertenece el manantial
		this.magnitud = getMagnitud(caudal);
		//incrementa el caudal acumulado por todos los manantiales cada vez que se crea un nuevo manantial
		setCaudalAcumulado(caudal);
	}

	
	public double getCaudal() {
		return caudal;
	}
	
	
	
	//metodo para determinar la magnitud de un manantial
	final public String getMagnitud(double caudal) {
		//si el caudal es mayor a 2800 litros por segundo
		if (caudal>2800){
			//la magnitud del manantial va a ser la primera 
			return "Primera Magnitud";
		}else if(caudal>280 && caudal<=2800){//si el caudal es mayor a 280 litros por segundo y menor/igual a 2800 litros por segundos
			//la magnitud del manantial va a ser la segunda
			return "Segunda Magnitud";
		}else if(caudal>28 && caudal<=280){//si el caudal es mayor a 28 litros por segundo y menor/igual a 280 litros por segundos
			//la magnitud del manantial va a ser la tercera
			return "Tercera Magnitud";
		}else if(caudal>6.3 && caudal<=28){//si el caudal es mayor a 6,3 litros por segundo y menor/igual a 28 litros por segundos
			//la magnitud del manantial va a ser la cuarta
			return "Cuarta Magnitud";
		}else if(caudal>0.63 && caudal<=6.3){//si el caudal es mayor a 0,63 litros por segundo y menor/igual a 6,3 litros por segundos
			//la magnitud del manantial va a ser la quinta
			return "Quinta Magnitud";
		}else if(caudal>0.063 && caudal<=0.63){//si el caudal es mayor a 0,063 litros por segundo y menor/igual a 0,63 litros por segundos
			//la magnitud del manantial va a ser la sexta
			return "Sexta Magnitud";
		}else if(caudal>0.008 && caudal<=0.063){//si el caudal es mayor a 0,008 litros por segundo y menor/igual a 0,063 litros por segundos
			//la magnitud del manantial va a ser la septima
			return "Septima Magnitud";
		}else if(caudal>0 && caudal<=0.008){//si el caudal es mayor a 0 litros por segundo y menor/igual a 0,008 litros por segundos
			//la magnitud del manantial va a ser la octava
			return "Octava Magnitud";
		}else {//si el caudal es igual a 0 litros por segundo 
			//la magnitud del manantial va a ser la cero
			return "Magnitud Cero";
		}
	}



//obtiene el caudal acumulado por todos los manantiales
	public static double getCaudalAcumulado() {
		return caudalAcumulado;
	}

//incrementa el caudal acumulado por todos los manantiales 
	public static void setCaudalAcumulado(double caudal) {
		Manantial.caudalAcumulado = caudalAcumulado + caudal;
	}


	//muestra la ubicacion de un manantial
	public void ubicacion(BigDecimal longitud, BigDecimal latitud){
		

		
		System.out.print("Longitud: ");
		gradoDecimalAGradoSexagecimal(longitud);
	  
		
	    System.out.print("Latitud: ");
	    gradoDecimalAGradoSexagecimal(latitud);
		
		
	    
	
	}
	
	//transforma un grado decimal en sexagecimal y lo muestra
	public void gradoDecimalAGradoSexagecimal(BigDecimal gradoDecimal){
		
		BigDecimal grado,min,minutos,seg,segundos;
		
		//calcular grados del grado decimal   
	    grado=calcular(gradoDecimal);
	    //se obtiene los minutos del grado decimal
	    min=obtener(gradoDecimal, grado);
	    //calcular minutos del grado decimal
	    minutos=calcular(min);
	    //se obtiene los segundos del grado decimal
	    seg=obtener(min, minutos);
	    //calcular segundos del grado decimal
	    segundos=calcular(seg);
	    System.out.println(grado + "° " + minutos + "' " + segundos + "''");
	  
		
	};

	
	//metodo que calcula la parte entera de un numero decimal
	public BigDecimal calcular(BigDecimal valor){
		
		
		//se calculan los grados, o los minutos o los segundos,    
	    BigInteger entero=valor.toBigInteger();
	    BigDecimal v=new BigDecimal(entero);
	    return v;
		
	}
	
	//metodo que obtiene el valor de los minutos o segundos
	public BigDecimal obtener(BigDecimal valor, BigDecimal entero){
		
		BigDecimal mult=new BigDecimal(MS);//multiplica para saacar los minutos y segundos
		
		BigDecimal v;
		//se obtiene los minutos o segundos
		v=valor.subtract(entero);
	    v=v.multiply(mult);
		
	return v;
	}
}
