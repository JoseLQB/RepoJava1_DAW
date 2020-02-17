import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("categorias.txt"));
		Scanner sc2 = new Scanner(new FileReader("entradas.txt"));
		String line;

		List<String> l = new ArrayList<String>(); // partes categorias

		while (sc.hasNext()) {

			line = sc.nextLine();
			String[] parts = line.split(":");
			l.add(parts[0]);
		}
		
		while (sc2.hasNext()) {

			line = sc2.nextLine();
			String[] parts2 = line.split(":");
			if (!l.contains(parts2[2])) {

				System.out.println(line);

			}

		}
	}
}