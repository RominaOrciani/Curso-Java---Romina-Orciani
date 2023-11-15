package Ejericio5Mio;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
	
	private int fecha;
	private ArrayList<ItemCarrito> items;
	
	public int precio(Descuento desc) {
		return 100;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public ArrayList<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(List<ItemCarrito> items) {
		this.items = (ArrayList<ItemCarrito>) items;
	}

}
