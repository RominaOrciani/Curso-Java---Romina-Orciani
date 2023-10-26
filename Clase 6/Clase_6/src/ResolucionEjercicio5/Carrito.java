package ResolucionEjercicio5;

public class Carrito {

	private Persona persona;
	private itemCarrito item1;
	private itemCarrito item2;
	private itemCarrito item3;
	
	public Carrito() {}
	
	public Double getCostoFinal() {
		Double costoFinal = 0.0;
		costoFinal = this.item1.getPrecio()+ this.item2.getPrecio()+this.item3.getPrecio();
		return costoFinal;
	}

	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public itemCarrito getItem1() {
		return item1;
	}

	public void setItem1(itemCarrito item1) {
		this.item1 = item1;
	}

	public itemCarrito getItem2() {
		return item2;
	}

	public void setItem2(itemCarrito item2) {
		this.item2 = item2;
	}

	public itemCarrito getItem3() {
		return item3;
	}

	public void setItem3(itemCarrito item3) {
		this.item3 = item3;
	}
	
}
