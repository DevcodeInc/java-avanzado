package devcode.module_07x03_linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class DevcodeExample {

	public static void main(String[] args) {

		 Map <Integer, String> hm = new  LinkedHashMap <Integer, String> ();  

		hm.put(100,"Libros");
		hm.put(23,"Cuadernos");
		hm.put(15,"Libretas");
		hm.put(4,"Borras");
		hm.put(3,"Miguel");
		hm.put(3,"Miguel Jose");
		hm.put(null,"Miguel");
		hm.put(null,"Pedro");
		hm.put(1,null);
		hm.put(31,null);

		for (Map.Entry m: hm.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
		Map <Integer, Persona> hm2 = new  LinkedHashMap <Integer, Persona> ();
		
		hm2.put(1, new Persona(1,"David",38));
		hm2.put(3, new Persona(6,"Max",30));
		hm2.put(2, new Persona(7,"Maximo",30));
		hm2.put(0, new Persona(4,"Edgar",42));
		hm2.put(3, new Persona(6,"Max",30));
		hm2.put(12, null);
		hm2.put(13, null);
		hm2.put(null, new Persona(7,"Maria",35));
		
		System.out.println ("\n");
		for (Map.Entry m: hm2.entrySet ()) {
			System.out.println ( m.getKey () + " " + m.getValue ());
		}
		
	}
}

