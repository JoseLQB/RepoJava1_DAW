
public class Ejer10 {
	public static void main(String[] args) {

		int n = -2;
		for (String st : args) {
			n = n + 2;

			System.out.println(n + " ---- " + st);

		}
	}
}
// escribe este bloque para que se muestre en salida estándar los argumentos
// de la línea de comandos en posiciones par.

/*
 * $ java Diez uno dos tres cuatro cinco seis siete ocho 0 ---- uno 2 ---- tres
 * 4 ---- cinco 6 ---- siete
 */