public class Ejer7 {

	public static void main(String[] args) {

		int nume = readOnlyIntegers("5");
		while (nume != 0) {
			System.out.println(".............." + nume + "............");
			nume = readOnlyIntegers("0");
		}
	}

	public static int readOnlyIntegers(String st) {
		return 5; // S�lo reemplazar �?�, no debes agregar l�neas nuevas.
	}
	// La salida es: ..............5............
}