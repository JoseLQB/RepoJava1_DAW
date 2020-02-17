import java.util.ArrayList;
import java.util.List;

public class Ejercicio1_3 {

	public static void main(String[] args) {

		for (String st : args) {

			List<String> l2 = new ArrayList<String>();

			for (String r : args) {
				l2.add(r);
			}
			System.out.println("Lista 2 = " + l2);

		}

	}
}