package com.curso.compras;

import com.curso.compras.excepciones.*;
import com.curso.compras.models.*;

public class App 
{
    public static void main( String[] args )
    {
    	
        //Inastancio una Persona
    	Persona unaPersona = new Persona("Nahuel","Ramirez");
    	
    	DescuentoFijo desc1 = new DescuentoFijo();
    	desc1.setValorDescuento(500);
    	
    	DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
    	desc2.setValorDescuento(0.3);//Descuento del 30%
    	
    	Producto harina = new Producto("harina",100.0);
    	Producto roastBeef = new Producto("roastBeef",1250.5);
    	Producto leche = new Producto("leche",250.0);
    	
    	ItemCarrito item1 = new ItemCarrito(harina,12);
    	ItemCarrito item2 = new ItemCarrito(roastBeef,1);
    	ItemCarrito item3 = new ItemCarrito(leche,3);
    	
    	Carrito unCarrito = new Carrito(unaPersona);
    	
    	unCarrito.setItem1(item1);
    	unCarrito.setItem2(item2);
    	unCarrito.setItem3(item3);
    	try {
    		System.out.println("Costo final del carrito sin descuento: "+unCarrito.getCostoFinal());
    		System.out.println("Costo final del carrito con descuento fijo: "+unCarrito.getCostoFinal(desc1));
    		System.out.println("Costo final del carrito con descuento con porcentaje: "+unCarrito.getCostoFinal(desc2));
    	}catch(NoHayStockException e) {
    		System.out.println("No hay stock del producto: "+ e.getProducto().getNombre());
    	}catch(NoSuperoMontoMinException e){
    		System.out.println("No se supero el monto minimo necesario para compras ($5000)");
    	}
    }
}
