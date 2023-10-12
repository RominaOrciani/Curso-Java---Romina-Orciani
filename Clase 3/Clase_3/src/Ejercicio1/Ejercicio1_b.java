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
			int cont=1;
			while(cont>0) {
				for(int i=0;i<(vectorInicial.length-1);i++) {
					cont=0;
					int aux=0;
					if(vectorInicial[i+1]<vectorInicial[i]) {
						aux=vectorInicial[i];
						vectorInicial[i]=vectorInicial[i+1];
						vectorInicial[i+1]=aux;
						cont=cont+1;
					}
				}
			}
			System.out.println(Arrays.toString(vectorInicial));
		}else if(orden=="descendente"){
			int cont=1;
			while(cont>0) {
				for(int i=0;i<(vectorInicial.length-1);i++) {
					cont=0;
					int aux=0;
					if(vectorInicial[i+1]>vectorInicial[i]) {
						aux=vectorInicial[i+1];
						vectorInicial[i+1]=vectorInicial[i];
						vectorInicial[i]=aux;
						cont=cont+1;
					}
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
		ejecucion1.ordenarNumeros(7,5,9,"ascendente");
		ejecucion1.ordenarNumeros(3,5,9,"descendente");
		ejecucion1.ordenarNumeros(7,5,9,"nene");
	}		
}