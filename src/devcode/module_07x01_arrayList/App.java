package devcode.module_07x01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1,"Jose",24));
		lista.add(new Persona(2,"Dario",43));
		lista.add(new Persona(3,"Maximo",37));
		lista.add(new Persona(1,"Jose",24));
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}	
		
		for (int i=0; i<lista.size(); i++ ) {
			System.out.println("index: " + lista.get(1)) ;
		}
		
		
		
	}
}
