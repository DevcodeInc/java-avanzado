package devcode.module_05x01_stringBuilder_stringBufferAnd_String;

public class DevcodeExample {
	
	public void callStringBuilder() {
		StringBuilder cadenaBuilder = new StringBuilder();
		cadenaBuilder.append("En inform�tica, ");
		cadenaBuilder.append("un programa ");
		cadenaBuilder.append("Hola mundo es el que imprime ");
		cadenaBuilder.append("el texto ��Hola, mundo!� ");
		cadenaBuilder.append("en un dispositivo de visualizaci�n, ");
		cadenaBuilder.append("en la mayor�a de los casos ");
		cadenaBuilder.append("una pantalla de monitor. ");
		cadenaBuilder.append("Este programa suele ");
		cadenaBuilder.append("ser usado como introducci�n ");
		cadenaBuilder.append("al estudio de un lenguaje de programaci�n, ");
		cadenaBuilder.append("siendo un primer ejercicio t�pico, ");
		cadenaBuilder.append("y se considera fundamental desde ");
		cadenaBuilder.append("el punto de vista did�ctico.");
		
		System.out.println(cadenaBuilder.toString());
	}
	
	public void callStringBuffer() {
		StringBuffer cadenaBuffer = new StringBuffer();
		cadenaBuffer.append("En caracas hay , ");
		cadenaBuffer.append("un detalle que ");
		cadenaBuffer.append("no todo el mundo lo sabe ");
		cadenaBuffer.append("��Hola, mundo!� es el texto  ");
		cadenaBuffer.append("de visualizaci�n, en un dispositivo  ");
		cadenaBuffer.append("de los casos en la mayor�a  ");
		cadenaBuffer.append("de monitor. una pantalla  ");
		cadenaBuffer.append("Este suele programar  ");
		cadenaBuffer.append("como introducci�n ser usado  ");
		cadenaBuffer.append("lenguaje de programaci�n, al estudio de un  ");
		cadenaBuffer.append("primer ejercicio t�pico, siendo un  ");
		cadenaBuffer.append("y fundamental desde se considera  ");
		cadenaBuffer.append("vista did�ctico. el punto de ");
		
		System.out.println(cadenaBuffer.toString());
	}	
	
	public void callString() {
		String cadenaString = new String();
		cadenaString = "En caracas hay 2, ";
		cadenaString +="un detalle que ";
		cadenaString +="no todo el mundo lo sabe ";
		cadenaString +="��Hola, mundo!� es el texto  ";
		cadenaString +="de visualizaci�n, en un dispositivo  ";
		cadenaString +="de los casos en la mayor�a  ";
		cadenaString +="de monitor. una pantalla  ";
		cadenaString +="Este suele programar  ";
		cadenaString +="como introducci�n ser usado  ";
		cadenaString +="lenguaje de programaci�n, al estudio de un  ";
		cadenaString +="primer ejercicio t�pico, siendo un  ";
		cadenaString +="y fundamental desde se considera  ";
		cadenaString +="vista did�ctico. el punto de ";
		
		System.out.println("String: " + cadenaString.toString());
	}	
	
	
	
	public static void main(String args[]) {
		
		DevcodeExample dce= new DevcodeExample();
		double ini, fin, time;
		
		// String
		ini = System.nanoTime();
		dce.callString();
		fin = System.nanoTime();
		time = fin - ini;
		System.out.println("Tiempo de la clase String:        " + time);		
		
		//StringBuffer
		ini = System.nanoTime();
		dce.callStringBuffer();
		fin = System.nanoTime();
		time = fin - ini;
		System.out.println("Tiempo de la clase StringBuffer:  " + time);	
		
		// StringBuilder
		ini = System.nanoTime();
		dce.callStringBuilder();
		fin = System.nanoTime();
		time = fin - ini;
		System.out.println("Tiempo de la clase StringBuilder: " + time);		
		
		
		
	}	
}
