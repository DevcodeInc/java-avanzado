package devcode.module_06x02_generic_methods;
import java.util.ArrayList;

public class MetodoGenerico {
	public static <E> void show(ArrayList<E> entrada) {
		
		for (E elemento : entrada) {
			System.out.print(elemento + " ");
		}
		
		System.out.println("\n");
	}

	public static void main(String args[]) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i <= 6; i++) {
			list1.add(i);
		}

		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("this");
				add("is");
				add("a");
				add("test");
			}
		};

		System.out.println("--- Usando ArrayList de enteros ---");
		show(list1);

		System.out.println("--- Usando ArrayList de cadenas ---");
		show(list2);
	}
}
