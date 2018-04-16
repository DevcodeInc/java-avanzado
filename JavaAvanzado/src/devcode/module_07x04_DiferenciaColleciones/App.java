package devcode.module_07x04_DiferenciaColleciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		System.out.println("\nLista ArrayList: ");
		List<String> lista = new ArrayList<String>();
		lista.add("Jose");
		lista.add("Dario");
		lista.add("Maximo");
		lista.add("Jose");
		lista.add(null);
		
		for (String str : lista) {
			System.out.println(str);
		}	
		
		System.out.println("\nLista LinkedList: ");
		List<String> linList = new LinkedList<String>();
		linList.add("Jose");
		linList.add("Dario");
		linList.add("Maximo");
		linList.add("Jose");
		linList.add(null);
		
		for (String str : linList) {
			System.out.println(str);
		}
		
		System.out.println("\nLista HashSet: ");
		Set<String> sets = new HashSet<String>();
		sets.add("Jose");
		sets.add("Dario");
		sets.add("Maximo");
		sets.add("Jose");
		sets.add(null);
		
		for (String set : sets) {
			System.out.println(set);
		}
		
		System.out.println("\nLista LinkedHashSet: ");
		Set<String> linHasSets = new LinkedHashSet<String>();
		linHasSets.add("Jose");
		linHasSets.add("Dario");
		linHasSets.add("Maximo");
		linHasSets.add("Jose");
		linHasSets.add(null);
		for (String linHasSet : linHasSets) {
			System.out.println(linHasSet);
		}	
		
		System.out.println("\nLista TreeSet: ");
		Set<String> treeSets = new TreeSet<String>();
		treeSets.add("Jose");
		treeSets.add("Dario");
		treeSets.add("Maximo");
		treeSets.add("Jose");
		treeSets.add("Miguel");
//		treeSets.add(null);

		for (String treSet : treeSets) {
			System.out.println(treSet);
		}		
		
		System.out.println("\nLista HashMap: ");
		Map <Integer, String> hm = new  HashMap <Integer, String> ();

		hm.put(1,"Jose");
		hm.put(2,"Dario");
		hm.put(3,"Maximo");
		hm.put(1,"Jose");
		hm.put(null,"Miguel");
		hm.put(1,null);
		hm.put(4,null);

		for (Map.Entry m : hm.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
		
		System.out.println("\nLista LinkedHashMap: ");
		Map <Integer, String> linHasMap = new  LinkedHashMap <Integer, String> ();
		
		linHasMap.put(1,"Jose");
		linHasMap.put(2,"Dario");
		linHasMap.put(3,"Maximo");
		linHasMap.put(1,"Jose");
		linHasMap.put(null,"Miguel");
		linHasMap.put(null,"Pedro");
		linHasMap.put(1,null);
		linHasMap.put(9,null);
		
		for (Map.Entry m : linHasMap.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}		
		
		System.out.println("\nLista TreeMap: ");
		Map <Integer, String> treMap = new  TreeMap <Integer, String> ();
		
		treMap.put(1,"Jose");
		treMap.put(2,"Dario");
		treMap.put(3,"Maximo");
		treMap.put(1,"Jose");
		treMap.put(1,null);
		treMap.put(9,null);
//		treMap.put(null,"Pedro");
		
		for (Map.Entry m : treMap.entrySet ()) {
			System.out.println (m.getKey () + " " + m.getValue ());
		}
	}
}
