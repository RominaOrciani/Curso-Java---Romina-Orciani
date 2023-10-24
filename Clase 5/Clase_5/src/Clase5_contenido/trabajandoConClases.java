package Clase5_contenido;

import Clase5.entidades.Persona;
import Clase5.entidades.Producto;

public class trabajandoConClases {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Mariana","Gonzales");
		
		persona1.setNombre("Mariana");
		persona1.setApellido("Gonzales");
		
		Persona persona2 = new Persona();
		
		persona2.setNombre("Pedro");
		persona2.setApellido("Sousa");
		
		System.out.println(persona1.getApellido()+", "+persona2.getNombre());
		
		Producto prod1 = new Producto();
		
		prod1.setNombre("cepillo de dientes");
		prod1.setCodigo("123456");
		prod1.setPrecio(550);
		
		Producto prod2 = new Producto();
		
		prod2.setNombre("pasta de dientes");
		prod2.setCodigo("4321");
		prod2.setPrecio(750);

	}

}
