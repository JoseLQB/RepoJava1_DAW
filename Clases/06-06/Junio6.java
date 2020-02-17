
//para una ejecucion
//java junio6 hol vel tel vel hol tet
//debo ver
/*hol: 2
vel: 2
tel: 1
tel: 1*/

import java.util.Hashtable;

public class Junio6 {

	public static void main(String[] args) {

		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		/*
		 * int n = 0; for (String st : args) { if (hash.containsKey(st)) { n++;
		 * hash.put(st, 1 + n); } else { hash.put(st, 1); } }
		 */
		for (String st : args) {
			if (hash.get(st) == null) {
				hash.put(st, 1);
			}
			else {
				int i = hash.get(st);
				hash.put(st, ++i);
			}
		}

		for (String s : hash.keySet()) {
			System.out.println(s + ": " + hash.get(s));

		}

	}

}
