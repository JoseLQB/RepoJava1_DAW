import java.io.FileReader;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.Objects;

public class MediaEdadPerson {
	public static void main(String[] args) throws Exception {
		String line;
		Scanner in = new Scanner(new FileReader("filePerson.txt"));
		int i = 0;
		int j = 0;
		Person[] a = new Person[30];
		Set<String> set = new HashSet<String>();
		String[] ar = new String[30];
		int arEdad[] = new int[20];
		while (in.hasNext()) {
			line = in.nextLine();
			String[] parts = line.split(":");
			// Person p1 = new Person (parts[0] , parts[1], parts[3]);
			if (set.add(parts[0])) {
				Person p1 = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
				a[i] = p1;
				i++;
	
			} else {
				ar[j] = line;
				j++;
			}

		}
		/*OptionalDouble z = Arrays.stream(a) 
				.filter(Objects::nonNull)
				.filter(p ->p.getTelefono().contains("55"))
				
				.mapToInt(Person::getEdad)
				.average();
		
		z.ifPresent(p->System.out.println(p));*/
		
		 Arrays.stream(a) 
				.filter(Objects::nonNull)
				.filter(p ->p.getTelefono().contains("55"))
				.forEach(p -> System.out.println(p.getNombre() + "---" + p.getTelefono()));


	}

}//solo hacer la media de los que contienen telefono que contenga el 55