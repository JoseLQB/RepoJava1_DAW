import java.util.Scanner;
import java.util.Hashtable;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class R10_6d{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader("ficheros/ciudades.txt"));
		Hashtable <String, String> ht = new Hashtable <String, String>();
		String line;

		while(sc.hasNext()){

			line = sc.nextLine();
			String partes [] = line.split(":");
			ht.put(partes[0], partes[1]);
		}

		for(String st : ht.keySet()){

			System.out.println(st + "----------" + ht.get(st));
		}


	}
}