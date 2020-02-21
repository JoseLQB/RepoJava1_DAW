import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RUno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		String line;
		FileWriter fw;
		PrintWriter pw;
		try {
			fw = new FileWriter("noRepe.txt");
			pw = new PrintWriter(fw);
			while (sc.hasNext()) {

				line = sc.nextLine();
				set.add(line);

			}
			for (String sg : set) {

				System.out.println(sg);
				pw.println(sg);

			}
			fw.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}
}
//Muestra lineas repetidas introducidas mediante teclado y las guarda en fichero