import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Project1.Person;

public class Junio5_2 {
	static public void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		String line;
		while (sc.hasNext()) {
			line = sc.nextLine();
			if(line.length() ==0) {
				i++;
			}

		}

		System.out.println(i);

	}
}