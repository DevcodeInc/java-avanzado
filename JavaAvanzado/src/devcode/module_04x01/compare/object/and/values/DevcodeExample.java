package devcode.module_04x01.compare.object.and.values;

public class DevcodeExample {
	
	public static void main(String args[]) {
		
        String c1 = "Hola";

        String c2 = new String(c1);

        System.out.println(c1 + " == " + c2 + " -> " + (c1 == c2)); 		// false

        System.out.println(c1 + " equals " + c2 + " -> " + c1.equals(c2)); 	// true
        
        String c3 = c1;

        System.out.println(c1 + " == " + c3 + " -> " + (c1 == c3)); 		// true
	}	
}
