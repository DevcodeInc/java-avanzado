package devcode.module_01x02._interface;

public class App {

	public static void main(String[] args) {

		Bicileta bicileta = new Bicileta(2);
		bicileta.trasladar();
		
		Carro carro = new Carro(4);
		carro.trasladar();		
		
		Barco barco = new Barco(6);
		barco.funcionar();
		barco.trasladar();
		

	}
}
