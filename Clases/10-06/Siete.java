package Project1;

public class Siete {
	public static void main(String[] args) {
		int nume = readOnlyIntegers("5");
		while (nume != 0) {
			System.out.println(".............." + nume + "............");
			nume = readOnlyIntegers("0");
		}
	}

	private static int readOnlyIntegers(String st) {
		return  Integer.parseInt(st); // S�lo reemplazar �?�, no debes agregar l�neas nuevas.
	}
	// La salida es: ..............5............
}

//Cuantas iteraciones realiza:  1

//8 A) 

//8 B) Cambiando private por public