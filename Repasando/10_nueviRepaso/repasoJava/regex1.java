package repasoJava;

public class regex1 {
	
	public static void main(String[]args) {
		System.out.println(validaNombre("Jose Luis"));
		System.out.println(validaNombre("JL"));
		System.out.println(validaNombre("PPPaaa"));
	}

	public static boolean validaDNI(String DNI) {
		return DNI.matches("^[0-9]{8}[A-Z]{1}$");	
	}
	
	public static boolean validaNombre(String nombre) {//+ una o más veces //? opcional
		return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}
}
