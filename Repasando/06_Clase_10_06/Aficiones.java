import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Aficiones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> ht = new Hashtable<String, String>();
		List<String> l = new ArrayList<String>();
		String nombre;
		String aficiones;
		while (sc.hasNext()) {

			nombre = sc.nextLine();
			aficiones = sc.nextLine();
			ht.put(nombre, aficiones);

		}
		System.out.println(ht);
		for (String st : ht.keySet()) {
			System.out.println(st + " : " + ht.get(st));
		}

	}

}

