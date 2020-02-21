import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(args[0]);
		Scanner sc1 = new Scanner(new FileReader("entradas.txt"));
		
		List<String> l = new ArrayList<String>();
		String codigo;
		String linea;
		boolean b = false;
		codigo = sc.nextLine();
	
		
		while (sc1.hasNext()) {
			linea = sc1.nextLine();
			l.add(linea);
		}
		for (String s : l) {
			if (s.contains(codigo)) {

				System.out.println(s);
				b = true;
			} 	
		}
	
		if(!b) {
			System.out.println("COD NO EXISTENTE");
		}
	}

}