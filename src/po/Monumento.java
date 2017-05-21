package po;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Monumento implements Georeferenciable{
	
	public String tipo;
	public String nombre;
	public String historia;
	public String pais;
	public String ciudad;
	public BigDecimal longitud;
	public BigDecimal latitud;
	public static final int MS=60;
	
	
	
	//constructor de la clase monumento
	public Monumento(String nombre, String historia, String pais, String ciudad, BigDecimal longitud, BigDecimal latitud) {
		this.nombre = nombre; //nombre del monumento
		this.historia = historia; //historia del monumento
		this.pais = pais; //pais donde se encuentra el monumento
		this.ciudad = ciudad; //ciudad donde se encuentra el monumento
		//coordenadas donde se ubica
		this.longitud=longitud;//grados decimales	
		this.latitud=latitud;  //grados decimales 
		
		
	}
	
	//muestra la ubicacion de un monumento
	public void ubicacion(BigDecimal longitud, BigDecimal latitud){
		

		System.out.println("Pais: "+ this.pais);
		System.out.println("Ciudad:"+ this.ciudad);
		System.out.print("Longitud: ");
		gradoDecimalAGradoSexagecimal(longitud);
	  
		
	    System.out.print("Latitud: ");
	    gradoDecimalAGradoSexagecimal(latitud);
		
		
	    
	
	}
	
	//transforma un grado decimal en sexagecimal y lo muestra	
	public void gradoDecimalAGradoSexagecimal(BigDecimal gradoDecimal){
		
		BigDecimal grado,min,minutos,seg,segundos;
		
		//calcular grados sexadecimales del grado   
	    grado=calcular(gradoDecimal);
	    //se obtiene los minutos del grado
	    min=obtener(gradoDecimal, grado);
	    //calcular minutos sexadecimales del grado
	    minutos=calcular(min);
	    //se obtiene los segundos del grado
	    seg=obtener(min, minutos);
	    //calcular segundos sexadecimales del grado
	    segundos=calcular(seg);
	    System.out.println(grado + "° " + minutos + "' " + segundos + "''");
	  
		//System.out.print();
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
		
		BigDecimal mult=new BigDecimal(MS);//multiplica para sacar los minutos y segundos en grado sexagecimal
		BigDecimal v;
		//se obtiene los minutos o segundos
		
		
		v=valor.subtract(entero);
		
		v=v.multiply(mult);
		
	return v;
	}
	
}
