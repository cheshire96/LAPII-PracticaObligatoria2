package po;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
                    
public abstract class Celular implements Georeferenciable{

	public String compania;
	public int numero;
	public String marca;
	public static final int MS=60;
	
	
	//constructor de clase celular
	public Celular(String compania, int numero) {
		this.compania = compania;
		this.numero = numero;
	}

	//metodo que simula la ubicacion de un celular que se encuentra en movimiento
	public void usarGPS(){
		BigDecimal longitud, mov, latitud;
		Random lon=new Random();
		Random lat=new Random();
		Random mover=new Random();
		
		longitud=new BigDecimal((lon.nextDouble()*180 +(-180)));
		latitud=new BigDecimal((lat.nextDouble()*90+(-90)));;
		//cantidad de grados decimales que se mueve el celular
		mov= new BigDecimal("0.0003");
		//indica si el celular se va a mover para el norte, sur, este u oeste
		int movimiento=(int)(mover.nextDouble()*4+0);
		
		for(int i = 0; i < 10; i++){
			System.out.println("Ubicacion actual del celular: "+ this.numero);
			ubicacion(longitud, latitud);
			System.out.println();
			
			//el celular se mueve
			switch (movimiento) {
				case 0://este
					longitud=longitud.add(mov);
					break;
					
				case 1://oste
					longitud=longitud.subtract(mov);
					break;
					
				case 2://norte
					latitud=latitud.add(mov);
					break;
			
				case 3://sur
					latitud=latitud.subtract(mov);
					break;
				
			}
			
		}
	}
	
	//muestra la ubicacion de un celular
	public void ubicacion(BigDecimal longitud, BigDecimal latitud){
				
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
		
		//se obtiene los minutos o segundos
		BigDecimal v=valor.subtract(entero);
	    v=v.multiply(mult);
		
	return v;
	}
	
}
