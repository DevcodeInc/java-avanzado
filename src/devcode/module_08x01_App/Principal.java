package devcode.module_08x01_App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		/** Lista de clientes*/
		Map<Integer,Cliente> clientes = new HashMap<Integer,Cliente>();
		clientes.put(1, new Cliente(1, "Maximo", 37));
		clientes.put(2, new Cliente(2, "David", 39));
		clientes.put(3, new Cliente(3, "Jose", 25));
		clientes.put(4, new Cliente(4, "Jesus", 23));
		
		System.out.println ("Lista de clientes:\n");
		for (Map.Entry m : clientes.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}		
		
		/** Lista de empleados*/
		Set<Empleado> empleados = new 	HashSet<Empleado>();
		empleados.add(new Empleado(1, "Pablo", 24));
		empleados.add(new Empleado(2, "Maria", 25));
		
		System.out.println ("\nLista de empleados:");
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}		
		
		
		/** Lista de Autores*/
		List<Autor> autores = new ArrayList<Autor>();
		autores.add(new Autor(1, "Carlos Javier"));
		autores.add(new Autor(2, "David Colmenares"));
		autores.add(new Autor(3, "Ana Blanco"));
		
		System.out.println ("\nLista de Autores:");
		for (Autor autor : autores) {
			System.out.println(autor);
		}			
		
		/** Lista de Categorias*/
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(new Categoria(1,"Drama"));
		categorias.add(new Categoria(2,"Accion"));
		categorias.add(new Categoria(3,"Ciencia ficcion"));
		categorias.add(new Categoria(4,"Terror"));
		categorias.add(new Categoria(5,"Crimen"));
		
		System.out.println ("\nLista de Categorias:");
		for (Categoria categoria : categorias) {
			System.out.println(categoria);
		}			
		
		/** Lista de libros*/
		Set<Libro> libros = new TreeSet<Libro>();
		libros.add(new Libro(1, "La dama de rojo", categorias.get(0), autores.get(0), 5));
		libros.add(new Libro(2, "El puño de hierro", categorias.get(1), autores.get(1), 3));
		libros.add(new Libro(3, "El dispositivo definitivo", categorias.get(2), autores.get(2), 14));
		libros.add(new Libro(4, "La casa embrujada", categorias.get(3), autores.get(0), 17));
		libros.add(new Libro(5, "El cuerpo perdido", categorias.get(4), autores.get(2), 15));
		
		System.out.println ("\nLista de libros:");
		for (Libro libro : libros) {
			System.out.println(libro);
		}	
		
		/** Reservar del cliente {1, "Maximo"}, 
		 * con los libros[{1, "La dama de rojo"},{2, "El puño de hierro"}]
		 */ 
		
		Map<Integer,Integer> existenciaLibros = new 	HashMap<Integer,Integer>();	
		
		Empleado empleado = null;
		for (Empleado emp : empleados) {
			if(emp.getId()== 1) 
				empleado = emp;
		}	
		
		Set<Libro> reservarlibros = new TreeSet<Libro>();
		for (Libro lib : libros) {
			if(lib.getId()== 1 || lib.getId()== 2) { 
				reservarlibros.add(lib);
				existenciaLibros.put(lib.getId(), lib.getCantidad()-1);
			}
		}		
		
		List<Registro> registros = new ArrayList<Registro>();
		
		registros.add(new Registro(1,empleado, clientes.get(1), reservarlibros ,'R'));
		
		System.out.println ("\nLista de registros:");
		for (Registro registro : registros) {
			System.out.println(registro);
		}
		
		/** Devoluccion de libros del cliente {1, "Maximo"}, 
		 * con los libros[{1, "La dama de rojo"},{2, "El puño de hierro"}]
		 */ 
			
		for (Registro registro : registros) {
			if (registro.getId()==1) {
				registro.setStatus('D');
				for (Libro libroReservado : reservarlibros) {
					existenciaLibros.put(libroReservado.getId(), libroReservado.getCantidad()+1);
				}
			}
		}
		
		System.out.println ("\nLista de registros:");
		for (Registro registro : registros) {
			System.out.println(registro);
		}		
	}
}
