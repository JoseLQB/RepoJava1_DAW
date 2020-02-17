import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new FileReader("categorias.txt"));
		Scanner sc2 = new Scanner(new FileReader("entradas.txt"));
		String line, line2;
		
		List<String> lista = new ArrayList<String>(); //entradas
		List<String> lista2 = new ArrayList<String>(); //categorias

		while (sc2.hasNext()) {

			line2 = sc2.nextLine();
			lista2.add(line2);
		}
		
		lista
			.stream()
			.map(p -> p.split(":")[0])
			.forEach(p -> lista.add(p));
		
		lista2
			.stream()
			.filter(p -> !lista.contains(p))
			.forEach(System.out::println);
			
	}

}
