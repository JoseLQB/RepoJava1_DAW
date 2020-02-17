import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class R10_6h{

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner (new FileReader("ficheros/notas.txt"));
		String line;

		while(sc.hasNext()){
			line = sc.nextLine();

			if(line.length() != 0) {
				line = sc.nextLine() + ":" + line;
				String parts[] = line.split(":");
				System.out.println(parts[1] + ": " +parts[0]);
			}
		}
	}
}