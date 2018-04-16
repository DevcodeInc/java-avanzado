package devcode.module_02x02._static._block;

public class DevcodeExample {
	static int numero;
	static String cadena;

	static {
		System.out.println("Static Bloque 1");
		numero = 68;
		cadena = "Bloque 1";
	}

	void imprimir() {
		System.out.println("imprimir");
	}

	public static void main(String args[]) {
		
		DevcodeExample dce = new DevcodeExample();
		dce.imprimir();
		
		System.out.println("Valor de numero: " + numero);
		System.out.println("Valor de  cadena: " + DevcodeExample.cadena);
	}
}
