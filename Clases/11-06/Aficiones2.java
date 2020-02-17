import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Aficiones2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> ht = new Hashtable<String, String>();
		String nombre;
		String aficiones;
		while (sc.hasNext()) {
			nombre = sc.nextLine();
			aficiones = sc.nextLine();
			ht.put(nombre, aficiones);
		}
		sc.close();

		for (String st : ht.keySet()) {

			String[] parts = ht.get(st).split(",");
			if (parts.length >3) {
				System.out.println(st + " : " + ht.get(st));
			}
		}
	}
}

//Soy capaz de hacerlo con streams?

//mirar interfaces