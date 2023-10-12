package miprimerproyecto;

public class ejercicio_4 {

	public static void main(String[] args) {
	
		for (String linea : Files.readAllLines(Paths.get(archivo))){

			if(linea.startswith(“*”)){

			System.out.println(linea);

			}

			}

	}

}
