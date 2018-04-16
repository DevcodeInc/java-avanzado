package devcode.module_02x01._final._variable;

public class DevCodeVariable {

	final int MAX_VALUE;

	DevCodeVariable() {
		MAX_VALUE = 101;
	}	
	
	void myMethod() {
		//MAX_VALUE = 101;
		System.out.println(MAX_VALUE);
	}

	public static void main(String args[]) {
		DevCodeVariable obj = new DevCodeVariable();
		obj.myMethod();
	} 	
}
