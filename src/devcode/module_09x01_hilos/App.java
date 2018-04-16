package devcode.module_09x01_hilos;

public class App {

	public static void main(String[] args) {

		ThreadPersona tPersona = new ThreadPersona("persona 1");
		
//		tPersona.run();
		tPersona.start();
		
		Thread rPersona2 = new Thread(new RunnablePersona("Persona 2"));
		rPersona2.run();
		rPersona2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Hilo Principal en ejecuccion: " + i);
		}
		
	}

}
