package Project1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Xxxx {

	public static void main(String[] args) {
		
		
		proccess_line_to_line();

	}

	private static void proccess_line_to_line() {
		System.out.println("Leyendo file line to line con java8");
		try (Stream<String> stream = Files.lines(Paths.get("temperaturas"))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
