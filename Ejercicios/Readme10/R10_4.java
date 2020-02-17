//lo mismo que antes pero teniendo en cuenta si un fichero está vacío

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class R10_4{

	public static void main(String[] args) throws FileNotFoundException {
		
		for(String st : args){
			Scanner sc = new Scanner(new FileReader(st));
			String line;
			if(!sc.hasNext()){

				System.out.println("El fichero " + st + " existe, pero esta vacio.");
			}else{
				line = sc.nextLine();
				System.out.println(line);
			}
		}
	}
}