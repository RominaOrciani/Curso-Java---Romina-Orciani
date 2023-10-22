package Clase4_Ejercicio1A;

import java.util.Arrays;

public class Ejercicio1 {
	
	public void ordenarNumeros(int primerNumero, int segundoNumero, int tercerNumero , char letra) {
		int[] vectorInicial = {primerNumero,segundoNumero,tercerNumero};
		if(letra=='A') {
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
		}else if(letra=='D'){
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
			System.out.println("Ingresar (A) Ascendete o (D) Descendente");
		}
	}
}