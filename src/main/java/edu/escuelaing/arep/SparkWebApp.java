package edu.escuelaing.arep;

import static spark.Spark.*;
import spark.Request;
import spark.Response;


/**
*
* @author sarah.vieda
*/


public class SparkWebApp {
	private static ComplexSystems c;
	
	/**
	 * Este metodo utiliza metodos de SparkWeb y funciones lambda.
	 */
	public static void main (String[]args){
		c = new ComplexSystems();
        port(getPort());
        get("/inputdata",(req,res) -> inputDataPage(req,res));
        get("/resultados",(req,res) -> resultDataPage(req,res));
        
        
	}
	
	/**
	 * Este metodo recibe los datos que el usuario desea agregar a la Linked List
	 * @param req
	 * @param res
	 * @return pageC
	 */
	private static String inputDataPage(Request req, Response res) {
		String pageC
			="<!DOCTYPE html>" 
			+"<html>"
			+"<body>" 
			+ "<h2>Bandeja de entrada de los numeros:</h2>"
			+ "<h2>(Introduzca los numeros separados por una coma)</h2>" 
			+ "<form action='/resultados\'>" 
			+ "<input type=\"text\" name='data'>"
			+ "<input type=\"submit\" value=\"Continue\">"  
			+ "</form>" 
			+ "</body>"
			+ "</html>";
		return pageC;
	}
	
	/**
	 * Este metodo retorna el valor de la media y la desviacion estandar de los datos ingresados en la Linked List
	 * @param req
	 * @param res
	 * @return resp
	 */
	private static String resultDataPage(Request req, Response res) {
		String resp;
		String [] valores=req.queryParams("data").split(",");
		for(String i:valores) {
			c.insertandoNodo(Double.parseDouble(i));
		}
		Double media = c.retornaMedia();
		resp = "<!DOCTYPE html>" 
				+"<html>"
				+"<body>" 
				+ "<h2>"+ "La media de la Linked List es: " + media + "<h2>"
				+ "<h2>"+ "La desviacion de la Linked List es: " + c.desviacionEstandar(media) + "<h2>"
				+ "</body>"
				+ "</html>";
		
		return resp;
	
	}
	 /**
     * Este metodo lee el puerto predeterminado segun lo especificado por la variable PORT 
     *
     */
	static int getPort(){
        if (System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

}
