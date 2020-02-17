import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioNoSet1 {

	public static void main(String[] args) {


		List<String> l = new ArrayList<String>();
		for (String st : args) {

			if (!l.contains(st)) {

				l.add(st);

			}
		}
		for (String st : l) {
			System.out.println(st);
		}

	}

}