package devcode.module_02x02._static._class;

public class DevcodeExample {

	static String cadena01 = "Mi cadena 01";
	String cadena02 = "Mi cadena 02";

	static class ClaseAnidada {
		void imprimirValor() {
			System.out.println("cadena01: " + cadena01);
			//System.out.println("cadena02: " + cadena02);
		}
	}

	public static void main(String args[]) {
		DevcodeExample.ClaseAnidada objCa = new DevcodeExample.ClaseAnidada();
		objCa.imprimirValor();
		
		DevcodeExample objDce = new DevcodeExample();
		System.out.println("objDce.cadena02: " + objDce.cadena02);
	}
	
}
