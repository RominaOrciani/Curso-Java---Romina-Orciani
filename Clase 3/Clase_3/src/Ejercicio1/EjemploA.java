package Ejercicio1;


public class EjemploA {

	public static int contarCantidadLetra(String palabra, char letra) {
		  int contador = 0;
		  palabra = palabra.toLowerCase();
	      letra = Character.toLowerCase(letra);  
	      
	      for (int i = 0; i < palabra.length(); i++) {
	          if (palabra.charAt(i) == letra) {
	              contador++;
	          }
	      }
      return contador;
	}
}

