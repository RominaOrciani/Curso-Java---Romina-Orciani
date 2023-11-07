package com.curso.compras;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.curso.compras.excepciones.NoHayStockException;
import com.curso.compras.models.Carrito;
import com.curso.compras.models.DescuentoFijo;
import com.curso.compras.models.DescuentoPorcentaje;
import com.curso.compras.models.ItemCarrito;
import com.curso.compras.models.Persona;
import com.curso.compras.models.Producto;

public class CarritoTest {
	
	@Test
	public void validarCostoFinalSinDescuento() {
		
		//Inastancio una Persona
    	Persona unaPersona = new Persona("Nahuel","Ramirez");
    	
    	DescuentoFijo desc1 = new DescuentoFijo();
    	desc1.setValorDescuento(500);
    	DescuentoPorcentaje desc2 = new DescuentoPorcentaje();
    	desc2.setValorDescuento(0.3);//Descuento del 30%
    	
    	Producto harina = new Producto("harina",100.0);
    	Producto roastBeef = new Producto("roastBeef",1250.5);
    	Producto leche = new Producto("leche",250.0);
    	
    	ItemCarrito item1 = new ItemCarrito(harina,3);
    	ItemCarrito item2 = new ItemCarrito(roastBeef,1);
    	ItemCarrito item3 = new ItemCarrito(leche,3);
    	
    	Carrito unCarrito = new Carrito(unaPersona);
    	
    	unCarrito.setItem1(item1);
    	unCarrito.setItem2(item2);
    	unCarrito.setItem3(item3);
    	
		Double costoFinalDelCarrito = 0.0;
		costoFinalDelCarrito += unCarrito.getItem1().getProducto().getPrecio()*unCarrito.getItem1().getCantidad()
							 + unCarrito.getItem2().getProducto().getPrecio()*unCarrito.getItem2().getCantidad()
							 + unCarrito.getItem3().getProducto().getPrecio()*unCarrito.getItem3().getCantidad();
		try {
		assertEquals(unCarrito.getCostoFinal(), costoFinalDelCarrito);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
