//Devuelve elementos no repetidos. p ejemplo:
//java Junio5Set hola hola2 hola3 hola hola hola4 hola5 hola5

//hola hola2 hola3 hola4 hola5

import java.util.HashSet;
import java.util.Set;

public class Junio5Set {
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		for (String st : args) {
			set.add(st);

		}
		for (String str : set){
			System.out.println(str);

		}

	}

}