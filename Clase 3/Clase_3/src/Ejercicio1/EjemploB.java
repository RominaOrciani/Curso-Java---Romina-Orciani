package Ejercicio1;

import java.util.Arrays;
import java.util.Collections;

public class EjemploB {
	
	 public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
			 int[] numeros  = {num1, num2, num3};
			 int[] numerosOrdenados = new int[3];
	        
	        if (orden.equals("ascendente")) {
	        	Arrays.sort(numeros);
	        	numerosOrdenados = numeros;
	        	return numerosOrdenados;

	        } else if (orden.equals("decreciente")) {
	        	for (int i = 0; i < numeros.length; i++) {
	                numerosOrdenados. numeros[i];
	            }
	        	return numerosOrdenados;
	            
	        } else {
	            System.out.println("El orden ingresado no es válido. Debe ser 'ascendente' o 'decreciente'.");
	            return null;
	        }
	    }
	}
}


