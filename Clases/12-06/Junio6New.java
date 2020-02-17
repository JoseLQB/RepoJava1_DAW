import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class Junio6New {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("filePerson.txt"));
		// Scanner sc = new Scanner(new File(args[0]));
		Set<String> set = new HashSet<String>();
		//Hashtable<String, String> hash = new Hashtable<String, String>();
		String noProces[] = new String[20];
		Person arPerson[] = new Person[20];
		int i = 0;
		int j = 0;

		while (sc.hasNext()) {

			String line = sc.nextLine();
			String[] parts = line.split(":");
			Person p1 = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
			if(!set.add(parts[0])) {
				noProces[i] = parts[0];
				i++;
			}else {
				arPerson[j] = p1;
				j++;
			}
			for (Person st : arPerson){
				if (i > 0){
					System.out.println(st.getNombre() + "-----" + st.getTelefono());
					i--;
				}
			}
			System.out.println("repetidos");
			for (String s : noProces){
				if (j > 0){
					System.out.println(s);
					j--;
				}

			}

		}
	}
}