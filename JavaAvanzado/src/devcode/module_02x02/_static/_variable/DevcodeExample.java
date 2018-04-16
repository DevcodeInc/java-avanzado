package devcode.module_02x02._static._variable;

public class DevcodeExample {

	static String varStatic;
	String varNoStatic;
	
	public static void main(String args[]) {
		DevcodeExample dce1 = new DevcodeExample();
		DevcodeExample dce2= new DevcodeExample();
		
		dce1.varNoStatic = "Variable no estatica";
		dce1.varStatic = "Variable estatica";
		
		dce2.varNoStatic = "Variable no estatica 2";
		dce2.varStatic = "Variable estatica 2";
		
		System.out.println("dce1.varStatic: " + dce1.varStatic);
		System.out.println("dce1.varNoStatic: " + dce1.varNoStatic);
		
		System.out.println("dce2.varStatic: " + dce2.varStatic);
		System.out.println("dce2.varNoStatic: " + dce2.varNoStatic);
	}	
}
