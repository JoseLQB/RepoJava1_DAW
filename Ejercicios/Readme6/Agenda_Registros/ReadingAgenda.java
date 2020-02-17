import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingAgenda{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader(args[0]));
		List<String> l = new ArrayList<String>();

		while (sc.hasNext()) {

			String line = sc.nextLine();

			l.add(line + ":");

		}

		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("intermedio.txt");
			pw = new PrintWriter(fichero);
			for (String st : l) {
				pw.print(st);
				if (st.equals(":")) {
					pw.println(" ");
				}
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//

		Scanner sc2 = new Scanner(new FileReader("intermedio.txt"));
		String line2;
		System.out.println("Nombre y Apellido" + "                           " + "Telefono");
		System.out.println("-----------------" + "                           " + "--------");
		while (sc2.hasNext()) {

			line2 = sc2.nextLine();
			String[] partes = line2.split(":");

			Person p1 = new Person(partes[0], partes[1], partes[2], partes[3]);

			System.out.println(p1.getNombre() + "                       " + p1.getTelefono() + "   "
					+ p1.getMovil() + "\n");
			
		}
		
	}

}
