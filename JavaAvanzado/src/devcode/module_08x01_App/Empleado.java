package devcode.module_08x01_App;

public class Empleado extends Persona {

	public Empleado() {
		super();
	}

	public Empleado(Integer id, String nombre, Integer edad) {
		super(id, nombre, edad);
	}

	@Override
	public String toString() {
		return "Empleado [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()+ "]";
	}
	
	
}