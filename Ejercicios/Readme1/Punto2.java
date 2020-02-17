public class Punto2 {

	public static void main(String[] args) {

		String[] nuevo = null;
		nuevo = new String [20]; ///Dimensión del array
		for (String st : args) {
			System.out.println(st);
		}
		nuevo = args;

		System.out.println("A continuación se muestra el contenido del nuevo array: ");
		for (String str : nuevo) {
			System.out.println(str);
		}

	}

}