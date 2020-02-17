import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class R10_6f{

	public static void main(String[] args) throws Exception{

		//Scanner sc = new Scanner(System.in);
		String line;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		while((line = sc.readLine()) != null){
			if(line.length()>0){
				String partes[] = line.split(" ");
				System.out.println(" -" + partes.length + "- ");	
			}else{
				System.out.println(" -0- ");
			}
		}
		System.out.println("Adios eso fue todo");
	}
}
