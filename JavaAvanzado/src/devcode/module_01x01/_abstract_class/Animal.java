package devcode.module_01x01._abstract_class;

public abstract class Animal {
	
	private String tipo;
	
	protected static final String SOY= "animal";

	public Animal() {
	}

	public Animal(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void desplazarse();
	
	public abstract void alimentarse();
	
	protected void soyAnimal() {
		System.out.println("Yo " + this.tipo + " soy un " + SOY);
	};
	
}
