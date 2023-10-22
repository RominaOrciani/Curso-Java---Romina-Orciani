package Clase4_Ejercicio1B;

import java.util.Scanner;

import Clase4_Ejercicio1A.Ejercicio1;

public class main {

	public static void main(String[] args) {
		Ejercicio1 ejecucion1 = new Ejercicio1();
		Scanner obj=new Scanner (System.in);
		System.out.println("Ingresa primer numero");
		int primerNumero=obj.nextInt();
		System.out.println("Ingresa segundo numero");
		int segundoNumero=obj.nextInt();
		System.out.println("Ingresa tercer numero");
		int tercerNumero=obj.nextInt();
		System.out.println("Ingresa orden");
		char orden=obj.next().charAt(0);
		ejecucion1.ordenarNumeros(primerNumero,segundoNumero,tercerNumero,orden);

	}

}
