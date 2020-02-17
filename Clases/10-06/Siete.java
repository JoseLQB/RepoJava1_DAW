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
		return  Integer.parseInt(st); // Sólo reemplazar “?”, no debes agregar líneas nuevas.
	}
	// La salida es: ..............5............
}

//Cuantas iteraciones realiza:  1

//8 A) 

//8 B) Cambiando private por public