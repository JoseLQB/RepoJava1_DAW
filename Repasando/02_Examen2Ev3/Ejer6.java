import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejer6 {
	public static void main(String[] args) {

		List<String> lista = Arrays.asList("zoraida", "concejero", "cristianb", "martinl", "puiu");
		List<String> lista1 = Arrays.asList("luisc", "carlosm", "barreda", "bocanegra");
		List<String> lista3 = new ArrayList<String>(); // desde aquí sigues tú.

		int cont = 0;
		while (cont < lista.size() -1) {

			lista3.add(lista.get(cont));
			lista3.add(lista1.get(cont));

			cont++;

		}

		System.out.println(lista3);
		// Crea una tercera lista para que contenga elementos de las estructuras lista y
		// lista1 .
		// Los elementos se intercalan comenzando por lista1, ver abajo las salida a
		// obtener.
		// El último elemento de la lista "lista" quedará fuera, no se almacena en la
		// tercer lista.

	}
}