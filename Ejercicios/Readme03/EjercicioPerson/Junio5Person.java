import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Project1.Person;

public class Junio5Person {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		Person parr[] = new Person[30];
		String noProces[] = new String[10];
		int i = 0;
		int tamaño = set.size();
		String line;

		while (sc.hasNext()) {

			line = sc.nextLine();
			String parts[] = line.split(":");
			set.add(parts[0]);
			if (tamaño != set.size()) {
				Person p1 = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
				System.out.println(p1.getNombre() + " ---> " + p1.getTelefono());
				tamaño = set.size();

			} else {
				noProces[i] = line;
				i++;
			}
		}

		System.out.println(" ***Los siguiente registros no han sido procesados.*** ");
		for (String st : noProces) {
			if (i > 0) {
				i--;
				System.out.println(st);
			}
		}

	}

}
