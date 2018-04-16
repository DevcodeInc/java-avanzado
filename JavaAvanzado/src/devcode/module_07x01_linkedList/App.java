package devcode.module_07x01_linkedList;

import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new LinkedList<Persona>();
		lista.add(new Persona(1,"Jose",24));
		lista.add(new Persona(2,"Dario",43));
		lista.add(new Persona(3,"Maximo",37));
		lista.add(new Persona(1,"Jose",24));
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}	
		
		System.out.println("**********");
		lista.add(new Persona(5,"Pedro",35) );
		lista.add(0,new Persona(0,"David",38) );
	
		for (Persona persona : lista) {
			System.out.println(persona);
		}					
	}
}
