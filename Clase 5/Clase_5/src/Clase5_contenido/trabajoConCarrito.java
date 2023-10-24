package Clase5_contenido;

import Clase5.entidades.Persona;
import Clase5.entidades.Producto;
import Clase5.entidades.Carrito;

public class trabajoConCarrito {

	public static void main(String[] args) {
		
		//Instaciar una persona
		Persona nahuel = new Persona("Nahuel","Ramirez");
		System.out.println(nahuel.toString());
		
		//instacnciar producto con su nombre
		Producto harina = new Producto("Harina");
		//instanciar dos productos con nombre, descripcion y peso
		Producto roastBeef = new Producto("Roast Beef","Carne de ternera",3000.0);
		Producto leche = new Producto("Leche","Producto lacteo",550.0);
		
		//Instanciar un carrito
		Carrito carrito = new Carrito(nahuel,leche,roastBeef,harina);
		
		System.out.println("El costo final del carrito es: "+carrito.costoFinal());
		
	}

}
