import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {

		String a = args[0];
		

		List<String> l = new ArrayList<String>();
		if (a != null) {
			l.add(a);
		}

		for (String b : l) {
			System.out.println(b);
		}

	}

}
