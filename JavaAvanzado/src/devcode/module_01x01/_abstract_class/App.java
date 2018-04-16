package devcode.module_01x01._abstract_class;

public class App {

	public static void main(String[] args) {

		Animal caballo = new Caballo();
		caballo.soyAnimal();
		caballo.alimentarse();
		caballo.desplazarse();		
		
		Animal perro = new Perro();
		perro.soyAnimal();
		perro.alimentarse();
		perro.desplazarse();
		
		Animal gato = new Gato();
		gato.soyAnimal();
		gato.alimentarse();
		gato.desplazarse();
	}
}
