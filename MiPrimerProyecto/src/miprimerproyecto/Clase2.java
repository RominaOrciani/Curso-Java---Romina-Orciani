package miprimerproyecto;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean terminoElPrograma=false;
		String accion="NO";
		while(!terminoElPrograma) {
			//CONJUNTO DE INSTRUCCIONES
			System.out.println("Inicia el ciclo while, se ejecuta alguna cosa");
			System.out.println("Queres terminar el programa? Si o No");
			accion=scanner.nextLine();
			
			if(accion.equals("SI")) {
				terminoElPrograma=true;
			}
		}

	}

}
