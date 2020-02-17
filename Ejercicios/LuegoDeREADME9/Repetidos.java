import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Repetidos{

	public static void main (String [] args) {

		long unicos = 0;
		try(Stream<String> lineas = Files.lines(Paths.get("entradas.txt"))) {
			unicos = lineas.flatMap(l -> Arrays.stream(l.split(" ")))
			.distinct()
			.count();
		}
		catch(IOException e) {
		}
		System.out.println(unicos);


	}
}