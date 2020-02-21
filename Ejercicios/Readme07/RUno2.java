import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RUno2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		String line;
		FileWriter fw;
		PrintWriter pw;

	try {
		fw = new FileWriter("eliminando.txt");
		pw= new PrintWriter(fw);

		while (sc.hasNext()) {

			line = sc.nextLine();
				if (set.contains(line)) {
					set.remove(line);
				} else {
					set.add(line);
				}
		}
		for (String sg : set) {
			System.out.println(sg);
			pw.println(sg);
		}

		pw.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

}
//Solo muestra los datos que nunca han sido repetidos y los graba en fichero
