package Ejercicio1;


public class Prueba {

	
		char letra;
		String palabra;
		int contador=0;
		
		public void contarLetra(String palabra, char letra) {
			for(int i=0;i < palabra.length();i++) {
				
			if(palabra.charAt(i)==letra) {
				contador++;
			}
			}
			System.out.println("Contador " +contador);
		}
		
		
		
		public static void main(String[] args) {
			Prueba clasePrueba = new Prueba();
			
			clasePrueba.contarLetra("correr", 'r');
			
		}

}