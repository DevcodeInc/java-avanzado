package devcode.module_07x02_LinkedSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class DevcodeExample {

	public static void main(String[] args) {

		Set<String> sets = new LinkedHashSet<String>();

		sets.add("David");
		sets.add("Carlos");
		sets.add("Jesus");
		sets.add("David");
		sets.add("Miguel");
		sets.add(null);

		for (String set : sets) {
			System.out.println(set);
		}
		
		Set<Persona> sets1 = new LinkedHashSet<Persona>();
		
		sets1.add(new Persona(1,"David",38));
		sets1.add(new Persona(6,"Max",30));
		sets1.add(new Persona(7,"Maximo",30));
		sets1.add( new Persona(4,"Edgar",42));
		sets1.add( new Persona(6,"Max",30));

		for (Persona set : sets1) {
			System.out.println(set);
		}		
		
	}
}
