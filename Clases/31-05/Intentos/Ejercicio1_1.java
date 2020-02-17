import java.util.ArrayList;
import java.util.List;

public class Ejercicio1_1 {

	public static void main(String[] args) {

		String a = args[0];
		String b = args[1];
		String c = args[2];

		List<String> l = new ArrayList<String>();
			l.add(a);
			l.add(b);
			l.add(c);
		

		for (String r : l) {
			System.out.println(r);
			
		}
		System.out.println(l);

	}

}
