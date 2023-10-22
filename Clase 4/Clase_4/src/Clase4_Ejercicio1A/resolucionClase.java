package Clase4_Ejercicio1A;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class resolucionClase {

	public static void main(String[] args) {
		
		String rutaAbsoluta="C:\\Users\\54116\\OneDrive\\Escritorio\\Romina\\Java\\Curso-Java---Romina-Orciani\\Clase 4\\Clase_4\\recursos\\archivoTextoEjemplo.txt";
		String rutaRelativa="recursos/archivoTextoEjemplo.txt";
		
		Path pathDelArchivo=Paths.get(rutaRelativa);
		
		try {
			for(String linea:Files.readAllLines(pathDelArchivo)) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException s) {
			System.out.print("El archivo no existe");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
