//Almacenar el contenido de dos ficheros en una ArrayList de manera intercalada

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class R10_2{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc1 = new Scanner(new FileReader("ficheros/file1.txt"));
		Scanner sc2 = new Scanner(new FileReader("ficheros/file2.txt"));
		List <String> list = new ArrayList<String>();
		String line;
		String line2;

		while(sc2.hasNext()){

			if(sc1.hasNext()){
				line = sc1.nextLine();
				list.add(line);
			}

			line2 = sc2.nextLine();
			list.add(line2);
		}
		for(String st : list){

			System.out.println(st);
		}
		
	}
}