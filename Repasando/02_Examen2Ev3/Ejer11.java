import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;
import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) throws Exception {
		
		ServiceAlumno servAlu = new ServiceAlumno();
		
		HashMap<String, String> unHash = servAlu.getAlumnos();
		
		Set<String> unSet = unHash.keySet();
		for (String s : unSet) {
			
			System.out.println(s);
		}
		System.out.println(" - - - - - ");
		
		unSet.stream().forEach(System.out::println);
	}
}