//Dados dos ficheros, se lee el contenido de ambos y finalmente se crea uno nuevo
//intercalando los datos de los dos ya existentes.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ficheros6{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("Doc1.txt"));
		Scanner sc2 = new Scanner(new File("Doc2.txt"));
		FileWriter fichero = null;
		PrintWriter pw = null;
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		int cont = 0;

		System.out.println(" -------- Contenido del primer fichero --------");
		while (sc.hasNext()) {

			String line = sc.nextLine();
			l1.add(line);
			System.out.println(line);

		}

		System.out.println(" -------- Contenido del segundo fichero --------");
		while (sc2.hasNext()) {

			String line = sc2.nextLine();
			l2.add(line);
			System.out.println(line);

		}

		try {
			fichero = new FileWriter("Doc3.txt");
			pw = new PrintWriter(fichero);
			while (cont < l2.size()) {

				l3.add(l1.get(cont));
				l3.add(l2.get(cont));
				// l3.add("******");
				cont++;

			}

			while (cont < l1.size()) {

				l3.add(l1.get(cont));
				cont++;
			}

			System.out.println("************************");
			for (String st : l3) {
				pw.println(st);
				System.out.println(st);
			}
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
