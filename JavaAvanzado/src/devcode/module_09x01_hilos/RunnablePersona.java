package devcode.module_09x01_hilos;

public class RunnablePersona implements Runnable{

	private String nombre;
	
	public RunnablePersona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run () {
		for (int i = 0; i < 50; i++) {
			System.out.println("[Runnable] Hilo persona en ejecucion: "+ (nombre));
			
		}
	}	
	
}
