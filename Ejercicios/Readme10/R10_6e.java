import java.util.Scanner;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class R10_6e{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		Set<String>set = new HashSet<String>();
		String line;

		while(sc.hasNext()){
			line = sc.nextLine();
			if(!set.contains(line)){
				set.add(line);

			}else{
				System.out.println("No aceptado, esta repetido");
			}
		}
		try{
			FileWriter fw = new FileWriter("ficheros/noRep.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(String st : set){
				pw.println(st);
			}
			pw.close();
		}catch(IOException ex){
			System.out.println(ex);
		}
	}
}