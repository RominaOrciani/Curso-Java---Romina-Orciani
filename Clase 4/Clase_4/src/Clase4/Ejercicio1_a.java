package Clase4;


public class Ejercicio1_a {

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
			Ejercicio1_a clasePrueba = new Ejercicio1_a();
			
			clasePrueba.contarLetra("correr", 'r');
			
		}

}