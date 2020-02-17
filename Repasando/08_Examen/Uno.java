import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Uno{

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(22);
		lista.add(12);
		lista.add(4);
		Collections.sort(lista);

		System.out.println(lista);

	}

}