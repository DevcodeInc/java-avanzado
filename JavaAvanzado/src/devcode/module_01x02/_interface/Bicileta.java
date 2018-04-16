package devcode.module_01x02._interface;

public class Bicileta implements Vehiculo{
	private Integer ruedas;

	public Bicileta() {
	}

	public Bicileta(Integer ruedas) {
		this.ruedas = ruedas;
	}

	public Integer getRuedas() {
		return ruedas;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public void trasladar() {
		System.out.println("Yo soy un "+ Vehiculo.NAME + " tipo " + tipoVehiculo() + " que me traslado en el suelo con " + this.ruedas + " ruedas");
	}

	@Override
	public String tipoVehiculo() {
		return "Bicileta";
	}
}
