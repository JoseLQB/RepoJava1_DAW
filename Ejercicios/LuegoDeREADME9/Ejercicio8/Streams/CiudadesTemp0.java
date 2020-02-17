import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CiudadesTemp0 {

	public static void main(String[] args) throws IOException {
		String line;
		Set<String> set = new HashSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader ("ciudadesTemp.txt"));
			List<String> lista = new ArrayList<String>();
			
			while((line = br.readLine())!=null){
				
				String[]parts = line.split(":");
				lista.add(parts[1]);

				
			}
			lista
				.stream()
				//.map(p -> Integer.parseInt(p))
				.reduce((x,y) -> x + ", " + y)
				.ifPresent(p-> System.out.println(" **" + p + "** "));
			
			/*set
				.stream()
				.filter(p -> !p.equals("Badajoz"))
				.forEach(System.out::println);
			
			set
				.stream()
				.sorted()
				.reduce((x, y) ->x + " " +y)
				.ifPresent(p -> System.out.println(" **" + p + "** "));*/
			
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
    }
}