import java.util.Scanner;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class R10_5{

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileReader("ficheros/file9.txt"));
		Scanner in = new Scanner(System.in);
		String line;
		String input;

		try{
			FileWriter fw = new FileWriter("ficheros/file_temporal.txt");
			PrintWriter pw = new PrintWriter(fw);

			while(sc.hasNext()){

				line = sc.nextLine();
				System.out.println(line);
				System.out.println(" Borramos? [s/n] [default [n]]");
				input = in.nextLine();

				if(input.equals("s")){
					pw.println(line);
				}

			}
			pw.close();
		}catch(IOException ex){
			System.out.println(ex);
			

		}
	}
}