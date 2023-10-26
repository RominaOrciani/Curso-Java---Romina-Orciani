package ResolucionEjercicio5;

public class descuentoFijo extends Descuento{

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValorDescuento();
	}
}
