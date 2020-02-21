import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3A {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(new FileReader("entradas.txt"));
		List<String> l = new ArrayList<String>();
		String categoria;
		String linea;
		boolean b = false;
		System.out.println("Inserta categoria");
		categoria = sc.nextLine();
		while (sc1.hasNext()) {

			linea = sc1.nextLine();
			l.add(linea);

		}
		for (String s : l) {
			if (s.contains(categoria)) {

				System.out.println(s);
				b = true;
			} 	
		}
	
		if(!b) {
			System.out.println("COD NO EXISTENTE");
		}
	}

}
