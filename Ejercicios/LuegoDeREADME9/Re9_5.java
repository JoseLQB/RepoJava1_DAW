import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Re9_5 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("entradas.txt"));
		Set<String> set = new HashSet <String>();

		String line;

		while (sc.hasNext()) {

			line = sc.nextLine();
			String parts[] = line.split(" ");
			set.add(parts[0]);
			set.add(parts[1]);

		}
		int n = 0;
		for (String st : set){
			n++;
		}
		System.out.println(n);
	}

}
