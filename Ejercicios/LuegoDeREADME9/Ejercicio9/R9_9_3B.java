import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R9_9_3B {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(args[0]);
		Scanner sc1 = new Scanner(new FileReader("entradas.txt"));

		List<String> l = new ArrayList<String>();
		String codigo;
		String linea;
		boolean b = false;
		codigo = sc.nextLine();

		while (sc1.hasNext()) {
			linea = sc1.nextLine();
			l.add(linea);
		}
		int p = 0;
		int q = 0;
		for (String s : l) {
			q++;
			if (s.contains(codigo)) {

				System.out.println(s);
				p++;
				b = true;

			}
		}
		int porcentaje = 100* p/q;
		System.out.println("Porcentaje: " + porcentaje + "%");

		if (!b) {
			System.out.println("COD NO EXISTENTE");
		}
	}

}