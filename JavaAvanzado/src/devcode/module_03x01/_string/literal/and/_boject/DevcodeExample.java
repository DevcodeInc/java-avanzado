package devcode.module_03x01._string.literal.and._boject;

public class DevcodeExample {
	
	public static void main(String args[]) {
		
//		String literal
		String s3 = "Devcode"; 
		String s4 = "Devcode"; 
		
		System.out.println(s3 == s4); // True
		
//		String object
		String s1 = new String("Devcode"); 
		String s2 = new String("Devcode"); 
		
		System.out.println(s1 == s2); // False
		
		
		System.out.println(s3 == s2); // False
	}	
}
