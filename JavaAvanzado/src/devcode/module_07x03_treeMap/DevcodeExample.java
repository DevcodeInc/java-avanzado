package devcode.module_07x03_treeMap;

import java.util.Map;
import java.util.TreeMap;
import devcode.module_07x03_treeMap.Persona;

public class DevcodeExample {

	public static void main(String[] args) {

		Map <Integer, String> hm = new  TreeMap <Integer, String> ();  

		hm.put(100,"Libros");
		hm.put(23,"Cuadernos");
		hm.put(15,"Libretas");
		hm.put(4,"Borras");
		hm.put(4,"Borras blanca");
		hm.put(1,null);
		hm.put(2,null);
//		hm.put(null,"Pepe");

		for (Map.Entry m: hm.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
		Map <Integer, Persona> hm2 = new  TreeMap <Integer, Persona> ();
		
		hm2.put(1, new Persona(1,"David",38));
		hm2.put(3, new Persona(6,"Max",30));
		hm2.put(2, new Persona(7,"Maximo",30));
		hm2.put(0, new Persona(4,"Edgar",42));
		hm2.put(3, new Persona(6,"Max",30));
		
		System.out.println ("\n");
		
		for (Map.Entry m: hm2.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
	}
}

