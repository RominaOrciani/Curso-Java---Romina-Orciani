package miprimerproyecto;

import java.util.Scanner;

public class Clase01CEjercicio1AConScanner {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		
		System.out.println("Ingresa numero inicio");
		int numeroInicio=Integer.parseInt(obj.nextLine());
		System.out.println("Ingresa numero fin");
		int numeroFin=Integer.parseInt(obj.nextLine());
		System.out.println("Ingresa si queres imorimir los pares(p) o impares(i)");
		String parOImpar=obj.nextLine();
		
		while(numeroInicio<=numeroFin) {
			switch(parOImpar) {
			case "p":
				if(numeroInicio%2==0) {
					System.out.println(numeroInicio);
				}
				break;
			case"i":
				if(numeroInicio%2!=0) {
					System.out.println(numeroInicio);
				}
				break;
			default:
				System.out.println("Opcion ingresada incorrecta");
			}
			numeroInicio++;
		}

	}

}
