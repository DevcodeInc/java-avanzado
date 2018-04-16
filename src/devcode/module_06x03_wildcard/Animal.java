package devcode.module_06x03_wildcard;

public class Animal implements SerVivo{
	private String tipo;

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

	@Override
	public void alimentarse() {
		System.out.println("El Animal se alimenta");
	}
}
