package Clase4_Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	    File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String ALFABETO = "abcdefghijklmnñopqrstuvwxyz ";
	    
		Scanner obj=new Scanner (System.in);
		System.out.println("Ingresa la ruta de archivo de entrada");
		String ruta1=obj.next(); 
		
		System.out.println("Ingresa condicion");
		String condicion =obj.next(); 
		
		System.out.println("Ingresa valor de desplazamiento");
		int desplazamiento =obj.nextInt(); 
		
		System.out.println("Ingresa la ruta de archivo de salida");
		String ruta2=obj.next(); 
		
		try {
			
		archivo = new File (ruta1);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);
		
		String linea;
        StringBuilder resultado = new StringBuilder();
        
        while ((linea = br.readLine()) != null) {
            if (condicion.equals("c")) {
        		 for (int i = 0; i < linea.length(); i++) {
        	           char caracter = linea.charAt(i);
        	           int indice = ALFABETO.indexOf(caracter);
        	           if (indice != -1) {
        	                int nuevoIndice = (indice + desplazamiento) % ALFABETO.length();
        	                resultado.append(ALFABETO.charAt(nuevoIndice));
        	            } else {
        	                resultado.append(caracter);
        	            }
        	        }
            } else if (condicion.equals("d")) {
        		for (int i = 0; i < linea.length(); i++) {
    	            char caracter = linea.charAt(i);
    	            int indice = ALFABETO.indexOf(caracter);
    	            if (indice != -1) {
    	                int nuevoIndice = (indice + (-desplazamiento)) % ALFABETO.length();
    	                resultado.append(ALFABETO.charAt(nuevoIndice));
    	            } else {
    	                resultado.append(caracter);
    	            }
    	        }
            } else {
                throw new IllegalArgumentException("Operación no válida. Use 'c' o 'd'.");
            }
        }
        Files.writeString(Paths.get(ruta2), resultado);
        System.out.println("La operacion se realizo correctamente");
  }
     catch(Exception e){
        e.printStackTrace();
     }finally{
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta una excepcion.
        try{                    
           if( null != fr ){   
              fr.close();     
           }                  
        }catch (Exception e2){ 
           e2.printStackTrace();
        }
     }
 }
	
}
