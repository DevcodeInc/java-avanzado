package devcode.module_01x02._interface;

public class Barco implements Vehiculo, Propulsor {
	private Integer helices;

	public Barco() {
	}

	public Barco(Integer helices) {
		this.helices = helices;
	}

	public Integer getHelices() {
		return helices;
	}

	public void setHelices(Integer helices) {
		this.helices = helices;
	}

	@Override
	public void funcionar() {
		System.out.println("Yo soy un "+ Vehiculo.NAME + " tipo " + tipoVehiculo() + " que funciono en el agua con " + this.helices + " helices con motores " + tipoMotor());
	}
	
	@Override
	public void trasladar() {
		System.out.println("Yo soy un "+ Vehiculo.NAME + " tipo " + tipoVehiculo() + " que me traslado en el agua");
	}

	@Override
	public String tipoMotor() {
		return "tipo diésel marino";
	}

	@Override
	public String tipoVehiculo() {
		return "Barco";
	}
}
