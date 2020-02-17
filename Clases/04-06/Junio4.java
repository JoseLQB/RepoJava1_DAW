import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Junio4 {

	public static void main(String args[])  {
		// Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String linea = sc.nextLine();
			String part[] = linea.split(":");
			Person p1 = new Person(part[0], part[1], part[2]);
			//if (p1.getAddress().matches("\bAvenida\b")) {
			if((p1.getAddress().contains("Avenida")) && (p1.getName().length() >= 4)) {
				System.out.println("Nombre: " + p1.getName());
				System.out.println("Telefono: " + p1.getTlf()); 
			}
		}
	}

}