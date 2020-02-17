import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Readme5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileReader("agenda.txt"));
		StringBuilder str = new StringBuilder();
		String line  = null;

		while(sc.hasNext()) {
			
			line = sc.nextLine();
			str.append(line +  "\n");
			
		}
		System.out.println(str.toString());
		
		

	}
	
}

//hacer lo mismo distribuyendo algunas cosas en el main y otras en un método