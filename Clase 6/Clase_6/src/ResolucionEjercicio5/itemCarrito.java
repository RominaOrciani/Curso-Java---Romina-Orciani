package ResolucionEjercicio5;

public class itemCarrito {

	private int cantidad;
	private Producto producto;
	
	public itemCarrito(Producto producto, Integer cantidad) {
		this.setCantidad(cantidad);
		this.setProducto(producto);
	}
	
	public double getPrecio() {
		return this.producto.getPrecio()*this.getCantidad();
	}
	
	public String toString() {
		return this.getProducto().getNombre()+"("+this.getCantidad()+")";
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
