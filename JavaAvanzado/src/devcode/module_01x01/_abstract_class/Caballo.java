package devcode.module_01x01._abstract_class;

public class Caballo extends Animal{

	public Caballo() {
		this.setTipo("Caballo");
	}

	public Caballo(String tipo) {
		super(tipo);
	}

	@Override
	public void desplazarse() {
		System.out.println("corro Rapidamente en cualquier distancia");
	}

	@Override
	public void alimentarse() {
		System.out.println("** me alimento de manzanas");
	}
}
