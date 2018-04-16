package devcode.module_08x01_App;

import java.util.Set;

public class Registro {
	private Integer id;
	private Empleado empleado;
	private Cliente cliente;
	private Set<Libro> libros;
	private char status;
	
	public Registro() {
		super();
	}
	public Registro(Integer id, Empleado empleado, Cliente cliente, Set<Libro> libros, char status) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.cliente = cliente;
		this.libros = libros;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Set<Libro> getLibros() {
		return libros;
	}
	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Registro [id=" + id + ", empleado=" + empleado + ", cliente=" + cliente + ", libros=" + libros
				+ ", status=" + status + "]";
	}
	
}
