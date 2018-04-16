package devcode.module_08x01_App;
//package devcode.module_08x01_App;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Principal implements Accion {
//	
//	Set<Cliente> clientes = new HashSet<Cliente>();
//	Map<Integer,Empleado> empleados = new 	HashMap<Integer,Empleado>();
//	Set<Libro> libros = new HashSet<Libro>();
//	List<Registro> registros = new ArrayList<Registro>();
//	Map<Integer,Integer> existenciaLibros = new 	HashMap<Integer,Integer>();
//	
//	public static void main(String[] args) {
//		Principal p= new Principal();
//		p.cargarMenu();
//	}
//	
//	public void cargarMenu() {
//		System.out.println("\nSeleccionar una opcion:");
//		System.out.println("1 Agregar nuevo Cliente: ");
//		System.out.println("2 Agregar nuevo Empleado: ");
//		System.out.println("3 Agregar nuevo Libro: ");
//		System.out.println("4 Registrar nueva reserva: ");
//		System.out.println("5 Registrar retorno: ");
//		System.out.println("6 Mostrar registros: ");
//		
//		Scanner in = new Scanner(System.in);
//		int opcionIn = in.nextInt();
//		
//		switch (opcionIn) {
//			case 1:
//					this.addCliente();
////					this.cleanScreen();
//					this.cargarMenu();
//				break;
//			case 2:
//				this.addEmpleado();
//				this.cargarMenu();
//				break;
//			case 3:
//				this.addLibro();
//				this.cargarMenu();
//				break;
//			case 4:
//				this.registrarReserva();
//				this.cargarMenu();
//			case 5:
//				this.registrarRetorno();
//				this.cargarMenu();
//				break;
//			case 6:
//				this.mostrarReservas();
//				this.cargarMenu();
//				break;
//			default:
//				break;
//		}			
//	}
//	
//	public void cleanScreen() {
//	    try
//	    {
//	        final String os = System.getProperty("os.name");
//
//	        if (os.contains("Windows"))
//	        {
//	            Runtime.getRuntime().exec("cls");
//	        }
//	        else
//	        {
//	            Runtime.getRuntime().exec("clear");
//	        }
//	    }
//	    catch (final Exception e)
//	    {
//	        System.out.println("Error generado por: " + e.getStackTrace() );
//	    }
//	}
//	
//	
//	public  String getInput(String cadena){
//		System.out.print(cadena);
//		Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();		
//	}
//	
//	@Override
//	public void addCliente() {
//	    
//		int id = Integer.valueOf(getInput("Introduzca id: "));   
//		String nombre =  getInput("Introduzca nombre:  ");
//		int edad =  Integer.valueOf(getInput("Introduzca edad:  "));
//		
//		Cliente c= new Cliente(id, nombre, edad);
//		
//		boolean add= true;
//		
//		for (Cliente cliente : this.clientes) {
//			if (cliente.equals(c)) {
//				add= false;
//				break;
//			}
//		}
//		if(add) this.clientes.add(c);
//		else  	System.out.println("\nEste cliente ya existe ");
//	}	
//	
//	@Override
//	public void addLibro() {
//		
//		int id = Integer.valueOf(getInput("Introduzca id: "));   
//		String nombre =  getInput("Introduzca nombre:  ");
//		String categoria =  getInput("Introduzca categoria:  ");
//		String autor =  getInput("Introduzca autor:  ");
//		int cantidad =  Integer.valueOf(getInput("Introduzca cantidad:  "));
//		
////		Libro l= new Libro(id, nombre, categoria,autor, cantidad);
//		Libro l= new Libro();
//		
//		boolean add= true;
//		
//		for (Libro libro : this.libros) {
//			if (libro.equals(l)) {
//				add= false;
//				break;
//			}
//		}
//		if(add) this.libros.add(l);
//		else 	System.out.println("\nEste libro ya existe ");			
//	}
//
//	@Override
//	public void addEmpleado() {
//		int id = Integer.valueOf(getInput("Introduzca id: "));   
//		String nombre =  getInput("Introduzca nombre:  ");
//		int edad =  Integer.valueOf(getInput("Introduzca edad:  "));
//		
//		Empleado e= new Empleado(id, nombre, edad);
//		
//		boolean add= true;
//		
//		for (Map.Entry m: this.empleados.entrySet ()) {
//			System.out.println (m.getKey () + " " + m.getValue ());
//			if (m.getValue ().equals(e)) {
//				add= false;
//				break;
//			}			
//		}
//		
//		if(add) this.empleados.put(e.getId(), e);
//		else 	System.out.println("\nEste cliente ya existe ");		
//	}
//
//	@Override
//	public void registrarReserva() {
//	
//		int idEmpleado = Integer.valueOf(getInput("Introduzca id del Empleado: "));  
//		Empleado empleado =  this.getEmpleado(idEmpleado);
//		
//		int idCliente = Integer.valueOf(getInput("Introduzca id del Cliente: ")); 
//		Cliente cliente =  this.getCliente(idCliente);
//		
//		Set<Libro> librosTemp = new HashSet<Libro>();
//		boolean preguntar= true;
//		
//		while ( preguntar == true ){ 
//			int idLibro = Integer.valueOf(getInput("Introduzca id del libro que va a reservar: ")); 
//			Libro libTemp = this.getLibro(idLibro);
//			
//			if (libTemp != null) librosTemp.add(libTemp);
//			
//			String result = getInput("Desea reservar mas Libros S/N: "); 
//			
//			if(result.equalsIgnoreCase("N")) preguntar = false;
//		} 
//		
//		boolean add= true;
//		if (this.existenciaLibros!=null && this.existenciaLibros.size()>0) {
//			for (Libro libro : librosTemp) {
//				if (existenciaLibros.get(libro.getId())==0) {
//					add= false;
//					System.out.println("\n Este libro no esta en existencia");
//					break;
//				}else {
//					this.existenciaLibros.put(libro.getId(),this.existenciaLibros.get(libro.getId())-1);
//				}
//			}
//		}
//		
//		Registro registro= new Registro(empleado, cliente, librosTemp ,'E');
//		this.registros.add(registro);
//	}
//
//	@Override
//	public void registrarRetorno() {
//
//		int idEmpleado = Integer.valueOf(getInput("Introduzca id del Empleado: "));  
//		Empleado empleado =  this.getEmpleado(idEmpleado);
//		
//		int idCliente = Integer.valueOf(getInput("Introduzca id del Cliente: ")); 
//		Cliente cliente =  this.getCliente(idCliente);
//		
//		Set<Libro> librosTemp = new HashSet<Libro>();
//		boolean preguntar= true;
//		
//		while ( preguntar == true ){ 
//			int idLibro = Integer.valueOf(getInput("Introduzca id del libro que va a retornar: ")); 
//			Libro libTemp = this.getLibro(idLibro);
//			
//			if (libTemp != null) librosTemp.add(libTemp);
//			
//			String result = getInput("Desea retornar otro libro S/N: "); 
//			
//			if(result.equalsIgnoreCase("N")) preguntar = false;
//		} 		
//		
//		if (this.existenciaLibros!=null && this.existenciaLibros.size()>0) {
//			for (Registro reg : this.registros) {
//				reg.setStatus('D');
//				for (Libro lib : this.libros) {
//					this.existenciaLibros.put(lib.getId(),this.existenciaLibros.get(lib.getId())+1);
//				}
//			}
//		}
//	}
//
//	@Override
//	public Libro getLibro(int id) {
//		Libro libro= null;
//		for (Libro lib : this.libros) {
//			if (lib.getId() == id) {
//				libro = lib;
//				break;
//			}
//		}
//		return libro;
//	}
//
//	@Override
//	public Cliente getCliente(int id) {
//		Cliente cliente= null;
//		for (Cliente cli : this.clientes) {
//			if (cli.getId() == id) {
//				cliente = cli;
//				break;
//			}
//		}
//		return cliente;
//	}
//
//	@Override
//	public Empleado getEmpleado(int id) {
//		return this.empleados.get(id);
//	}
//
//	@Override
//	public void mostrarReservas() {
//		for (Registro registro : this.registros) {
//			System.out.println("\nregistros: " + registro); 
//		}
//	}
//}
