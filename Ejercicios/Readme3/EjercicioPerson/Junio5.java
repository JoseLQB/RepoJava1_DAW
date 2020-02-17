import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Project1.Person;

public class Junio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		Person parr[] = new Person[30];
		String noProces [] = new String[10];
		int i = 0;
		int tamaño = set.size();
		String line;

		while (sc.hasNext()) {
			
			line = sc.nextLine();
			String parts[] = line.split(":");
			set.add(parts[0]);
			if(tamaño != set.size()) {
				System.out.println(parts[0] + "----->" + parts[3]);
				tamaño = set.size();
				
			}else {
				  noProces[i] = line;
                  i++;  
		
			}
		}
		System.out.println(" ***Los siguiente registros no han sido procesados.*** ");
		for(String st: noProces) {
			if (i > 0) {
				i--;
			System.out.println(st);
			}
		}
		
	}

}
