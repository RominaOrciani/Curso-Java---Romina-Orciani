package Clase4_Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio2_a {

	public static void main(String[] args) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      int resultado = 0;
		try {
		Scanner obj=new Scanner (System.in);
		System.out.println("Ingresa la ruta deseada");
		String ruta=obj.next(); 
		
		System.out.println("Ingresa operacion");
		String operacion =obj.next(); 
		
		archivo = new File (ruta);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        
        while ((linea = br.readLine()) != null) {
            int numero = Integer.parseInt(linea);
            if (operacion.equals("suma")) {
                resultado += numero;
            } else if (operacion.equals("multiplicacion")) {
                if (resultado == 0) {
                    resultado = 1; // Inicializa en 1 para multiplicación
                }
                resultado *= numero;
            } else {
                throw new IllegalArgumentException("Operación no válida. Use 'suma' o 'multiplicacion'.");
            }
        }
        
        System.out.println("El resultado de la operación es: " + resultado);
       
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
