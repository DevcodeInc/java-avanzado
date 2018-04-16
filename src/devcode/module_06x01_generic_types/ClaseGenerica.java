package devcode.module_06x01_generic_types;

class ClaseGenerica<T> {
	T obj;

	public ClaseGenerica(T o) {
		obj = o;
	}

	public void classType() {
		System.out.println("El tipo de T es " + obj.getClass().getName());
	}

	public static void main(String args[]) {
		
		// Creamos una instancia de ClaseGenerica para Integer.
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
		intObj.classType();

		// Creamos una instancia de ClaseGenerica para String.
		ClaseGenerica<Boolean> strObj = new ClaseGenerica<Boolean>(true);
		strObj.classType();

	}
}
