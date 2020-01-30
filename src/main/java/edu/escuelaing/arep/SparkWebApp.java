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


	public static void main (String[]args){
		c = new ComplexSystems();
        port(getPort());
        get("/inputdata",(req,res) -> inputDataPage(req,res));
        get("/resultados",(req,res) -> resultDataPage(req,res));
        
        
	}
	

	
	private static String inputDataPage(Request req, Response res) {
		String pageC
			="<!DOCTYPE html>" 
			+"<html>"
			+"<body>" 
			+ "<h2>Bandeja de entrada de los números:</h2>"
			+ "<h2>(Introduzca los números separados por una coma)</h2>" 
			+ "<form action='/resultados\'>" 
			+ "<input type=\"text\" name='data'>"
			+ "<input type=\"submit\" value=\"Continue\">"  
			+ "</form>" 
			+ "</body>"
			+ "</html>";
		return pageC;
	}
	
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
				+ "<h2>"+ "La desviación de la Linked List es: " + c.desviacionEstandar(media) + "<h2>"
				+ "</body>"
				+ "</html>";
		
		return resp;
	
	}
	
	static int getPort(){
        if (System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

}
