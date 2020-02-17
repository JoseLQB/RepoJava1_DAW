//Ejercicio 6 del examen modificado, este tiene en cuenta a todos los elementos de los arrays
//Tal como está solo funcioa si la lista más grande es la primera
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio6A {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("zoraida", "concejero", "cristianb", "martinl", "puiu", "pedro", "juan",
				"maria");
		List<String> lista1 = Arrays.asList("luisc", "carlosm", "barreda", "bocanegra");
		List<String> lista3 = new ArrayList<String>();
		int c = 0;

		while (c < lista1.size()) {
			lista3.add(lista.get(c));
			lista3.add(lista1.get(c));
			c++;

		}
		while (c < lista.size()) {
			lista3.add(lista.get(c));
			c++;
		}
		
		while (c < lista1.size()) {
			lista3.add(lista1.get(c));
			c++;
		}

		for (String sc : lista3) {
			System.out.println(sc);
		}
	}
}