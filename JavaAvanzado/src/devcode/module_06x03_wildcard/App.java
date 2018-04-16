package devcode.module_06x03_wildcard;
import java.util.ArrayList;
import java.util.List;

public class App {
	//	Java Generics Unbounded Wildcard
	public static void mostrarElementosUnbounded(List<? /*extends Object*/> elements){
		System.out.println("{***Unbounded method***}");
		
		
		for(Object obj : elements){
			if(obj instanceof Perro) {
				System.out.println(((Perro)obj).getTipo());
			}else if(obj instanceof Gato){
				System.out.println(((Gato)obj).getTipo());
			}
		}
	}	

	// Java Generics Upper Bounded Wildcard
	public static void mostrarElementosUpperBounded(List<? extends Animal> elements) {
		System.out.println("{***Upper Bounded method***}");
		for (Animal ani : elements) {
			System.out.println(ani.getTipo());
		}
	}
//	
	// Java Generics Lower Wildcard
	public static void mostrarElementosLowerBounded(List<? super Perro> elements){
		System.out.println("{***Lower Bounded method***}");
		for (Object obj : elements) {
			System.out.println(((Animal)obj).getTipo());
		}
	}	
	
	public static void main(String[] args) {

		/** Codigo  un bounded **/
		Perro p = new Perro("Perro Dalmata");
		Perro p1 = new Perro("Pastor Aleman");

		
		List<Perro> listA = new ArrayList<>();
		listA.add(p);
		listA.add(p1);
	
//		Gato g1= new  Gato("Gato siames");		
//		List<Gato> listA = new ArrayList<>();
//		listA.add(g1);
		mostrarElementosUnbounded(listA);
		/** __________________________ **/
		
		/** Codigo  upper bounded **/
		Animal b1 = new Perro("Perro Dalmata");
		Perro b2 = new Perro("Pastor Aleman");
		Animal b3= new Gato("Gato siames");
		
		List<Animal> listB = new ArrayList<>();
		listB.add(b1);
		listB.add(b2);
		listB.add(b3);
		mostrarElementosUpperBounded(listB);
//		/** __________________________ **/
		
		/** Codigo  lower bounded **/
		Animal c1 = new Perro("Perro Dalmata");
		Perro c2 = new Perro("Pastor Aleman");
		Animal c3= new Gato("Gato siames");
		Gato c4= new Gato("Gato persa");
		
		List<Animal> listC = new ArrayList<>();
		listC.add(c1);
		listC.add(c2);
		listC.add(c3);
		listC.add(c4);
		mostrarElementosLowerBounded(listC);		
	}
}
