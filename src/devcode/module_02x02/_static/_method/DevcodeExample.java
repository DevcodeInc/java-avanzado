package devcode.module_02x02._static._method;

public class DevcodeExample {

	static String varStatic;
	String varNoStatic;

	static void llenar() {
		varStatic = "Variable estatica";
		//varNoStatic= "Variable no statica";
	}

	void llenar02() {
		varStatic = "Variable estatica 2";
		varNoStatic = "Variable no estatica 2";
	}

	public static void main(String args[]) {
		llenar();
		//DevcodeExample.llenar2();
		DevcodeExample dce = new DevcodeExample();
		dce.llenar02();

		System.out.println("varStatic: " + varStatic);
		System.out.println("varNoStatic: " + dce.varNoStatic);
	}
}
