import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;


public class Junio6 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("filePerson.txt"));
		Set<String> set = new HashSet<String>();
		Hashtable<String, String> hash = new Hashtable<String, String>();
		String noProces[] = new String[10];
		int i = 0;

		while (sc.hasNext()) {

			String line = sc.nextLine();
			String[] parts = line.split(":");
			Person p1 = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
			if (set.add(p1.getNombre())) {

				hash.put(p1.getNombre(), p1.getTelefono());

			} else {
				noProces[i] = line;
				i++;
			}

		}

		for (String s : hash.keySet()) {
			System.out.println(s + " ----> " + hash.get(s));
		}
		System.out.println(" ***Los siguientes registros no han sido procesados.*** ");
		for (String s : noProces) {
			if (i > 0) {
				i--;
				System.out.println(s);
			}
		}
	}

}
