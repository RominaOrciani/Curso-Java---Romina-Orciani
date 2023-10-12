package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		String fraseBase = "hola que tal";
		byte[] decodedBytes= fraseBase.getBytes();
		
		for(int i=0;i<decodedBytes.length;i++) {
			decodedBytes[i]++;
		}
		String fraseDesplazada=new String (decodedBytes);
		System.out.println("Frase sin desplazamiento " + fraseBase);
		System.out.println("Frase con desplazamiento " + fraseDesplazada);
	}

}
