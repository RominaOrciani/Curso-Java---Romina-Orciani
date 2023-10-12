package Ejercicio1;

public class Ejercicio1_c {
	int [] vectorNumeros;
	int numeroReferebcia;
	
	public void sumarNumeros(int [] vectorNumeros,int numeroReferencia) {
		int resultado=0;
		for(int i=0;i< vectorNumeros.length;i++) {
			if(vectorNumeros[i]>numeroReferencia) {
				resultado=resultado+vectorNumeros[i];
			}
		}
		System.out.println("Suma " +resultado);
	}

	public static void main(String[] args) {
		Ejercicio1_c ejecucion1 = new Ejercicio1_c();
		int[] vector= {1,8,6,3,7};
		ejecucion1.sumarNumeros(vector,5);
	}

}
