package devcode.module_07x03_hashMap;

import java.util.HashMap;
import java.util.Map;

public class DevcodeExample {

	public static void main(String[] args) {

		Map <String, String> hm = new  HashMap <String, String> ();

		hm.put("1","David");
		hm.put("2","Carlos");
		hm.put("5","Jesus");
		hm.put("4","David");
		hm.put("3","Miguel");
		hm.put(null,"Miguel");
		hm.put(null,"Pedro");
		hm.put("1","Gabriel");
		hm.put("1",null);
		hm.put("9",null);

		for (Map.Entry m : hm.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
		Map <Integer, Persona> hm2 = new  HashMap <Integer, Persona> ();
		
		hm2.put(1, new Persona(1,"David",38));
		hm2.put(3, new Persona(6,"Max",30));
		hm2.put(2, new Persona(7,"Maximo",30));
		hm2.put(0, new Persona(4,"Edgar",42));
		
		hm2.put(1, new Persona(1,"David",38));
		hm2.put(3, new Persona(6,"Max",30));
		hm2.put(2,new Persona(7,"Maximo",30));
		hm2.put(0,new Persona(4,"Edgar",42));
		hm2.put(3, new Persona(6,"Max",30));
		
		for (Map.Entry m: hm2.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
		System.out.println ("get object: "+ hm2.get(3) );
	}
}

