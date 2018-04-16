package devcode.module_01x01._abstract_class;

public class Perro extends Animal {

	public Perro() {
		this.setTipo("Perro");
	}

	public Perro(String tipo) {
		super(tipo);
	}

	@Override
	public void desplazarse() {
		System.out.println("** Corro no tan rapidamente");
	}

	@Override
	public void alimentarse() {
		System.out.println("** Me alimento de Carne");
	}	
}
