import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Seis {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("zoraida", "concejero", "cristianb", "martinl", "puiu");
		List<String> lista1 = Arrays.asList("luisc", "carlosm", "barreda", "bocanegra");
		List<String> lista3 = new ArrayList<String>();

		int c = 0;
		while (c < lista.size() - 1) {
			lista3.add(lista.get(c));
			lista3.add(lista1.get(c));
			c++;
		}
		for (String sc : lista3) {
			System.out.println(sc);
		}
	}
}
//Hacer con ficheros