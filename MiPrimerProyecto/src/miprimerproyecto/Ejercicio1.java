package miprimerproyecto;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.println("Inicia el item A del ejercicio 1:");
		
		while(numeroInicio<=numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
			
		System.out.println("Inicia el item B del ejercicio 1:");
		numeroInicio=5;
		while(numeroInicio<=numeroFin) {
			if(numeroInicio%2==0) {
			System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
		System.out.println("Inicia el item C del ejercicio 1:");
		
		numeroInicio=5;
		boolean esPar=true;
		while(numeroInicio<=numeroFin) {
			if(numeroInicio%2==0 && esPar) {
				System.out.println(numeroInicio);
			}
			if(numeroInicio%2!=0 && !esPar) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
		numeroInicio=5;
		boolean esImpar=false;
		while(numeroInicio<=numeroFin) {
			if(numeroInicio%2==0 && esImpar) {
				System.out.println(numeroInicio);
			}
			if(numeroInicio%2!=0 && !esImpar) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
		System.out.println("Inicia el item C del ejercicio 1, usando switch:");
		numeroInicio=5;
			char parOImpar='a';
			while(numeroInicio<=numeroFin) {
				switch(parOImpar) {
				case 'p':
					if(numeroInicio%2==0) {
						System.out.println(numeroInicio);
					}
					break;
				case'i':
					if(numeroInicio%2!=0) {
						System.out.println(numeroInicio);
					}
					break;
				default:
					System.out.println("Opcion ingresada incorrecta");
				}
				numeroInicio++;
			}
		
		numeroInicio=5;
		System.out.println("Inicia el item D del ejercicio 1:");
		for(numeroFin=14;numeroInicio<=numeroFin;numeroFin--) {
			if(numeroFin%2==0) {
				System.out.println(numeroFin);
			}
		}

	}

}
