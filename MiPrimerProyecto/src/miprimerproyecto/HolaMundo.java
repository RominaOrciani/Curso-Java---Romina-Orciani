package miprimerproyecto;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prueba de instrucciones de asisnación:");
		
		//Instrucciones de asignación y creación de variable
		char unaLetra = 'a';
		boolean unValorBooleano = true;
		int miPrimerContador = 66;
		double unValor = 1.68;
		float otroNum = 2.344f;
		System.out.println(unaLetra);
		
		//Instrucción de asisnación de variable
		unaLetra = 'b';
		
		System.out.println(unaLetra);
		
		//Instrucciones de operaciones básicas:
		System.out.println("Prueba de operaciones básicas:");
		
		int suma=10+20;
		int resta=15-12;
		int mul=10*3;
		int div=8/3;
		int modulo=8%3; //devuelve es resto de la división
		
		System.out.println("El modulo de 8/3 es: "+ modulo);
		
		//Inatrucciones de precedencia
		int precedencia1=3*2+3;
		System.out.println(precedencia1);
		int precedencia2=(3*2)+3;
		System.out.println(precedencia2);
		int precedencia3= 3 + 3*2;
		System.out.println(precedencia3);
		
		//Intrucciones con tipo de dato Boolean
		boolean booleano= 10>20;
		System.out.println(booleano);
		booleano = 15>=12;
		System.out.println(booleano);
		
		//Ejemplo de Monotributo
		int ingresodocente= 500000;
		int superficiedocente=30;
		boolean superaingreso=ingresodocente< 750000 && superficiedocente<300;
		
		boolean booleanovariable=true;
		System.out.println("NOT: "+!booleanovariable); //FALSE
		System.out.println("AND: "+(booleanovariable && true)); // TRUE
		System.out.println("OR: " + (booleanovariable || true)); //TRUE
		System.out.println("MULTIPLE: " + (ingresodocente< 750000 && superficiedocente<300)); //TRUE
		
		
		int UnNumero=30;
		int OtroNumero=20;
		
		if(UnNumero < OtroNumero) {
			System.out.println("Si Es Verdad");
		 } else {
			UnNumero=20;
			System.out.println("Es falso, entonces al Numero mas grande le sume 20");
		 }
		
		//Ejemplo para iniciar con el programa de asignacion de categoria de Monotributo
		double ingresosCatA = 748382.07 ;
		int superficieCatA = 30 ;
		int energiaCatA = 3330 ; 
		
		double ingresosDePersona = 500000 ;
		int superficieDePersona = 15 ; 
		int energiaDePersona = 0 ;
		
		if(ingresosDePersona < ingresosCatA
				&& superficieDePersona < superficieCatA
				&& energiaDePersona < energiaCatA) {
			System.out.println("Si, es de la categoria A");
		}else {
			System.out.println("No, no es de la categoria A");
		}
		

	}

}
