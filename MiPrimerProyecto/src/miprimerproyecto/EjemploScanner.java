package miprimerproyecto;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		
		System.out.println("Ingresa numero inicio");
		String textoCapturado=obj.nextLine();
		String textoCapturado2=obj.nextLine();
		System.out.println("El texto leido por consola:"+textoCapturado);

	}

}
