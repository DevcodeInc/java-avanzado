package devcode.module_09x01_hilos;

public class ThreadPersona extends Thread{

	private String nombre;
	
	public ThreadPersona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run () {
		for (int i = 0; i < 50; i++) {
			System.out.println("[Thread] Hilo persona en ejecucion: "+ (nombre));
			
		}
	}
}
