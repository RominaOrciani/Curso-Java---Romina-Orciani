package ResolucionEjercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      int suma = 0;
	      
		try {
		Scanner obj=new Scanner (System.in);
		System.out.println("Ingresa la ruta de carrito");
		String ruta=obj.next(); 
		
		archivo = new File (ruta);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);

        // Lectura del fichero
		String linea;
		String productos;
		int resultado;
        while((linea=br.readLine())!=null)
        	String[] productos = linea.split(",");
        	int cantidad = Integer. parseInt(productos[0]);
        	int precioUnitario = Integer. parseInt(productos[1]);
        	int totalProducto = cantidad * precioUnitario;
        	resultado = resultado + totalProducto;
        
        System.out.println(resultado);
     }
     catch(Exception e){
        e.printStackTrace();
     }finally{
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
