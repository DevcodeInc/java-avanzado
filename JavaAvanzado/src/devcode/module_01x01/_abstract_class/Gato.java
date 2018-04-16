package devcode.module_01x01._abstract_class;

public class Gato extends Animal{

	public Gato() {
		this.setTipo("Gato");
	}

	public Gato(String tipo) {
		super(tipo);
	}
	
	@Override
	public void desplazarse() {
		System.out.println("** Corro rapidamente en corta distancia");
		
	}

	@Override
	public void alimentarse() {
		System.out.println("** Me alimento de ratones");
	}
}
