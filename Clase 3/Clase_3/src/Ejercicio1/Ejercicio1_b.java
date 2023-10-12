package Ejercicio1;

import java.util.Arrays;

public class Ejercicio1_b {
	int primerNumero;
	int segundoNumero;
	int tercerNumero;
	String orden;
	
	public void ordenarNumeros(int primerNumero, int segundoNumero, int tercerNumero , String orden) {
		int[] vectorInicial = {primerNumero,segundoNumero,tercerNumero};
		if(orden=="ascendente") {
			for(int i=0;i < (vectorInicial.length-1);i++) {
				int aux=0;
				if(vectorInicial[i+1]<vectorInicial[i]) {
					aux=vectorInicial[i];
					vectorInicial[i]=vectorInicial[i+1];
					vectorInicial[i+1]=aux;
				}
			}
			System.out.println(Arrays.toString(vectorInicial));
		}else if(orden=="descendente"){
			for(int i=0;i < (vectorInicial.length-1);i++) {
				int aux=0;
				if(vectorInicial[i]>vectorInicial[i+1]) {
					aux=vectorInicial[i];
					vectorInicial[i]=vectorInicial[i+1];
					vectorInicial[i+1]=aux;
				}
			}
			System.out.println(Arrays.toString(vectorInicial));
		}
		else{
			System.out.println("Ingresar Ascendete o Descendente");
		}
	}

	public static void main(String[] args) {
		Ejercicio1_b ejecucion1 = new Ejercicio1_b();
		ejecucion1.ordenarNumeros(10,5,9,"ascendente");
		ejecucion1.ordenarNumeros(7,5,9,"descendente");
		ejecucion1.ordenarNumeros(7,5,9,"nene");
	}		
}