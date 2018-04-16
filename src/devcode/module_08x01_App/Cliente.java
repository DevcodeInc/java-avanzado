package devcode.module_08x01_App;

public class Cliente extends Persona {

	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nombre, Integer edad) {
		super(id, nombre, edad);
	}

	@Override
	public String toString() {
		return "Cliente [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()+"]";
	}
}
