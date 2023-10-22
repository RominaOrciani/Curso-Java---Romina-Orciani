package Clase4_Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      int suma = 0;
		try {
		Scanner obj=new Scanner (System.in);
		System.out.println("Ingresa la ruta deseada");
		String ruta=obj.next(); 
		
		archivo = new File (ruta);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null)
        	suma = suma+Integer.parseInt(linea);
        
        System.out.println(suma);
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
