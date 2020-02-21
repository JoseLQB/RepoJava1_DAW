import java.util.HashSet;
import java.util.Set;

public class EjercicioSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		for (String st : args) {
			set.add(st);
		}
		for (String stt : set) {

			System.out.println(stt);
		}
	}
}