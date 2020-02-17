import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Re9_9 {
	
	public static void main(String[] args) throws Exception {
		
		Stream<String> stream = Files.lines(Paths.get("entradas.txt"));
		
		List<String> lista = stream
							.filter(p -> p.split(":")[2]
							.equals(args[0]))
							.collect(Collectors.toList());
		if (lista.size() == 0) {
			System.out.println("NO Existente dicho código");
		} else {
			lista.forEach(System.out::println);
		}
	}
}