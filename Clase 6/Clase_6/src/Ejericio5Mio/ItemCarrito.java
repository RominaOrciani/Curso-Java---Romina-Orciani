package Ejericio5Mio;

public class ItemCarrito {
	
	private int cantidad;
	private Producto producto;
	
	public ItemCarrito(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int precio() {
		return 0;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
}
