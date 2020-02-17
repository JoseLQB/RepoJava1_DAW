import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FicheroNoRepetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileWriter fichero = null;
		PrintWriter pw = null;
		String line;
		Set<String> s = new HashSet<String>();
		try {
			fichero = new FileWriter("noRepetidos.txt");
			pw = new PrintWriter(fichero);
			while (sc.hasNext()) {
				line = sc.nextLine();
				s.add(line);
				
			}
			for (String r : s) {
				pw.println(r);
			}
			pw.close();
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
