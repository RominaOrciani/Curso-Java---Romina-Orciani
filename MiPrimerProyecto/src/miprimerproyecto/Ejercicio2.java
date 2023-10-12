package miprimerproyecto;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		float ingresosMensuales=100000;
		int cantidadVehiculosMenorA5anios=3;
		int cantidadInmuebles=1;
		int cantidadVehiculosLujo=0;
		if(
				ingresosMensuales>=489083 ||
				cantidadVehiculosMenorA5anios>=3 ||
				cantidadInmuebles>=3 ||
				cantidadVehiculosLujo>0
				) {
			System.out.println("El hogar pertene al segmento de ingresos altos");
		}else {
			System.out.println("El hogar no pertenece al segmento de ingresos altos");
		}

	}

}
