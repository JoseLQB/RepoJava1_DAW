import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3CC {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc1 = new Scanner(new FileReader("entradas.txt"));

		String linea;
		boolean b = false;

		while (sc1.hasNext()) {
			linea = sc1.nextLine();
			for(String st :args){
				String parts [] = linea.split(":");
				if(parts[2].equals(st)){
					System.out.println(linea);
					b = true;
				}
			}/*if(!b){
					System.out.println("COD NO EXISTENTE");
				}
				b=false;*/
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