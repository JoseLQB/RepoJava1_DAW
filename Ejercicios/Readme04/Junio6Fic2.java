import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class Junio6Fic2 {

	public static void main(String[] args) throws FileNotFoundException {
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		Scanner sc = new Scanner(new File("datos.txt"));

		String li[] = new String[50];
		int i = 0;
		String line;
		while (sc.hasNext()) {
			line = sc.nextLine();
			li[i] = line;
			i++;
		}
		for (String st : li) {
			if (i > 0) {
				i--;
				if (hash.get(st) == null) {
					hash.put(st, 1);
				} else {
					int is = hash.get(st);
					hash.put(st, ++is);
				}
			}
		}

		for (String s : hash.keySet()) {
			System.out.println(s + ": " + hash.get(s));

		}

	}

}
