package Ejericio5Mio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; 
public class main {
	
	public static void main(String[] args) {
		Carrito carrito = new Carrito();
		carrito.setFecha(1);
		carrito.setItems(leerArchivo());
		carrito.precio(obtenerDescuento());
	}
	
	public static List<ItemCarrito> leerArchivo() {
			
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String linea;
	      List<ItemCarrito> listaDeItems = new ArrayList<>();
	      
	      try {
	  		Scanner obj=new Scanner (System.in);
	  		System.out.println("Ingresa la ruta de carrito");
	  		String ruta=obj.next(); 
	  		
	  		archivo = new File (ruta);
	  		fr = new FileReader (archivo);
	  		br = new BufferedReader(fr);
		
	  		 while ((linea = br.readLine()) != null) {
	  			String[] lineaSplit = linea.split(",");
	  			Producto producto = new Producto(Integer.parseInt(lineaSplit[1]), lineaSplit[2]);
	  			ItemCarrito item = new ItemCarrito(Integer.parseInt(lineaSplit[0]), producto);
	  			listaDeItems.add(item);
	         }
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
		return listaDeItems;
	   }

	public static Descuento obtenerDescuento() {
		Descuento descuento = new DescuentoFijo();
		return descuento;
	}
}
