package edu.escuelaing.arep;


import java.util.*;
import static spark.Spark.*;
import spark.Request;
import spark.Response;

/**
*
* @author sarah.vieda
*/

public class ComplexSystems {
	
	public LinkedL lista;
	public Double media, desviEst;
	
	public ComplexSystems() {
		
		lista = new LinkedL();
	}
	
	
	
	static int getPort(){
        if (System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

	/**
	 * Metodo que retorna la media de una LinkedList
	 * @return resp variable en la que se retorna el valor de la media
	 */
	
	public Double retornaMedia() {
		Double cont = 0.0;
		for (int i = 0; i<lista.getLen();i++) {
			cont+=lista.getActual().getDato();
			lista.setNodoActual(lista.getActual().getNext());
			//System.out.println(cont);
		}
		Double resp = cont/lista.getLen();
		return resp;
		
	}

	
	/**
	 * Metodo que retorna la desviacion estandar de los elementos de una LinkedList
	 * @param resp Variable que representa la media 
	 * @return r
	 */
	
	public  Double desviacionEstandar(Double resp) {
		Double cont = 0.0;
		for (int i=0; i<lista.getLen();i++){
			Double resp1 = lista.getActual().getDato()-resp;
			resp1=resp1*resp1;
			cont+=resp1;
			lista.setNodoActual(lista.getActual().getNext());
		}
		Double desviacion = Math.sqrt(cont/(lista.getLen()-1));
		return desviacion;
	}
	
	public void insertandoNodo(Double datos) {

		lista.insertNodo(datos);
	}
	

	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		ComplexSystems that = (ComplexSystems) o;
		return Double.compare(that.media,media)==0 &&
				Double.compare(that.desviEst,desviEst)==0;


	}

	
	
	
	
	
}
