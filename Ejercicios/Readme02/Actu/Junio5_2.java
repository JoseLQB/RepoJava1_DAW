import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Project1.Person;

public class Junio5_2 {
	public static void main(String args[]) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		Person[] ar = new Person[10];
		int i = 0;
		while (sc.hasNext()) {
			String linea = sc.nextLine();
			String[] part = linea.split(":");

			Person p1 = new Person(part[0], part[1], part[2]);
			ar[i] = p1;
			i++;    ///equivale al add de arraylist
			
			Thread.sleep(5000);

			//System.out.println(p1.getName() + " ---> " + p1.getTlf());
	
		}

//		for(int j=0;i>0;i--,j++) {
//			System.out.println(ar[j].getName());
	for(Person ps: ar){
		if(i>0){
			i--;
			System.out.println(ps.getName());
			}	
		}
	}
	
}