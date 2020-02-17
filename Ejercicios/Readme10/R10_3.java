//mostrar solo la primera linea de los ficheros usando la linea de comandos

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class R10_3{

	public static void main(String[] args) throws FileNotFoundException {
		
		for(String st : args){
			Scanner sc = new Scanner(new FileReader(st));
			String line;
			line = sc.nextLine();
			System.out.println(line);
		}
	}
}