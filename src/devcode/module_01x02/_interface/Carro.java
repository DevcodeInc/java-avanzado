package devcode.module_01x02._interface;

public class Carro implements Vehiculo, Motor{
	
	private Integer ruedas;

	public Carro() {
	}
	
	public Carro(Integer ruedas) {
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
		System.out.println("Yo soy un "+ Vehiculo.NAME + " tipo " + tipoVehiculo() + " que me traslado en el suelo con " + this.ruedas + " ruedas y con un motor de " + tipoMotor());
	}
	
	@Override
	public String tipoMotor() {
		return "tipo hidraulico";
	}

	@Override
	public String tipoVehiculo() {
		return "Carro";
	}
	
}
