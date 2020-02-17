import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Junio6Fic {

	public static void main(String[] args) throws FileNotFoundException {

		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		Scanner sc = new Scanner(new File("datos.txt"));
		List<String> l = new ArrayList<String>();
		String line;
		while (sc.hasNext()) {
			line = sc.nextLine();
			l.add(line);
		}
		for (String st : l) {
			if (hash.get(st) == null) {
				hash.put(st, 1);
			} else {
				int i = hash.get(st);
				hash.put(st, ++i);
			}
		}

		for (String s : hash.keySet()) {
			System.out.println(s + ": " + hash.get(s));

		}

	}

}
