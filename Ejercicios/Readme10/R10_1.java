//Muestra por salida estandar todas las lineas almacenadas en un fichero usando
//un StringBuilder

import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class R10_1{

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileReader("ficheros/ficheroDatos1.txt"));
		StringBuilder sb = new StringBuilder();
		String line;
		while(sc.hasNext()){

			line = sc.nextLine();
			
			sb.append(line + "\n");
		}
		System.out.println(sb);
	}
}