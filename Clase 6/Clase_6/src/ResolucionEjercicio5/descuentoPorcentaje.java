package ResolucionEjercicio5;

public class descuentoPorcentaje extends Descuento{

	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - (valorInicial * this.getValorDescuento());
	}

}
