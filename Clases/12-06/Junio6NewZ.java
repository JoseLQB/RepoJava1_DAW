import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Junio6NewZ{
	public static void main(String[] args) throws Exception{
		String line;
		Scanner in = new Scanner(System.in);
		int i = 0 ;
		int j = 0;
		Person[] a = new Person[30];
		Set <String> set = new HashSet<String>();
		String[] ar = new String[30];
		while (in.hasNext()){
			line = in.nextLine();
			String[] parts = line.split(":");
			// Person p1 = new Person (parts[0] , parts[1], parts[3]);
			if(set.add(parts[0])){
				Person p1 = new Person (parts[0] , parts[1],Integer.parseInt(parts[2]), parts[3]);
				a[i] = p1;
				i++;
			}
			else{
				ar[j]= line;
				j++;
			}
		}
		for (Person st : a){
			if (i > 0){
				System.out.println(st.getNombre() + "-----" + st.getTelefono());
				i--;
			}
		}
		System.out.println("repetidos");
		for (String s : ar){
			if (j > 0){
				System.out.println(s);
				j--;
			}
		}
	}
}