import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CuentaNulos {
	
	static public void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String line;
		while (sc.hasNext()) {
			
			line = sc.nextLine();
			if (line.length() == 0) {
				i++;
				
			}
		}
		System.out.println(i);
	}
}

//devuelve el número de espacios en blanco introducidos por scanner