import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;



public class Junio6F {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("filePerson.txt"));
		//Scanner sc = new Scanner(new File(args[0]));
		Set<String> set = new HashSet<String>();
		Hashtable<String, String> hash = new Hashtable<String, String>();
		String noProces[] = new String[20];
		Person arPerson[] = new Person[20];
		int i = 0;
		FileWriter fichero = null;
        PrintWriter pw = null;

		while (sc.hasNext()) {
			
			String line = sc.nextLine();
			String[] parts = line.split(":");
			Person p1 = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
			arPerson[i] = p1;
			i++;
			if (set.add(p1.getNombre())) {

				hash.put(p1.getNombre(), p1.getTelefono());

			} else {
				noProces[i] = line;
				i++;
			}

		}
		try {
			fichero = new FileWriter("telefonos.txt");
			pw = new PrintWriter(fichero);
			for (String s : hash.keySet()) {
				pw.println(s + " ----> " + hash.get(s));
			}
			pw.println(" ***Los siguientes registros no han sido procesados.*** ");
			for (String s : noProces) {
				if (i > 0) {
					i--;
					pw.println(s);
				}
			}
			fichero.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
//trata fileperson