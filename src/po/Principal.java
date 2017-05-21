package po;

import java.math.BigDecimal;

public class Principal {
	
	public static void main(String[] args){
		
		BigDecimal longitud, latitud;//longitud y latitud en grados decimales
		
		//-----------------------
		//|		MANANTIALES		|
		//-----------------------	
		//se crea pozo artesiano
		PozoArtesiano pa = new PozoArtesiano("Manantial Uno", 3472.73, longitud=new BigDecimal("45.7938"), latitud=new BigDecimal("36.2174"));
		//se crea manantial drenante
		ManantialDrenante md = new ManantialDrenante("Manantial Dos", 8, longitud=new BigDecimal("27.3926"), latitud=new BigDecimal("56.7334"));
		//se crea manantial emergente
		ManantialEmergente me = new ManantialEmergente("Manantial Tres", 2500.25, longitud=new BigDecimal("-32.7843"), latitud=new BigDecimal("49.3827"));
		//se crea manantial filoniano
		ManantialFiloniano mf = new ManantialFiloniano("Manantial Cuatro", 4000.99, longitud=new BigDecimal("22.5271"), latitud=new BigDecimal("29.84732"));
		
		
		//-----------------------
		//|		CELULARES		|
		//-----------------------
		// se crea celular LG
		LG celular1 = new LG("K10", "MOVISTAR", 154738244);
		//se crea celular Samsung
		Samsung celular2 = new Samsung("Galaxy A3", "CLARO", 154325127);
		//se crea celular LG
		LG celular3 = new LG("Leon", "PERSONAL", 154732218);
		
		
		
		//-----------------------
		//|		MONUMENTOS		|
		//-----------------------
		//se crea un monumento artificial
		MonumentoArtificial monumento1= new MonumentoArtificial("Uno", "historia uno", "pais uno", "ciudad uno", longitud=new BigDecimal("53.5497"), latitud=new BigDecimal("-22.5271"));
		//se crea un monumento artificial
		MonumentoArtificial monumento2= new MonumentoArtificial("Dos", "historia dos", "pais dos", "ciudad dos", longitud=new BigDecimal("-29.8524"), latitud=new BigDecimal("34.8461"));
		//se crea un monumento artificial
		MonumentoArtificial monumento3= new MonumentoArtificial("Tres", "historia tres", "pais tres", "ciudad tres", longitud=new BigDecimal("41.8341"), latitud=new BigDecimal("76.1284"));
		
//_________________________________________________________________________________________________		
		System.out.println("-------------------------------------------------");
		System.out.println("|		MANANTIALES			|");
		System.out.println("-------------------------------------------------");
		
		
		//Pozo Artesiano
		System.out.println("Nombre: " + pa.nombre + ", Tipo: " + pa.tipo + ", Caudal: " + pa.caudal + ", Magnitud: " + pa.magnitud);
		//Ubicacion del pozo artesiano
		System.out.println("Ubicacion de " + pa.nombre);
		pa.ubicacion(pa.longitud, pa.latitud);
		System.out.println();
		
		//Manantial Drenante
		System.out.println("Nombre: " + md.nombre + ", Tipo: " + md.tipo + ", Caudal: " + md.caudal + ", Magnitud: " + md.magnitud);
		//Ubicacion del manantial drenante
		System.out.println("Ubicacion de " + md.nombre );
		md.ubicacion(md.longitud, md.latitud);
		System.out.println();

		//Manantial Emergente
		System.out.println("Nombre: " + me.nombre + ", Tipo: " + me.tipo + ", Caudal: " + me.caudal + ", Magnitud: " + me.magnitud);
		//Ubicacion del manantial emergente
		System.out.println("Ubicacion de " + me.nombre);
		me.ubicacion(me.longitud, me.latitud);
		System.out.println();		

		//Manantial Finosiano
		System.out.println("Nombre: " + mf.nombre + ", Tipo: " + mf.tipo + ", Caudal: " + mf.caudal + ", Magnitud: " + mf.magnitud);
		//Ubicacion del manantial filoniano
		System.out.println("Ubicacion de " + mf.nombre);
		mf.ubicacion(mf.longitud, mf.latitud);
		System.out.println();
		

		System.out.println("Total caudal acumulado: "+ Manantial.getCaudalAcumulado());
		
		
//_____________________________________________________________________________________		


		System.out.println("-------------------------------------------------");
		System.out.println("|		MONUMENTOS			|");
		System.out.println("-------------------------------------------------");
		
		
		//Monumento Uno
		System.out.println(monumento1.tipo + ": " + monumento1.nombre+" Historia: "+monumento1.historia+" Pais: "+monumento1.pais+" Ciudad: "+monumento1.ciudad+" Longitud: "+monumento1.longitud+" Latitud: "+monumento1.latitud);
		//Ubicacion monumento uno
		System.out.println("Ubicacion de "+monumento1.nombre);
		monumento1.ubicacion(monumento1.longitud, monumento1.latitud);
		System.out.println();
		
		
		//Monumento Dos
		System.out.println(monumento2.tipo + ": " + monumento2.nombre+" Historia: "+monumento2.historia+" Pais: "+monumento2.pais+" Ciudad: "+monumento2.ciudad+" Longitud: "+monumento2.longitud+" Latitud: "+monumento2.latitud);
		//Ubicacion monumento dos
		System.out.println("Ubicacion de "+monumento2.nombre);
		monumento2.ubicacion(monumento2.longitud, monumento2.latitud);
		System.out.println();
		
		
		//Monumento Tres
		System.out.println(monumento3.tipo + ": " + monumento3.nombre+" Historia: "+monumento3.historia+" Pais: "+monumento3.pais+" Ciudad: "+monumento3.ciudad+" Longitud: "+monumento3.longitud+" Latitud: "+monumento3.latitud);
		//Ubicacion monumento tres
		System.out.println("Ubicacion de "+monumento3.nombre);
		monumento3.ubicacion(monumento3.longitud, monumento3.latitud);
		System.out.println();
		
		
//___________________________________________________________________________________________________
		

		System.out.println("-------------------------------------------------");
		System.out.println("|		CELULARES			|");
		System.out.println("-------------------------------------------------");
		
		//Celular Uno
		System.out.println("Celular: " + celular1.marca + " " + celular1.modelo);
		System.out.println("Compania: " + celular1.compania);
		System.out.println("Numero: " + celular1.numero);
		//Ubicacion de celular uno
		System.out.println("Ubicacion de "+celular1.numero);
		celular1.usarGPS();
		System.out.println();

		//Celular Dos
		System.out.println("Celular: " + celular2.marca + " " + celular2.modelo);
		System.out.println("Compania: " + celular2.compania);
		System.out.println("Numero: " + celular2.numero);
		//Ubicacion de celular dos
		System.out.println("Ubicacion de "+celular2.numero);
		celular2.usarGPS();
		System.out.println();
		
		//Celular Tres
		System.out.println("Celular: " + celular3.marca + " " + celular3.modelo);
		System.out.println("Compania: " + celular3.compania);
		System.out.println("Numero: " + celular3.numero);
		//Ubicacion de celular tres
		System.out.println("Ubicacion de "+celular3.numero);
		celular3.usarGPS();
		System.out.println();
		
		
		
	}



}
