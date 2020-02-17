import java.util.ArrayList;
import java.util.List;

public class Ejercicio1_2 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);

			l.add(args[i]);
		}

		System.out.println("Lista 1 = " + l);

		List<String> l2 = new ArrayList<String>();

		for (String r : l) {
			l2.add(r);
		}
		System.out.println("Lista 2 = " + l2);
	}

}
