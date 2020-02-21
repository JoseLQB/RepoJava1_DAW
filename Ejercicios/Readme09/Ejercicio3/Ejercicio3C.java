import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3C {

	public static void main(String[] args) throws FileNotFoundException {

		List<String> l = new ArrayList<String>();

		Scanner sc1 = new Scanner(new FileReader("entradas.txt"));

		String linea;
		boolean b = false;

		while (sc1.hasNext()) {
			linea = sc1.nextLine();
			l.add(linea);
		}

		for(String st :args){
			System.out.println("---------------------------" + st + "-----------------------------------");

			for(String ss :l){
				String parts [] = ss.split(":");
				if(parts[2].equals(st)){
					System.out.println(ss);
					b = true;
				}
			}if(!b){
				System.out.println("COD NO EXISTENTE");
			}
			b=false;
		}

		/*for (String s : l) {
			for (String ss : args) {
				if (s.contains(ss)) {
					System.out.println(s);
					b = true;
				}
			}
		}
		if (!b) {
			System.out.println("COD NO EXISTENTE");
		}*/
	}
}